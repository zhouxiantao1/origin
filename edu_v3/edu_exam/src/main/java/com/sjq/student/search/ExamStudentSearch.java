package com.sjq.student.search;

/**
 * 查询条件
 * [自动生成]线上考试-考生信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-12 18:27:49
 * @version 1.0
 */

public class ExamStudentSearch{

	private Long id; /* 自增id */
	private String studentId; /* 学籍号 */
	private String isSubmit; /* 是否提交（0否，1是） */
	private Long examDetailId; /* 考试明细id */
	private String examType;//考试类型
	private Long subjectId;//学科
	private Long gradeId;//年级
	private String examName;//考试名称
	private String examRange; /* 考试范围（4市，3区，2校，1班） */
	private Long districtId;//区域id
	private Long schoolId;//学校id
	private Long classId;//班级id
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getIsSubmit() {
		return isSubmit;
	}

	public void setIsSubmit(String isSubmit) {
		this.isSubmit = isSubmit;
	}

	public Long getExamDetailId() {
		return examDetailId;
	}

	public void setExamDetailId(Long examDetailId) {
		this.examDetailId = examDetailId;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
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

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}
	
}