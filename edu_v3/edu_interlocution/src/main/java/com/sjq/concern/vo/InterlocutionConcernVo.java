package com.sjq.concern.vo;

import java.util.Date;

import com.sjq.ask.vo.InterlocutionAskVo;

import java.math.BigDecimal;

/**
 * [自动生成]关注信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-17 11:29:41
 * @version 1.0
 */

public class InterlocutionConcernVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long askId; /* 问题ID */
	private Long answerAskId; /* 回答ID */
	private Long userId; /* 用户ID */
	private Long reportId; /* 举报ID */
	private String type; /* 1-问题关注，2-回答关注，3-举报问题，4-举报回答 */
	
	private int isConcren; /*是否关注，0-没有关注，1-关注*/
	private InterlocutionAskVo interlocutionAskVo;
	
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
	public Long getAskId() {
		return askId;
	}

	public void setAskId(Long askId) {
		this.askId = askId;
	} 
	public Long getAnswerAskId() {
		return answerAskId;
	}

	public void setAnswerAskId(Long answerAskId) {
		this.answerAskId = answerAskId;
	} 
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	} 
	public Long getReportId() {
		return reportId;
	}

	public void setReportId(Long reportId) {
		this.reportId = reportId;
	} 
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getIsConcren() {
		return isConcren;
	}

	public void setIsConcren(int isConcren) {
		this.isConcren = isConcren;
	}

	public InterlocutionAskVo getInterlocutionAskVo() {
		return interlocutionAskVo;
	}

	public void setInterlocutionAskVo(InterlocutionAskVo interlocutionAskVo) {
		this.interlocutionAskVo = interlocutionAskVo;
	} 

	
}