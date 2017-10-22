package com.sjq.exam.online.vo;

import java.util.Date;

/**
 * 
 * @ClassName:ExamOfflineDataVo
 * @Description:线下考试基础数据vo
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 下午4:11:07
 * @version 1.0
 */
public class OnlineSchedulingConfVo {
	
	private Long id; //id
	
	private Long examId; //考试id
	
	private Date startTime; //基础数据导入开始时间
	
	private Date endTime; //基础数据导入结束时间
	
	private String runningState; //运行状态
	
	private Integer callNumber; //最多调用次数
	
	private String status;//状态

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

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getRunningState() {
		return runningState;
	}

	public void setRunningState(String runningState) {
		this.runningState = runningState;
	}

	public Integer getCallNumber() {
		return callNumber;
	}

	public void setCallNumber(Integer callNumber) {
		this.callNumber = callNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
