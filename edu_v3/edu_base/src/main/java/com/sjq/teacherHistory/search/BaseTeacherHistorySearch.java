package com.sjq.teacherHistory.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]教师任教历史信息Search
 * @author  ShuiJingQiu
 * @since   2017-04-27 15:42:52
 * @version 1.0
 */

public class BaseTeacherHistorySearch{

	private Long id; /* 自增id */
	private Long teacherId; /* 教师ID */
	private Long gradeId; /* 年级ID */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	} 
	
}