package com.sjq.school.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]基础模块-学校信息Search
 * @author  ShuiJingQiu
 * @since   2017-04-25 16:53:37
 * @version 1.0
 */

public class BaseSchoolSearch{

	private Long id; /* 自增id */
	private String name; /* 学校名称 */	
	private Long areaId; /* 区域id */
	
	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
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