package com.sjq.question.vo;

import java.util.Date;
import com.sjq.ware.vo.QuestionWareVo;

/**
 * [自动生成]试卷模块-试卷试题信息vo
 * @author  ShuiJingQiu
 * @since   2017-05-10 18:27:38
 * @version 1.0
 */

public class PapersQuestionVo{

	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private Long paperId; /* 试卷id */
	private Long paperDetailId; /* 试卷明细id */
	private Long questionId; /* 试题id */
	private Long questionNo; /* 题号（1，2，3...） */
	private Long score; /* 每小题的分值 */
	private String status; /* 是否可用(0不可用，1可用) */
	private String remark; /* 备注 */
	private QuestionWareVo questionWareVo;//题目
	private String isWrong; /* 题目是否做错（0否，1是）用于查看答卷 */
	private String options; /* 选项（作答答案） 用于查看答卷*/
	
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
	public Long getPaperId() {
		return paperId;
	}
	public void setPaperId(Long paperId) {
		this.paperId = paperId;
	}
	public Long getPaperDetailId() {
		return paperDetailId;
	}
	public void setPaperDetailId(Long paperDetailId) {
		this.paperDetailId = paperDetailId;
	}
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public Long getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(Long questionNo) {
		this.questionNo = questionNo;
	}
	public Long getScore() {
		return score;
	}
	public void setScore(Long score) {
		this.score = score;
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
	public QuestionWareVo getQuestionWareVo() {
		return questionWareVo;
	}
	public void setQuestionWareVo(QuestionWareVo questionWareVo) {
		this.questionWareVo = questionWareVo;
	}
	public String getIsWrong() {
		return isWrong;
	}
	public void setIsWrong(String isWrong) {
		this.isWrong = isWrong;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	
}