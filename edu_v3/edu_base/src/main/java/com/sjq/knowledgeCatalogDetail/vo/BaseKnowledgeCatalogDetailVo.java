package com.sjq.knowledgeCatalogDetail.vo;

import java.util.Date;
import java.util.List;
import com.sjq.knowledge.vo.BaseKnowledgeVo;


/**
 * [自动生成]知识点目录详情信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-01 11:35:00
 * @version 1.0
 */

public class BaseKnowledgeCatalogDetailVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long catalogdetailId; /* 目录详情ID */
	private Long knowledgeId; /* 知识点ID */
	private Long sort; /* 排序 */
	
	private BaseKnowledgeVo bkv;
	
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
	public Long getCatalogdetailId() {
		return catalogdetailId;
	}

	public void setCatalogdetailId(Long catalogdetailId) {
		this.catalogdetailId = catalogdetailId;
	} 
	public Long getKnowledgeId() {
		return knowledgeId;
	}

	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
	} 
	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	}

	public BaseKnowledgeVo getBkv() {
		return bkv;
	}

	public void setBkv(BaseKnowledgeVo bkv) {
		this.bkv = bkv;
	}


}