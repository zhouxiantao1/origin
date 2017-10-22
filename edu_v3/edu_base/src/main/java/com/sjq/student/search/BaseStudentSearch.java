package com.sjq.student.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]基础模块-学生信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-16 15:50:39
 * @version 1.0
 */

public class BaseStudentSearch{

	private Long id; /* 自增id */
	private String name; /* 学生姓名 */
	private Long classesId; /* 班级id */
	private Long areaId; /* 区域id */
	private Long userId; /* 用户id */
	private Long schoolId; /* 学校ID */
	private Long gradeId; /* 年级ID */
	
	private Long teacherId;//用户分页查询该老师任教班级的所有学生
	
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

	public Long getClassesId() {
		return classesId;
	}

	public void setClassesId(Long classesId) {
		this.classesId = classesId;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	} 
	
	

}