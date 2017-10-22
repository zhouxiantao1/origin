package com.sjq.develop.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * 代码生成模块bean
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月11日下午3:50:12
 * @version 1.0
 */
public class DevelopCodeBean{

	private Long id;           /* id  */
	private Date createTime;   /* 创建时间   */
	private String createName; /* 创建人 */
	private Date modTime;      /* 修改时间  */
	private String modName;    /* 修改人 */
	private String delflag;    /* 删除标识 */
	private String codeName; /* 代码名称 */
	private String projectName;; /* 父模块 */
	private String moduleName; /* 子模块 */
	private String codeComment; /* 代码说明 */
	private Date lastGenerateTime;  /* 最后一次生成时间 */
	private String tableTop;   /* 表前缀  */
	
	public Date getLastGenerateTime() {
		return lastGenerateTime;
	}
	public void setLastGenerateTime(Date lastGenerateTime) {
		this.lastGenerateTime = lastGenerateTime;
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
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getCodeComment() {
		return codeComment;
	}
	public void setCodeComment(String codeComment) {
		this.codeComment = codeComment;
	}
	public String getTableTop() {
		return tableTop;
	}
	public void setTableTop(String tableTop) {
		this.tableTop = tableTop;
	}
	
}