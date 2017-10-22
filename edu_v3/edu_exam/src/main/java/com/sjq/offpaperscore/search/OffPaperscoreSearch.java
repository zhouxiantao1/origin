package com.sjq.offpaperscore.search;

/**
 * 查询条件
 * [自动生成]考生考试卷面得分Search
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:20
 * @version 1.0
 */

public class OffPaperscoreSearch{

	private Long id; /* 自增id */
	private Long examId; /* 考试id */
	private Long examDetailId; /* 考试明细id */
	private String studentId; /* 学籍号 */
	private Long districtId;//区域id
	private Long schoolId;//学校id
	private Long classId;//班级id
	private Long gradeId; /* 年级id */
	private Long subjectId;//学科id
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getExamId() {
		return examId;
	}
	public void setExamId(Long examId) {
		this.examId = examId;
	}
	public Long getExamDetailId() {
		return examDetailId;
	}
	public void setExamDetailId(Long examDetailId) {
		this.examDetailId = examDetailId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
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
	public Long getGradeId() {
		return gradeId;
	}
	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	
}