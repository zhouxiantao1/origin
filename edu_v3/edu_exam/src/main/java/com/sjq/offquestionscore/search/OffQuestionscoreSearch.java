package com.sjq.offquestionscore.search;

/**
 * 查询条件
 * [自动生成]试管理-考生考试试题得分Search
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:04
 * @version 1.0
 */

public class OffQuestionscoreSearch{

	private Long id; /* 自增id */
	private Long examDetailId;//考试明细id
	private String questionId; /* 试题id */
	private String studentId; /* 学生学籍号 */
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getExamDetailId() {
		return examDetailId;
	}
	public void setExamDetailId(Long examDetailId) {
		this.examDetailId = examDetailId;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
}