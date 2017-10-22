package com.sjq.catalog.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]基础模块-目录信息Search
 * @author  ShuiJingQiu
 * @since   2017-04-25 15:01:36
 * @version 1.0
 */

public class BaseCatalogSearch{

	private Long id; /* 自增id */
	private String name; /* 目录名称 */
	private Long yearId; /* 年份ID */
	private Long stageId; /* 学段ID */
	private Long subjectId; /* 学科ID */
	private Long gradeId; /* 年级ID */
	private Long termId; /* 学期ID */
	private Long versionId; /* 版本ID */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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


}