package com.sjq.area.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]基础模块-区域信息bean
 * @author  ShuiJingQiu
 * @since   2017-04-25 16:25:00
 * @version 1.0
 */

public class BaseAreaBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long parentId; /*  */
	private String parentIds; /*  */
	private String name; /*  */
	private Long level; /* 等级 */
	private String remake; /* 备注 */
	
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
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	public Long getLevel() {
		return level;
	}

	public void setLevel(Long level) {
		this.level = level;
	} 
	public String getRemake() {
		return remake;
	}

	public void setRemake(String remake) {
		this.remake = remake;
	} 


}