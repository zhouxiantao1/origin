package com.sjq.common.export;


/**
 * 
 *
 * @author SJQ-ZeJie Zheng
 * @since 2017年5月3日下午1:45:43
 * @version 1.0
 */
public class ColumnConfig {
	private String code;
	private String name;
	private Short colspan;
	private Short colrows;

	public ColumnConfig(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getColspan() {
		return colspan;
	}

	public ColumnConfig setColspan(Short colspan) {
		this.colspan = colspan;
		return this;
	}

	public Short getColrows() {
		return colrows;
	}

	public ColumnConfig setColrows(Short colrows) {
		this.colrows = colrows;
		return this;
	}

}
