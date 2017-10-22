package com.sjq.security.search;

import com.sjq.security.bean.BaseBean;

/**
 * 
 * 角色管理前端搜索条件
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月10日下午3:20:39
 * @version 1.0
 */
public class SecurityRoleSearch extends BaseBean{
	
	private Long id;             //角色id
	
	private String code;         //角色编码
 
 	private String name;         //角色名称

	private String isVisible;    //是否启用
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

}