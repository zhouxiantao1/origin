package com.sjq.adaptation.vo;

import java.math.BigDecimal;
import java.text.Collator;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.sjq.common.util.phputil.PhpUtil;
import com.sjq.common.util.phputil.dto.QuestionContentDto;
import com.sjq.common.util.phputil.dto.QuestionOptionsDto;
import com.sjq.knowledge.vo.BaseKnowledgeVo;

/**
 * [自动生成]考试模块-自适应试题库vo
 * @author  ShuiJingQiu
 * @since   2017-05-22 19:19:03
 * @version 1.0
 */

public class ExamAdaptationQuestionVo{


	private Long id; /* 自增id */
	private Date createTime; /* (默认)创建时间 */
	private Long typeId; /* 题型id */
	private Long knowledgeId; /* 知识点id */
	private BigDecimal difficulty; /* 试题难度值（取值由0到1为简单到困难） */
	private Long questionId; /* 试题id */
	private Long adaptationId; /* 自适应测试id */
	private String questionContent; /* 试题内容（冗余） */
	private String options; /* 试题选项与答案 */
	private String bloomTaxonomy; /* 布鲁姆认知体系1知道，2领会，3应用，4分析，5综合，6评价  */
	
	private QuestionContentDto qcd;  /* 转换的内容  */
	private List<QuestionOptionsDto> qods; /* 选择题选项  */
	private BaseKnowledgeVo bkv;  /* 关联的知识点信息 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	} 
	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	} 
	public Long getKnowledgeId() {
		return knowledgeId;
	}

	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
	} 
	public BigDecimal getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(BigDecimal difficulty) {
		this.difficulty = difficulty;
	} 
	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	} 
	public Long getAdaptationId() {
		return adaptationId;
	}

	public void setAdaptationId(Long adaptationId) {
		this.adaptationId = adaptationId;
	} 
	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		
		
		this.questionContent = questionContent;
//		try {
//			this.qcd = JSON.parseObject(questionContent,QuestionContentDto.class);   //对象转换
//		} catch (Exception e) {
//			System.out.println("解析试题内容出现异常，数据问题！试题id为"+this.getId().toString());
//		}
		try {
			this.qcd = PhpUtil.parsePhpToQuestionContent(questionContent);
		} catch (Exception e) {
			System.out.println("解析试题内容出现异常，数据问题！试题id为"+this.getId().toString());
		}
	} 
	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		

		this.options = options;
//		try{
//			if(options != null) qods = JSON.parseArray(options, QuestionOptionsDto.class);   // option不为空，则代表为选择题
//		} catch (Exception e) {
//			System.out.println("解析试题选项出现异常，数据问题！试题id为"+this.getId().toString());
//		}
		try{
			if(options != null) qods = PhpUtil.parsePhpToQuestionOptions(options);   // option不为空，则代表为选择题
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("解析试题选项出现异常，数据问题！试题id为"+this.getId().toString());
		}
	}

	public QuestionContentDto getQcd() {
		return qcd;
	}

	public void setQcd(QuestionContentDto qcd) {
		this.qcd = qcd;
	}


	public List<QuestionOptionsDto> getQods() {
		return qods;
	}

	public void setQods(List<QuestionOptionsDto> qods) {
		this.qods = qods;
	}

	public BaseKnowledgeVo getBkv() {
		return bkv;
	}

	public void setBkv(BaseKnowledgeVo bkv) {
		this.bkv = bkv;
	}

	public String getBloomTaxonomy() {
		return bloomTaxonomy;
	}

	public void setBloomTaxonomy(String bloomTaxonomy) {
		this.bloomTaxonomy = bloomTaxonomy;
	} 
	
	


	
}