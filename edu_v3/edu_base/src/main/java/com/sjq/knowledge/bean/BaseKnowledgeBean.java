package com.sjq.knowledge.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]基础模块-知识点信息bean
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:33:27
 * @version 1.0
 */

public class BaseKnowledgeBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String name; /* 知识点名称 */
	private Long parentId; /* 父类ID */
	private String parentIds; /* 父类全路径 */
	private Long sort; /* 排序 */
	private Long level; /* 等级 */
	private String gradeId; /* 年级ID */
	private String stageId; /* 学段ID */
	private String termId; /* 学期ID */
	private String subjectId; /* 学科ID */
	private Long oldId; /*  */
	private Long isLast; /* 是否最后 */
	
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
	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	} 
	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	} 
	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	} 
	public Long getLevel() {
		return level;
	}

	public void setLevel(Long level) {
		this.level = level;
	} 
	public String getGradeId() {
		return gradeId;
	}

	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	} 
	public String getStageId() {
		return stageId;
	}

	public void setStageId(String stageId) {
		this.stageId = stageId;
	} 
	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	} 
	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	} 
	public Long getOldId() {
		return oldId;
	}

	public void setOldId(Long oldId) {
		this.oldId = oldId;
	} 
	public Long getIsLast() {
		return isLast;
	}

	public void setIsLast(Long isLast) {
		this.isLast = isLast;
	} 


}