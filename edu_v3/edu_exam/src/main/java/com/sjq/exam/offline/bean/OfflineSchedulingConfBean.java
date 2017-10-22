package com.sjq.exam.offline.bean;

/**
 * 
 * @ClassName:OfflineSchedulingConfBean
 * @Description:线下考生作答数据
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 下午2:12:33
 * @version 1.0
 */
public class OfflineSchedulingConfBean {
	
	private Long id; //id
	
	private String examCode; //考试编码
	
	private String startTime; //基础数据导入开始时间
	
	private String endTime; //基础数据导入结束时间
	
	private String runningState; //运行状态
	
	private String callNumber; //最多调用次数
	
	private String status;//状态

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExamCode() {
		return examCode;
	}

	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getRunningState() {
		return runningState;
	}

	public void setRunningState(String runningState) {
		this.runningState = runningState;
	}

	public String getCallNumber() {
		return callNumber;
	}

	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
