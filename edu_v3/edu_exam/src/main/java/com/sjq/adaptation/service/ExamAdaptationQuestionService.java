package com.sjq.adaptation.service;

import java.util.List;
import java.util.Map;

import com.sjq.adaptation.search.ExamAdaptationQuestionSearch;
import com.sjq.adaptation.vo.ExamAdaptationQuestionVo;

/**
 * [自动生成]抽象考试模块-自适应试题库service层
 * @author  ShuiJingQiu
 * @since   2017-05-22 19:19:03
 * @version 1.0
 */
 
public interface ExamAdaptationQuestionService {

				
	/**
	 * 根据条件查询所有考试模块-自适应试题库信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	ExamAdaptationQuestionVo queryExamAdaptationQuestionBySearch(ExamAdaptationQuestionSearch search);
				
	/**
	 * 根据条件查询所有考试模块-自适应试题库信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	ExamAdaptationQuestionVo queryAccurateExamAdaptationQuestionBySearch(ExamAdaptationQuestionSearch search);
	
					
	/**
	 * 根据条件查询考试模块-自适应试题库count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryExamAdaptationQuestionTotalCount(ExamAdaptationQuestionSearch search);
	
	
}