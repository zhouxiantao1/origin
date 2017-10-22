package com.sjq.staff.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]管理者信息Search
 * @author  ShuiJingQiu
 * @since   2017-04-27 16:33:46
 * @version 1.0
 */

public class BaseStaffSearch{

	private Long id; /* 自增id */
	private Long areaId; /* 区域ID */
	private String type; /* 管理者类型  1-市教管员,2-市教研员,3-区教管员,4-区教研员,5-校教管员,6-校教研员,7-校长*/
	private String name; /* 管理者姓名 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 

	
}