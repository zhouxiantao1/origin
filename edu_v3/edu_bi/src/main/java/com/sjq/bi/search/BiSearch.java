package com.sjq.bi.search;

/**
 * 
 * @ClassName:CitySearch
 * @Description:市级报告前端搜索条件
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 上午11:15:14
 * @version 1.0
 */
public class BiSearch {
	
	private Long examId;//考试id
	private String studentId;//学籍号
	private Long districtId;//区域id
	private Long schoolId;//学校id
	private Long classId;//班级id

	public Long getExamId() {
		return examId;
	}

	public void setExamId(Long examId) {
		this.examId = examId;
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
}
