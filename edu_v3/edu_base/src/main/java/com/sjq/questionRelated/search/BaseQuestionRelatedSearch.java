package com.sjq.questionRelated.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]题目知识点目录信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-06 00:47:45
 * @version 1.0
 */

public class BaseQuestionRelatedSearch{

	private Long id; /* 自增id */
	private Long relatedId;//知识点或者章节ID
	private String relatedType; /* 1-目录详情，2-知识点 */
	private Long questionId; /* 题目ID */
	private String relatedIds;//目录的id集合，形式为relatedIds="id1,id2,id3"
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRelatedId() {
		return relatedId;
	}

	public void setRelatedId(Long relatedId) {
		this.relatedId = relatedId;
	}

	public String getRelatedType() {
		return relatedType;
	}

	public void setRelatedType(String relatedType) {
		this.relatedType = relatedType;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getRelatedIds() {
		return relatedIds;
	}

	public void setRelatedIds(String relatedIds) {
		this.relatedIds = relatedIds;
	} 

	
}