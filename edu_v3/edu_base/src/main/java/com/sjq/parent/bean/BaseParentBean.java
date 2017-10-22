package com.sjq.parent.bean;

import java.util.Date;
import java.math.BigDecimal;

/**
 * [自动生成]基础模块-家长信息bean
 * @author  ShuiJingQiu
 * @since   2017-04-29 01:02:00
 * @version 1.0
 */

public class BaseParentBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String name; /* 家长姓名 */
	private Long studentId; /* 学生ID */
	private String sex; /* 性别 */
	private String relation; /* 家长跟学生关系 */
	private Long phone; /* 电话 */
	private String email; /* 邮件 */
	private String remake; /* 备注 */
	private Long userId; /* 用户ID */
	
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
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	} 
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	} 
	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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