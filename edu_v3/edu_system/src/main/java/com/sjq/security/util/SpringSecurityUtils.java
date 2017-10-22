package com.sjq.security.util;

import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

/**
 * 
 * 权限控制工具类
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月15日下午5:20:58
 * @version 1.0
 */
public final class SpringSecurityUtils {

	/**
	 * @return
	 */
	public static String getCurrentUserCode() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth == null) {
			return "";
		}

		if (auth.getName().equals("roleAnonymous")) {
			return "";
		}

		return auth.getName();
	}

	/**
	 * @return
	 */
	public static Collection<? extends GrantedAuthority> getAuthority() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal == null) {
			return null;
		}

		Collection<? extends GrantedAuthority> authSet = SecurityContextHolder.getContext().getAuthentication()
				.getAuthorities();

		return authSet;
	}

	/**
	 * @return
	 */
	public static Authentication getAuthentication() {
		SecurityContext context = SecurityContextHolder.getContext();
		if (context != null) {
			return context.getAuthentication();
		}
		return null;
	}

	/**
	 * ������չ���¼�û���Ϣ
	 * @return
	 */
	public static CustomUser getCurrentCustomUser() {
		Authentication authentication = getAuthentication();

		if (authentication != null && authentication.getPrincipal() != null
				&& !authentication.getPrincipal().equals("anonymousUser")) {
			return (CustomUser) authentication.getPrincipal();
		}
		return null;

	}

	/**
	 * 
	 * 返回擴展後登錄用戶信息
	 * @return
	 */
	public static User getCurrentBasicUser() {
		Object principal = null;
		try {
			principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception e) {

		}
		if (principal == null || principal.equals("anonymousUser")) {
			return null;
		}

		return (User) principal;
	}
}
