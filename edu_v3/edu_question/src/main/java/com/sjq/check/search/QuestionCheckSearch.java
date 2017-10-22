package com.sjq.check.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]题库模块-题库审核Search
 * @author  ShuiJingQiu
 * @since   2017-05-10 01:34:44
 * @version 1.0
 */

public class QuestionCheckSearch{

	private Long id; /* 自增id */
	private Long querstionId; /* 试题id */
	private Long userId; /* 用户id(老师id) */
	private String checkStatus; /* 0.待审核 1.审核通过 2.审核不通过  */
	private Long stageId;  /* 学段id */
	private Long gradeId;  /* 年级id */
	private Long subjectId; /* 学科id */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public Long getQuerstionId() {
		return querstionId;
	}

	public void setQuerstionId(Long querstionId) {
		this.querstionId = querstionId;
	} 
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	} 
	public String getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	} 
	

}