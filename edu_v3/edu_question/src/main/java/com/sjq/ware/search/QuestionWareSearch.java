package com.sjq.ware.search;

/**
 * 查询条件
 * [自动生成]题库模块-题库中心Search
 * @author  ShuiJingQiu
 * @since   2017-04-25 11:53:57
 * @version 1.0
 */

public class QuestionWareSearch{

	private Long id; /* 自增id */
	private String questionContent; /* 试题内容 */
	private Long subjectId; /* 学科id */
	private Long gradeId; /* 年级id */
	private Long stageId; /* 学段id */
	private Long typeId; /* 题型id */
	private String sortType; /* 排序方式  0.默认 1.按组卷顺序降序， 2.按难度系数升序 */
	private String difficulty; /* 难度等级  0.较易  2.中等  3.较难 （较易1.00-0.70中等0.70-0.30较难0.30-0.00） */
	private String belongToLib;  /* 1考试题库,2作业题库,3錨题库,4种子题库（自适应题库）, 5个人题库（教师题库）,6专家题库 （新题库） */
	private String sort;  /* 排序方式  0.按组卷次数降序   1.按难度系统数 升序 */
	private String checkStatus; /* 0.待审核 1.审核通过 2.审核不通过  */
	private Long createId;  /* 创建人id */
	private Long checkId;  /* 审核人 */
	private Long knowledgeId; /* 知识点id */
	private Long catalogDetailId; /* 课本章节id */
	private Long versionId; /* 版本id  */
	private Long[] ids; /* 批量查询试题 */
	public Long getKnowledgeId() {
		return knowledgeId;
	}

	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
	}

	public String getSortType() {
		return sortType;
		
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
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
	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getBelongToLib() {
		return belongToLib;
	}

	public void setBelongToLib(String belongToLib) {
		this.belongToLib = belongToLib;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Long getCreateId() {
		return createId;
	}

	public void setCreateId(Long createId) {
		this.createId = createId;
	}

	public Long getCatalogDetailId() {
		return catalogDetailId;
	}

	public void setCatalogDetailId(Long catalogDetailId) {
		this.catalogDetailId = catalogDetailId;
	}

	public Long[] getIds() {
		return ids;
	}

	public void setIds(Long[] ids) {
		this.ids = ids;
	}

	public Long getCheckId() {
		return checkId;
	}

	public void setCheckId(Long checkId) {
		this.checkId = checkId;
	}

	public Long getVersionId() {
		return versionId;
	}

	public void setVersionId(Long versionId) {
		this.versionId = versionId;
	} 
	
	
	
}