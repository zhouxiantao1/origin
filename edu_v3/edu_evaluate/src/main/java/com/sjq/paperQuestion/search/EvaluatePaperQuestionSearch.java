package com.sjq.paperQuestion.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]题目信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-23 00:00:21
 * @version 1.0
 */

public class EvaluatePaperQuestionSearch{

	private Long id; /* 自增id */
	private Long paperId; /* 问卷ID */
	private String delflag; /* (默认)删除标识 */
	
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

	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	} 

	
}