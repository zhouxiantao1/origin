package com.sjq.offpaperconf.search;

/**
 * 
 * @ClassName:OfflinePaperConfBean
 * @Description:线下考试的试卷配置
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 下午2:12:33
 * @version 1.0
 */
public class OffPaperConfSearch {
	
	private Long id; //id
	
	private Long examId; //考试id
	
	private Long examDetailId; /* 考试明细id */
	
	private Long subjectId; //学科id
	
	private String subjectName; //学科名称
	
	private String questionId; //题号
	
	private String pointName; //知识模块
	
	private String abilityName; //认知层次
	
	private String typeName; //题型
	
	private Long fullScore; //学科满分值

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getExamId() {
		return examId;
	}

	public void setExamId(Long examId) {
		this.examId = examId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getPointName() {
		return pointName;
	}

	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	public String getAbilityName() {
		return abilityName;
	}

	public void setAbilityName(String abilityName) {
		this.abilityName = abilityName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Long getFullScore() {
		return fullScore;
	}

	public void setFullScore(Long fullScore) {
		this.fullScore = fullScore;
	}

	public Long getExamDetailId() {
		return examDetailId;
	}

	public void setExamDetailId(Long examDetailId) {
		this.examDetailId = examDetailId;
	}
	
}
