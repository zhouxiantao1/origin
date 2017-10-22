package com.sjq.detail.search;

/**
 * 查询条件
 * [自动生成]线上考试-考试明细信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-12 19:18:17
 * @version 1.0
 */

public class ExamDetailSearch{

	private Long id; /* 自增id */
	private Long paperId; /* 试卷id */
	private Long examId; /* 考试id */
	private String detailName; /* 考试明细名称（即对应学科考试名称） */
	private String examProgress; /* 考试进度（未进行，进行中， 待评分，已评分） */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public Long getPaperId() {
		return paperId;
	}

	public void setPaperId(Long paperId) {
		this.paperId = paperId;
	} 
	public String getDetailName() {
		return detailName;
	}

	public void setDetailName(String detailName) {
		this.detailName = detailName;
	} 
	public String getExamProgress() {
		return examProgress;
	}

	public void setExamProgress(String examProgress) {
		this.examProgress = examProgress;
	}

	public Long getExamId() {
		return examId;
	}

	public void setExamId(Long examId) {
		this.examId = examId;
	} 
	
}