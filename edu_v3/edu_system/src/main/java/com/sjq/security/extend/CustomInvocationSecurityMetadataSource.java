package com.sjq.security.extend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.AntPathRequestMatcher;
import org.springframework.security.web.util.RequestMatcher;
import org.springframework.stereotype.Service;

import com.sjq.common.cache.EhcacheManager;
import com.sjq.security.bean.SecurityResource;
import com.sjq.security.enums.YesNoEnum;
import com.sjq.security.service.SecurityResourceService;

import net.sf.ehcache.Element;

/**
 * 
 * 装配每个资源对应的权限定义，即getAttributes方法返回的结果。 
 * 此类在初始化时，应该取到所有资源及其对应角色的定义。
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月9日下午2:30:33
 * @version 1.0
 */
@Service
public class CustomInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
	
	// AntUrlPathMatcher默认要进行小写转换AntPathRequestMatcher
	private final Logger logger = LoggerFactory.getLogger(CustomInvocationSecurityMetadataSource.class);

	private static Map<String, Collection<ConfigAttribute>> rolesResourceMap = null;

	private final String ROLE_DEFAULT = "ROLE_DEFAULT";

	private final String CACHE_KEY = "resources";

	private final String DWR_PUSH_URL = "/dwr/call/plainpoll/ReverseAjax.dwr";
	
	@Autowired
	private SecurityResourceService securityResourceService;

	/**
	 * 第一次请求时加载
	 * 加载资源与权限的关系，包括所有角色
	 * 应当是资源为key， 权限为value。 资源通常为url， 权限就是那些以ROLE_为前缀的角色。 一个资源可以由多个权限来访问
	 */
	private void loadRolesResourceDefine() {
		
		String postfix = "__@";

		rolesResourceMap = new HashMap<String, Collection<ConfigAttribute>>();
		
		//获取全部的请求资源
		List<SecurityResource>  srs = securityResourceService.querySecurityResourceBySearch(null);
		
		//通过请求资源获取有此权限的角色
		for(SecurityResource sr:srs){
			
			Collection<ConfigAttribute> cas = new ArrayList<ConfigAttribute>();
			
			List<Map<String,Object>> ms = securityResourceService.querySecurityRoleResourceByResourceId(sr.getId());
			
			// 不属于任何模块，因为springSecurity如果不预先设置，默认就不会拦截
			ConfigAttribute ca = new SecurityConfig(ROLE_DEFAULT);
			for(Map<String,Object> m:ms){
				ca = new SecurityConfig(m.get("code").toString());
				cas.add(ca);
			}
			
			rolesResourceMap.put(sr.getUrl(), cas);
			
		}

		
		// 全部URL资源
//		SecurityGroupResourceViewSearch securityGroupResourceSearch = new SecurityGroupResourceViewSearch();
//		List<SecurityGroupResourceViewModel> securityGroupResourceModels = securityFacade
//				.findListSecurityGroupResourceDefine(securityGroupResourceSearch);
//
//		for (SecurityGroupResourceViewModel securityGroupResourceModel : securityGroupResourceModels) {
//			Collection<ConfigAttribute> configAttributes = new ArrayList<ConfigAttribute>();
//
//		    // 根据资料查找角色
//			SecurityGroupResourceViewSearch roleSearch = new SecurityGroupResourceViewSearch();
//			roleSearch.setCompanyCode(securityGroupResourceModel.getCompanyCode());
//			roleSearch.setResourceId(securityGroupResourceModel.getResourceId());
//
//			List<SecurityGroupResourceViewModel> roleModels = securityFacade
//					.findListSecurityGroupResourceView(roleSearch);
//
//			// Map<url,ROLE>
//			for (SecurityGroupResourceViewModel role : roleModels) {
//				ConfigAttribute configAttribute = new SecurityConfig(role.getRoleCode());
//				configAttributes.add(configAttribute);
//
//				// 上级授权角色(上级授权角色编码规则：角色代码+"__@")
//				if (role.getIsNeedAuthorized().equals(YesNoEnum.YES.getCode()) && role.getAuthorizeRoleCode() != null) {
//					 System.out.println("角色代码...." + securityGroupResourceModel.getUrl() + "...." + role.getAuthorizeRoleCode());
//
//					ConfigAttribute c = new SecurityConfig(role.getAuthorizeRoleCode() + postfix);
//					configAttributes.add(c);
//				}
//
//				rolesResourceMap.put(securityGroupResourceModel.getUrl(), configAttributes);
//
//				 System.out.println(role.getRoleCode() + "  Role has " + securityGroupResourceModel.getUrl());
//			}
//		}
//
		
//		rolesResourceMap.put("/**/home.html", defaultConfigAttributes);
//
//		
//
//		// 保存到缓存中
		saveInCache(rolesResourceMap);
	}

	private void saveInCache(Map<String, Collection<ConfigAttribute>> map) {
		EhcacheManager.put(new Element(CACHE_KEY, map));
	}

	private Map<String, Collection<ConfigAttribute>> getFromCache(String elementKey) {
		return (Map<String, Collection<ConfigAttribute>>) EhcacheManager.getElement(elementKey);
	}

	/**
	 * 每次请求都会执行
	 * 获取与需要保护的安全对象关联的属性信息
	 * 返回所请求资源所需要的权限(role name)  
	 * (要有 url.indexOf("?")这样的判断，要通过判断对URL特别是Action问号之前的部分进行匹配，  
	 * 防止用户请求的带参数的URL与你数据库中定义的URL不匹配，造成访问拒绝)  
	 */
	public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
		// 获得请求的URL地址ַ
		String requestUrl = ((FilterInvocation) object).getRequestUrl();
		int firstQuestionMarkIndex = requestUrl.indexOf("?");
		if (firstQuestionMarkIndex != -1) {
			requestUrl = requestUrl.substring(0, firstQuestionMarkIndex);
		}

		System.out.println("requestUrl..." + requestUrl);
		logger.debug("requestUrl........" + requestUrl);

		FilterInvocation filterInvocation = (FilterInvocation) object;
		HttpServletRequest request = filterInvocation.getHttpRequest();

		// 如果是DWR的消息推送
		RequestMatcher dwrMatcher = new AntPathRequestMatcher(DWR_PUSH_URL);
		if (dwrMatcher.matches(request)) {
			return new ArrayList<ConfigAttribute>();
		}

		// 第一次从数据库读取，第二次开始从内存中读取
		rolesResourceMap = getFromCache(CACHE_KEY);
		if (rolesResourceMap == null) {
			loadRolesResourceDefine();
		}

		Iterator<String> ite = rolesResourceMap.keySet().iterator();
		while (ite.hasNext()) {
			String resourceUrl = ite.next();

			RequestMatcher urlMatcher = new AntPathRequestMatcher(resourceUrl);

			// System.out.println("request..." + request);

			if (urlMatcher.matches(request)) {
				// Collection<ConfigAttribute> roleAttributes = rolesResourceMap.get(resourceUrl);
				System.out.println("needs the roles.........." + rolesResourceMap.get(resourceUrl));

				// if (roleAttributes.contains("ROLE_ACCOUNT")) {
				return rolesResourceMap.get(resourceUrl);
				// }
			}
		}

		return new ArrayList<ConfigAttribute>();
	}

	/**
	 * 每次请求都会执行
	 * 获取与需要保护的安全对象关联的属性信息
	 * 返回所请求资源所需要的权限(role name)  
	 * (要有 url.indexOf("?")这样的判断，要通过判断对URL特别是Action问号之前的部分进行匹配，  
	 * 防止用户请求的带参数的URL与你数据库中定义的URL不匹配，造成访问拒绝)  
	 */
	public Collection<ConfigAttribute> getAttributes2(Object object) throws IllegalArgumentException {
		// 获得请求的URL地址
		String requestUrl = ((FilterInvocation) object).getRequestUrl();
		int firstQuestionMarkIndex = requestUrl.indexOf("?");
		if (firstQuestionMarkIndex != -1) {
			requestUrl = requestUrl.substring(0, firstQuestionMarkIndex);
		}

		System.out.println("requestUrl..." + requestUrl);
		logger.debug("requestUrl........" + requestUrl);

		FilterInvocation filterInvocation = (FilterInvocation) object;
		HttpServletRequest request = filterInvocation.getHttpRequest();

		// 如果是DWR的消息推送就无需校验
		RequestMatcher dwrMatcher = new AntPathRequestMatcher("/dwr/call/plainpoll/ReverseAjax.dwr");
		if (dwrMatcher.matches(request)) {
			return new ArrayList<ConfigAttribute>();
		}

		// 如果为空，先加载
		if (rolesResourceMap == null) {
			loadRolesResourceDefine();
		}

		Iterator<String> ite = rolesResourceMap.keySet().iterator();
		while (ite.hasNext()) {
			String resourceUrl = ite.next();

			RequestMatcher urlMatcher = new AntPathRequestMatcher(resourceUrl);

			// System.out.println("request..." + request);

			if (urlMatcher.matches(request)) {
				// Collection<ConfigAttribute> roleAttributes = rolesResourceMap.get(resourceUrl);
				System.out.println("needs the roles.........." + rolesResourceMap.get(resourceUrl));

				// if (roleAttributes.contains("ROLE_ACCOUNT")) {
				return rolesResourceMap.get(resourceUrl);
				// }
			}
		}

		return new ArrayList<ConfigAttribute>();
		// return rolesResourceMap.get(requestUrl);

		// 如果找不到匹配的资源与权限的关系，就重新从数据库中加载
		// if (rolesResourceMap.get(requestUrl) == null) {
		// // 指定URL资源
		// SecurityGroupResourceViewSearch securityGroupResourceSearch = new
		// SecurityGroupResourceViewSearch();
		// securityGroupResourceSearch.setUrl(requestUrl);
		// List<SecurityGroupResourceViewModel> securityGroupResourceModels = securityFacade
		// .findListSecurityGroupResourceDefine(securityGroupResourceSearch);
		//
		// for (SecurityGroupResourceViewModel securityGroupResourceModel :
		// securityGroupResourceModels) {
		// Collection<ConfigAttribute> configAttributes = new ArrayList<ConfigAttribute>();
		//
		// SecurityGroupResourceViewSearch roleSearch = new SecurityGroupResourceViewSearch();
		// roleSearch.setCompanyCode(securityGroupResourceModel.getCompanyCode());
		// roleSearch.setResourceId(securityGroupResourceModel.getResourceId());
		//
		// List<SecurityGroupResourceViewModel> roleModels = securityFacade
		// .findListSecurityGroupResourceView(roleSearch);
		//
		// // ROLE_
		// for (SecurityGroupResourceViewModel role : roleModels) {
		// ConfigAttribute configAttribute = new SecurityConfig(role.getRoleCode());
		// configAttributes.add(configAttribute);
		//
		// // System.out.println(securityGroupResourceModel.getUrl() + "........" +
		// // role.getRoleCode());
		//
		// rolesResourceMap.put(securityGroupResourceModel.getUrl(), configAttributes);
		// }
		// }
		//
		// }
	}


	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return null;
	}

	public boolean supports(Class<?> clazz) {
		return true;
	}


}
