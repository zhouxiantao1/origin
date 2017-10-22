package com.sjq.knowledgeCatalogDetail.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]知识点目录详情信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-01 11:35:00
 * @version 1.0
 */

public class BaseKnowledgeCatalogDetailSearch{

	private Long id; /* 自增id */
	private Long catalogdetailId; /* 目录详情ID */
	private Long knowledgeId; /* 知识点ID */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	


}