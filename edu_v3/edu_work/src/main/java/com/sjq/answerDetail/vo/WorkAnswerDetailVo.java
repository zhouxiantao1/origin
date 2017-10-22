package com.sjq.answerDetail.vo;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]作答详细信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:28:06
 * @version 1.0
 */

public class WorkAnswerDetailVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long answerId; /* 作答编码 */
	private Long questionId; /* 题目ID */
	private String answerContent; /* 作答内容 */
	private Long questionType; /* 题目类型 */
	private Long score; /* 得分 */
	private Long homeworkId; /* 作业ID */
	private String selectNum; /* 选项号(1,2,3,4等) */
	private Long userId; /* 用户ID */
	
	private String isRight;/*0-正确，1-错误 */
	
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
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	} 
	public String getModName() {
		return modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	} 
	public Date getModTime() {
		return modTime;
	}

	public void setModTime(Date modTime) {
		this.modTime = modTime;
	} 
	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
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

	public String getIsRight() {
		return isRight;
	}

	public void setIsRight(String isRight) {
		this.isRight = isRight;
	} 

	
}