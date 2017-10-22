package com.sjq.security.bean;

import java.io.Serializable;

/**
 * 
 * 角色
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月10日下午3:20:39
 * @version 1.0
 */
public class SecurityRole extends BaseBean implements Serializable{
	
	private String code;         //角色编码
 
 	private String name;         //角色名称

	private String isVisible;    //是否启用
	
	private String description;  //描述
	
	private String type;         //角色类型
	
	private Long sort;           //排序
	
	private Long roleId;         //角色id
	
	
	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
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

	public String getIsVisible() {
		return isVisible;
	}

	public void setIsVisible(String isVisible) {
		this.isVisible = isVisible;
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

}