package com.sjq.knowledge.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]基础模块-知识点信息Search
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:33:27
 * @version 1.0
 */

public class BaseKnowledgeSearch{

	private Long id; /* 自增id */
	private String name; /* 知识点名称 */
	private Long parentId;
	private Long level; /* 等级 */
	private String gradeId; /* 年级ID */
	private String stageId; /* 学段ID */
	private String termId; /* 学期ID */
	private String subjectId; /* 学科ID */
	
	private Long questionId; /*试题id */
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
	public String getGradeId() {
		return gradeId;
	}
	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}
	public String getStageId() {
		return stageId;
	}
	public void setStageId(String stageId) {
		this.stageId = stageId;
	}
	public String getTermId() {
		return termId;
	}
	public void setTermId(String termId) {
		this.termId = termId;
	}
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	

}