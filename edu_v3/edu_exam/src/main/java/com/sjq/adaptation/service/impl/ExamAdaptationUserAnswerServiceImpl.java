package com.sjq.adaptation.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.adaptation.bean.ExamAdaptationUserAnswerBean;
import com.sjq.adaptation.dao.ExamAdaptationUserAnswerMapper;
import com.sjq.adaptation.search.ExamAdaptationUserAnswerSearch;
import com.sjq.adaptation.service.ExamAdaptationUserAnswerService;
import com.sjq.adaptation.vo.ExamAdaptationUserAnswerVo;

/**
 * [自动生成]实现考试模块-自适应测试用户答题记录表service层
 * @author  ShuiJingQiu
 * @since   2017-05-22 17:34:42
 * @version 1.0
 */
 
@Service("ExamAdaptationUserAnswerService")
public class ExamAdaptationUserAnswerServiceImpl implements ExamAdaptationUserAnswerService {
	

	@Autowired
	private ExamAdaptationUserAnswerMapper examAdaptationUserAnswerMapper;
	

	/**
	 * 根据条件查询所有考试模块-自适应测试用户答题记录表信息
	 * @param map
	 * @return
	 */
	public List<ExamAdaptationUserAnswerVo> queryExamAdaptationUserAnswerBySearch(ExamAdaptationUserAnswerSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("number",search.getNumber());
  		map.put("isRight",search.getIsRight());
  		map.put("knowledgeId",search.getKnowledgeId());
  		map.put("adaptationId",search.getAdaptationId());
  		map.put("userId",search.getUserId());
  		map.put("questionId",search.getQuestionId());
  		map.put("answerTime",search.getAnswerTime());
  		map.put("answerSecond",search.getAnswerSecond());
		
		return this.examAdaptationUserAnswerMapper.queryExamAdaptationUserAnswerBySearch(map);
	}
	
	

	/**
	 * 根据条件查询最新的考试模块-自适应测试用户答题记录表信息
	 * @param map
	 * @return
	 */
	public ExamAdaptationUserAnswerVo queryRecentExamAdaptationUserAnswerLimit1BySearch(ExamAdaptationUserAnswerSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("number",search.getNumber());
  		map.put("isRight",search.getIsRight());
  		map.put("knowledgeId",search.getKnowledgeId());
  		map.put("adaptationId",search.getAdaptationId());
  		map.put("userId",search.getUserId());
  		map.put("questionId",search.getQuestionId());
  		map.put("answerTime",search.getAnswerTime());
  		map.put("answerSecond",search.getAnswerSecond());
		
		return this.examAdaptationUserAnswerMapper.queryRecentExamAdaptationUserAnswerLimit1BySearch(map);
	}
	
	
	
	/**
	 * 根据条件查询考试模块-自适应测试用户答题记录表count总数
	 * @param map
	 * @return
	 */
	public int queryExamAdaptationUserAnswerTotalCount(ExamAdaptationUserAnswerSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("number",search.getNumber());
  		map.put("isRight",search.getIsRight());
  		map.put("knowledgeId",search.getKnowledgeId());
  		map.put("adaptationId",search.getAdaptationId());
  		map.put("userId",search.getUserId());
  		map.put("questionId",search.getQuestionId());
  		map.put("answerTime",search.getAnswerTime());
  		map.put("answerSecond",search.getAnswerSecond());
		
		return this.examAdaptationUserAnswerMapper.queryExamAdaptationUserAnswerTotalCount(map);
	}
	
				
	/**
	 * (更新)根据ID更新所有考试模块-自适应测试用户答题记录表信息
	 * @param bean
	 * @return
	 */
	public int updateExamAdaptationUserAnswerById(ExamAdaptationUserAnswerBean bean){
		
		return this.examAdaptationUserAnswerMapper.updateExamAdaptationUserAnswerById(bean);
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有考试模块-自适应测试用户答题记录表信息
	 * @param map
	 * @return
	 */
	public int updateExamAdaptationUserAnswerBySearch(ExamAdaptationUserAnswerBean bean,ExamAdaptationUserAnswerSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.examAdaptationUserAnswerMapper.updateExamAdaptationUserAnswerBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加考试模块-自适应测试用户答题记录表信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertExamAdaptationUserAnswer(ExamAdaptationUserAnswerBean bean){
	
		
		return this.examAdaptationUserAnswerMapper.insertExamAdaptationUserAnswer(bean);
		
	}



	@Override
	public int getExamAdaptationUserAnswerSecond(Long adaptationId, Long userId) {

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("adaptationId", adaptationId);
		map.put("userId", userId);
		return this.examAdaptationUserAnswerMapper.getExamAdaptationUserAnswerSecond(map);
		
	}
	
	
	
}
