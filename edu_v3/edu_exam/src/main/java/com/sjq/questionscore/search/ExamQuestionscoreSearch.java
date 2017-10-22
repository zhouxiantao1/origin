package com.sjq.questionscore.search;

/**
 * 查询条件
 * [自动生成]试管理-考生考试试题得分Search
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:04
 * @version 1.0
 */

public class ExamQuestionscoreSearch{

	private Long id; /* 自增id */
	private Long paperScoreId; /* 卷面得分id */
	private Long examDetailId;//考试明细id
	private Long questionId; /* 试题id */
	private String studentId; /* 学生学籍号 */
	private String isWrong; /* 题目是否做错（0否，1是） */
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPaperScoreId() {
		return paperScoreId;
	}
	public void setPaperScoreId(Long paperScoreId) {
		this.paperScoreId = paperScoreId;
	}
	public Long getExamDetailId() {
		return examDetailId;
	}
	public void setExamDetailId(Long examDetailId) {
		this.examDetailId = examDetailId;
	}
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getIsWrong() {
		return isWrong;
	}
	public void setIsWrong(String isWrong) {
		this.isWrong = isWrong;
	}
	
}