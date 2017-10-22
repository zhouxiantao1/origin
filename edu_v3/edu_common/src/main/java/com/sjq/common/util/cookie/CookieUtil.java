package com.sjq.common.util.cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Cookie工具类
 * 
 * @author ZeJie.Zheng
 * @since 2017年7月4日
 * @version 1.0
 */
public class CookieUtil {

	private CookieUtil() {
	}

	/**
	 * 添加cookie
	 * 
	 * @param response
	 * @param name
	 * @param value
	 * @param maxAge
	 */
	public static void addCookie(HttpServletResponse response, String name, String value) {
		Cookie cookie = new Cookie(name, value);
		cookie.setMaxAge(3600);
		cookie.setPath("/");
		response.addCookie(cookie);
		
	}

	/**
	 * 删除cookie
	 * 
	 * @param response
	 * @param name
	 */
	public static void removeCookie(HttpServletResponse response, String name) {
		Cookie uid = new Cookie(name, null);
		uid.setMaxAge(0);
		uid.setPath(null);
		response.addCookie(uid);
	}

	/**
	 * 获取cookie值
	 * 
	 * @param request
	 * @return
	 */
	public static String getCookie(HttpServletRequest request, String cookieName) {
		Cookie cookies[] = request.getCookies();
		if(cookies!=null){
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals(cookieName)) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}
}
