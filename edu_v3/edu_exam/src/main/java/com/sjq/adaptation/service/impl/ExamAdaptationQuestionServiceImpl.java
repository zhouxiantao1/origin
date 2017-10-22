package com.sjq.adaptation.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.adaptation.dao.ExamAdaptationQuestionMapper;
import com.sjq.adaptation.search.ExamAdaptationQuestionSearch;
import com.sjq.adaptation.service.ExamAdaptationQuestionService;
import com.sjq.adaptation.vo.ExamAdaptationQuestionVo;

/**
 * [自动生成]实现考试模块-自适应试题库service层
 * @author  ShuiJingQiu
 * @since   2017-05-22 19:19:03
 * @version 1.0
 */
 
@Service("ExamAdaptationQuestionService")
public class ExamAdaptationQuestionServiceImpl implements ExamAdaptationQuestionService {
	

	@Autowired
	private ExamAdaptationQuestionMapper examAdaptationQuestionMapper;
	

	/**
	 * 根据条件查询匹配最符合条件的试题
	 * @param map
	 * @return
	 */
	public ExamAdaptationQuestionVo queryExamAdaptationQuestionBySearch(ExamAdaptationQuestionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("typeId",search.getTypeId());
  		map.put("knowledgeId",search.getKnowledgeId());
  		map.put("questionId",search.getQuestionId());
  		map.put("adaptationId",search.getAdaptationId());
		
		return this.examAdaptationQuestionMapper.queryExamAdaptationQuestionBySearch(map);
	}
	
	
	/**
	 * 根据条件查询匹配最符合条件的试题
	 * @param map
	 * @return
	 */
	public ExamAdaptationQuestionVo queryAccurateExamAdaptationQuestionBySearch(ExamAdaptationQuestionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("typeId",search.getTypeId());
  		map.put("knowledgeId",search.getKnowledgeId());
  		map.put("questionId",search.getQuestionId());
  		map.put("adaptationId",search.getAdaptationId());
  		map.put("userId", search.getUserId());
  		map.put("difficulty", search.getDifficulty());
		
		return this.examAdaptationQuestionMapper.queryAccurateExamAdaptationQuestionBySearch(map);
	}
	
	
	/**
	 * 根据条件查询考试模块-自适应试题库count总数
	 * @param map
	 * @return
	 */
	public int queryExamAdaptationQuestionTotalCount(ExamAdaptationQuestionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("typeId",search.getTypeId());
  		map.put("knowledgeId",search.getKnowledgeId());
  		map.put("questionId",search.getQuestionId());
  		map.put("adaptationId",search.getAdaptationId());
		
		return this.examAdaptationQuestionMapper.queryExamAdaptationQuestionTotalCount(map);
	}
	
	
	
}
