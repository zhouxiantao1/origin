package com.sjq.bi.servlet.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.bi.dao.BiMapper;
import com.sjq.bi.search.BiSearch;
import com.sjq.bi.servlet.BiService;

/**
 * 
 * @ClassName:CityServiceImp
 * @Description:市级报告service实现层
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 上午11:18:02
 * @version 1.0
 */
@Service("BiService")
public class BiImp implements BiService {
	
	@Autowired
	private BiMapper biMapper;
	
	public List<Map<String, Object>> queryBiCitySurveyBySearch(BiSearch search){
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
		return this.biMapper.queryBiCitySurveyBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiCityAbilityBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
		return this.biMapper.queryBiCityAbilityBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiCityPointBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
		return this.biMapper.queryBiCityAbilityBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiCityQuestionTypeBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
		return this.biMapper.queryBiCityQuestionTypeBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiCityLevelBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
		return this.biMapper.queryBiCityLevelBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiCityQuestionIdBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
		return this.biMapper.queryBiCityQuestionIdBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiCityScoreBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
		return this.biMapper.queryBiCityScoreBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiCityExamSituationBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
		return this.biMapper.queryBiCityExamSituationBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiCitySubjectSubsectionBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
		return this.biMapper.queryBiCitySubjectSubsectionBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiCitySubjectScatterBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
		return this.biMapper.queryBiCitySubjectScatterBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiCitySumSubsectionBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
		return this.biMapper.queryBiCitySumSubsectionBySearch(map);
	}
	
	@Override
	public List<Map<String, Object>> queryBiRegionSurveyBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("districtId",search.getDistrictId());
		return this.biMapper.queryBiRegionSurveyBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionAbilityBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("districtId",search.getDistrictId());
		return this.biMapper.queryBiRegionAbilityBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionPointBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("districtId",search.getDistrictId());
		return this.biMapper.queryBiRegionPointBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionQuestionTypeBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("districtId",search.getDistrictId());
		return this.biMapper.queryBiRegionQuestionTypeBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionLevelBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("districtId",search.getDistrictId());
		return this.biMapper.queryBiRegionLevelBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionQuestionIdBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("districtId",search.getDistrictId());
		return this.biMapper.queryBiRegionQuestionIdBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionScoreBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("districtId",search.getDistrictId());
		return this.biMapper.queryBiRegionScoreBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionExamSituationBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("districtId",search.getDistrictId());
		return this.biMapper.queryBiRegionExamSituationBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionSubjectSubsectionBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("districtId",search.getDistrictId());
		return this.biMapper.queryBiRegionSubjectSubsectionBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionSubjectScatterBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("districtId",search.getDistrictId());
		return this.biMapper.queryBiRegionSubjectScatterBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiRegionSumSubsectionBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("districtId",search.getDistrictId());
		return this.biMapper.queryBiRegionSumSubsectionBySearch(map);
	}
	
	@Override
	public List<Map<String, Object>> queryBiSchoolSurveyBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("schoolId",search.getSchoolId());
		return this.biMapper.queryBiSchoolSurveyBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolAbilityBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("schoolId",search.getSchoolId());
		return this.biMapper.queryBiSchoolAbilityBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolPointBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("schoolId",search.getSchoolId());
		return this.biMapper.queryBiSchoolPointBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolQuestionTypeBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("schoolId",search.getSchoolId());
		return this.biMapper.queryBiSchoolQuestionTypeBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolLevelBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("schoolId",search.getSchoolId());
		return this.biMapper.queryBiSchoolLevelBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolQuestionIdBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("schoolId",search.getSchoolId());
		return this.biMapper.queryBiSchoolQuestionIdBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolScoreBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("schoolId",search.getSchoolId());
		return this.biMapper.queryBiSchoolScoreBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolExamSituationBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("schoolId",search.getSchoolId());
		return this.biMapper.queryBiSchoolExamSituationBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolSubjectSubsectionBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("schoolId",search.getSchoolId());
		return this.biMapper.queryBiSchoolSubjectSubsectionBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiSchoolSumSubsectionBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("schoolId",search.getSchoolId());
		return this.biMapper.queryBiSchoolSumSubsectionBySearch(map);
	}
	
	@Override
	public List<Map<String, Object>> queryBiClazzSurveyBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("classId",search.getClassId());
		return this.biMapper.queryBiClazzSurveyBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiClazzAbilityBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("classId",search.getClassId());
		return this.biMapper.queryBiClazzAbilityBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiClazzPointBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("classId",search.getClassId());
		return this.biMapper.queryBiClazzPointBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiClazzQuestionTypeBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("classId",search.getClassId());
		return this.biMapper.queryBiClazzQuestionTypeBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiClazzLevelBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("classId",search.getClassId());
		return this.biMapper.queryBiClazzLevelBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiClazzQuestionIdBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("classId",search.getClassId());
		return this.biMapper.queryBiClazzQuestionIdBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiClazzScoreBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("classId",search.getClassId());
		return this.biMapper.queryBiClazzScoreBySearch(map);
	}
	
	@Override
	public List<Map<String, Object>> queryBiStudentSurveyBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("studentId",search.getStudentId());
		return this.biMapper.queryBiStudentSurveyBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiStudentAbilityBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("studentId",search.getStudentId());
		return this.biMapper.queryBiStudentAbilityBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiStudentPointBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("studentId",search.getStudentId());
		return this.biMapper.queryBiStudentPointBySearch(map);
	}

	@Override
	public List<Map<String, Object>> queryBiStudentQuestionTypeBySearch(BiSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
  		map.put("studentId",search.getStudentId());
		return this.biMapper.queryBiStudentQuestionTypeBySearch(map);
	}
	
}
