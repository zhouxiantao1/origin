package com.sjq.adaptation.vo;

import java.math.BigDecimal;
import java.util.List;

import com.sjq.knowledge.vo.BaseKnowledgeVo;

/**
 * 
 * 自适应报告统计Vo
 * @author ZeJie.Zheng
 * @since 2017年6月5日
 * @version 1.0
 */
public class ExamAdaptationReportVo {
	
	private Long knowledgeId;               //布鲁姆认知体系1知道，2领会，3应用，4分析，5综合，6评价
	
	private String bloom1;                      //综合评估  1知道 答对概率
	private int bloom1IsRightNum = 0; 
	private int bloom1IsWrongNum = 0;
	
	private String bloom2;                      //综合评估  2领会 答对概率
	private int bloom2IsRightNum = 0; 
	private int bloom2IsWrongNum = 0;
	
	private String bloom3;                      //综合评估  3应用 答对概率
	private int bloom3IsRightNum = 0; 
	private int bloom3IsWrongNum = 0;
	
	private String bloom4;                      //综合评估  4分析 答对概率
	private int bloom4IsRightNum = 0; 
	private int bloom4IsWrongNum = 0;
	
	private String bloom5;                      //综合评估  5综合 答对概率
	private int bloom5IsRightNum = 0; 
	private int bloom5IsWrongNum = 0;
	
	private String bloom6;                      //综合评估  6评价 答对概率
	private int bloom6IsRightNum = 0; 
	private int bloom6IsWrongNum = 0;
	
	private BigDecimal masterProgram;           //掌握程序
	private String ident;                       //标识
	
	private List<ExamAdaptationReportVo> earvs; //知识点
	
	private BaseKnowledgeVo bkv;                //知识点信息
	
	
	public BaseKnowledgeVo getBkv() {
		return bkv;
	}
	public void setBkv(BaseKnowledgeVo bkv) {
		this.bkv = bkv;
	}
	public Long getKnowledgeId() {
		return knowledgeId;
	}
	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
	}
	public String getBloom1() {
		return bloom1;
	}
	public void setBloom1(String bloom1) {
		this.bloom1 = bloom1;
	}
	public int getBloom1IsRightNum() {
		return bloom1IsRightNum;
	}
	public void setBloom1IsRightNum(int bloom1IsRightNum) {
		this.bloom1IsRightNum = bloom1IsRightNum;
	}
	public int getBloom1IsWrongNum() {
		return bloom1IsWrongNum;
	}
	public void setBloom1IsWrongNum(int bloom1IsWrongNum) {
		this.bloom1IsWrongNum = bloom1IsWrongNum;
	}
	public String getBloom2() {
		return bloom2;
	}
	public void setBloom2(String bloom2) {
		this.bloom2 = bloom2;
	}
	public int getBloom2IsRightNum() {
		return bloom2IsRightNum;
	}
	public void setBloom2IsRightNum(int bloom2IsRightNum) {
		this.bloom2IsRightNum = bloom2IsRightNum;
	}
	public int getBloom2IsWrongNum() {
		return bloom2IsWrongNum;
	}
	public void setBloom2IsWrongNum(int bloom2IsWrongNum) {
		this.bloom2IsWrongNum = bloom2IsWrongNum;
	}
	public String getBloom3() {
		return bloom3;
	}
	public void setBloom3(String bloom3) {
		this.bloom3 = bloom3;
	}
	public int getBloom3IsRightNum() {
		return bloom3IsRightNum;
	}
	public void setBloom3IsRightNum(int bloom3IsRightNum) {
		this.bloom3IsRightNum = bloom3IsRightNum;
	}
	public int getBloom3IsWrongNum() {
		return bloom3IsWrongNum;
	}
	public void setBloom3IsWrongNum(int bloom3IsWrongNum) {
		this.bloom3IsWrongNum = bloom3IsWrongNum;
	}
	public String getBloom4() {
		return bloom4;
	}
	public void setBloom4(String bloom4) {
		this.bloom4 = bloom4;
	}
	public int getBloom4IsRightNum() {
		return bloom4IsRightNum;
	}
	public void setBloom4IsRightNum(int bloom4IsRightNum) {
		this.bloom4IsRightNum = bloom4IsRightNum;
	}
	public int getBloom4IsWrongNum() {
		return bloom4IsWrongNum;
	}
	public void setBloom4IsWrongNum(int bloom4IsWrongNum) {
		this.bloom4IsWrongNum = bloom4IsWrongNum;
	}
	public String getBloom5() {
		return bloom5;
	}
	public void setBloom5(String bloom5) {
		this.bloom5 = bloom5;
	}
	public int getBloom5IsRightNum() {
		return bloom5IsRightNum;
	}
	public void setBloom5IsRightNum(int bloom5IsRightNum) {
		this.bloom5IsRightNum = bloom5IsRightNum;
	}
	public int getBloom5IsWrongNum() {
		return bloom5IsWrongNum;
	}
	public void setBloom5IsWrongNum(int bloom5IsWrongNum) {
		this.bloom5IsWrongNum = bloom5IsWrongNum;
	}
	public String getBloom6() {
		return bloom6;
	}
	public void setBloom6(String bloom6) {
		this.bloom6 = bloom6;
	}
	public int getBloom6IsRightNum() {
		return bloom6IsRightNum;
	}
	public void setBloom6IsRightNum(int bloom6IsRightNum) {
		this.bloom6IsRightNum = bloom6IsRightNum;
	}
	public int getBloom6IsWrongNum() {
		return bloom6IsWrongNum;
	}
	public void setBloom6IsWrongNum(int bloom6IsWrongNum) {
		this.bloom6IsWrongNum = bloom6IsWrongNum;
	}
	public String getIdent() {
		return ident;
	}
	public void setIdent(String ident) {
		this.ident = ident;
	}
	public List<ExamAdaptationReportVo> getEarvs() {
		return earvs;
	}
	public void setEarvs(List<ExamAdaptationReportVo> earvs) {
		this.earvs = earvs;
	}
	public BigDecimal getMasterProgram() {
		return masterProgram;
	}
	public void setMasterProgram(BigDecimal masterProgram) {
		this.masterProgram = masterProgram;
	}

	
	
}
