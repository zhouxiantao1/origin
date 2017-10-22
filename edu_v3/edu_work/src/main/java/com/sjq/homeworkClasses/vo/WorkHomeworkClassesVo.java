package com.sjq.homeworkClasses.vo;

import java.util.Date;

import com.sjq.answer.vo.WorkAnswerVo;
import com.sjq.classes.vo.BaseClassesVo;
import com.sjq.homework.vo.WorkHomeworkVo;

import java.math.BigDecimal;

/**
 * [自动生成]作业班级信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-12 10:00:42
 * @version 1.0
 */

public class WorkHomeworkClassesVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long homeworkId; /* 作业ID */
	private Long classesId; /* 班级ID */
	private Long sort; /* 排序 */
	
	private BaseClassesVo baseClassesVo;
	private WorkHomeworkVo workHomeworkVo;

	
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
	public Long getHomeworkId() {
		return homeworkId;
	}

	public void setHomeworkId(Long homeworkId) {
		this.homeworkId = homeworkId;
	} 
	public Long getClassesId() {
		return classesId;
	}

	public void setClassesId(Long classesId) {
		this.classesId = classesId;
	} 
	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	}

	public BaseClassesVo getBaseClassesVo() {
		return baseClassesVo;
	}

	public void setBaseClassesVo(BaseClassesVo baseClassesVo) {
		this.baseClassesVo = baseClassesVo;
	}

	public WorkHomeworkVo getWorkHomeworkVo() {
		return workHomeworkVo;
	}

	public void setWorkHomeworkVo(WorkHomeworkVo workHomeworkVo) {
		this.workHomeworkVo = workHomeworkVo;
	}

	

	
}