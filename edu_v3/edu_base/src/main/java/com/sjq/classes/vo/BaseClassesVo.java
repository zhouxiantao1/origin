package com.sjq.classes.vo;

import java.util.Date;

import com.sjq.school.vo.BaseSchoolVo;

import java.math.BigDecimal;

/**
 * [自动生成]基础模块-班级信息vo
 * @author  ShuiJingQiu
 * @since   2017-04-25 17:17:24
 * @version 1.0
 */

public class BaseClassesVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String name; /* 班级名称 */
	private Long schoolId; /* 学校ID */
	private Long gradeId; /* 年级编码 */
	private String isIncharge; /* 是否有班主任，0-没有，1-有 */
	private Long sort; /* 排序 */
	private String remake; /* 备注 */
	
	private BaseSchoolVo baseSchoolVo;/* 关联的学校Vo*/
	
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
	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	} 
	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	} 
	public String getIsIncharge() {
		return isIncharge;
	}

	public void setIsIncharge(String isIncharge) {
		this.isIncharge = isIncharge;
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

	public BaseSchoolVo getBaseSchoolVo() {
		return baseSchoolVo;
	}

	public void setBaseSchoolVo(BaseSchoolVo baseSchoolVo) {
		this.baseSchoolVo = baseSchoolVo;
	} 

	
}