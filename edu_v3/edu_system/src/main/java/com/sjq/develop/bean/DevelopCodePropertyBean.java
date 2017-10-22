package com.sjq.develop.bean;

import java.util.Date;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月12日上午9:35:44
 * @version 1.0
 */
public class DevelopCodePropertyBean {

	private Long id;           /* id  */
	private Date createTime;   /* 创建时间   */
	private String createName; /* 创建人 */
	private Date modTime;      /* 修改时间  */
	private String modName;    /* 修改人 */
	private String delflag;
	private String name;        //属性(字段)名称
	private String type;        //属性(字段)类型 
	private String length;        //属性(字段)长度
	private String isNull;      //属性(字段)是否为空
	private String comment;     //属性(字段)说明
	private String def;         //属性(字段)默认值
	private String isSearch;  //是否生成该属性(字段)对应的操作方法
	private Long codeId;        //所属代码
	
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getIsNull() {
		return isNull;
	}
	public void setIsNull(String isNull) {
		this.isNull = isNull;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDef() {
		return def;
	}
	public void setDef(String def) {
		this.def = def;
	}
	public String getIsSearch() {
		return isSearch;
	}
	public void setIsSearch(String isSearch) {
		this.isSearch = isSearch;
	}
	public Long getCodeId() {
		return codeId;
	}
	public void setCodeId(Long codeId) {
		this.codeId = codeId;
	}
	
}
