package com.sjq.answer.vo;

import java.util.Date;
import java.util.List;

import com.sjq.answerDetail.vo.WorkAnswerDetailVo;
import com.sjq.student.vo.BaseStudentVo;

import java.math.BigDecimal;

/**
 * [自动生成]作答信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:27:33
 * @version 1.0
 */

public class WorkAnswerVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long homeworkId; /* 作业ID */
	private Long studentId; /* 学生ID */
	private Long answerTime; /* 作答时间，(秒) */
	private String status; /* 1-已完成，0-未完成 */
	private String correct; /* 正确率 */
	private String type; /* 1-作业，2-补救练习 */
	
	private BaseStudentVo baseStudentVo;
	private List<WorkAnswerDetailVo> workAnswerDetailVoList;
	
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
	public Long getHomeworkId() {
		return homeworkId;
	}

	public void setHomeworkId(Long homeworkId) {
		this.homeworkId = homeworkId;
	} 
	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	} 
	public Long getAnswerTime() {
		return answerTime;
	}

	public void setAnswerTime(Long answerTime) {
		this.answerTime = answerTime;
	} 
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCorrect() {
		return correct;
	}

	public void setCorrect(String correct) {
		this.correct = correct;
	}

	public BaseStudentVo getBaseStudentVo() {
		return baseStudentVo;
	}

	public void setBaseStudentVo(BaseStudentVo baseStudentVo) {
		this.baseStudentVo = baseStudentVo;
	}

	public List<WorkAnswerDetailVo> getWorkAnswerDetailVoList() {
		return workAnswerDetailVoList;
	}

	public void setWorkAnswerDetailVoList(List<WorkAnswerDetailVo> workAnswerDetailVoList) {
		this.workAnswerDetailVoList = workAnswerDetailVoList;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 

	
}