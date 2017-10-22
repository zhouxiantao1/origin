package com.sjq.homeworkClasses.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]作业班级信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-12 10:00:42
 * @version 1.0
 */

public class WorkHomeworkClassesSearch{

	private Long id; /* 自增id */
	private Long homeworkId; /* 作业ID */
	private Long status; /* 0-待完成，1-已完成的和未完成的 */
	private Long classesId; /* 班级ID */
	private Long studentId; /* 班级ID */
	private String title;/*作业标题*/
	
	private String ansStatus; //1-已完成，0-未完成
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getHomeworkId() {
		return homeworkId;
	}

	public void setHomeworkId(Long homeworkId) {
		this.homeworkId = homeworkId;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getClassesId() {
		return classesId;
	}

	public void setClassesId(Long classesId) {
		this.classesId = classesId;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAnsStatus() {
		return ansStatus;
	}

	public void setAnsStatus(String ansStatus) {
		this.ansStatus = ansStatus;
	} 

	
}