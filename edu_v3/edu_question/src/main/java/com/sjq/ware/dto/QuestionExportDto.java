package com.sjq.ware.dto;

import java.math.BigDecimal;

/**
 * 
 * 试题导入模板
 * @author SJQ-ZeJie Zheng
 * @since 2017年5月3日下午3:25:22
 * @version 1.0
 */
public class QuestionExportDto {
	
	private String questionTypeName;/* 试题题型名称  */
	private String questionContent;/* 试题内容  */
	private String questionAnswer;/* 试题答案  */
	private String questionAnswerDescription; /* 试题解析  */
	private String difficulty; /* 试题难度值（取值由0到1为简单到困难） */
	private String bloomTaxonomy; /* 布鲁姆认知体系1知道，2领会，3应用，4分析，5综合，6评价 */
	
	
	public String getQuestionTypeName() {
		return questionTypeName;
	}
	public void setQuestionTypeName(String questionTypeName) {
		this.questionTypeName = questionTypeName;
	}
	public String getQuestionContent() {
		return questionContent;
	}
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
	public String getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public String getQuestionAnswerDescription() {
		return questionAnswerDescription;
	}
	public void setQuestionAnswerDescription(String questionAnswerDescription) {
		this.questionAnswerDescription = questionAnswerDescription;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getBloomTaxonomy() {
		return bloomTaxonomy;
	}
	public void setBloomTaxonomy(String bloomTaxonomy) {
		this.bloomTaxonomy = bloomTaxonomy;
	}
	
	

}
