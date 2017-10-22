package com.sjq.ware.dto;

import java.util.List;

/**
 * 
 * 配合前端用的zTree
 * @author SJQ-ZeJie Zheng
 * @since 2017年5月8日下午3:15:12
 * @version 1.0
 */
public class ZTreeNodesDto {
	
	private String name;
	private boolean open = true;
	private boolean isParent;
	private Long id;
	private String url;
	private boolean checked = false;     //默认不选择
	private List<ZTreeNodesDto> children;
	
	private Long searchId;  /* 与Tree无关，主要用于储存查询的id,用于判断哪些节点为open */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public boolean isParent() {
		return isParent;
	}
	public void setParent(boolean isParent) {
		this.isParent = isParent;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<ZTreeNodesDto> getChildren() {
		return children;
	}
	public void setChildren(List<ZTreeNodesDto> children) {
		this.children = children;
	}
	public Long getSearchId() {
		return searchId;
	}
	public void setSearchId(Long searchId) {
		this.searchId = searchId;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
	
	
	
}
