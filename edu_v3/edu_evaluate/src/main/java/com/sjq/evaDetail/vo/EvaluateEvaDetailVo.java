package com.sjq.evaDetail.vo;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]测评明细信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:17
 * @version 1.0
 */

public class EvaluateEvaDetailVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long evaId; /* 测评的ID */
	private String name; /* 测评明细名称 */
	private String evaObject; /* 1-学生，2-家长，3-老师，4-校长 */
	private Long stageId; /* 学段ID */
	private String type; /* 0-线上，1-线下 */
	private Date startTime; /* 开始时间 */
	private Date endTime; /* 结束时间 */
	private Long answerTime; /* 答题时间(秒) */
	private String introduction; /* 测评简介 */
	private String remake; /* 备注 */
	private Long allNum; /* 总共区 */
	private Long issueNum; /* 已发布区数 */
	private String status; /* 1-未开始，2-进行中，3-已结束 */
	
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
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	public String getEvaObject() {
		return evaObject;
	}

	public void setEvaObject(String evaObject) {
		this.evaObject = evaObject;
	} 
	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	} 
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
	public Long getAnswerTime() {
		return answerTime;
	}

	public void setAnswerTime(Long answerTime) {
		this.answerTime = answerTime;
	} 
	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	} 
	public String getRemake() {
		return remake;
	}

	public void setRemake(String remake) {
		this.remake = remake;
	} 
	public Long getAllNum() {
		return allNum;
	}

	public void setAllNum(Long allNum) {
		this.allNum = allNum;
	} 
	public Long getIssueNum() {
		return issueNum;
	}

	public void setIssueNum(Long issueNum) {
		this.issueNum = issueNum;
	} 
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	} 


}