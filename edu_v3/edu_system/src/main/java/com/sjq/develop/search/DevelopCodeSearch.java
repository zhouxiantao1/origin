package com.sjq.develop.search;

import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * 代码生成模块search(搜索条件)
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月11日下午4:03:23
 * @version 1.0
 */
public class DevelopCodeSearch{


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

}