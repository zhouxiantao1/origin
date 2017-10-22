package com.sjq.common.util.http;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月9日上午11:31:01
 * @version 1.0
 */
public final class HttpUtil {


	/**
	* @param request
	* @return
	*/
	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
}
