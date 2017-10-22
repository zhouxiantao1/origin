package com.sjq.issueList.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]发布列表bean
 * @author  ShuiJingQiu
 * @since   2017-05-27 17:12:25
 * @version 1.0
 */

public class EvaluateIssueListBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long evaDetailId; /* 测评明细ID */
	private Long schoolId; /* 学校ID */
	private Long classesId; /* 班级ID */
	private Long userId; /* 用户ID */
	private String evaObject; /* 1-学生，2-家长，3-老师，4-校长 */
	private Long evaIssueId; /* 校级发布测评ID */
	
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
	public Long getClassesId() {
		return classesId;
	}

	public void setClassesId(Long classesId) {
		this.classesId = classesId;
	} 
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	} 
	public String getEvaObject() {
		return evaObject;
	}

	public void setEvaObject(String evaObject) {
		this.evaObject = evaObject;
	} 
	public Long getEvaIssueId() {
		return evaIssueId;
	}

	public void setEvaIssueId(Long evaIssueId) {
		this.evaIssueId = evaIssueId;
	} 


}