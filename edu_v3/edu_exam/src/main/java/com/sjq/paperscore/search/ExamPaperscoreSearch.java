package com.sjq.paperscore.search;

/**
 * 查询条件
 * [自动生成]考生考试卷面得分Search
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:20
 * @version 1.0
 */

public class ExamPaperscoreSearch{

	private Long id; /* 自增id */
	private Long examDetailId; /* 考试明细id */
	private String studentId; /* 学籍号 */
	
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
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	
}