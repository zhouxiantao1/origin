package com.sjq.offpaperscore.vo;

import java.util.List;

import com.sjq.offpaperscore.bean.OffPaperscoreBean;
import com.sjq.offquestionscore.bean.OffQuestionscoreBean;

public class OffPaperscoreVo{

	private Long id; /* 自增id */
	private Long examId; /* 考试id */
	private Long examDetailId; /* 考试明细id */
	private String studentId; /* 学籍号 */
	private Long fullScore; /* 得分 */
	private Long subjectId;//学科id
	private Long districtId;//区域id
	private Long schoolId;//学校id
	private Long classId;//班级id
	private String districtName; //区域名称
	private String schoolName; //学校名称
	private String className; //班级名称
	
	private List<OffPaperscoreBean> offPaperscoreBeanList;//作答基础数据集合
	private List<OffQuestionscoreBean> offQuestionscoreBeanList;//作答详情集合
	
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
	public Long getFullScore() {
		return fullScore;
	}
	public void setFullScore(Long fullScore) {
		this.fullScore = fullScore;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
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
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<OffPaperscoreBean> getOffPaperscoreBeanList() {
		return offPaperscoreBeanList;
	}
	public void setOffPaperscoreBeanList(List<OffPaperscoreBean> offPaperscoreBeanList) {
		this.offPaperscoreBeanList = offPaperscoreBeanList;
	}
	public List<OffQuestionscoreBean> getOffQuestionscoreBeanList() {
		return offQuestionscoreBeanList;
	}
	public void setOffQuestionscoreBeanList(List<OffQuestionscoreBean> offQuestionscoreBeanList) {
		this.offQuestionscoreBeanList = offQuestionscoreBeanList;
	}
	
}