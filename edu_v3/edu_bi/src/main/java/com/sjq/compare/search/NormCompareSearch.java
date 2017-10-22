package com.sjq.compare.search;

/**
 * 查询条件
 * [自动生成]常模管理-常模对照Search
 * @author  ShuiJingQiu
 * @since   2017-07-06 15:06:34
 * @version 1.0
 */

public class NormCompareSearch{

	private Long id; /* 自增id */
	private String delflag; /* (默认)删除标识 */
	private Long defId; /* 常模定义id */
	private Long examId;
	private String normName; /* 常模名称 */
	private String calculationMethod; /* 计算方式（0标准分数，1百分位） */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getExamId() {
		return examId;
	}

	public void setExamId(Long examId) {
		this.examId = examId;
	}

	public String getNormName() {
		return normName;
	}

	public void setNormName(String normName) {
		this.normName = normName;
	}

	public String getCalculationMethod() {
		return calculationMethod;
	}

	public void setCalculationMethod(String calculationMethod) {
		this.calculationMethod = calculationMethod;
	}
	
}