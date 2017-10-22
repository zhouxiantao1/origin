package com.sjq.student.vo;

import java.util.Date;

import com.sjq.area.vo.BaseAreaVo;
import com.sjq.classes.vo.BaseClassesVo;
import com.sjq.school.vo.BaseSchoolVo;

import java.math.BigDecimal;

/**
 * [自动生成]基础模块-学生信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-16 15:50:39
 * @version 1.0
 */

public class BaseStudentVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long userId; /* 用户id */
	private String name; /* 学生姓名 */
	private Long schoolId; /* 学校ID */
	private String sex; /* 性别 */
	private Long code; /* 统一学籍号 */
	private Date startTime; /* 入学时间 */
	private Date endTime; /* 毕业时间 */
	private Long sort; /* 排序 */
	private String remake; /* 备注 */
	private Long age; /* 年龄 */
	private Long phone; /* 电话 */
	private String email; /* 邮箱 */
	private Long classesId; /* 班级ID */
	private Long gradeId; /* 年级ID */
	private Long areaId; /* 区域ID */
	private Long stageId; /* 学段ID */
	private String number; /* 学号 */
	private String birth; /* 出生年月 */
	private String idNum; /* 身份证号 */
	
	private BaseClassesVo baseClassesVo;/* 关联的班级Vo*/
	private BaseAreaVo baseAreaVo;/* 关联的区域Vo*/
	private BaseSchoolVo baseSchoolVo;/* 关联的学校Vo*/
	
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
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	} 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	} 
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	} 
	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
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
	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	} 
	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	} 
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	} 
	public Long getClassesId() {
		return classesId;
	}

	public void setClassesId(Long classesId) {
		this.classesId = classesId;
	} 
	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	} 
	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

	public BaseClassesVo getBaseClassesVo() {
		return baseClassesVo;
	}

	public void setBaseClassesVo(BaseClassesVo baseClassesVo) {
		this.baseClassesVo = baseClassesVo;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public BaseAreaVo getBaseAreaVo() {
		return baseAreaVo;
	}

	public void setBaseAreaVo(BaseAreaVo baseAreaVo) {
		this.baseAreaVo = baseAreaVo;
	}

	public BaseSchoolVo getBaseSchoolVo() {
		return baseSchoolVo;
	}

	public void setBaseSchoolVo(BaseSchoolVo baseSchoolVo) {
		this.baseSchoolVo = baseSchoolVo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	} 

	
}