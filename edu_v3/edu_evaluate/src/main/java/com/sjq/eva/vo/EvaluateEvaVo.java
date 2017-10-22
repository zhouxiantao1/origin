package com.sjq.eva.vo;

import java.util.Date;
import java.util.List;

import com.sjq.evaDetail.vo.EvaluateEvaDetailVo;

import java.math.BigDecimal;

/**
 * [自动生成]测评信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:15:58
 * @version 1.0
 */

public class EvaluateEvaVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String name; /* 测评名称 */
	private String introduction; /* 测评简介 */
	private Date startTime; /* 开始时间 */
	private Date endTime; /* 结束时间 */
	private String status; /* 1-未开始，2-进行中，3-已结束 */
	private String remake; //注意事项
	private Long userId; /* 用户ID */
	
	private List<EvaluateEvaDetailVo> evaluateEvaDetailVoList;
	
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
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	} 
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	} 
	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	} 
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getRemake() {
		return remake;
	}

	public void setRemake(String remake) {
		this.remake = remake;
	}

	public List<EvaluateEvaDetailVo> getEvaluateEvaDetailVoList() {
		return evaluateEvaDetailVoList;
	}

	public void setEvaluateEvaDetailVoList(List<EvaluateEvaDetailVo> evaluateEvaDetailVoList) {
		this.evaluateEvaDetailVoList = evaluateEvaDetailVoList;
	} 

	
}