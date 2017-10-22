package com.sjq.student.vo;

import java.util.Date;

import com.sjq.detail.vo.ExamDetailVo;
import com.sjq.info.vo.ExamInfoVo;

/**
 * [自动生成]线上考试-考生信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-12 18:27:49
 * @version 1.0
 */

public class ExamStudentVo{

	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long examId; /* 考试id */
	private Long examDetailId; /* 考试明细id */
	private Long paperId; /* 试卷id */
	private String studentId; /* 学籍号 */
	private String studentName; /* 考生姓名 */
	private String sex; /* 性别（0男，1女） */
	private String status; /* 是否可用（0否， 1是） */
	private String remark; /* 备注 */
	private String isSubmit; /* 是否提交（0否，1是） */
	private ExamInfoVo examInfoVo;//考试信息
	private ExamDetailVo examDetailVo;//考试明细信息
	private Long subjectId;//学科id
	private Long districtId;//区域id
	private Long schoolId;//学校id
	private Long classId;//班级id
	private Long gradeId; /* 年级id */
	
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
	public Long getExamDetailId() {
		return examDetailId;
	}
	public void setExamDetailId(Long examDetailId) {
		this.examDetailId = examDetailId;
	}
	public Long getPaperId() {
		return paperId;
	}
	public void setPaperId(Long paperId) {
		this.paperId = paperId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
	public String getIsSubmit() {
		return isSubmit;
	}
	public void setIsSubmit(String isSubmit) {
		this.isSubmit = isSubmit;
	}
	public ExamInfoVo getExamInfoVo() {
		return examInfoVo;
	}
	public void setExamInfoVo(ExamInfoVo examInfoVo) {
		this.examInfoVo = examInfoVo;
	}
	public ExamDetailVo getExamDetailVo() {
		return examDetailVo;
	}
	public void setExamDetailVo(ExamDetailVo examDetailVo) {
		this.examDetailVo = examDetailVo;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public Long getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}
	public Long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}
	public Long getClassId() {
		return classId;
	}
	public void setClassId(Long classId) {
		this.classId = classId;
	}
	public Long getGradeId() {
		return gradeId;
	}
	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}
	
}