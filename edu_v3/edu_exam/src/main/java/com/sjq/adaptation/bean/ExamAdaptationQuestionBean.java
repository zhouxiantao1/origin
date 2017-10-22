package com.sjq.adaptation.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]考试模块-自适应试题库bean
 * @author  ShuiJingQiu
 * @since   2017-05-22 19:19:03
 * @version 1.0
 */

public class ExamAdaptationQuestionBean{


	private Long id; /* 自增id */
	private Date createTime; /* (默认)创建时间 */
	private Long typeId; /* 题型id */
	private Long knowledgeId; /* 知识点id */
	private BigDecimal difficulty; /* 试题难度值（取值由0到1为简单到困难） */
	private Long questionId; /* 试题id */
	private Long adaptationId; /* 自适应测试id */
	private String questionContent; /* 试题内容（冗余） */
	private String options; /* 试题选项与答案 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
	public BigDecimal getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(BigDecimal difficulty) {
		this.difficulty = difficulty;
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
	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	} 
	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	} 


}