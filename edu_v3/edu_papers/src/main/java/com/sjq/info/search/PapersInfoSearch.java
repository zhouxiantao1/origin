package com.sjq.info.search;

/**
 * 查询条件
 * [自动生成]试卷模块-试卷信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-11 00:59:01
 * @version 1.0
 */

public class PapersInfoSearch{

	private Long id; /* 自增id */
	private String paperName; /* 试卷名称 */
	private Long subjectId; /* 学科id */
	private Long gradeId; /* 年级id */
	private String status; /* 是否可用(0不可用，1可用) */
	private String createName; /* 创建人 */
	private String examType;//考试类型
	private String isSubjective;//是否包含主观题（0否，1是）
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public String getPaperName() {
		return paperName;
	}

	public void setPaperName(String paperName) {
		this.paperName = paperName;
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

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public String getIsSubjective() {
		return isSubjective;
	}

	public void setIsSubjective(String isSubjective) {
		this.isSubjective = isSubjective;
	} 
	
}