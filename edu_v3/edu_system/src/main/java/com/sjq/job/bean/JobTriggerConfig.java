package com.sjq.job.bean;

import com.sjq.security.bean.BaseBean;

/**
 * 
 * QUARTZ触发器配置
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午4:10:10
 * @version 1.0
 */
public class JobTriggerConfig extends BaseBean{

	// 触发类型
	// LOADED.加载即触发
	// MANUAL.手工触发
	private String triggerType;

	// 触发器备注
	private String triggerNote;

	private String schedulerName;

	private String groupName;

	private String triggerName;

	private String cronExpression;

	private String springBatchJobId;

	public String getTriggerType() {
		return triggerType;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}

	public String getTriggerNote() {
		return triggerNote;
	}

	public void setTriggerNote(String triggerNote) {
		this.triggerNote = triggerNote;
	}

	public String getSchedulerName() {
		return schedulerName;
	}

	public void setSchedulerName(String schedulerName) {
		this.schedulerName = schedulerName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getTriggerName() {
		return triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

	public String getCronExpression() {
		return cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public String getSpringBatchJobId() {
		return springBatchJobId;
	}

	public void setSpringBatchJobId(String springBatchJobId) {
		this.springBatchJobId = springBatchJobId;
	}

}
