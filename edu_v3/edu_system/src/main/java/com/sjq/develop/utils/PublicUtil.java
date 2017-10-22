package com.sjq.develop.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月11日上午9:53:59
 * @version 1.0
 */
public class PublicUtil {

	public static void main(String[] args) {
		System.out.println("本机的ip=" + PublicUtil.getIp());
	}

	public static String getPorjectPath() {
		String nowpath = "";
		nowpath = System.getProperty("user.dir") + "/";

		return nowpath;
	}

	/**
	 * 获取本机ip
	 * @return
	 */
	public static String getIp() {
		String ip = "";
		try {
			InetAddress inet = InetAddress.getLocalHost();
			ip = inet.getHostAddress();
			// System.out.println("本机的ip=" + ip);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		return ip;
	}

}