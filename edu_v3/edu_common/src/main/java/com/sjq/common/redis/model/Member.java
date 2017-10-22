package com.sjq.common.redis.model;

import java.io.Serializable;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月1日上午10:33:42
 * @version 1.0
 */
public class Member implements Serializable{

	private static final long serialVersionUID = 1L;
	private String key;    
	private String value;
	
	public Member() {
		super();
	}
	
	public Member(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	  
}
