package com.sjq.adaptation.vo;

import java.util.Date;

import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.stage.vo.BaseStageVo;
import com.sjq.stageSubject.vo.BaseStageSubjectVo;
import com.sjq.subject.vo.BaseSubjectVo;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * [自动生成]考试模块-自适应测试vo
 * @author  ShuiJingQiu
 * @since   2017-05-12 23:31:54
 * @version 1.0
 */

public class ExamAdaptationVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String name; /* 自适应测试名称 */
	private Long stageId; /* 学段id */
	private Long subjectId; /* 学科id */
	private Long gradeId; /* 年级id */
	private Long num; /* 题量（测试的试题数量） */
	private Long duration; /* 时长（单位分钟） */
	private Date testStartTime; /* 测试开始时间 */
	private Date testEndTime; /* 测试结束时间 */
	private String remark; /* 简介 */
	private String status; /* 状态  (0.未进行 1.进行中 2.已结束) */
	private BaseStageVo bs;
	private BaseGradeVo bgv;
	private BaseSubjectVo bsv;
	
	
	private ExamAdaptationUserVo eauv; /* 关联用户测试记录表(面向测试者） */
	
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
	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	} 
	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	} 
	public Date getTestStartTime() {
		return testStartTime;
	}

	public void setTestStartTime(Date testStartTime) {
		this.testStartTime = testStartTime;
	} 
	public Date getTestEndTime() {
		return testEndTime;
	}

	public void setTestEndTime(Date testEndTime) {
		this.testEndTime = testEndTime;
	} 
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	

	public BaseStageVo getBs() {
		return bs;
	}

	public void setBs(BaseStageVo bs) {
		this.bs = bs;
	}

	public BaseGradeVo getBgv() {
		return bgv;
	}

	public void setBgv(BaseGradeVo bgv) {
		this.bgv = bgv;
	}

	public BaseSubjectVo getBsv() {
		return bsv;
	}

	public void setBsv(BaseSubjectVo bsv) {
		this.bsv = bsv;
	}

	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

	public String getStatus() {
		
        Date now = new Date();
        
        if(testStartTime.getTime()>now.getTime()&&testEndTime.getTime()>now.getTime()){
        	return "0"; //未开始
        }
        
        if(testStartTime.getTime()<now.getTime()&&testEndTime.getTime()>=now.getTime()){
        	return "1"; //进行中
        }
        
        if(testStartTime.getTime()<now.getTime()&&testEndTime.getTime()<now.getTime()){
        	return "2"; //已结束
        }
        
        return "";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ExamAdaptationUserVo getEauv() {
		return eauv;
	}

	public void setEauv(ExamAdaptationUserVo eauv) {
		this.eauv = eauv;
	}

	
	

	

}