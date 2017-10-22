package com.sjq.adaptation.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]考试模块-自适应测试用户记录表Search
 * @author  ShuiJingQiu
 * @since   2017-05-19 23:16:26
 * @version 1.0
 */

public class ExamAdaptationUserSearch{

	private Long id; /* 自增id */
	private Long userId; /* 用户id */
	private Long adaptationId; /* 自适应测试id */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getAdaptationId() {
		return adaptationId;
	}

	public void setAdaptationId(Long adaptationId) {
		this.adaptationId = adaptationId;
	} 


}