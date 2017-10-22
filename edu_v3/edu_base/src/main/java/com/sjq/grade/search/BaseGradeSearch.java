package com.sjq.grade.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]基础模块-学段信息Search
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:26:54
 * @version 1.0
 */

public class BaseGradeSearch{

	private Long id; /* 自增id */
	private String name; /* 年级名称 */
	private Long stageId;
	
	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 


}