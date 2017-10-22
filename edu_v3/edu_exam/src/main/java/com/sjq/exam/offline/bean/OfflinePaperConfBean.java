package com.sjq.exam.offline.bean;

/**
 * 
 * @ClassName:OfflinePaperConfBean
 * @Description:线下考试的试卷配置
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 下午2:12:33
 * @version 1.0
 */
public class OfflinePaperConfBean {
	
	private Long id; //id
	
	private String examCode; //考生编码
	
	private String subjectCode; //学科编码
	
	private String subjectName; //学科名称
	
	private String questionNo; //题号
	
	private String pointCode; //知识模块编码
	
	private String pointName; //知识模块
	
	private String abilityCode; //认知层次编码
	
	private String abilityName; //认知层次
	
	private String typeCode; //题型编码
	
	private String typeName; //题型
	
	private String fullScore; //学科满分值

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExamCode() {
		return examCode;
	}

	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(String questionNo) {
		this.questionNo = questionNo;
	}

	public String getPointCode() {
		return pointCode;
	}

	public void setPointCode(String pointCode) {
		this.pointCode = pointCode;
	}

	public String getPointName() {
		return pointName;
	}

	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	public String getAbilityCode() {
		return abilityCode;
	}

	public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}

	public String getAbilityName() {
		return abilityName;
	}

	public void setAbilityName(String abilityName) {
		this.abilityName = abilityName;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getFullScore() {
		return fullScore;
	}

	public void setFullScore(String fullScore) {
		this.fullScore = fullScore;
	}
	
}
