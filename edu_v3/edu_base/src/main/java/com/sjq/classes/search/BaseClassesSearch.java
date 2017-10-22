package com.sjq.classes.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]基础模块-班级信息Search
 * @author  ShuiJingQiu
 * @since   2017-04-25 17:17:24
 * @version 1.0
 */

public class BaseClassesSearch{

	private Long id; /* 自增id */
	private String name; /* 班级名称 */
	private Long gradeId; /* 年级编码 */
	private Long schoolId;
	private Long areaId;
	
	
	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	


}