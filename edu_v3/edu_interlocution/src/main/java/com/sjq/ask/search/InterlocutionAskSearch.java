package com.sjq.ask.search;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 查询条件
 * [自动生成]提问信息Search
 * @author  ShuiJingQiu
 * @since   2017-05-15 15:18:01
 * @version 1.0
 */

public class InterlocutionAskSearch{

	private Long id; /* 自增id */
	private Long type; /*筛选添加，0-最新排序，1-流量最多排序*/
	private Long subjectId; /* 学科ID */
	private Long gradeId; /* 年级ID */
	private String title; /* 提问标题 */
	private String content; /* 提问内容 */
	private Long readNum; /* 浏览次数 */
	
	private Long userId;/*当前用户的ID*/
	private String status; //查看详情 1-广场，2-我的回答，3-我的关注，4-举报
	private String isAsk; //是否是提问 1-提问，2-回答
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getReadNum() {
		return readNum;
	}

	public void setReadNum(Long readNum) {
		this.readNum = readNum;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIsAsk() {
		return isAsk;
	}

	public void setIsAsk(String isAsk) {
		this.isAsk = isAsk;
	} 

	
}