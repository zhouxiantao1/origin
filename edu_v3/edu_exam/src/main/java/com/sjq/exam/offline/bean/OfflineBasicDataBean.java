package com.sjq.exam.offline.bean;

/**
 * 
 * @ClassName:OfflineBasicDataBean
 * @Description:线下考生基础数据
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 下午2:12:33
 * @version 1.0
 */
public class OfflineBasicDataBean {
	
	private Long id; //id
	
	private String examCode; //考试编码
	
	private String subjectCode; //学科编码
	
	private String subjectName; //学科名称
	
	private String districtCode; //区域编码
	
	private String districtName; //区域名称
	
	private String schoolCode; //学校编码
	
	private String schoolName; //学校名称
	
	private String classCode; //班级编码
	
	private String className; //班级名称
	
	private String studentIdGz; //广州学籍号
	
	private String studentName; //考生名称
	
	private String fullScore; //每科考试总得分

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExamCode() {
		return examCode;
	}

	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getStudentIdGz() {
		return studentIdGz;
	}

	public void setStudentIdGz(String studentIdGz) {
		this.studentIdGz = studentIdGz;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getFullScore() {
		return fullScore;
	}

	public void setFullScore(String fullScore) {
		this.fullScore = fullScore;
	}
	
}
