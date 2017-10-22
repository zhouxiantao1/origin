package com.sjq.dict.vo;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]字典工具信息vo
 * @author  ShuiJingQiu
 * @since   2017-04-27 18:11:47
 * @version 1.0
 */

public class BaseDictVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String type; /* 类型 */
	private String label; /* 标签 */
	private String value; /* 键值 */
	private Long parentId; /* 父类ID */
	private String parentIds; /* 父类IDS */
	private Long sort; /* 排序 */
	
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
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	} 
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	} 
	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	} 
	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	} 
	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	} 


}