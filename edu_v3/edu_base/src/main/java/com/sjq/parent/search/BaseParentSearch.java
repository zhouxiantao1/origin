package com.sjq.parent.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]基础模块-家长信息Search
 * @author  ShuiJingQiu
 * @since   2017-04-29 01:02:00
 * @version 1.0
 */

public class BaseParentSearch{

	private Long id; /* 自增id */
	private String name; /* 家长姓名 */
	private Long userId; /* 用户ID */
	
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	} 

	
}