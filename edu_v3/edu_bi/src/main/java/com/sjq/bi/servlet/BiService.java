package com.sjq.bi.servlet;

import java.util.List;
import java.util.Map;

import com.sjq.bi.search.BiSearch;

/**
 * 
 * @ClassName:CityService
 * @Description:市级报告service层
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 上午11:17:12
 * @version 1.0
 */
public interface BiService {
	
	//市级
	List<Map<String,Object>> queryBiCitySurveyBySearch(BiSearch search);
	List<Map<String,Object>> queryBiCityAbilityBySearch(BiSearch search);
	List<Map<String,Object>> queryBiCityPointBySearch(BiSearch search);
	List<Map<String,Object>> queryBiCityQuestionTypeBySearch(BiSearch search);
	List<Map<String,Object>> queryBiCityLevelBySearch(BiSearch search);
	List<Map<String,Object>> queryBiCityQuestionIdBySearch(BiSearch search);
	List<Map<String,Object>> queryBiCityScoreBySearch(BiSearch search);
	List<Map<String,Object>> queryBiCityExamSituationBySearch(BiSearch search);
	List<Map<String,Object>> queryBiCitySubjectSubsectionBySearch(BiSearch search);
	List<Map<String,Object>> queryBiCitySubjectScatterBySearch(BiSearch search);
	List<Map<String,Object>> queryBiCitySumSubsectionBySearch(BiSearch search);

	//区级
	List<Map<String,Object>> queryBiRegionSurveyBySearch(BiSearch search);
	List<Map<String,Object>> queryBiRegionAbilityBySearch(BiSearch search);
	List<Map<String,Object>> queryBiRegionPointBySearch(BiSearch search);
	List<Map<String,Object>> queryBiRegionQuestionTypeBySearch(BiSearch search);
	List<Map<String,Object>> queryBiRegionLevelBySearch(BiSearch search);
	List<Map<String,Object>> queryBiRegionQuestionIdBySearch(BiSearch search);
	List<Map<String,Object>> queryBiRegionScoreBySearch(BiSearch search);
	List<Map<String,Object>> queryBiRegionExamSituationBySearch(BiSearch search);
	List<Map<String,Object>> queryBiRegionSubjectSubsectionBySearch(BiSearch search);
	List<Map<String,Object>> queryBiRegionSubjectScatterBySearch(BiSearch search);
	List<Map<String,Object>> queryBiRegionSumSubsectionBySearch(BiSearch search);
	
	//校级
	List<Map<String,Object>> queryBiSchoolSurveyBySearch(BiSearch search);
	List<Map<String,Object>> queryBiSchoolAbilityBySearch(BiSearch search);
	List<Map<String,Object>> queryBiSchoolPointBySearch(BiSearch search);
	List<Map<String,Object>> queryBiSchoolQuestionTypeBySearch(BiSearch search);
	List<Map<String,Object>> queryBiSchoolLevelBySearch(BiSearch search);
	List<Map<String,Object>> queryBiSchoolQuestionIdBySearch(BiSearch search);
	List<Map<String,Object>> queryBiSchoolScoreBySearch(BiSearch search);
	List<Map<String,Object>> queryBiSchoolExamSituationBySearch(BiSearch search);
	List<Map<String,Object>> queryBiSchoolSubjectSubsectionBySearch(BiSearch search);
	List<Map<String,Object>> queryBiSchoolSumSubsectionBySearch(BiSearch search);
	
	//班级
	List<Map<String,Object>> queryBiClazzSurveyBySearch(BiSearch search);
	List<Map<String,Object>> queryBiClazzAbilityBySearch(BiSearch search);
	List<Map<String,Object>> queryBiClazzPointBySearch(BiSearch search);
	List<Map<String,Object>> queryBiClazzQuestionTypeBySearch(BiSearch search);
	List<Map<String,Object>> queryBiClazzLevelBySearch(BiSearch search);
	List<Map<String,Object>> queryBiClazzQuestionIdBySearch(BiSearch search);
	List<Map<String,Object>> queryBiClazzScoreBySearch(BiSearch search);
	
	//学生
	List<Map<String,Object>> queryBiStudentSurveyBySearch(BiSearch search);
	List<Map<String,Object>> queryBiStudentAbilityBySearch(BiSearch search);
	List<Map<String,Object>> queryBiStudentPointBySearch(BiSearch search);
	List<Map<String,Object>> queryBiStudentQuestionTypeBySearch(BiSearch search);
}
