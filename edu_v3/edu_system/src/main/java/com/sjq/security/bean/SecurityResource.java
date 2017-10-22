package com.sjq.security.bean;

/**
 * 
 * 权限资源表
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月10日下午3:02:39
 * @version 1.0
 */
public class SecurityResource extends BaseBean{
	
	private String name;   // 资源名称
	
	private String resourceType;   //资源类型（0节点，1元素，2数据）

	private String url;   //资源url

	private String isVisible;   //是否可用  0可用 1不可用
	
	private String imgUrl;     //资源图标
	
	private String imgUrlSelected;  //资源选中图标
	
	private Long parentId;   //父级id
	
	private String description;  //描述
	
	private Long sort;           //排序

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIsVisible() {
		return isVisible;
	}

	public void setIsVisible(String isVisible) {
		this.isVisible = isVisible;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getImgUrlSelected() {
		return imgUrlSelected;
	}

	public void setImgUrlSelected(String imgUrlSelected) {
		this.imgUrlSelected = imgUrlSelected;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	}

}