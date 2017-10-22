package com.sjq.develop.vo;

import java.util.Date;

import com.sjq.develop.utils.StringUtil;


/**
 * 
 * [自动生成]代码生成模块Vo
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月11日下午4:05:20
 * @version 1.0
 */
public class DevelopCodeVo{

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
	private String upperModuleName="";          /*转首字母大写 */
	private String lowerModuleName="";          /*转首字母小写 */
	private String upperProjectName="";         /*所属模块大写 */
	private String lowerProjectName="";         /*所属模块小写 */
	private String tableTop;
	
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
		this.upperProjectName = StringUtil.toUpperCaseName(projectName);
		this.lowerProjectName = StringUtil.toLowerCaseName(projectName);
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
		this.upperModuleName = StringUtil.toUpperCaseName(moduleName);
		this.lowerModuleName = StringUtil.toLowerCaseName(moduleName);
	}
	public String getCodeComment() {
		return codeComment;
	}
	public void setCodeComment(String codeComment) {
		this.codeComment = codeComment;
	}
	
	public String getUpperModuleName() {
		return upperModuleName;
	}
	public void setUpperModuleName(String upperModuleName) {
		this.upperModuleName = upperModuleName;
	}
	public String getLowerModuleName() {
		return lowerModuleName;
	}
	public void setLowerModuleName(String lowerModuleName) {
		this.lowerModuleName = lowerModuleName;
	}
	public String getUpperProjectName() {
		return upperProjectName;
	}
	public void setUpperProjectName(String upperProjectName) {
		this.upperProjectName = upperProjectName;
	}
	public String getLowerProjectName() {
		return lowerProjectName;
	}
	public void setLowerProjectName(String lowerProjectName) {
		this.lowerProjectName = lowerProjectName;
	}
	public String getTableTop() {
		return tableTop;
	}
	public void setTableTop(String tableTop) {
		this.tableTop = tableTop;
	}
	

}