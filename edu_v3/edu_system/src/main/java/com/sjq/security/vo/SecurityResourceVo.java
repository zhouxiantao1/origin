package com.sjq.security.vo;

import java.util.List;

public class SecurityResourceVo {

	private String text;       //资源名称
	
	private Long rid;          //资源id
	 
	private Long pid;          //父级资源id
	
	private List<SecurityResourceVo> nodes;      //子级资源
	
	private SecurityResourceStateVo state = new SecurityResourceStateVo();       //一个节点的初始状态。

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	

	public List<SecurityResourceVo> getNodes() {
		return nodes;
	}

	public void setNodes(List<SecurityResourceVo> nodes) {
		this.nodes = nodes;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public SecurityResourceStateVo getState() {
		return state;
	}

	public void setState(SecurityResourceStateVo state) {
		this.state = state;
	}
	
	
	
	
	
}
