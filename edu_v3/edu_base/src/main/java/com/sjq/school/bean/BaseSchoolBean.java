package com.sjq.school.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]基础模块-学校信息bean
 * @author  ShuiJingQiu
 * @since   2017-04-25 16:53:37
 * @version 1.0
 */

public class BaseSchoolBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String name; /* 学校名称 */
	private String shortName; /* 简称 */
	private String address; /* 学校地址 */
	private Long areaId; /* 区域ID */
	private String type; /* 学校类型 */
	private String level; /* 学校等级 */
	private String handleSort; /* 学校办别 */
	private Long sort; /* 排序 */
	private String remake; /* 备注 */
	private String isHeadmaster; /* 0-没有校长，1-有校长 */
	private String isAdmin; /* 是否有管理员，0-没有管理员，1-有管理员 */
	
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
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	} 
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	} 
	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	} 
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	} 
	public String getHandleSort() {
		return handleSort;
	}

	public void setHandleSort(String handleSort) {
		this.handleSort = handleSort;
	} 
	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	} 
	public String getRemake() {
		return remake;
	}

	public void setRemake(String remake) {
		this.remake = remake;
	} 
	public String getIsHeadmaster() {
		return isHeadmaster;
	}

	public void setIsHeadmaster(String isHeadmaster) {
		this.isHeadmaster = isHeadmaster;
	} 
	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	} 


}