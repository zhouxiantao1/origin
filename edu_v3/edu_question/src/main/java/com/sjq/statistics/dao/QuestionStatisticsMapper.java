package com.sjq.statistics.dao;

import java.util.List;
import java.util.Map;

/**
 * 
 * 题库统计
 * @author ZeJie.Zheng
 * @since 2017年7月5日
 * @version 1.0
 */
public interface QuestionStatisticsMapper {

	/**
	 * 获取试题总数
	 * @return
	 */
	int queryQuestionStatisticsCount();
	
	/**
	 * 今日命题数
	 * @return
	 */
	int queryQuestionStatisticsCountByToDay();
	
	
	/**
	 * 审核状态
	 * @return
	 */
	List<Map<String,Object>> queryQuestionStatisticsCountGroupByCheckStatus();
	
	
	/**
	 * 学段试题数
	 * @return
	 */
	List<Map<String,Object>> queryQuestionStatisticsCountGroupByStage();
	
	
	/**
	 * 年级试题数
	 * @return
	 */
	List<Map<String,Object>> queryQuestionStatisticsCountGroupByGrade();
	
	
	/**
	 * 学科题型数
	 * @return
	 */
	List<Map<String,Object>> queryQuestionStatisticsCountGroupBySubject();
	
	/**
	 * 题库试题数
	 * @return
	 */
	List<Map<String,Object>> queryQuestionStatisticsCountGroupByBelongToLib();
	
}
