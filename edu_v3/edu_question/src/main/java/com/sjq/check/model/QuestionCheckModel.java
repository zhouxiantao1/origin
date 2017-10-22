package com.sjq.check.model;

import java.util.List;

public class QuestionCheckModel {

	private List<QuestionCheckNumModel> qcnms;
	private Long subjectId; /* 学科id */
	private Long gradeId; /* 年级id */
	private Long stageId; /* 学段id */

	public List<QuestionCheckNumModel> getQcnms() {
		return qcnms;
	}

	public void setQcnms(List<QuestionCheckNumModel> qcnms) {
		this.qcnms = qcnms;
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

	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}
	
	
	
}
