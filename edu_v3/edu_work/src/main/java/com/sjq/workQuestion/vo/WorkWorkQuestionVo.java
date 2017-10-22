package com.sjq.workQuestion.vo;

import java.util.Date;

import com.sjq.ware.vo.QuestionWareVo;

import java.math.BigDecimal;

/**
 * [自动生成]作业题目信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-05 23:19:47
 * @version 1.0
 */

public class WorkWorkQuestionVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long homeworkId; /* 作业ID */
	private Long questionId; /* 题目ID */
	private Long sort; /* 排序 */
	private String remake; /* 备注 */
	
	private QuestionWareVo questionWareVo; //题目实体列表
	
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
	public Long getHomeworkId() {
		return homeworkId;
	}

	public void setHomeworkId(Long homeworkId) {
		this.homeworkId = homeworkId;
	} 
	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	} 
	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	} 
	public String getRemake() {
		return remake;
	}

	public void setRemake(String remake) {
		this.remake = remake;
	}

	public QuestionWareVo getQuestionWareVo() {
		return questionWareVo;
	}

	public void setQuestionWareVo(QuestionWareVo questionWareVo) {
		this.questionWareVo = questionWareVo;
	} 

	
}