package com.sjq.answer.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]题库模块-题库答案Search
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:19:47
 * @version 1.0
 */

public class QuestionAnswerSearch{

	private Long id; /* 自增id */
	private Long questionId; /* 试题id */
	
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


}