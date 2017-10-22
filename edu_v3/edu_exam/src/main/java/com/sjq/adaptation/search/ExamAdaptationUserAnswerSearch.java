package com.sjq.adaptation.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]考试模块-自适应测试用户答题记录表Search
 * @author  ShuiJingQiu
 * @since   2017-05-22 17:34:42
 * @version 1.0
 */

public class ExamAdaptationUserAnswerSearch{

	private Long id; /* 自增id */
	private Long number; /* 题序（第几题） */
	private String isRight; /* 0 正确  1错误 */
	private Long knowledgeId; /* 知识点id */
	private Long adaptationId; /* 自适应测试id */
	private Long userId; /* 用户id */
	private Long questionId; /* 试题id */
	private Date answerTime; /* 测试时间 */
	private Long answerSecond; /* 用时 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	} 
	public String getIsRight() {
		return isRight;
	}

	public void setIsRight(String isRight) {
		this.isRight = isRight;
	} 
	public Long getKnowledgeId() {
		return knowledgeId;
	}

	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
	} 
	public Long getAdaptationId() {
		return adaptationId;
	}

	public void setAdaptationId(Long adaptationId) {
		this.adaptationId = adaptationId;
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
	public Date getAnswerTime() {
		return answerTime;
	}

	public void setAnswerTime(Date answerTime) {
		this.answerTime = answerTime;
	} 
	public Long getAnswerSecond() {
		return answerSecond;
	}

	public void setAnswerSecond(Long answerSecond) {
		this.answerSecond = answerSecond;
	} 


}