package com.sjq.paperscore.vo;

import java.util.Date;
import java.util.List;

import com.sjq.questionscore.vo.ExamQuestionscoreVo;
import com.sjq.student.vo.BaseStudentVo;

public class ExamPaperscoreVo{

	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long examId; /* 考试id */
	private Long examDetailId; /* 考试明细id */
	private String studentId; /* 学籍号 */
	private Long score; /* 得分 */
	private String status; /* 状态 */
	private String remark; /* 备注 */
	private Long paperId;//试卷id
	private List<ExamQuestionscoreVo> examQuestionscoreVoList;//试题得分vo集合
	private BaseStudentVo baseStudentVo;//考生信息
	private Long subjectId;//学科id
	
	public Long getExamId() {
		return examId;
	}
	public void setExamId(Long examId) {
		this.examId = examId;
	}
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
	public Long getExamDetailId() {
		return examDetailId;
	}
	public void setExamDetailId(Long examDetailId) {
		this.examDetailId = examDetailId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public Long getScore() {
		return score;
	}
	public void setScore(Long score) {
		this.score = score;
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
	public Long getPaperId() {
		return paperId;
	}
	public void setPaperId(Long paperId) {
		this.paperId = paperId;
	}
	public List<ExamQuestionscoreVo> getExamQuestionscoreVoList() {
		return examQuestionscoreVoList;
	}
	public void setExamQuestionscoreVoList(List<ExamQuestionscoreVo> examQuestionscoreVoList) {
		this.examQuestionscoreVoList = examQuestionscoreVoList;
	}
	public BaseStudentVo getBaseStudentVo() {
		return baseStudentVo;
	}
	public void setBaseStudentVo(BaseStudentVo baseStudentVo) {
		this.baseStudentVo = baseStudentVo;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	
}