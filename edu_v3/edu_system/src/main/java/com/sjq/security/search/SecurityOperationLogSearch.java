package com.sjq.security.search;

import java.util.Date;

/**
 * 查询条件
 * [自动生成]系统日志操作Search
 * @author  ShuiJingQiu
 * @since   2017-07-06 15:34:36
 * @version 1.0
 */

public class SecurityOperationLogSearch{

	private Long id; /* 自增id */
	private String delflag; /* (默认)删除标识 */
	private String ip; /* ip */
	private String userCode; /* 登录帐号名 */
	private String userName; /* 操作人姓名 */
	private Date operateTime; /* 操作时间 */
	private String operateUrl; /* 操作地址 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	} 
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	} 
	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	} 
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	} 
	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	} 
	public String getOperateUrl() {
		return operateUrl;
	}

	public void setOperateUrl(String operateUrl) {
		this.operateUrl = operateUrl;
	} 


}