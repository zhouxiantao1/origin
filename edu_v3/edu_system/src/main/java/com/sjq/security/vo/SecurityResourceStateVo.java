package com.sjq.security.vo;

/**
 * 
 * bootstrap treeview 插件所需状态
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月20日下午2:26:20
 * @version 1.0
 */
public class SecurityResourceStateVo {
	
	private Boolean checked = false;     //指示一个节点是否处于checked状态，用一个checkbox图标表示。
	
	private Boolean disabled = false;    //指示一个节点是否处于disabled状态。（不是selectable，expandable或checkable）
	
	private Boolean expanded = false;    //指示一个节点是否处于展开状态。
	
	private Boolean selected = false;    //指示一个节点是否可以被选择。

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public Boolean getExpanded() {
		return expanded;
	}

	public void setExpanded(Boolean expanded) {
		this.expanded = expanded;
	}

	public Boolean getSelected() {
		return selected;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	
	
	
	
}
