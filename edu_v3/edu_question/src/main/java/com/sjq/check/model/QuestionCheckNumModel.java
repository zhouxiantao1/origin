package com.sjq.check.model;

/**
 * 
 * 用于传递审核数量与审核人id
 * @author SJQ-ZeJie Zheng
 * @since 2017年5月10日下午2:28:18
 * @version 1.0
 */
public class QuestionCheckNumModel {
	
	public Long checkId; /* 操作人id(教研员id) */
	public String checkName; 
	public int num;/* 审核试题的数量  */
	
	public Long getCheckId() {
		return checkId;
	}
	public void setCheckId(Long checkId) {
		this.checkId = checkId;
	}
	public String getCheckName() {
		return checkName;
	}
	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
 	
	
}
