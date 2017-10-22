package com.sjq.teacherClasses.vo;

import java.util.Date;

import com.sjq.classes.vo.BaseClassesVo;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.stage.vo.BaseStageVo;
import com.sjq.subject.vo.BaseSubjectVo;

import java.math.BigDecimal;

/**
 * [自动生成]教师班级信息vo
 * @author  ShuiJingQiu
 * @since   2017-04-27 15:29:15
 * @version 1.0
 */

public class BaseTeacherClassesVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long teacherId; /* 教师ID */
	private Long classesId; /* 班级ID */
	private Long subjectId; /* 学科ID */
	private String isIncharge; /* 是否是班主任，0-不是，1-是 */
	private Long sort; /* 排序 */
	private String remake; /* 备注 */
	private Long userId;	/*用户ID*/
	private Long gradeId;	/*年级ID*/
	private Long stageId; /*学段ID*/
	
	private BaseSubjectVo baseSubjectVo; //学科对象
	private BaseGradeVo baseGradeVo;	//年级对象
	private BaseClassesVo baseClassesVo;	//班级对象
	private BaseStageVo baseStageVo;  //学段对象
	
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
	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	} 
	public Long getClassesId() {
		return classesId;
	}

	public void setClassesId(Long classesId) {
		this.classesId = classesId;
	} 
	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	} 
	public String getIsIncharge() {
		return isIncharge;
	}

	public void setIsIncharge(String isIncharge) {
		this.isIncharge = isIncharge;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public BaseSubjectVo getBaseSubjectVo() {
		return baseSubjectVo;
	}

	public void setBaseSubjectVo(BaseSubjectVo baseSubjectVo) {
		this.baseSubjectVo = baseSubjectVo;
	}

	public BaseGradeVo getBaseGradeVo() {
		return baseGradeVo;
	}

	public void setBaseGradeVo(BaseGradeVo baseGradeVo) {
		this.baseGradeVo = baseGradeVo;
	}

	public BaseClassesVo getBaseClassesVo() {
		return baseClassesVo;
	}

	public void setBaseClassesVo(BaseClassesVo baseClassesVo) {
		this.baseClassesVo = baseClassesVo;
	}

	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

	public BaseStageVo getBaseStageVo() {
		return baseStageVo;
	}

	public void setBaseStageVo(BaseStageVo baseStageVo) {
		this.baseStageVo = baseStageVo;
	} 

	
}