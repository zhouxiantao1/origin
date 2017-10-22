package com.sjq.answerDetail.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]作答详细信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:28:06
 * @version 1.0
 */

public class WorkAnswerDetailSearch{

	private Long id; /* 自增id */
	private Long answerId; /* 作答编码 */
	private Long questionId; /* 题目ID */
	private String answerContent; /* 作答内容 */
	private Long questionType; /* 题目类型 */
	private Long score; /* 得分 */
	private Long homeworkId; /* 作业ID */
	private String selectNum; /* 选项号(1,2,3,4等) */
	private Long userId; /* 用户ID */
	private String delflag; /* (默认)删除标识 */
	private String isRight;/*0-正确，1-错误 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getAnswerContent() {
		return answerContent;
	}

	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}

	public Long getQuestionType() {
		return questionType;
	}

	public void setQuestionType(Long questionType) {
		this.questionType = questionType;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Long getHomeworkId() {
		return homeworkId;
	}

	public void setHomeworkId(Long homeworkId) {
		this.homeworkId = homeworkId;
	}

	public String getSelectNum() {
		return selectNum;
	}

	public void setSelectNum(String selectNum) {
		this.selectNum = selectNum;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}

	public String getIsRight() {
		return isRight;
	}

	public void setIsRight(String isRight) {
		this.isRight = isRight;
	} 

	
}