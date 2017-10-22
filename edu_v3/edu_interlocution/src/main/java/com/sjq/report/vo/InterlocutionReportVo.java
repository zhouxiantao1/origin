package com.sjq.report.vo;

import java.util.Date;

import com.sjq.answerAsk.vo.InterlocutionAnswerAskVo;
import com.sjq.ask.vo.InterlocutionAskVo;

import java.math.BigDecimal;

/**
 * [自动生成]举报信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-16 17:57:11
 * @version 1.0
 */

public class InterlocutionReportVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String type; /* 0-举报问题，1-举报回答 */
	private Long reportNum; /* 举报次数 */
	private String status; /* 0-未处理，1-处理 */
	private String result; /* 0-关闭，1-忽略 */
	private Long areaId; /* 区域ID */
	private Long schoolId; /* 学校ID */
	private Long askId; /* 问题ID */
	private Long answerId; /* 回答ID */
	
	private InterlocutionAskVo interlocutionAskVo; /*问题实体*/
	private InterlocutionAnswerAskVo interlocutionAnswerAskVo; /*回答实体*/
	
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
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 
	public Long getReportNum() {
		return reportNum;
	}

	public void setReportNum(Long reportNum) {
		this.reportNum = reportNum;
	} 
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	} 
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
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
	public Long getAskId() {
		return askId;
	}

	public void setAskId(Long askId) {
		this.askId = askId;
	} 
	public Long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	}

	public InterlocutionAskVo getInterlocutionAskVo() {
		return interlocutionAskVo;
	}

	public void setInterlocutionAskVo(InterlocutionAskVo interlocutionAskVo) {
		this.interlocutionAskVo = interlocutionAskVo;
	}

	public InterlocutionAnswerAskVo getInterlocutionAnswerAskVo() {
		return interlocutionAnswerAskVo;
	}

	public void setInterlocutionAnswerAskVo(InterlocutionAnswerAskVo interlocutionAnswerAskVo) {
		this.interlocutionAnswerAskVo = interlocutionAnswerAskVo;
	} 

	
}