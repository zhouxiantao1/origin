package com.sjq.workQuestion.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]作业题目信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-05 23:19:47
 * @version 1.0
 */

public class WorkWorkQuestionSearch{

	private Long id; /* 自增id */
	private Long homeworkId; /* 作业ID */
	private Long questionId; /* 题目ID */
	private String delflag; /* (默认)删除标识 */
	
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
	
	
	
}