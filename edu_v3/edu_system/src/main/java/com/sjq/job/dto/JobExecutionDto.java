package com.sjq.job.dto;

import java.util.List;
import java.util.Map;

import org.springframework.batch.core.JobParameter;

/**
 * 
 * SPRING BATCH JOB 执行情况详情
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月7日上午11:08:46
 * @version 1.0
 */
public class JobExecutionDto {

	private Long jobInstanceId;

	private String jobInstanceName;

	private Long jobExecutionId;

	private String startTime;

	private String endTime;

	private String exitStatus;

	private String exitDescription;

	private Map<String, JobParameter> jobParameterMap;

	private List<StepExecutionDto> stepExecutionList;

	private List<Throwable> exceptionList;

	private Integer totalRecordCount = 0;

	private Integer localSuccessCount = 0;

	private Integer localFailedCount = 0;

	private Integer portalSuccessCount = 0;

	private Integer portalFailedCount = 0;

	private String jobExecException;

	public Long getJobInstanceId() {
		return jobInstanceId;
	}

	public void setJobInstanceId(Long jobInstanceId) {
		this.jobInstanceId = jobInstanceId;
	}

	public String getJobInstanceName() {
		return jobInstanceName;
	}

	public void setJobInstanceName(String jobInstanceName) {
		this.jobInstanceName = jobInstanceName;
	}

	public Long getJobExecutionId() {
		return jobExecutionId;
	}

	public void setJobExecutionId(Long jobExecutionId) {
		this.jobExecutionId = jobExecutionId;
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

	public String getExitStatus() {
		return exitStatus;
	}

	public void setExitStatus(String exitStatus) {
		this.exitStatus = exitStatus;
	}

	public String getExitDescription() {
		return exitDescription;
	}

	public void setExitDescription(String exitDescription) {
		this.exitDescription = exitDescription;
	}

	public Map<String, JobParameter> getJobParameterMap() {
		return jobParameterMap;
	}

	public void setJobParameterMap(Map<String, JobParameter> jobParameterMap) {
		this.jobParameterMap = jobParameterMap;
	}

	public List<StepExecutionDto> getStepExecutionList() {
		return stepExecutionList;
	}

	public void setStepExecutionList(List<StepExecutionDto> stepExecutionList) {
		this.stepExecutionList = stepExecutionList;
	}

	public List<Throwable> getExceptionList() {
		return exceptionList;
	}

	public void setExceptionList(List<Throwable> exceptionList) {
		this.exceptionList = exceptionList;
	}

	public Integer getTotalRecordCount() {
		return totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getLocalSuccessCount() {
		return localSuccessCount;
	}

	public void setLocalSuccessCount(Integer localSuccessCount) {
		this.localSuccessCount = localSuccessCount;
	}

	public Integer getLocalFailedCount() {
		return localFailedCount;
	}

	public void setLocalFailedCount(Integer localFailedCount) {
		this.localFailedCount = localFailedCount;
	}

	public Integer getPortalSuccessCount() {
		return portalSuccessCount;
	}

	public void setPortalSuccessCount(Integer portalSuccessCount) {
		this.portalSuccessCount = portalSuccessCount;
	}

	public Integer getPortalFailedCount() {
		return portalFailedCount;
	}

	public void setPortalFailedCount(Integer portalFailedCount) {
		this.portalFailedCount = portalFailedCount;
	}

	public String getJobExecException() {
		return jobExecException;
	}

	public void setJobExecException(String jobExecException) {
		this.jobExecException = jobExecException;
	}

}
