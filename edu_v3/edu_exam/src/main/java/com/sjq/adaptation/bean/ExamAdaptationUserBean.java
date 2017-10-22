package com.sjq.adaptation.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]考试模块-自适应测试用户记录表bean
 * @author  ShuiJingQiu
 * @since   2017-05-19 23:16:26
 * @version 1.0
 */

public class ExamAdaptationUserBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Date answerStartTime; /* 开始测试时间 */
	private Date answerFinalTime; /* 最后答题时间 */
	private String status; /* 0，测试中  1.测试完成 */
	private Long answerTime; /* 单位（秒）前端解析成分钟 */
	private Long rightNum; /* 累积答对多少题 */
	private Long errorNum; /* 累积答错多少题 */
	private Long lastAnswerNumber; /* 上一次回答到第几题 */
	private Long userId; /* 用户id */
	private Long adaptationId; /* 自适应测试id */
	
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
	public Date getAnswerStartTime() {
		return answerStartTime;
	}

	public void setAnswerStartTime(Date answerStartTime) {
		this.answerStartTime = answerStartTime;
	} 
	public Date getAnswerFinalTime() {
		return answerFinalTime;
	}

	public void setAnswerFinalTime(Date answerFinalTime) {
		this.answerFinalTime = answerFinalTime;
	} 
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	} 
	public Long getAnswerTime() {
		return answerTime;
	}

	public void setAnswerTime(Long answerTime) {
		this.answerTime = answerTime;
	} 
	public Long getRightNum() {
		return rightNum;
	}

	public void setRightNum(Long rightNum) {
		this.rightNum = rightNum;
	} 
	public Long getErrorNum() {
		return errorNum;
	}

	public void setErrorNum(Long errorNum) {
		this.errorNum = errorNum;
	} 
	public Long getLastAnswerNumber() {
		return lastAnswerNumber;
	}

	public void setLastAnswerNumber(Long lastAnswerNumber) {
		this.lastAnswerNumber = lastAnswerNumber;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getAdaptationId() {
		return adaptationId;
	}

	public void setAdaptationId(Long adaptationId) {
		this.adaptationId = adaptationId;
	} 

	

}