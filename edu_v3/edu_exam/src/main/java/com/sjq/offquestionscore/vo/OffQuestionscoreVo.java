package com.sjq.offquestionscore.vo;

/**
 * [自动生成]试管理-考生考试试题得分vo
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:04
 * @version 1.0
 */

public class OffQuestionscoreVo{
	
	private Long id; /* 自增id */
	private Long examId; /* 考试id */
	private Long examDetailId;//考试明细id
	private String studentId; /* 学生学籍号 */
	private String questionId; /* 试题id */
	private Long score; /* 小题得分 */
	
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
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public Long getScore() {
		return score;
	}
	public void setScore(Long score) {
		this.score = score;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
}