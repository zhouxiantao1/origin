package com.sjq.comment.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]评语信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-31 10:02:18
 * @version 1.0
 */

public class ArchivesCommentSearch{

	private Long id; /* 自增id */
	private Long studentId; /* 学生ID */
	
	//用于跳转查看试卷
	private Long examId;
	private Long paperId;
	private Long detailId;
	private String studentNum;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getExamId() {
		return examId;
	}

	public void setExamId(Long examId) {
		this.examId = examId;
	}

	public Long getPaperId() {
		return paperId;
	}

	public void setPaperId(Long paperId) {
		this.paperId = paperId;
	}

	public Long getDetailId() {
		return detailId;
	}

	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	} 

	
}