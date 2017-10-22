package com.sjq.security.bean;

/**
 * 
 * 菜单表
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月10日下午3:30:39
 * @version 1.0
 */
public class SecurityMenu extends BaseBean{
	
	private Long categoryId;

	private Long parentId;

	private String name;

	private String url;

	private Long isLeaf;

	private Long lev;

	private Long position;

	private String isVisible;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(Long isLeaf) {
		this.isLeaf = isLeaf;
	}

	public Long getLev() {
		return lev;
	}

	public void setLev(Long lev) {
		this.lev = lev;
	}

	public Long getPosition() {
		return position;
	}

	public void setPosition(Long position) {
		this.position = position;
	}

	public String getIsVisible() {
		return isVisible;
	}

	public void setIsVisible(String isVisible) {
		this.isVisible = isVisible;
	}
	
}
