package com.sjq.common.export;

import java.util.List;

/**
 * 
 * EXCEL列表sheet配置
 * @author SJQ-ZeJie Zheng
 * @since 2017年5月3日下午1:46:47
 * @version 1.0
 */
public class ListSheetConfig<T> extends BasicSheetConfig {

	private List<T> dataList;

	private List<ColumnConfig> columnConfigList;

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

	public List<ColumnConfig> getColumnConfigList() {
		return columnConfigList;
	}

	public void setColumnConfigList(List<ColumnConfig> columnConfigList) {
		this.columnConfigList = columnConfigList;
	}

	@Override
	public String toString() {
		return "ListSheetConfig [dataList=" + dataList + ", columnConfigList=" + columnConfigList
				+ ", getSheetIndex()=" + getSheetIndex() + ", getSheetName()=" + getSheetName() + "]";
	}

}
