package com.sjq.detail.vo;

import java.util.Date;
import java.util.List;

import com.sjq.question.vo.PapersQuestionVo;
import com.sjq.type.vo.QuestionTypeVo;

/**
 * [自动生成]试卷模块-试卷明细信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-10 23:58:11
 * @version 1.0
 */

public class PapersDetailVo{

	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long paperId; /* 试卷id */
	private Long quTypeId; /* 题型id */
	private Long quQuantity; /* 各知识模块题量 */
	private Long quScore; /* 各小题得分 */
	private Long reorder; /* 排序 */
	private String status; /* 是否可用(0不可用，1可用) */
	private String remark; /* 备注 */
	private QuestionTypeVo questionTypeVo; /* 题型 */
	private List<PapersQuestionVo> papersQuestionVoList;//试题集合
	
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
	public Long getPaperId() {
		return paperId;
	}

	public void setPaperId(Long paperId) {
		this.paperId = paperId;
	} 
	public Long getQuTypeId() {
		return quTypeId;
	}

	public void setQuTypeId(Long quTypeId) {
		this.quTypeId = quTypeId;
	} 
	public Long getQuQuantity() {
		return quQuantity;
	}

	public void setQuQuantity(Long quQuantity) {
		this.quQuantity = quQuantity;
	} 
	public Long getQuScore() {
		return quScore;
	}

	public void setQuScore(Long quScore) {
		this.quScore = quScore;
	} 
	public Long getReorder() {
		return reorder;
	}

	public void setReorder(Long reorder) {
		this.reorder = reorder;
	} 
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	} 
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public QuestionTypeVo getQuestionTypeVo() {
		return questionTypeVo;
	}

	public void setQuestionTypeVo(QuestionTypeVo questionTypeVo) {
		this.questionTypeVo = questionTypeVo;
	}

	public List<PapersQuestionVo> getPapersQuestionVoList() {
		return papersQuestionVoList;
	}

	public void setPapersQuestionVoList(List<PapersQuestionVo> papersQuestionVoList) {
		this.papersQuestionVoList = papersQuestionVoList;
	} 
	
}