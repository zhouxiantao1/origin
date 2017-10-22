package com.sjq.definition.search;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 查询条件
 * [自动生成]常模管理-常模定义Search
 * @author  ShuiJingQiu
 * @since   2017-07-06 16:04:08
 * @version 1.0
 */

public class NormDefinitionSearch{

	private Long id; /* 自增id */
	private String delflag; /* (默认)删除标识 */
	private String normName; /* 常模名称 */
	private Long examId; /* 考试id */
	private Long gradeId; /* 年级id */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date startTime;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endTime;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	} 
	public String getNormName() {
		return normName;
	}

	public void setNormName(String normName) {
		this.normName = normName;
	} 
	public Long getExamId() {
		return examId;
	}

	public void setExamId(Long examId) {
		this.examId = examId;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
}