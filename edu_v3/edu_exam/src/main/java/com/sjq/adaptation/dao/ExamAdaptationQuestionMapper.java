package com.sjq.adaptation.dao;

import java.util.List;
import java.util.Map;

import com.sjq.adaptation.vo.ExamAdaptationQuestionVo;

/**
 * [自动生成]抽象考试模块-自适应试题库Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-22 19:19:03
 * @version 1.0
 */
public interface ExamAdaptationQuestionMapper {


	/**
	 * 根据条件查询所有考试模块-自适应试题库信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	ExamAdaptationQuestionVo queryExamAdaptationQuestionBySearch(Map<String, Object> map);
	
	
	/**
	 * 根据条件查询所有考试模块-自适应试题库信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	ExamAdaptationQuestionVo queryAccurateExamAdaptationQuestionBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询考试模块-自适应试题库count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryExamAdaptationQuestionTotalCount(Map<String, Object> map);
	
	
}