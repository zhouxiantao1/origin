package com.sjq.collect.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]题库模块-题库收藏Search
 * @author  ShuiJingQiu
 * @since   2017-05-09 01:36:25
 * @version 1.0
 */

public class QuestionCollectSearch{

	private Long id; /* 自增id */
	private Long userId; /* 用户id */
	private Long questionId; /* 试题id */
	private String delflag;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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