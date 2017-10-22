package com.sjq.adaptation.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.sjq.util.datetime.DateUtil;

import java.math.BigDecimal;

/**
 * [自动生成]考试模块-自适应测试bean
 * @author  ShuiJingQiu
 * @since   2017-05-12 23:31:54
 * @version 1.0
 */

public class ExamAdaptationBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String name; /* 自适应测试名称 */
	private Long stageId; /* 学段id */
	private Long subjectId; /* 学科id */
	private Long gradeId; /* 年级id */
	private Long num; /* 题量（测试的试题数量） */
	private Long duration; /* 时长（单位分钟） */
	private Date testStartTime; /* 测试开始时间 */
	private Date testEndTime; /* 测试结束时间 */
	private String remark; /* 简介 */
	private String start;
	private String end;
	
	
	
	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

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
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	} 
	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	} 
	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	} 
	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	} 
	public Date getTestStartTime() {
		return testStartTime;
	}

	public void setTestStartTime(Date testStartTime) {
		this.testStartTime = testStartTime;
	} 
	public Date getTestEndTime() {
		return testEndTime;
	}

	public void setTestEndTime(Date testEndTime) {
		this.testEndTime = testEndTime;
	} 
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
		
		this.testStartTime = DateUtil.StrToDate(start);
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
		this.testEndTime = DateUtil.StrToDate(end);
	} 
	
	


}