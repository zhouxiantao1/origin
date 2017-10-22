package com.sjq.develop.bean;

import java.util.Date;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月12日下午3:57:49
 * @version 1.0
 */
public class DevelopMethodBean {

	private Long id;           /* id  */
	private Date createTime;   /* 创建时间   */
	private String createName; /* 创建人 */
	private Date modTime;      /* 修改时间  */
	private String modName;    /* 修改人 */
	private String delflag;    /* 删除标识 */
	
	private String methodName;
	private String methodComment;
	private String methodClassType;
	private String methodCode;
	
	private String controllerRequestMapping;
	
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
	public String getCreateName() {
		return createName;
	}
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	public Date getModTime() {
		return modTime;
	}
	public void setModTime(Date modTime) {
		this.modTime = modTime;
	}
	public String getModName() {
		return modName;
	}
	public void setModName(String modName) {
		this.modName = modName;
	}
	public String getDelflag() {
		return delflag;
	}
	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getMethodComment() {
		return methodComment;
	}
	public void setMethodComment(String methodComment) {		this.methodComment = methodComment;
	}
	public String getMethodClassType() {
		return methodClassType;
	}
	public void setMethodClassType(String methodClassType) {
		this.methodClassType = methodClassType;
	}
	public String getMethodCode() {
		return methodCode;
	}
	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode;
	}
	public String getControllerRequestMapping() {
		return controllerRequestMapping;
	}
	public void setControllerRequestMapping(String controllerRequestMapping) {
		this.controllerRequestMapping = controllerRequestMapping;
	}
	
	
	
	

}
