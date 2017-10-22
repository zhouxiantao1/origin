package com.sjq.security.bean;

import java.util.Date;

public class BaseBean {
	
	/*
	 * 自增id
	 */
	private Long id;
	
	/*
	 * 创建时间
	 */
	private Date createTime;

	/*
	 * 创建人
	 */
	private String createUser;

	/*
	 * 修改时间
	 */
	private Date updateTime;

	/*
	 * 修改人
	 */
	private String updateUser;
	
	/*
	 * 删除标识
	 */
	private String delflag;
	

	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
	
	

}
