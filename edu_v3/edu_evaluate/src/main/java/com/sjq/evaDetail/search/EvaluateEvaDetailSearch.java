package com.sjq.evaDetail.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]测评明细信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:17
 * @version 1.0
 */

public class EvaluateEvaDetailSearch{

	private Long id; /* 自增id */
	private Long evaId; /* 测评的ID */
	private String delflag; /* (默认)删除标识 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEvaId() {
		return evaId;
	}

	public void setEvaId(Long evaId) {
		this.evaId = evaId;
	}

	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	} 

	
}