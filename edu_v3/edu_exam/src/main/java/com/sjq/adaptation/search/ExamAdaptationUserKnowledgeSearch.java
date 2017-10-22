package com.sjq.adaptation.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]考试模块-自适应测试用户知识点难度历史记录表Search
 * @author  ShuiJingQiu
 * @since   2017-05-22 18:07:22
 * @version 1.0
 */

public class ExamAdaptationUserKnowledgeSearch{

	private Long id; /* 自增id */
	private Long knowledgeId; /* 知识点id */
	private Long userId; /* 用户id */
	private BigDecimal difficulty; /* 试题难度值（取值由0到1为简单到困难） */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public Long getKnowledgeId() {
		return knowledgeId;
	}

	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
	} 
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	} 
	public BigDecimal getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(BigDecimal difficulty) {
		this.difficulty = difficulty;
	} 


}