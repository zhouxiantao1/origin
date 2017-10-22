package com.sjq.eva.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]测评信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:15:58
 * @version 1.0
 */

public class EvaluateEvaSearch{

	private Long id; /* 自增id */
	private Long evaId; /*测评ID*/
	private String delflag; /* (默认)删除标识 */
	private Long userId; /* 用户ID */
	
	private String status; /*区和校 1-待发布，2-已发布 */
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	
}