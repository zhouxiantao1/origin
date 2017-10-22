package com.sjq.catalog.vo;

import java.util.Date;
import java.util.List;

import com.sjq.catalogDetail.vo.BaseCatalogDetailVo;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.version.vo.BaseVersionVo;

import java.math.BigDecimal;

/**
 * [自动生成]基础模块-目录信息vo
 * @author  ShuiJingQiu
 * @since   2017-04-25 15:01:36
 * @version 1.0
 */

public class BaseCatalogVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String name; /* 目录名称 */
	private String pic; /*  */
	private Long yearId; /* 年份ID */
	private Long stageId; /* 学段ID */
	private Long subjectId; /* 学科ID */
	private Long gradeId; /* 年级ID */
	private Long termId; /* 学期ID */
	private Long versionId; /* 版本ID */
	private String planId; /* 学制ID */
	private Long sort; /* 排序 */
	
	private BaseSubjectVo baseSubjectVo;
	private BaseGradeVo baseGradeVo;
	private BaseVersionVo baseVersionVo;
	
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
	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
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
	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	} 
	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	}

	public BaseSubjectVo getBaseSubjectVo() {
		return baseSubjectVo;
	}

	public void setBaseSubjectVo(BaseSubjectVo baseSubjectVo) {
		this.baseSubjectVo = baseSubjectVo;
	}

	public BaseGradeVo getBaseGradeVo() {
		return baseGradeVo;
	}

	public void setBaseGradeVo(BaseGradeVo baseGradeVo) {
		this.baseGradeVo = baseGradeVo;
	}

	public BaseVersionVo getBaseVersionVo() {
		return baseVersionVo;
	}

	public void setBaseVersionVo(BaseVersionVo baseVersionVo) {
		this.baseVersionVo = baseVersionVo;
	}

	
}