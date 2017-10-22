package com.sjq.security.extend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.sjq.security.bean.SecurityUser;
import com.sjq.security.service.SecurityResourceService;
import com.sjq.security.service.SecurityUserService;
import com.sjq.security.util.CustomUser;

/**
 * 
 * 实现springsecurity的userdetailsservice接口,负责用户信息校验
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月9日下午2:34:34
 * @version 1.0
 */
@Service("customBossUserDetailsService")
public class CustomBossUserDetailsServiceImpl implements UserDetailsService {
	// private final String SPLIT = "\t";
	private final String ROLE_DEFAULT = "ROLE_DEFAULT";

	@Autowired
	private SecurityUserService securityUserService;
	
	@Autowired
	private SecurityResourceService securityResourceService;
	

	/******************************************** UserDetails ********************************************/

	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException, DataAccessException {
		
		
		SecurityUser user = securityUserService.queryUserByCode(userName);
		
	
		List<Map<String,Object>> menumap = null;    	//收集菜单 信息

		if (user == null) {
			throw new AuthenticationServiceException("错误的用户号：" + userName + "。");
		}else{
			
			//修改登录信息 -----------------------------------
			SecurityUser suv = new SecurityUser();
			if(user.getFirstLoginTime()==null){
				suv.setFirstLoginTime(new Date());
			}
			
			suv.setLastLoginTime(new Date());
			suv.setLoginNum(user.getLoginNum()+1L);
			suv.setId(user.getId());
			securityUserService.updateUserById(suv);
			//---------------------------------------------
			
			menumap = new ArrayList<Map<String,Object>>();
			//查看1级资源
			
			Map<String,Object> levelM1 = new HashMap<String,Object>();
			levelM1.put("level", 1);
			levelM1.put("roleId", user.getSecurityRole().getId());
			List<Map<String,Object>> levelMap1s = securityResourceService.queryBossLeftMenu(levelM1);
			
			//查看2级资源
			
			for(Map<String,Object> map:levelMap1s){
				
				Map<String,Object> levelM2 = new HashMap<String,Object>();
				levelM2.put("level", 2);
				levelM2.put("parentId", map.get("id"));
				levelM2.put("roleId", user.getSecurityRole().getId());
				List<Map<String,Object>> levelMap2s = securityResourceService.queryBossLeftMenu(levelM2);
				
				if(levelMap2s != null && levelMap2s.size() >0){
					map.put("menu2map"	, levelMap2s);
					menumap.add(map);
				}
				
			}
			
		}
		Set<GrantedAuthority> grantedAuthority = new HashSet<GrantedAuthority>();
		grantedAuthority.add(new SimpleGrantedAuthority(user.getSecurityRole().getCode()));
		
		// 無以下屬性，全部設置為true
		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;

		// 返回扩展后的CustomUserDetails，这样就将companyCode属性扩展并交给springsecurity存放到session了
		CustomUser customUser = new CustomUser(menumap,user.getSecurityRole(),user.getId(),user.getCode(), user.getName(), user.getPassword(),new Date(), enabled, accountNonExpired, credentialsNonExpired,accountNonLocked, grantedAuthority);

		return customUser;
		
	}

	/**
	 * 获取用户所有角色的权限集合，以便比较
	 * @param securityUserModel
	 * @return
	 */
	private Collection<? extends GrantedAuthority> obtainGrantedAuthorities() {
		Set<GrantedAuthority> authSet = new HashSet<GrantedAuthority>();

//		SecurityGroupResourceViewSearch roleSearch = new SecurityGroupResourceViewSearch();
//		// roleSearch.setCompanyCode(securityUserModel.getCompanyCode());
//		roleSearch.setGroupId(securityUserModel.getGroupId());
//
//		List<SecurityGroupResourceViewModel> roleModels = securityFacade.findListSecurityGroupResourceView(roleSearch);
//
//		authSet.add(new SimpleGrantedAuthority(ROLE_DEFAULT));
//		for (SecurityGroupResourceViewModel model : roleModels) {
//			authSet.add(new SimpleGrantedAuthority(model.getRoleCode()));
//		}
//
//		// 较高优先级角色拥有较低优先级角色的所有权限
//		SecurityGroupSearch search = new SecurityGroupSearch();
//		search.setIsVisible(1);
//		search.setRightLevel(securityUserModel.getRightLevel());
//		List<SecurityGroupModel> roleList = securityFacade.findBelowRightLevel(search);
//
//		for (SecurityGroupModel group : roleList) {
//			authSet.add(new SimpleGrantedAuthority(group.getRoleCode()));
//		}
//
//		// for (GrantedAuthority gaRole : authSet) {
//		// System.out.println("1111 is " + gaRole.getAuthority());
//		// }

		return authSet;
	}
	
}
