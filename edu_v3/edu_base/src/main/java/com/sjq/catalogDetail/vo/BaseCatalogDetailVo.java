package com.sjq.catalogDetail.vo;

import java.util.Date;
import java.util.List;

import com.sjq.knowledge.vo.BaseKnowledgeVo;
import com.sjq.questionRelated.vo.BaseQuestionRelatedVo;

import java.math.BigDecimal;

/**
 * [自动生成]基础模块-目录详情信息vo
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:34:19
 * @version 1.0
 */

public class BaseCatalogDetailVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String name; /* 目录详情名称 */
	private Long parentId; /* 父类ID */
	private Long level; /* 等级 */
	private String parentIds; /* 父类IDS */
	private Long sort; /* 排序 */
	private Long yearId; /* 年份ID */
	private Long stageId; /* 学段ID */
	private Long subjectId; /* 学科ID */
	private Long gradeId; /* 年级ID */
	private Long termId; /* 学期ID */
	private Long versionId; /* 版本ID */
	private Long catalogId; /* 目录ID */
	private Long isLast; /* 是否最后 */
	
	private List<BaseCatalogDetailVo> bcdvs ;  /* 下级目录详情  */
	private List<BaseKnowledgeVo> baseKnowledgeVoList; /*知识点*/
	
	
	public List<BaseCatalogDetailVo> getBcdvs() {
		return bcdvs;
	}

	public void setBcdvs(List<BaseCatalogDetailVo> bcdvs) {
		this.bcdvs = bcdvs;
	}

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
	public Long getLevel() {
		return level;
	}

	public void setLevel(Long level) {
		this.level = level;
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
	public Long getYearId() {
		return yearId;
	}

	public void setYearId(Long yearId) {
		this.yearId = yearId;
	} 
	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
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
	public Long getTermId() {
		return termId;
	}

	public void setTermId(Long termId) {
		this.termId = termId;
	} 
	public Long getVersionId() {
		return versionId;
	}

	public void setVersionId(Long versionId) {
		this.versionId = versionId;
	} 
	public Long getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(Long catalogId) {
		this.catalogId = catalogId;
	} 
	public Long getIsLast() {
		return isLast;
	}

	public void setIsLast(Long isLast) {
		this.isLast = isLast;
	}

	public List<BaseKnowledgeVo> getBaseKnowledgeVoList() {
		return baseKnowledgeVoList;
	}

	public void setBaseKnowledgeVoList(List<BaseKnowledgeVo> baseKnowledgeVoList) {
		this.baseKnowledgeVoList = baseKnowledgeVoList;
	}


	
}