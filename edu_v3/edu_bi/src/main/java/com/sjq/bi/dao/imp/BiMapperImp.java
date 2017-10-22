package com.sjq.bi.dao.imp;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.bi.dao.BiMapper;
import com.sjq.manager.base.BasicSqlSupport;

/**
 * 
 * @ClassName:CitypMapperImp
 * @Description:市级报告dao层实现
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 上午11:12:49
 * @version 1.0
 */
@Repository("BiMapper")
public class BiMapperImp extends BasicSqlSupport implements BiMapper {

	@Override
	public List<Map<String, Object>> queryBiCitySurveyBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiCitySurveyBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiCityAbilityBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiCityAbilityBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiCityPointBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiCityPointBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiCityQuestionTypeBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiCityQuestionTypeBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiCityLevelBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiCityLevelBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiCityQuestionIdBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiCityQuestionIdBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiCityScoreBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiCityScoreBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiCityExamSituationBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiCityExamSituationBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiCitySubjectSubsectionBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiCitySubjectSubsectionBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiCitySubjectScatterBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiCitySubjectScatterBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiCitySumSubsectionBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiCitySumSubsectionBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionSurveyBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiRegionSurveyBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionAbilityBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiRegionAbilityBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionPointBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiRegionPointBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionQuestionTypeBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiRegionQuestionTypeBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionLevelBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiRegionLevelBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionQuestionIdBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiRegionQuestionIdBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionScoreBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiRegionScoreBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionExamSituationBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiRegionExamSituationBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionSubjectSubsectionBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiRegionSubjectSubsectionBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionSubjectScatterBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiRegionSubjectScatterBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionSumSubsectionBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiRegionSumSubsectionBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolSurveyBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiSchoolSurveyBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolAbilityBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiSchoolAbilityBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolPointBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiSchoolPointBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolQuestionTypeBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiSchoolQuestionTypeBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolLevelBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiSchoolLevelBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolQuestionIdBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiSchoolQuestionIdBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolScoreBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiSchoolScoreBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolExamSituationBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiSchoolExamSituationBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolSubjectSubsectionBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiSchoolSubjectSubsectionBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolSumSubsectionBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiSchoolSumSubsectionBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiClazzSurveyBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiClazzSurveyBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiClazzAbilityBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiClazzAbilityBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiClazzPointBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiClazzPointBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiClazzQuestionTypeBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiClazzQuestionTypeBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiClazzLevelBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiClazzLevelBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiClazzQuestionIdBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiClazzQuestionIdBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiClazzScoreBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiClazzScoreBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiStudentSurveyBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiStudentSurveyBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiStudentAbilityBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiStudentAbilityBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiStudentPointBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiStudentPointBySearch",map);
	}

	@Override
	public List<Map<String, Object>> queryBiStudentQuestionTypeBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return this.selectList("com.sjq.bi.dao.BiMapper.queryBiStudentQuestionTypeBySearch",map);
	}

	
}
