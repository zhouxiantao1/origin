package com.sjq.info.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * [自动生成]线上考试-考试信息bean
 * @author  ShuiJingQiu
 * @since   2017-05-12 18:27:14
 * @version 1.0
 */

public class ExamInfoBean{
	
	private Long id; /* 自增id 考试id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String examName; /* 考试名称 */
	private String examRange; /* 考试范围（4市，3区，2校，1班） */
	private Long gradeId; /* 年级id */
	private String examType; /* 考试类型（1单元考，2月考，3期中考，4期末考，5市级考试） */
	private String examMethod;  /* 考试方式（0线上，1线下） */
	private String status; /* 是否可用（0否， 1是） */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date startTime; /* 考试开始时间 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endTime; /* 考试结束时间 */
	private String examDesc; /* 目的描述 */
	private String remark; /* 备注 */
	
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
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getExamRange() {
		return examRange;
	}
	public void setExamRange(String examRange) {
		this.examRange = examRange;
	}
	public Long getGradeId() {
		return gradeId;
	}
	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}
	public String getExamType() {
		return examType;
	}
	public void setExamType(String examType) {
		this.examType = examType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getExamDesc() {
		return examDesc;
	}
	public void setExamDesc(String examDesc) {
		this.examDesc = examDesc;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getExamMethod() {
		return examMethod;
	}
	public void setExamMethod(String examMethod) {
		this.examMethod = examMethod;
	}
	
}