package com.sjq.homework.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;

/**
 * [自动生成]作业信息bean
 * @author  ShuiJingQiu
 * @since   2017-05-11 23:11:48
 * @version 1.0
 */

public class WorkHomeworkBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String title; /* 作业标题 */
	private Long subjectId; /* 学科ID */
	private Long gradeId; /* 年级ID */
	private Long classesId; /* 班级ID */
	private Long questionNum; /* 题目数量 */
	private Date lastTime; /* 最后一个人提交时间 */
	private Long finishNum; /* 完成人数 */
	private String status; /* 0-未开始，1-进行中，2-已结束 */
	private Long teacherId; /* 老师ID */
	private Long userId; /* 用户ID */
	private Date startTime; /* 开始时间 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endTime; /* 结束时间 */
	private String type; /* 1-作业，2-补救练习 */
	
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
	public Long getClassesId() {
		return classesId;
	}

	public void setClassesId(Long classesId) {
		this.classesId = classesId;
	} 
	public Long getQuestionNum() {
		return questionNum;
	}

	public void setQuestionNum(Long questionNum) {
		this.questionNum = questionNum;
	} 
	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	} 
	public Long getFinishNum() {
		return finishNum;
	}

	public void setFinishNum(Long finishNum) {
		this.finishNum = finishNum;
	} 
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	} 
	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	} 
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 
	
	
}