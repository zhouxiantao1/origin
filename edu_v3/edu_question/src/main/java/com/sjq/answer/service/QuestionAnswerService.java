package com.sjq.answer.service;

import java.util.List;
import java.util.Map;

import com.sjq.answer.bean.QuestionAnswerBean;
import com.sjq.answer.search.QuestionAnswerSearch;
import com.sjq.answer.vo.QuestionAnswerVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象题库模块-题库答案service层
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:19:47
 * @version 1.0
 */
 
public interface QuestionAnswerService {

				
	/**
	 * 根据ID查询题库模块-题库答案信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	QuestionAnswerVo queryQuestionAnswerById(Long id);
				
	
	
	/**
	* (增加)增加题库模块-题库答案信息
	* @param bean
	* @param name 增加操作人
	* @return
	*/
	int insertQuestionAnswer(QuestionAnswerBean bean);
	
	
	/**
	 * (更新)根据ID更新所有题库模块-题库答案信息
	 * @param bean
	 * @return
	 */
	int updateQuestionAnswerById(QuestionAnswerBean bean);
				
}