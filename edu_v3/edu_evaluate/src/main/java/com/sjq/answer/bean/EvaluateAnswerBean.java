package com.sjq.answer.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]作答信息bean
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:38:02
 * @version 1.0
 */

public class EvaluateAnswerBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long userId; /* 用户编码 */
	private Long evaDetailId; /* 测评明细ID */
	private Long schoolId; /* 学校ID */
	private String status; /* 0-作答中，2已提交 */
	private Long issueListId; /* 发布列表ID */
	
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
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	} 
	public Long getEvaDetailId() {
		return evaDetailId;
	}

	public void setEvaDetailId(Long evaDetailId) {
		this.evaDetailId = evaDetailId;
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

	public Long getIssueListId() {
		return issueListId;
	}

	public void setIssueListId(Long issueListId) {
		this.issueListId = issueListId;
	}

	
	
}