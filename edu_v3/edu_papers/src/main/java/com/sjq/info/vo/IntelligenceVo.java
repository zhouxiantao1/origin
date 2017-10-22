package com.sjq.info.vo;

import java.util.List;
import java.util.Map;

import com.sjq.type.vo.QuestionTypeVo;
import com.sjq.ware.vo.QuestionWareVo;

import java.math.BigDecimal;

/**
 * [自动生成]试卷模块-试卷明细信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-10 23:58:11
 * @version 1.0
 */

public class IntelligenceVo{
	
	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private String createTime; /* (默认)创建时间 */
	private String paperName; /* 试卷名称 */
	private String paperType; /* 组卷方式(1命题，2智能，3手工) */
	private Long subjectId; /* 学科id */
	private String subjectName;
	private Long stageId; //学段id
	private Long catalogId;//课本id
	private List<Long> catalogDetailIdList;//课本章节集合
	private Long gradeId; /* 年级id */
	private String gradeName; 
	private Long versionId;/* 版本id */
	private String versionName;
	private Long testTime; /* 考试时长 */
	private Long totalQuantity; /* 考试总题量 */
	private Long totalScore; /* 试卷总分 */
	private BigDecimal paperDifficulty; /* 试卷难度 */
	private List<QuestionTypeVo> questionTypeVoList;//题型集合
	private Map<String,List<QuestionWareVo>> questionWareVoMap;//key题型，values 题型对应的题目集合
	private Map<String,String> questionQuScoreMap;//key题型ID，values分数
	private Map<String,String> questionQuQuantityMap;//key题型ID，values题量
	private Map<String,String> questionTypeMap;//key题型ID，values题型名称
	private String examType; /* 考试类型 */
	private String isSubjective;//是否包含主观题（0否，1是）
	
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
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getPaperName() {
		return paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	public String getPaperType() {
		return paperType;
	}
	public void setPaperType(String paperType) {
		this.paperType = paperType;
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
	public Long getGradeId() {
		return gradeId;
	}
	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public Long getVersionId() {
		return versionId;
	}
	public void setVersionId(Long versionId) {
		this.versionId = versionId;
	}
	public String getVersionName() {
		return versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	public Long getTestTime() {
		return testTime;
	}
	public void setTestTime(Long testTime) {
		this.testTime = testTime;
	}
	public Long getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(Long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public Long getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(Long totalScore) {
		this.totalScore = totalScore;
	}
	public BigDecimal getPaperDifficulty() {
		return paperDifficulty;
	}
	public void setPaperDifficulty(BigDecimal paperDifficulty) {
		this.paperDifficulty = paperDifficulty;
	}
	public List<QuestionTypeVo> getQuestionTypeVoList() {
		return questionTypeVoList;
	}
	public void setQuestionTypeVoList(List<QuestionTypeVo> questionTypeVoList) {
		this.questionTypeVoList = questionTypeVoList;
	}
	public Map<String, List<QuestionWareVo>> getQuestionWareVoMap() {
		return questionWareVoMap;
	}
	public void setQuestionWareVoMap(Map<String, List<QuestionWareVo>> questionWareVoMap) {
		this.questionWareVoMap = questionWareVoMap;
	}
	public Map<String, String> getQuestionQuScoreMap() {
		return questionQuScoreMap;
	}
	public void setQuestionQuScoreMap(Map<String, String> questionQuScoreMap) {
		this.questionQuScoreMap = questionQuScoreMap;
	}
	public Map<String, String> getQuestionQuQuantityMap() {
		return questionQuQuantityMap;
	}
	public void setQuestionQuQuantityMap(Map<String, String> questionQuQuantityMap) {
		this.questionQuQuantityMap = questionQuQuantityMap;
	}
	public Map<String, String> getQuestionTypeMap() {
		return questionTypeMap;
	}
	public void setQuestionTypeMap(Map<String, String> questionTypeMap) {
		this.questionTypeMap = questionTypeMap;
	}
	public Long getStageId() {
		return stageId;
	}
	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}
	public Long getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(Long catalogId) {
		this.catalogId = catalogId;
	}
	public List<Long> getCatalogDetailIdList() {
		return catalogDetailIdList;
	}
	public void setCatalogDetailIdList(List<Long> catalogDetailIdList) {
		this.catalogDetailIdList = catalogDetailIdList;
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