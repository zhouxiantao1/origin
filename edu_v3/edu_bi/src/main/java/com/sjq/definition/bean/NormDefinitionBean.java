package com.sjq.definition.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]常模管理-常模定义bean
 * @author  ShuiJingQiu
 * @since   2017-07-06 16:04:08
 * @version 1.0
 */

public class NormDefinitionBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String normName; /* 常模名称 */
	private Long examId; /* 考试id */
	private BigDecimal examScoreSum; /* 满分值 */
	private String normDesc; /* 常模说明 */
	private String calculationMethod; /* 计算方式（0标准分数，1百分位） */
	private Long gradeId; /* 年级id */
	
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
	public String getNormName() {
		return normName;
	}

	public void setNormName(String normName) {
		this.normName = normName;
	} 
	public Long getExamId() {
		return examId;
	}

	public void setExamId(Long examId) {
		this.examId = examId;
	} 
	public BigDecimal getExamScoreSum() {
		return examScoreSum;
	}

	public void setExamScoreSum(BigDecimal examScoreSum) {
		this.examScoreSum = examScoreSum;
	} 
	public String getNormDesc() {
		return normDesc;
	}

	public void setNormDesc(String normDesc) {
		this.normDesc = normDesc;
	} 
	public String getCalculationMethod() {
		return calculationMethod;
	}

	public void setCalculationMethod(String calculationMethod) {
		this.calculationMethod = calculationMethod;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	} 
	


}