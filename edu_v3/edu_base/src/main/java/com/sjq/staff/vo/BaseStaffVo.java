package com.sjq.staff.vo;

import java.util.Date;

import com.sjq.area.vo.BaseAreaVo;
import com.sjq.school.vo.BaseSchoolVo;

import java.math.BigDecimal;

/**
 * [自动生成]管理者信息vo
 * @author  ShuiJingQiu
 * @since   2017-04-27 16:33:46
 * @version 1.0
 */

public class BaseStaffVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long userId; /* 用户ID */
	private Long areaId; /* 区域ID */
	private Long schoolId; /* 学校ID */
	private String type; /* 管理者类型  1-市教管员,2-市教研员,3-区教管员,4-区教研员,5-校教管员,6-校教研员,7-校长*/
	private String name; /* 管理者姓名 */
	private String sex; /*  */
	private String degree; /* 学历 */
	private String title; /* 职称 */
	private Long workeAge; /* 工龄 */
	private Long phone; /* 电话 */
	private String email; /* 邮箱 */
	private String remake; /* 备注 */
	
	private BaseAreaVo baseAreaVo;//区域实体
	private BaseSchoolVo baseSchoolVo;//学校实体
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
	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	} 
	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	} 
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
	public Long getWorkeAge() {
		return workeAge;
	}

	public void setWorkeAge(Long workeAge) {
		this.workeAge = workeAge;
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
	public String getRemake() {
		return remake;
	}

	public void setRemake(String remake) {
		this.remake = remake;
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

	
}