package com.sjq.paperQuestion.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]题目信息bean
 * @author  ShuiJingQiu
 * @since   2017-05-23 00:00:21
 * @version 1.0
 */

public class EvaluatePaperQuestionBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long paperId; /* 问卷ID */
	private String content; /* 题目内容 */
	private String type; /* 1-单选题，2-多选题，3-判断题，4-预留 */
	private Long indicatorId; /* 指标ID */
	private Long sort; /* 排序 */
	
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
	public Long getPaperId() {
		return paperId;
	}

	public void setPaperId(Long paperId) {
		this.paperId = paperId;
	} 
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	} 
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 
	public Long getIndicatorId() {
		return indicatorId;
	}

	public void setIndicatorId(Long indicatorId) {
		this.indicatorId = indicatorId;
	} 
	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	} 


}