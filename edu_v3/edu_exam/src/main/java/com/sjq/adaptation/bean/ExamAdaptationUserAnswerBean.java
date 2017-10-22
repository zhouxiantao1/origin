package com.sjq.adaptation.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]考试模块-自适应测试用户答题记录表bean
 * @author  ShuiJingQiu
 * @since   2017-05-22 17:34:42
 * @version 1.0
 */

public class ExamAdaptationUserAnswerBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long number; /* 题序（第几题） */
	private String isRight; /* 0 正确  1错误 */
	private Long knowledgeId; /* 知识点id */
	private Long adaptationId; /* 自适应测试id */
	private Long userId; /* 用户id */
	private Long questionId; /* 试题id */
	private Date answerTime; /* 测试时间 */
	private Long answerSecond; /* 用时 */
	
	private String bloomTaxonomy; /* 布鲁姆认知体系1知道，2领会，3应用，4分析，5综合，6评价  */
	
	
	private BigDecimal difficulty; /* 难度  */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	} 
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	} 
	public String getModName() {
		return modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	} 
	public Date getModTime() {
		return modTime;
	}

	public void setModTime(Date modTime) {
		this.modTime = modTime;
	} 
	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
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
	
	

	public BigDecimal getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(BigDecimal difficulty) {
		this.difficulty = difficulty;
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

	public String getBloomTaxonomy() {
		return bloomTaxonomy;
	}

	public void setBloomTaxonomy(String bloomTaxonomy) {
		this.bloomTaxonomy = bloomTaxonomy;
	} 

	

}