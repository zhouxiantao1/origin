package com.sjq.info.search;

/**
 * 查询条件
 * [自动生成]线上考试-考试信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-12 18:27:14
 * @version 1.0
 */

public class ExamInfoSearch{

	private Long id; /* 自增id */
	private String examName; /* 考试名称 */
	private Long gradeId; /* 年级id */
	private String examType; /* 考试类型（1单元考，2月考，3期中考，4期末考，5市级考试） */
	private Long studentId; /* 统一学籍号 */
	private String isSubmit; /* 是否提交（0否，1是） */
	private String createName; //创建人
	private String progress;//进度
	private String examRange; /* 考试范围（4市，3区，2校，1班） */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
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

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getIsSubmit() {
		return isSubmit;
	}

	public void setIsSubmit(String isSubmit) {
		this.isSubmit = isSubmit;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public String getExamRange() {
		return examRange;
	}

	public void setExamRange(String examRange) {
		this.examRange = examRange;
	} 
	
}