package com.sjq.questionRelated.vo;

import java.util.Date;
import java.util.List;

import com.sjq.ware.vo.QuestionWareVo;

import java.math.BigDecimal;

/**
 * [自动生成]题目知识点目录信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-06 00:47:45
 * @version 1.0
 */

public class BaseQuestionRelatedVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long questionId; /* 题目ID */
	private Long relatedId; /* 目录详情ID 或者知识点ID */
	private String relatedType; /* 1-目录详情，2-知识点 */
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
	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
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
	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	}

	
}