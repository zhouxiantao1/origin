package com.sjq.job.exception;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 
 *
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午3:57:01
 * @version 1.0
 */
public class JobException {


	private Map<String, String> stepExecution = new HashMap<String, String>();

	public JobException(String stepExecutionName, String stepExecutionException) {
		stepExecution.put(stepExecutionName, stepExecutionException);
	}

	public Map<String, String> getStepExecution() {
		return stepExecution;
	}

	public void setStepExecution(Map<String, String> stepExecution) {
		this.stepExecution = stepExecution;
	}

	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	
}
