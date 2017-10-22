package com.sjq.compare.vo;

import java.util.Date;

import com.sjq.definition.vo.NormDefinitionVo;
import com.sjq.detail.vo.ExamDetailVo;

import java.math.BigDecimal;

/**
 * [自动生成]常模管理-常模对照vo
 * @author  ShuiJingQiu
 * @since   2017-07-06 15:06:34
 * @version 1.0
 */

public class NormCompareVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long defId; /* 常模定义id */
	private BigDecimal originalScore; /* 原始分 */
	private BigDecimal standardScore; /* 常模标准分数 */
	private BigDecimal normPercent; /* 常模百分位分数 */
	private Long examDetailId; /* 考试明细id */
	private NormDefinitionVo normDefinitionVo;
	private ExamDetailVo examDetailVo;
	
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
	public Long getDefId() {
		return defId;
	}

	public void setDefId(Long defId) {
		this.defId = defId;
	} 
	public BigDecimal getOriginalScore() {
		return originalScore;
	}

	public void setOriginalScore(BigDecimal originalScore) {
		this.originalScore = originalScore;
	} 
	public BigDecimal getStandardScore() {
		return standardScore;
	}

	public void setStandardScore(BigDecimal standardScore) {
		this.standardScore = standardScore;
	} 
	public BigDecimal getNormPercent() {
		return normPercent;
	}

	public void setNormPercent(BigDecimal normPercent) {
		this.normPercent = normPercent;
	}

	public NormDefinitionVo getNormDefinitionVo() {
		return normDefinitionVo;
	}

	public void setNormDefinitionVo(NormDefinitionVo normDefinitionVo) {
		this.normDefinitionVo = normDefinitionVo;
	}

	public ExamDetailVo getExamDetailVo() {
		return examDetailVo;
	}

	public void setExamDetailVo(ExamDetailVo examDetailVo) {
		this.examDetailVo = examDetailVo;
	}

	public Long getExamDetailId() {
		return examDetailId;
	}

	public void setExamDetailId(Long examDetailId) {
		this.examDetailId = examDetailId;
	} 
	
}