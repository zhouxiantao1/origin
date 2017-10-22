package com.sjq.dict.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]字典工具信息Search
 * @author  ShuiJingQiu
 * @since   2017-04-27 18:11:47
 * @version 1.0
 */

public class BaseDictSearch{

	private Long id; /* 自增id */
	private String type;
	
	public Long getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setId(Long id) {
		this.id = id;
	} 


}