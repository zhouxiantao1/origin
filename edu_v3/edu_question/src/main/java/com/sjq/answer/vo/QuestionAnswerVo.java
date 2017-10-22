package com.sjq.answer.vo;

import java.util.Date;

import com.sjq.common.util.phputil.PHPSerializer;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;

/**
 * [自动生成]题库模块-题库答案vo
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:19:47
 * @version 1.0
 */

public class QuestionAnswerVo{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long questionId; /* 试题id */
	private String answerValue; /* 试题答案 */
	private String answerDescription; /* 答案解析 */
	private String status; /* 答案状态（0有效 1无效） */
	private String remark; /* 备注说明 */
	
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
	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	} 
	public String getAnswerValue() {
		return answerValue;
	}

	public void setAnswerValue(String answerValue) {
		try {
			this.answerValue = (String) PHPSerializer.unserialize(answerValue.replace("other.koo6.com", "video.koo6.com").replace("__TIIMGURL__", "video.koo6.com").replace("__tiimgurl__", "video.koo6.com").getBytes("utf-8"));
		} catch (Exception e) {
			System.out.println("解析答案内容出现异常，数据问题！试题id为"+this.getQuestionId().toString());
			e.printStackTrace();
		} 
		
	} 
	public String getAnswerDescription() {
		return answerDescription;
	}

	public void setAnswerDescription(String answerDescription) {
		this.answerDescription = answerDescription.replace("other.koo6.com", "video.koo6.com").replace("__TIIMGURL__", "video.koo6.com").replace("__tiimgurl__", "video.koo6.com");
	} 
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	} 
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	} 


}