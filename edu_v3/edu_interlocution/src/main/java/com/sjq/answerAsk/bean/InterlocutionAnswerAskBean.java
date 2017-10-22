package com.sjq.answerAsk.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]回答提问信息bean
 * @author  ShuiJingQiu
 * @since   2017-05-04 18:30:14
 * @version 1.0
 */

public class InterlocutionAnswerAskBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long askId; /* 问题ID */
	private String content; /* 回答内容 */
	private String status; /* 0-不屏蔽，1-屏蔽 */
	private Long areaId; /* 区域ID */
	private Long schoolId; /* 学校ID */
	private Long userId; /*  */
	
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
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	} 
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	} 

	
}