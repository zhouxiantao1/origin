package com.sjq.security.extend;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.util.Assert;


/**
 * 
 * 扩展Principal，添加了IP
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月9日下午2:33:27
 * @version 1.0
 */
public class CustomPrincipal {
	
	private String username;
	private String ip;

	public CustomPrincipal(String username, String ip) {
		Assert.notNull(username, "username cannot be null (violation of interface contract)");
		Assert.notNull(ip, "username cannot be null (violation of interface contract)");
		this.username = username;
		this.ip = ip;
	}

	public CustomPrincipal(Authentication authentication) {
		Assert.notNull(authentication, "authentication cannot be null (violation of interface contract)");

		String username = null;

		if (authentication.getPrincipal() instanceof UserDetails) {
			username = ((UserDetails) authentication.getPrincipal()).getUsername();
		} else {
			username = (String) authentication.getPrincipal();
		}

		String ip = ((WebAuthenticationDetails) authentication.getDetails()).getRemoteAddress();
		this.username = username;
		this.ip = ip;
	}

	public boolean equalsIp(CustomPrincipal smartPrincipal) {
		return this.ip.equals(smartPrincipal.ip);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CustomPrincipal) {
			CustomPrincipal smartPrincipal = (CustomPrincipal) obj;

			return username.equals(smartPrincipal.username);
		}

		return false;
	}

	@Override
	public int hashCode() {
		return username.hashCode();
	}

	@Override
	public String toString() {
		return "SmartPrincipal:{username=" + username + ",ip=" + ip + "}";
	}
}
