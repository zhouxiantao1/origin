package com.sjq.common.export;

import java.util.Map;


/**
 * 
 * EXCEL概括sheet配置
 * @author SJQ-ZeJie Zheng
 * @since 2017年5月3日下午1:47:04
 * @version 1.0
 */
public class SumSheetConfig extends BasicSheetConfig {

	private String title;

	private Map<String, Integer> sumDataMap;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Map<String, Integer> getSumDataMap() {
		return sumDataMap;
	}

	public void setSumDataMap(Map<String, Integer> sumDataMap) {
		this.sumDataMap = sumDataMap;
	}

	@Override
	public String toString() {
		return "SumSheetConfig [title=" + title + ", sumDataMap=" + sumDataMap + ", getSheetIndex()=" + getSheetIndex()
				+ ", getSheetName()=" + getSheetName() + "]";
	}

}
