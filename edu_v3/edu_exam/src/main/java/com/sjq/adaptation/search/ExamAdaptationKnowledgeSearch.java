package com.sjq.adaptation.search;


/**
 * 查询条件
 * [自动生成]考试模块-自适应与知识点关联Search
 * @author  ShuiJingQiu
 * @since   2017-05-17 22:26:50
 * @version 1.0
 */

public class ExamAdaptationKnowledgeSearch{

	private Long id; /* 自增id */
	private Long adaptationId; /* 自适应测试id */
	private Long knowledgeId; /* 知识点id */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public Long getAdaptationId() {
		return adaptationId;
	}

	public void setAdaptationId(Long adaptationId) {
		this.adaptationId = adaptationId;
	} 
	public Long getKnowledgeId() {
		return knowledgeId;
	}

	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
	} 


}