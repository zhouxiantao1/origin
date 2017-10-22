package com.sjq.wrong.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]错题信息Search
 * @author  ShuiJingQiu
 * @since   2017-06-27 16:47:56
 * @version 1.0
 */

public class WorkWrongSearch{

	private Long id; /* 自增id */
	private Long questionId; /* 题目ID */
	private String delflag; /* (默认)删除标识 */
	private Long stageId; /* 学段ID */
	private Long gradeId; /* 年级ID */
	private Long subjectId; /* 学科ID */
	private Long questionType; /* 题型ID */
	private Long userId; /* 用户ID */
	private String status; /* 0-没掌握，1-已掌握 */
	private String type; /* 0-我的错题，1-公共错题 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
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

	public Long getQuestionType() {
		return questionType;
	}

	public void setQuestionType(Long questionType) {
		this.questionType = questionType;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 

	
}