package com.sjq.paper.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]问卷信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:15:23
 * @version 1.0
 */

public class EvaluatePaperSearch{

	private Long id; /* 自增id */
	private String title; /* 问卷标题 */
	private Long indicatorId; /* 指标体系ID */
	private String delflag; /* (默认)删除标识 */
	private Long userId; /* 用户ID */
	private String introduction; /* 问卷介绍 */

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getIndicatorId() {
		return indicatorId;
	}

	public void setIndicatorId(Long indicatorId) {
		this.indicatorId = indicatorId;
	}

	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	} 

	
}