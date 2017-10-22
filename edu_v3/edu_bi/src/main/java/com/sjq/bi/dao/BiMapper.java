package com.sjq.bi.dao;

import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName:CityMapper
 * @Description:市级报告dao层
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 上午11:11:07
 * @version 1.0
 */
public interface BiMapper {
	
	//市级
	List<Map<String,Object>> queryBiCitySurveyBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiCityAbilityBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiCityPointBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiCityQuestionTypeBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiCityLevelBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiCityQuestionIdBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiCityScoreBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiCityExamSituationBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiCitySubjectSubsectionBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiCitySubjectScatterBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiCitySumSubsectionBySearch(Map<String, Object> map);

	//区级
	List<Map<String,Object>> queryBiRegionSurveyBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiRegionAbilityBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiRegionPointBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiRegionQuestionTypeBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiRegionLevelBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiRegionQuestionIdBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiRegionScoreBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiRegionExamSituationBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiRegionSubjectSubsectionBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiRegionSubjectScatterBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiRegionSumSubsectionBySearch(Map<String, Object> map);
	
	//校级
	List<Map<String,Object>> queryBiSchoolSurveyBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiSchoolAbilityBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiSchoolPointBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiSchoolQuestionTypeBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiSchoolLevelBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiSchoolQuestionIdBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiSchoolScoreBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiSchoolExamSituationBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiSchoolSubjectSubsectionBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiSchoolSumSubsectionBySearch(Map<String, Object> map);
	
	//班级
	List<Map<String,Object>> queryBiClazzSurveyBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiClazzAbilityBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiClazzPointBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiClazzQuestionTypeBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiClazzLevelBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiClazzQuestionIdBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiClazzScoreBySearch(Map<String, Object> map);
	
	//学生
	List<Map<String,Object>> queryBiStudentSurveyBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiStudentAbilityBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiStudentPointBySearch(Map<String, Object> map);
	List<Map<String,Object>> queryBiStudentQuestionTypeBySearch(Map<String, Object> map);

}
