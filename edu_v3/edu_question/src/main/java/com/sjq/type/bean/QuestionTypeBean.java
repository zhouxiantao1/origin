package com.sjq.type.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]题库模块-题型信息bean
 * @author  ShuiJingQiu
 * @since   2017-04-28 19:53:48
 * @version 1.0
 */

public class QuestionTypeBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String typeName; /* 题型名称 */
	private String isObjective; /* 是否客观题（0否，1是）客观题 机器阅卷，主观题 人为阅卷 */
	private String markingCode; /* 阅卷机制。0，非机器阅卷 1.选择题 2.多选题 3填空题 4.多填空题 5.判断题 */
	private String status; /* 状态  0.可用 1不可用 */
	private String remark; /* 备注说明 */
	private Long subjectId; /* 学科id */


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
	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	} 
	public String getIsObjective() {
		return isObjective;
	}

	public void setIsObjective(String isObjective) {
		this.isObjective = isObjective;
	} 
	public String getMarkingCode() {
		return markingCode;
	}

	public void setMarkingCode(String markingCode) {
		this.markingCode = markingCode;
	} 
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	} 
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	} 
	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	} 


}