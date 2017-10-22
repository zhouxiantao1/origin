package com.sjq.security.extend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;

/**
 * 
 * 自家义用户授权
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月8日下午5:57:18
 * @version 1.0
 */
public class CustomAccessDecisionManager implements AccessDecisionManager {
	
	final String postfix = "__@";

	public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes)
			throws AccessDeniedException, InsufficientAuthenticationException {
		
		Boolean isNeedAuthorized = false;

		// 如果没有设置就相当开不需权限就可以访问
		if (configAttributes == null) {
			return;
		}

		// for (GrantedAuthority gaRole : authentication.getAuthorities()) {
		// }

		List<String> authorizeRoleCodesList = new ArrayList<String>();
//		for (ConfigAttribute c : configAttributes) {
//			String role = ((SecurityConfig) c).getAttribute();
//			if (role.indexOf(postfix) > 0) {
//				isNeedAuthorized = true;
//				authorizeRoleCodesList.add(role);
//				System.out.println("loop is " + role);
//			}
//		}

		// 所请求的资源拥有的权限(一个资源对多个权限,权限就是那些以ROLE_为前缀的角色)
		// Iterator<ConfigAttribute> iterator = configAttributes.iterator();

		for (ConfigAttribute configAttribute : configAttributes) {
			// while (iterator.hasNext()) {
			// ConfigAttribute configAttribute = iterator.next();

			// 访问所请求资源所需要的权限
			String needRole = ((SecurityConfig) configAttribute).getAttribute();
			System.out.println("needRole is " + needRole);

			// gaRole 为用户所被赋予的权限, needRole
			// 为访问相应的资源应该具有的权限,只有符合其中一个角色就放行，即使AffirmativeBased投票机制
			for (GrantedAuthority gaRole : authentication.getAuthorities()) {
				System.out.println("gaRole is " + gaRole.getAuthority());
				if (needRole.equals(gaRole.getAuthority())) {
					// needAuthorized(isNeedAuthorized);
					return;
//					if (isNeedAuthorized) {
//						// System.out.println("很抱歉,若使用此功能你需要上级授权。");
//						CustomUser customUser = SpringSecurityUtils.getCurrentCustomUser();
//						if (customUser != null && customUser.getUserId() != null
//								&& authorizeRoleCodesList.contains(customUser.getAuthorizeRoleCode())
//								&& customUser.getAuthorizerUserId() != null) {
//							return;
//						} else {
//							throw new AccessDeniedException("很抱歉,若使用此功能你需要上级授权,如" + authorizeRoleCodesList + "角色用户。");
//						}
//					} else {
//						return;
//					}

				}
			}
		}

		// 没有权限
		throw new AccessDeniedException("很抱歉,你没有权限访问此功能。");

	}

	public boolean supports(ConfigAttribute arg0) {
		return true;
	}

	public boolean supports(Class<?> arg0) {
		return true;
	}

	/**
	 * 判断上级是否已授权
	 * 
	 * @param isNeedAuthorized
	 */
	private void needAuthorized(Boolean isNeedAuthorized) {
//		if (isNeedAuthorized) {
//			CustomUser customUser = SpringSecurityUtils.getCurrentCustomUser();
//			if (customUser != null && customUser.getAuthorizerUserId() != null) {
//				throw new AccessDeniedException("没有权限访问!");
//			} else {
//				return;
//			}
//		} else {
//			return;
//		}
	}

}
