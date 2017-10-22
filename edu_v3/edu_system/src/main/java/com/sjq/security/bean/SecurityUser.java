package com.sjq.security.bean;

import java.util.Date;

/**
 * 
 * 用户表
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月10日下午3:01:43
 * @version 1.0
 */
public class SecurityUser extends BaseBean{
	
	private String code;  // 帐号

	private String name;  //姓名

	private String password;   //密码
	
	private String isAccountNonLocked; //帐户是否可用  0可用  1不可用
	
	private String description;  //描述
	
	private String type;         //帐号类型
	
	private Date firstLoginTime; //首次登录时间
	
	private Date lastLoginTime;  //首次登录时间
	
	private Long loginNum;       //登录次数
	
	private Long roleId;         //角色id
	
	private Date expireTime;  //首次登录时间
	
	private SecurityRole securityRole;   //角色信息
	
	
	public SecurityRole getSecurityRole() {
		return securityRole;
	}

	public void setSecurityRole(SecurityRole securityRole) {
		this.securityRole = securityRole;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getFirstLoginTime() {
		return firstLoginTime;
	}

	public void setFirstLoginTime(Date firstLoginTime) {
		this.firstLoginTime = firstLoginTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Long getLoginNum() {
		return loginNum;
	}

	public void setLoginNum(Long loginNum) {
		this.loginNum = loginNum;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIsAccountNonLocked() {
		return isAccountNonLocked;
	}

	public void setIsAccountNonLocked(String isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	
	

}