package com.sjq.adaptation.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]考试模块-自适应试题库Search
 * @author  ShuiJingQiu
 * @since   2017-05-22 19:19:03
 * @version 1.0
 */

public class ExamAdaptationQuestionSearch{

	private Long id; /* 自增id */
	private Long typeId; /* 题型id */
	private Long knowledgeId; /* 知识点id */
	private Long questionId; /* 试题id */
	private Long adaptationId; /* 自适应测试id */
	private BigDecimal difficulty; /* 难度 */
	private Long userId; 
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	} 
	public Long getKnowledgeId() {
		return knowledgeId;
	}

	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
	} 
	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	} 
	public Long getAdaptationId() {
		return adaptationId;
	}

	public void setAdaptationId(Long adaptationId) {
		this.adaptationId = adaptationId;
	}

	public BigDecimal getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(BigDecimal difficulty) {
		this.difficulty = difficulty;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	} 
	
	
	


}