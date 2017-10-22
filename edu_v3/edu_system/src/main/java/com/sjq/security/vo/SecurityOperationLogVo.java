package com.sjq.security.vo;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]系统日志操作vo
 * @author  ShuiJingQiu
 * @since   2017-07-06 15:34:36
 * @version 1.0
 */

public class SecurityOperationLogVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String ip; /* ip */
	private String userCode; /* 登录帐号名 */
	private String userName; /* 操作人姓名 */
	private Date operateTime; /* 操作时间 */
	private String operateData; /* 操作数据 */
	private String operateUrl; /* 操作地址 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	} 
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	} 
	public String getModName() {
		return modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	} 
	public Date getModTime() {
		return modTime;
	}

	public void setModTime(Date modTime) {
		this.modTime = modTime;
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
	public String getOperateData() {
		return operateData;
	}

	public void setOperateData(String operateData) {
		this.operateData = operateData;
	} 
	public String getOperateUrl() {
		return operateUrl;
	}

	public void setOperateUrl(String operateUrl) {
		this.operateUrl = operateUrl;
	} 


}