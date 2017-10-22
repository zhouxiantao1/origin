package com.sjq.selection.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]选项信息bean
 * @author  ShuiJingQiu
 * @since   2017-05-19 01:56:22
 * @version 1.0
 */

public class EvaluateSelectionBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long questionId; /* 题目ID */
	private String selectNum; /* 选项编码 */
	private BigDecimal selectScore; /* 分数 */
	private String content; /* 选项内容 */
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
	public String getSelectNum() {
		return selectNum;
	}

	public void setSelectNum(String selectNum) {
		this.selectNum = selectNum;
	} 
	public BigDecimal getSelectScore() {
		return selectScore;
	}

	public void setSelectScore(BigDecimal selectScore) {
		this.selectScore = selectScore;
	} 
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	} 
	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	} 


}