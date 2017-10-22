package com.sjq.indicator.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]指标信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:55:02
 * @version 1.0
 */

public class EvaluateIndicatorSearch{

	private Long id; /* 自增id */
	private Long parentId; /* 父类ID */
	private String delflag; /* (默认)删除标识 */
	private String type; /* 1-通用指标，2-自定义指标 */
	private Long userId; /* 用户ID */
	private Long useNum; /* 使用次数 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUseNum() {
		return useNum;
	}

	public void setUseNum(Long useNum) {
		this.useNum = useNum;
	} 

	
}