package com.sjq.teacherClasses.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]教师班级信息Search
 * @author  ShuiJingQiu
 * @since   2017-04-27 15:29:16
 * @version 1.0
 */

public class BaseTeacherClassesSearch{

	private Long id; /* 自增id */
	private Long teacherId;
	private Long gradeId;//年级ID
	private Long classesId; /* 班级ID */
	private Long subjectId; /* 学科ID */
	
	private String group; /*分组 1-年级,2-班级,3-学科 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Long getClassesId() {
		return classesId;
	}

	public void setClassesId(Long classesId) {
		this.classesId = classesId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	} 
	
	
}