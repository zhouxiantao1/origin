package com.sjq.evaDetailPaper.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]测评明细问卷信息bean
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:17:14
 * @version 1.0
 */

public class EvaluateEvaDetailPaperBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long evaDetailId; /* 测评明细ID */
	private Long paperId; /* 问卷ID */
	private Long sort; /* 排序 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	} 
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	} 
	public String getModName() {
		return modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	} 
	public Date getModTime() {
		return modTime;
	}

	public void setModTime(Date modTime) {
		this.modTime = modTime;
	} 
	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	} 
	public Long getEvaDetailId() {
		return evaDetailId;
	}

	public void setEvaDetailId(Long evaDetailId) {
		this.evaDetailId = evaDetailId;
	} 
	public Long getPaperId() {
		return paperId;
	}

	public void setPaperId(Long paperId) {
		this.paperId = paperId;
	} 
	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	} 


}