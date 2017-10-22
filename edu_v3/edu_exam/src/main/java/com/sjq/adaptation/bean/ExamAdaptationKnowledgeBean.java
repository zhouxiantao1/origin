package com.sjq.adaptation.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]考试模块-自适应与知识点关联bean
 * @author  ShuiJingQiu
 * @since   2017-05-17 22:26:50
 * @version 1.0
 */

public class ExamAdaptationKnowledgeBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long adaptationId; /* 自适应测试id */
	private Long knowledgeId; /* 知识点id */
	private int num; /* 默认为0 ，、主要用于计算存储该知识点有多少题被选中 */
	
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
	public Long getAdaptationId() {
		return adaptationId;
	}

	public void setAdaptationId(Long adaptationId) {
		this.adaptationId = adaptationId;
	} 
	public Long getKnowledgeId() {
		return knowledgeId;
	}

	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}



}