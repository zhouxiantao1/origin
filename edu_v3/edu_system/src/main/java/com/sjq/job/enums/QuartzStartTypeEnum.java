package com.sjq.job.enums;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午3:54:29
 * @version 1.0
 */
public enum QuartzStartTypeEnum {
	
	// 0 加载启动
	// 1 手动启动
	LOADED("0", "LOADED"), MANUAL("1", "MANUAL");

	private String code;
	private String name;

	private QuartzStartTypeEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
}
