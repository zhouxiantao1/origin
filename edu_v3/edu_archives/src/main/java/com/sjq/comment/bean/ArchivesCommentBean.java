package com.sjq.comment.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]评语信息bean
 * @author  ShuiJingQiu
 * @since   2017-05-31 10:02:18
 * @version 1.0
 */

public class ArchivesCommentBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long studentId; /* 学生ID */
	private String studentName; /* 学生姓名 */
	private Long schoolId; /* 学校ID */
	private Long classesId; /* 班级ID */
	private Long termId; /* 学期ID */
	private String scoreRemake; /* 成绩表现 */
	private String actionRemake; /* 行为表现 */
	private String guideRemake; /* 指导评语 */
	private Long teacherId; /* 老师ID */
	private String teacherName; /* 老师的名字 */
	private String honorRemark; /* 荣誉奖励 */
	private String remarkName; /* 评价名称 */
	private Long subjectId; /* 学科ID */
	private String title; /* 标题 */
	
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
	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	} 
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	} 
	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	} 
	public Long getClassesId() {
		return classesId;
	}

	public void setClassesId(Long classesId) {
		this.classesId = classesId;
	} 
	public Long getTermId() {
		return termId;
	}

	public void setTermId(Long termId) {
		this.termId = termId;
	} 
	public String getScoreRemake() {
		return scoreRemake;
	}

	public void setScoreRemake(String scoreRemake) {
		this.scoreRemake = scoreRemake;
	} 
	public String getActionRemake() {
		return actionRemake;
	}

	public void setActionRemake(String actionRemake) {
		this.actionRemake = actionRemake;
	} 
	public String getGuideRemake() {
		return guideRemake;
	}

	public void setGuideRemake(String guideRemake) {
		this.guideRemake = guideRemake;
	} 
	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	} 
	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	} 
	public String getHonorRemark() {
		return honorRemark;
	}

	public void setHonorRemark(String honorRemark) {
		this.honorRemark = honorRemark;
	} 
	public String getRemarkName() {
		return remarkName;
	}

	public void setRemarkName(String remarkName) {
		this.remarkName = remarkName;
	} 
	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	} 

	
}