package com.sjq.answer.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.answer.dao.QuestionAnswerMapper;
import com.sjq.answer.service.QuestionAnswerService;
import com.sjq.answer.bean.QuestionAnswerBean;
import com.sjq.answer.search.QuestionAnswerSearch;
import com.sjq.answer.vo.QuestionAnswerVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现题库模块-题库答案service层
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:19:47
 * @version 1.0
 */
 
@Service("QuestionAnswerService")
public class QuestionAnswerServiceImpl implements QuestionAnswerService {
	

	@Autowired
	private QuestionAnswerMapper questionAnswerMapper;
	
				
	
	/**
	 * 根据ID查询题库模块-题库答案信息
	 * @return
	 */
	public QuestionAnswerVo queryQuestionAnswerById(Long id){
		
		return this.questionAnswerMapper.queryQuestionAnswerById(id);

	}
	

	/**
	 * (增加)增加题库模块-题库答案信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertQuestionAnswer(QuestionAnswerBean bean){
	
		
		return this.questionAnswerMapper.insertQuestionAnswer(bean);
		
	}
	
	
	/**
	 * (更新)根据ID更新所有题库模块-题库答案信息
	 * @param bean
	 * @return
	 */
	public int updateQuestionAnswerById(QuestionAnswerBean bean){
		
		return this.questionAnswerMapper.updateQuestionAnswerById(bean);
		
	}
	
	
	
}
