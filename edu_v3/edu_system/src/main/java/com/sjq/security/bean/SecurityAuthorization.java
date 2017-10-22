package com.sjq.security.bean;

/**
 * 
 * 角色资源
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月10日下午3:29:48
 * @version 1.0
 */
public class SecurityAuthorization extends BaseBean{
	 
	private Long roleId;            //角色id
	
	private Long resourceId;        //资源id

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	

}