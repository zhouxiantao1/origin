package com.sjq.issueList.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]发布列表Search
 * @author  ShuiJingQiu
 * @since   2017-05-27 17:12:25
 * @version 1.0
 */

public class EvaluateIssueListSearch{

	private Long id; /* 自增id */
	private Long schoolId; /* 学校ID */
	private Long classesId; /* 班级ID */
	private Long userId; /* 用户ID */
	private String evaObject; /* 1-学生，2-家长，3-老师，4-校长 */
	private Long evaIssueId; /* 校级发布测评ID */
	private String issueListName;
	
	private String type; /* 1-待完成，2-已完成*/
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public Long getClassesId() {
		return classesId;
	}

	public void setClassesId(Long classesId) {
		this.classesId = classesId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEvaObject() {
		return evaObject;
	}

	public void setEvaObject(String evaObject) {
		this.evaObject = evaObject;
	}

	public Long getEvaIssueId() {
		return evaIssueId;
	}

	public void setEvaIssueId(Long evaIssueId) {
		this.evaIssueId = evaIssueId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIssueListName() {
		return issueListName;
	}

	public void setIssueListName(String issueListName) {
		this.issueListName = issueListName;
	} 

	
}