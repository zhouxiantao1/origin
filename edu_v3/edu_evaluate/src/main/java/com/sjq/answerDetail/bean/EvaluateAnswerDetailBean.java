package com.sjq.answerDetail.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]作答明细信息bean
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:58
 * @version 1.0
 */

public class EvaluateAnswerDetailBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long evaDetailId; /* 测评明细ID */
	private Long answerId; /* 作答ID */
	private Long questionId; /* 题目ID */
	private Long selectionId; /* 选项ID */
	private String selectionNum; /* 选项号 */
	private BigDecimal score; /* 得分 */
	private Long userId; /* 用户ID */
	private Long issueListId; /* 发布列表ID */
	
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
	public Long getEvaDetailId() {
		return evaDetailId;
	}

	public void setEvaDetailId(Long evaDetailId) {
		this.evaDetailId = evaDetailId;
	} 
	public Long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	} 
	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	} 
	public Long getSelectionId() {
		return selectionId;
	}

	public void setSelectionId(Long selectionId) {
		this.selectionId = selectionId;
	} 
	public String getSelectionNum() {
		return selectionNum;
	}

	public void setSelectionNum(String selectionNum) {
		this.selectionNum = selectionNum;
	} 
	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getIssueListId() {
		return issueListId;
	}

	public void setIssueListId(Long issueListId) {
		this.issueListId = issueListId;
	} 

	
}