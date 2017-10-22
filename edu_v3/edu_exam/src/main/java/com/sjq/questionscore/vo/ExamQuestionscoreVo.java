package com.sjq.questionscore.vo;

import java.util.Date;

/**
 * [自动生成]试管理-考生考试试题得分vo
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:04
 * @version 1.0
 */

public class ExamQuestionscoreVo{
	
	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long paperScoreId; /* 卷面得分id */
	private Long examDetailId;//考试明细id
	private Long questionId; /* 试题id */
	private Long score; /* 小题得分 */
	private String studentId; /* 学生学籍号 */
	private String isWrong; /* 题目是否做错（0否，1是） */
	private String options; /* 选项（作答答案） */
	private String answer;//正确答案
	
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
	public Long getPaperScoreId() {
		return paperScoreId;
	}
	public void setPaperScoreId(Long paperScoreId) {
		this.paperScoreId = paperScoreId;
	}
	public Long getExamDetailId() {
		return examDetailId;
	}
	public void setExamDetailId(Long examDetailId) {
		this.examDetailId = examDetailId;
	}
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public Long getScore() {
		return score;
	}
	public void setScore(Long score) {
		this.score = score;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getIsWrong() {
		return isWrong;
	}
	public void setIsWrong(String isWrong) {
		this.isWrong = isWrong;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}