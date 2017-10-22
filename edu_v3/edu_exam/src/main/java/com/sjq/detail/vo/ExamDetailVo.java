package com.sjq.detail.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.info.vo.PapersInfoVo;
import com.sjq.subject.vo.BaseSubjectVo;

/**
 * [自动生成]线上考试-考试明细信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-12 19:18:17
 * @version 1.0
 */

public class ExamDetailVo{

	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long examId; /* 考试id */
	private Long paperId; /* 试卷id */
	private String detailName; /* 考试明细名称（即对应学科考试名称） */
	private Long subjectId; /* 学科id */
	private Long gradeId; /* 年级id */
	private String examDesc; /* 考试简介 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date startTime; /* 考试开始时间 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endTime; /* 考试结束时间 */
	private String examProgress; /* 考试进度（0未进行，1进行中， 2待评分，3已评分） */
	private String status; /* 是否可用（0否， 1是） */
	private String remark; /* 备注 */
	private PapersInfoVo papersInfoVo;
	private BaseGradeVo bgv;//年级
	private BaseSubjectVo bsb;//学科
	
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
	public Long getExamId() {
		return examId;
	}
	public void setExamId(Long examId) {
		this.examId = examId;
	}
	public Long getPaperId() {
		return paperId;
	}
	public void setPaperId(Long paperId) {
		this.paperId = paperId;
	}
	public String getDetailName() {
		return detailName;
	}
	public void setDetailName(String detailName) {
		this.detailName = detailName;
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
	public String getExamDesc() {
		return examDesc;
	}
	public void setExamDesc(String examDesc) {
		this.examDesc = examDesc;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getExamProgress() {
		return examProgress;
	}
	public void setExamProgress(String examProgress) {
		this.examProgress = examProgress;
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
	public PapersInfoVo getPapersInfoVo() {
		return papersInfoVo;
	}
	public void setPapersInfoVo(PapersInfoVo papersInfoVo) {
		this.papersInfoVo = papersInfoVo;
	}
	
	public BaseGradeVo getBgv() {
		return bgv;
	}
	public void setBgv(BaseGradeVo bgv) {
		this.bgv = bgv;
	}
	public BaseSubjectVo getBsb() {
		return bsb;
	}
	public void setBsb(BaseSubjectVo bsb) {
		this.bsb = bsb;
	}
	
}