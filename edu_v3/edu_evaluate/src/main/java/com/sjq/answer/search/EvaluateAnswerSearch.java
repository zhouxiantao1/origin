package com.sjq.answer.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]作答信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:38:02
 * @version 1.0
 */

public class EvaluateAnswerSearch{

	private Long id; /* 自增id */
	private Long evaDetailId; /* 测评明细ID */
	private Long issueListId; /* 发布列表ID */
	private Long userId; /* 用户编码 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEvaDetailId() {
		return evaDetailId;
	}

	public void setEvaDetailId(Long evaDetailId) {
		this.evaDetailId = evaDetailId;
	}

	public Long getIssueListId() {
		return issueListId;
	}

	public void setIssueListId(Long issueListId) {
		this.issueListId = issueListId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	} 

	
}