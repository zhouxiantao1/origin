package com.sjq.questionscore.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.questionscore.dao.ExamQuestionscoreMapper;
import com.sjq.questionscore.service.ExamQuestionscoreService;
import com.sjq.questionscore.bean.ExamQuestionscoreBean;
import com.sjq.questionscore.search.ExamQuestionscoreSearch;
import com.sjq.questionscore.vo.ExamQuestionscoreVo;

/**
 * [自动生成]实现试管理-考生考试试题得分service层
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:05
 * @version 1.0
 */
 
@Service("ExamQuestionscoreService")
public class ExamQuestionscoreServiceImpl implements ExamQuestionscoreService {
	

	@Autowired
	private ExamQuestionscoreMapper examQuestionscoreMapper;
	
				
	
	/**
	 * 根据ID查询试管理-考生考试试题得分信息
	 * @return
	 */
	public ExamQuestionscoreVo queryExamQuestionscoreById(Long id){
		
		return this.examQuestionscoreMapper.queryExamQuestionscoreById(id);

	}
	

	/**
	 * 根据条件查询所有试管理-考生考试试题得分信息
	 * @param map
	 * @return
	 */
	public List<ExamQuestionscoreVo> queryExamQuestionscoreBySearch(ExamQuestionscoreSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("paperScoreId",search.getPaperScoreId());
  		map.put("questionId",search.getQuestionId());
  		map.put("studentId",search.getStudentId());
  		map.put("isWrong",search.getIsWrong());
  		map.put("examDetailId",search.getExamDetailId());
		
		return this.examQuestionscoreMapper.queryExamQuestionscoreBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加试管理-考生考试试题得分信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertExamQuestionscore(ExamQuestionscoreBean bean){
	
		
		return this.examQuestionscoreMapper.insertExamQuestionscore(bean);
		
	}
	
	
	
}
