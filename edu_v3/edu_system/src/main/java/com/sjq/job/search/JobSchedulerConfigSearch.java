package com.sjq.job.search;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月7日下午2:44:57
 * @version 1.0
 */
public class JobSchedulerConfigSearch {
	
	// 启动类型
	// LOADED.加载即启动
	// MANUAL.手工启动
	private String startType;

	private String schedulerName;

	public String getStartType() {
		return startType;
	}

	public void setStartType(String startType) {
		this.startType = startType;
	}

	public String getSchedulerName() {
		return schedulerName;
	}

	public void setSchedulerName(String schedulerName) {
		this.schedulerName = schedulerName;
	}
	

}
