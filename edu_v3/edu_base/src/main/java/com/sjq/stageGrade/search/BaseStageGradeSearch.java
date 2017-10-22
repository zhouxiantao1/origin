package com.sjq.stageGrade.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]学段年级信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-03 22:00:49
 * @version 1.0
 */

public class BaseStageGradeSearch{

	private Long id; /* 自增id */
	private Long stageId; /* 学段ID */
	private Long gradeId; /* 年级ID */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	} 
	
	

}