package com.sjq.job.dto;

import java.util.List;

/**
 * 
 * SPRING BATCH JOB 作业步骤执行情况详情
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月7日上午11:09:33
 * @version 1.0
 */
public class StepExecutionDto {

	private String stepName;

	private Integer readCount = 0;

	private Integer writeCount = 0;

	private Integer commitCount = 0;

	private Integer rollbackCount = 0;

	private Integer readSkipCount = 0;

	private Integer processSkipCount = 0;

	private Integer writeSkipCount = 0;

	private String startTime;

	private String endTime;

	private String lastUpdated;

	private Integer filterCount;

	private String exitStatus;

	private List<Throwable> failureExceptions;

	public String getStepName() {
		return stepName;
	}

	public void setStepName(String stepName) {
		this.stepName = stepName;
	}

	public Integer getReadCount() {
		return readCount;
	}

	public void setReadCount(Integer readCount) {
		this.readCount = readCount;
	}

	public Integer getWriteCount() {
		return writeCount;
	}

	public void setWriteCount(Integer writeCount) {
		this.writeCount = writeCount;
	}

	public Integer getCommitCount() {
		return commitCount;
	}

	public void setCommitCount(Integer commitCount) {
		this.commitCount = commitCount;
	}

	public Integer getRollbackCount() {
		return rollbackCount;
	}

	public void setRollbackCount(Integer rollbackCount) {
		this.rollbackCount = rollbackCount;
	}

	public Integer getReadSkipCount() {
		return readSkipCount;
	}

	public void setReadSkipCount(Integer readSkipCount) {
		this.readSkipCount = readSkipCount;
	}

	public Integer getProcessSkipCount() {
		return processSkipCount;
	}

	public void setProcessSkipCount(Integer processSkipCount) {
		this.processSkipCount = processSkipCount;
	}

	public Integer getWriteSkipCount() {
		return writeSkipCount;
	}

	public void setWriteSkipCount(Integer writeSkipCount) {
		this.writeSkipCount = writeSkipCount;
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

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Integer getFilterCount() {
		return filterCount;
	}

	public void setFilterCount(Integer filterCount) {
		this.filterCount = filterCount;
	}

	public String getExitStatus() {
		return exitStatus;
	}

	public void setExitStatus(String exitStatus) {
		this.exitStatus = exitStatus;
	}

	public List<Throwable> getFailureExceptions() {
		return failureExceptions;
	}

	public void setFailureExceptions(List<Throwable> failureExceptions) {
		this.failureExceptions = failureExceptions;
	}

}
