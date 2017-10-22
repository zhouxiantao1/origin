package com.sjq.exam.offline.bean;

/**
 * 
 * @ClassName:OfflineAnswerDataBean
 * @Description:线下考生作答数据
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 下午2:12:33
 * @version 1.0
 */
public class OfflineAnswerDataBean {
	
	private Long id; //id
	
	private String examCode; //考试编码
	
	private String subjectCode; //学科编码
	
	private String studentIdGz; //广州学籍号
	
	private String questionNo; //题号
	
	private String score; //小题得分

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

	public String getStudentIdGz() {
		return studentIdGz;
	}

	public void setStudentIdGz(String studentIdGz) {
		this.studentIdGz = studentIdGz;
	}

	public String getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(String questionNo) {
		this.questionNo = questionNo;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
}
