package com.sjq.develop.vo;

import java.util.Date;

/**
 * 
 *
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月13日上午9:30:04
 * @version 1.0
 */
public class DevelopCodeMethodVo {
	
	private Long id;           /* id  */
	private Date createTime;   /* 创建时间   */
	private String createName; /* 创建人 */
	private Date modTime;      /* 修改时间  */
	private String modName;    /* 修改人 */
	private String delflag;    /* 删除标识 */
	
	private Long codeId;   
	private Long methodId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateName() {
		return createName;
	}
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	public Date getModTime() {
		return modTime;
	}
	public void setModTime(Date modTime) {
		this.modTime = modTime;
	}
	public String getModName() {
		return modName;
	}
	public void setModName(String modName) {
		this.modName = modName;
	}
	public String getDelflag() {
		return delflag;
	}
	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}
	public Long getCodeId() {
		return codeId;
	}
	public void setCodeId(Long codeId) {
		this.codeId = codeId;
	}
	public Long getMethodId() {
		return methodId;
	}
	public void setMethodId(Long methodId) {
		this.methodId = methodId;
	}
	
	
}
