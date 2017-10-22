package com.sjq.ware.bean;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringEscapeUtils;

import com.alibaba.fastjson.JSON;
import com.sjq.common.util.phputil.PhpUtil;
import com.sjq.common.util.phputil.dto.QuestionContentDto;
import com.sjq.common.util.phputil.dto.QuestionOptionsDto;
import com.sjq.util.StringUtil;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;

/**
 * [自动生成]题库模块-题库中心bean
 * @author  ShuiJingQiu
 * @since   2017-04-25 11:53:57
 * @version 1.0
 */

public class QuestionWareBean{


	private Long id; /* 自增id */
	private String createName; /* (默认)创建人 */
	private Date createTime; /* (默认)创建时间 */
	private String modName; /* (默认)修改人 */
	private Date modTime; /* (默认)修改时间 */
	private String delflag; /* (默认)删除标识 */
	private String questionContent; /* 试题内容 */
	private BigDecimal difficulty; /* 试题难度值（取值由0到1为简单到困难） */
	private String bloomTaxonomy; /* 布鲁姆认知体系1知道，2领会，3应用，4分析，5综合，6评价 */
	private BigDecimal discrimination; /* 区分度预估  取值-1~1 低~高 */
	private Long testTimes; /* 知识考察频数 即 组卷次数上限 */
	private Long answerTime; /* 作答时间（以分钟为单位） */
	private String isGroup; /* 是否为组合题 */
	private String parentContent; /* 题干内容（组合题专用） */
	private Long parentId; /* 组合题所属试题id */
	private String belongToLib; /* 1考试题库,2作业题库,3錨题库,4种子题库（自适应题库）, 5个人题库（教师题库）,6专家题库 （新题库） */
	private String isObjective; /* 是否客观题（0否，1是）客观题 机器阅卷，主观题 人为阅卷 */
	private String remark; /* 描述说明 */
	private String isPublic; /* 是否公开 */
	private String fUrl; /* 音频或视频url */
	private Long subjectId; /* 学科id */
	private Long gradeId; /* 年级id */
	private Long stageId; /* 学段id */
	private Long typeId; /* 题型id */
	private Long createId;  /* 创建人id */
	private Date checkTime;  /* 审核时间  */
	private String checkName; /* 审核人 */
	private Long checkId; /* 审核人id */
	private String options; /* 选择题选项 */
	private String checkStatus; /* 0.待审核 1.审核通过 2.审核不通过  */
	private BigDecimal estimateValue; /* 预估分值  */
	
	private List<QuestionOptionsDto> qods; /* 选择题选项  */
	private QuestionContentDto qcd;        /* 试题内容 */

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public Long getCreateId() {
		return createId;
	}

	public void setCreateId(Long createId) {
		this.createId = createId;
	}
	
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
	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		
		
		//转换为json格式
		QuestionContentDto dto = new QuestionContentDto();
		dto.setTitle(questionContent);
		dto.setContent("");
		this.questionContent = JSON.toJSONString(dto);
		
	} 
	public BigDecimal getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(BigDecimal difficulty) {
		this.difficulty = difficulty;
	} 
	
	public String getBloomTaxonomy() {
		return bloomTaxonomy;
	}

	public void setBloomTaxonomy(String bloomTaxonomy) {
		this.bloomTaxonomy = bloomTaxonomy;
	} 
	public BigDecimal getDiscrimination() {
		return discrimination;
	}

	public void setDiscrimination(BigDecimal discrimination) {
		this.discrimination = discrimination;
	} 
	public Long getTestTimes() {
		return testTimes;
	}

	public void setTestTimes(Long testTimes) {
		this.testTimes = testTimes;
	} 
	public Long getAnswerTime() {
		return answerTime;
	}

	public void setAnswerTime(Long answerTime) {
		this.answerTime = answerTime;
	} 
	public String getIsGroup() {
		return isGroup;
	}

	public void setIsGroup(String isGroup) {
		this.isGroup = isGroup;
	} 
	public String getParentContent() {
		return parentContent;
	}

	public void setParentContent(String parentContent) {
		this.parentContent = parentContent;
	} 
	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	} 
	public String getBelongToLib() {
		return belongToLib;
	}

	public void setBelongToLib(String belongToLib) {
		this.belongToLib = belongToLib;
	} 
	public String getIsObjective() {
		return isObjective;
	}

	public void setIsObjective(String isObjective) {
		this.isObjective = isObjective;
	} 
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	} 
	public String getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	} 
	public String getFUrl() {
		return fUrl;
	}

	public void setFUrl(String fUrl) {
		this.fUrl = fUrl;
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
	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	} 
	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public String getfUrl() {
		return fUrl;
	}

	public void setfUrl(String fUrl) {
		this.fUrl = fUrl;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getCheckName() {
		return checkName;
	}

	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}

	public Long getCheckId() {
		return checkId;
	}

	public void setCheckId(Long checkId) {
		this.checkId = checkId;
	}

	public String getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public List<QuestionOptionsDto> getQods() {
		return qods;
	}

	public void setQods(List<QuestionOptionsDto> qods) {
		this.qods = qods;
		try {
			this.options = PhpUtil.parseQuestionOptionsToPhp(qods);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			System.out.println("命题，php序列化试题选项失败!");
		}
	}

	public QuestionContentDto getQcd() {
		return qcd;
	}

	public void setQcd(QuestionContentDto qcd) {
		this.qcd = qcd;
		try {
			this.questionContent = PhpUtil.parseQuestionContentToPhp(qcd);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			System.out.println("命题，php序列化试题内容失败!");
		}
	}

	public BigDecimal getEstimateValue() {
		return estimateValue;
	}

	public void setEstimateValue(BigDecimal estimateValue) {
		this.estimateValue = estimateValue;
	}

	
	

	
}