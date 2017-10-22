package com.sjq.answer.dao;

import java.util.List;
import java.util.Map;
import com.sjq.answer.vo.QuestionAnswerVo;
import com.sjq.answer.bean.QuestionAnswerBean;

/**
 * [自动生成]抽象题库模块-题库答案Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:19:47
 * @version 1.0
 */
public interface QuestionAnswerMapper {


	/**
	 * 根据ID查询题库模块-题库答案信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	QuestionAnswerVo queryQuestionAnswerById(Long id);
	
	
	/**
	 * (增加)增加题库模块-题库答案信息
	 * @param bean 题库模块-题库答案实体
	 * @return     受增加影响的行数
	 */
	int insertQuestionAnswer(QuestionAnswerBean bean);
	
	/**
	 * (更新)根据ID更新所有题库模块-题库答案信息
	 * @param bean 题库模块-题库答案实体
	 * @return     受更新影响的行数
	 */
	int updateQuestionAnswerById(QuestionAnswerBean bean);
	
}