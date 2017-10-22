package com.sjq.question.search;

/**
 * 查询条件
 * [自动生成]试卷模块-试卷试题信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-10 18:27:38
 * @version 1.0
 */

public class PapersQuestionSearch{

	private Long id; /* 自增id */
	private Long paperId; //试卷id
	private Long paperDetailId; /* 试卷明细id */
	
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
	public Long getPaperDetailId() {
		return paperDetailId;
	}
	public void setPaperDetailId(Long paperDetailId) {
		this.paperDetailId = paperDetailId;
	}
	
}