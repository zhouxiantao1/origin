package com.sjq.evaIssue.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]测评发布信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:28
 * @version 1.0
 */

public class EvaluateEvaIssueSearch{

	private Long id; /* 自增id */
	private Long areaId; /* 区域ID  */
	private String type; /* 0-市级，1-区级，2-校级 */
	private Long schoolId; /* 学校ID */
	private String status; /* 1-待发布，2-已发布,3-未发布 */
	private Long evaDetailId; /* 测评明细ID */
	private String delflag; /* (默认)删除标识 */
	
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

	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getEvaDetailId() {
		return evaDetailId;
	}

	public void setEvaDetailId(Long evaDetailId) {
		this.evaDetailId = evaDetailId;
	}

	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	} 

	
}