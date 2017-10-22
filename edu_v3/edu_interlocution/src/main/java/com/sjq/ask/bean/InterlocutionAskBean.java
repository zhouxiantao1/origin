package com.sjq.ask.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]提问信息bean
 * @author  ShuiJingQiu
 * @since   2017-05-15 15:18:01
 * @version 1.0
 */

public class InterlocutionAskBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String title; /* 提问标题 */
	private String content; /* 提问内容 */
	private Long subjectId; /* 学科ID */
	private Long gradeId; /* 年级ID */
	private String status; /* 0-不屏蔽，1-屏蔽 */
	private Long areaId; /* 区域ID */
	private Long schoolId; /* 学校ID */
	private Long readNum; /* 浏览次数 */
	private Long userId; /* 用户ID */
	
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
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	} 
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	} 
	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	} 
	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
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
	public Long getReadNum() {
		return readNum;
	}

	public void setReadNum(Long readNum) {
		this.readNum = readNum;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	} 

	
}