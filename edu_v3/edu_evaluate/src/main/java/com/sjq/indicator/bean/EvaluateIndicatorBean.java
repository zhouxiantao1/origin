package com.sjq.indicator.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]指标信息bean
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:55:02
 * @version 1.0
 */

public class EvaluateIndicatorBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String name; /* 指标名称 */
	private String content; /* 指标内容 */
	private Long parentId; /* 父类ID */
	private String parentIds; /* 父类ID集合 */
	private BigDecimal weight; /* 权重 */
	private Long sort; /* 排序 */
	private String remake; /* 备注 */
	private String type; /* 1-通用指标，2-自定义指标 */
	private Long userId; /* 用户ID */
	private Long useNum; /* 使用次数 */
	
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
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	} 
	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	} 
	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	} 
	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	} 
	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	} 
	public String getRemake() {
		return remake;
	}

	public void setRemake(String remake) {
		this.remake = remake;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUseNum() {
		return useNum;
	}

	public void setUseNum(Long useNum) {
		this.useNum = useNum;
	} 

	
}