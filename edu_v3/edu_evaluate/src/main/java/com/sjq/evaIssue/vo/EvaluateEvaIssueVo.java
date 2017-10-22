package com.sjq.evaIssue.vo;

import java.util.Date;

import com.sjq.evaDetail.vo.EvaluateEvaDetailVo;

import java.math.BigDecimal;

/**
 * [自动生成]测评发布信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:28
 * @version 1.0
 */

public class EvaluateEvaIssueVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long evaId; /* 测评ID  */
	private Long evaDetailId; /* 测评明细ID */
	private Long areaId; /* 区域ID  */
	private Long schoolId; /* 学校ID */
	private String type; /* 0-市级，1-区级，2-校级 */
	private String status; /* 1-待发布，2-已发布,3-未发布 */
	
	private EvaluateEvaDetailVo evaluateEvaDetailVo; //测评明细对象
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	} 
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	} 
	public String getModName() {
		return modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	} 
	public Date getModTime() {
		return modTime;
	}

	public void setModTime(Date modTime) {
		this.modTime = modTime;
	} 
	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	} 
	public Long getEvaId() {
		return evaId;
	}

	public void setEvaId(Long evaId) {
		this.evaId = evaId;
	} 
	public Long getEvaDetailId() {
		return evaDetailId;
	}

	public void setEvaDetailId(Long evaDetailId) {
		this.evaDetailId = evaDetailId;
	} 
	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	} 
	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	} 
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EvaluateEvaDetailVo getEvaluateEvaDetailVo() {
		return evaluateEvaDetailVo;
	}

	public void setEvaluateEvaDetailVo(EvaluateEvaDetailVo evaluateEvaDetailVo) {
		this.evaluateEvaDetailVo = evaluateEvaDetailVo;
	} 

	
}