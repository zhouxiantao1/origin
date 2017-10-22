package com.sjq.paper.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;

/**
 * [自动生成]问卷信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:15:23
 * @version 1.0
 */

public class EvaluatePaperVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String title; /* 问卷标题 */
	private String introduction; /* 问卷介绍 */
	private Long indicatorId; /* 指标体系ID */
	private BigDecimal reliability; /* 信度 */
	private BigDecimal validity; /* 效度 */
	private Long issueNum; /* 发布次数 */
	private Long useNum; /* 使用次数 */
	private Long sort; /* 排序 */
	private int questionNum; /* 题目数量 */
	private Long userId; /* 用户ID */
	
	private String createTimeStr;/* (默认)创建时间的String格式 */
	
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
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	} 
	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	} 
	public Long getIndicatorId() {
		return indicatorId;
	}

	public void setIndicatorId(Long indicatorId) {
		this.indicatorId = indicatorId;
	} 
	public BigDecimal getReliability() {
		return reliability;
	}

	public void setReliability(BigDecimal reliability) {
		this.reliability = reliability;
	} 
	public BigDecimal getValidity() {
		return validity;
	}

	public void setValidity(BigDecimal validity) {
		this.validity = validity;
	} 
	public Long getIssueNum() {
		return issueNum;
	}

	public void setIssueNum(Long issueNum) {
		this.issueNum = issueNum;
	} 
	public Long getUseNum() {
		return useNum;
	}

	public void setUseNum(Long useNum) {
		this.useNum = useNum;
	} 
	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	} 
	public int getQuestionNum() {
		return questionNum;
	}

	public void setQuestionNum(int questionNum) {
		this.questionNum = questionNum;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	
}