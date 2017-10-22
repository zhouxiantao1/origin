package com.sjq.info.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]试卷模块-试卷信息bean
 * @author  ShuiJingQiu
 * @since   2017-05-11 00:59:01
 * @version 1.0
 */

public class PapersInfoBean{

	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String paperName; /* 试卷名称 */
	private String paperType; /* 组卷方式(1命题，2智能，3手工) */
	private Long subjectId; /* 学科id */
	private Long gradeId; /* 年级id */
	private String isPublic; /* 是否公开试卷 */
	private Long testTime; /* 考试时长 */
	private Long totalQuantity; /* 考试题量 */
	private Long totalScore; /* 试卷总分 */
	private String isRelease; /* 当该试卷已发布后，就不能修改该试卷（0未发布，1发布过） */
	private BigDecimal paperDifficulty; /* 试卷难度 */
	private String status; /* 是否可用(0不可用，1可用) */
	private String remark; /* 备注 */
	private String examType; /* 考试类型 */
	private String isSubjective;//是否包含主观题（0否，1是）
	
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
	public String getPaperName() {
		return paperName;
	}

	public void setPaperName(String paperName) {
		this.paperName = paperName;
	} 
	public String getPaperType() {
		return paperType;
	}

	public void setPaperType(String paperType) {
		this.paperType = paperType;
	} 
	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	} 
	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	} 
	public String getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	} 
	public Long getTestTime() {
		return testTime;
	}

	public void setTestTime(Long testTime) {
		this.testTime = testTime;
	} 
	public Long getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(Long totalQuantity) {
		this.totalQuantity = totalQuantity;
	} 
	public Long getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Long totalScore) {
		this.totalScore = totalScore;
	} 
	public String getIsRelease() {
		return isRelease;
	}

	public void setIsRelease(String isRelease) {
		this.isRelease = isRelease;
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
	public BigDecimal getPaperDifficulty() {
		return paperDifficulty;
	}

	public void setPaperDifficulty(BigDecimal paperDifficulty) {
		this.paperDifficulty = paperDifficulty;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public String getIsSubjective() {
		return isSubjective;
	}

	public void setIsSubjective(String isSubjective) {
		this.isSubjective = isSubjective;
	} 
	
}