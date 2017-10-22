package com.sjq.job.bean;

import com.sjq.security.bean.BaseBean;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午4:08:49
 * @version 1.0
 */
public class JobLog extends BaseBean{

	private String jobNote;

	private String occurTime;

	private String status;

	private Long jobExecutionId;

	private String jobExecException;

	// private Long localSuccessCount;
	//
	// private Long localFailedCount;
	//
	// private Long portalSuccessCount;
	//
	// private Long portalFailedCount;

	public JobLog() {

	}

	public String getJobNote() {
		return jobNote;
	}

	public void setJobNote(String jobNote) {
		this.jobNote = jobNote;
	}

	public String getOccurTime() {
		return occurTime;
	}

	public void setOccurTime(String occurTime) {
		this.occurTime = occurTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getJobExecutionId() {
		return jobExecutionId;
	}

	public void setJobExecutionId(Long jobExecutionId) {
		this.jobExecutionId = jobExecutionId;
	}

	public String getJobExecException() {
		return jobExecException;
	}

	public void setJobExecException(String jobExecException) {
		this.jobExecException = jobExecException;
	}

}