package com.sjq.answerAsk.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]回答提问信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-04 18:30:14
 * @version 1.0
 */

public class InterlocutionAnswerAskSearch{

	private Long id; /* 自增id */
	private Long askId; /* 问题ID */
	private Long userId;
	private Long subjectId; /* 学科ID */
	private Long gradeId; /* 年级ID */
	private String delflag; /* (默认)删除标识 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAskId() {
		return askId;
	}

	public void setAskId(Long askId) {
		this.askId = askId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	} 

	
}