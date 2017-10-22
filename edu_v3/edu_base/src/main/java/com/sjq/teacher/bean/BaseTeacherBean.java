package com.sjq.teacher.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]教师信息bean
 * @author  ShuiJingQiu
 * @since   2017-04-27 16:06:01
 * @version 1.0
 */

public class BaseTeacherBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long userId; /* 用户ID */
	private String name; /* 教师姓名 */
	private String sex; /* 性别 */
	private Long age; /* 年龄 */
	private String degree; /* 学历 */
	private String title; /* 职称 */
	private String nativePlace; /* 籍贯 */
	private Long workeAge; /* 工龄 */
	private Long sort; /* 排序 */
	private String remake; /* 备注 */
	private Long phone; /* 电话 */
	private String email; /* 邮箱 */
	private Long schoolId;
	private Long areaId;
	private String idNum; /* 身份证号 */
	private String teacherImg; /* 教师头像 */
	private String birth; /* 出生年月 */
	private String teacherCourse; /* 任教学科（数据转移时用） */
	
	private String loginName; //登陆名
	private String passwork;  //密码
	
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
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	} 
	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	} 
	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	} 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	} 
	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	} 
	public Long getWorkeAge() {
		return workeAge;
	}

	public void setWorkeAge(Long workeAge) {
		this.workeAge = workeAge;
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

	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getTeacherImg() {
		return teacherImg;
	}

	public void setTeacherImg(String teacherImg) {
		this.teacherImg = teacherImg;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getTeacherCourse() {
		return teacherCourse;
	}

	public void setTeacherCourse(String teacherCourse) {
		this.teacherCourse = teacherCourse;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPasswork() {
		return passwork;
	}

	public void setPasswork(String passwork) {
		this.passwork = passwork;
	} 

	
}