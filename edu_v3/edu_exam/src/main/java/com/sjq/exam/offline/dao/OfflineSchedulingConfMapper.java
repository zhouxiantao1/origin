package com.sjq.exam.offline.dao;

import java.util.Map;


/**
 * 
 * @ClassName:OfflineSchedulingConfMapper
 * @Description:线下考试调度dao
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:22:41
 * @version 1.0
 */
public interface OfflineSchedulingConfMapper {
	
	/**
	 * 
	 * @MethodName:allSurveyProc
	 * @Description:考试概况分析
	 * @param map
	 * @return 0失败 1成功
	 */
	int allSurveyProc(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName:allSumSegmentedProc
	 * @Description:总分分数段分布对比
	 * @param map
	 * @return 0失败 1成功
	 */
	int allSumSegmentedProc(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName:allEachSegmentedProc
	 * @Description:各学科分数段分布对比
	 * @param map
	 * @return 0失败 1成功
	 */
	int allEachSegmentedProc(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName:allLevelSpreadProc
	 * @Description:各水平等级分布
	 * @param map
	 * @return 0失败 1成功
	 */
	int allLevelSpreadProc(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName:allScoreContrastProc
	 * @Description:各水平等级学生各科得分率对比
	 * @param map
	 * @return 0失败 1成功
	 */
	int allScoreContrastProc(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName:allSumSegmentedProc
	 * @Description:考试情况分析
	 * @param map
	 * @return 0失败 1成功
	 */
	int allExamSituationProc(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName:allPointNameProc
	 * @Description:各知识模块得分情况分析
	 * @param map
	 * @return 0失败 1成功
	 */
	int allPointNameProc(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName:allAbilityNameProc
	 * @Description:各认知层次得分情况分析
	 * @param map
	 * @return 0失败 1成功
	 */
	int allAbilityNameProc(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName:allQuestionTypeProc
	 * @Description:各题型得分情况分析
	 * @param map
	 * @return 0失败 1成功
	 */
	int allQuestionTypeProc(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName:allQuestionNoProc
	 * @Description:各小题得分情况分析
	 * @param map
	 * @return 0失败 1成功
	 */
	int allQuestionNoProc(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName:allSubjectScatterProc
	 * @Description:难度分布
	 * @param map
	 * @return 0失败 1成功
	 */
	int allSubjectScatterProc(Map<String, Object> map);
	
}
