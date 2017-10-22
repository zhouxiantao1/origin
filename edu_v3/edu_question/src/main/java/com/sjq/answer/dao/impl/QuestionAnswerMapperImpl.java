package com.sjq.answer.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.answer.vo.QuestionAnswerVo;
import com.sjq.answer.bean.QuestionAnswerBean;
import com.sjq.answer.dao.QuestionAnswerMapper;

/**
 * [自动生成]题库模块-题库答案DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:19:47
 * @version 1.0
 */
@Repository("QuestionAnswerMapper")
public class QuestionAnswerMapperImpl extends BasicSqlSupport implements QuestionAnswerMapper {

	/**
	 * 根据ID查询题库模块-题库答案信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public QuestionAnswerVo queryQuestionAnswerById(Long id){
	    return this.selectOne("com.sjq.answer.dao.QuestionAnswerMapper.queryQuestionAnswerById",id);
	}

	/**
	 * (增加)增加题库模块-题库答案信息
	 * @param bean 题库模块-题库答案实体
	 * @return     受增加影响的行数
	 */
	public int  insertQuestionAnswer(QuestionAnswerBean bean){
		return this.insert("com.sjq.answer.dao.QuestionAnswerMapper.insertQuestionAnswer", bean);
	}
	
	/**
	 * (更新)根据ID更新所有题库模块-题库答案信息
	 * @param bean 题库模块-题库答案实体
	 * @return     受更新影响的行数
	 */
	public int  updateQuestionAnswerById(QuestionAnswerBean bean){
	    return this.update("com.sjq.answer.dao.QuestionAnswerMapper.updateQuestionAnswerById", bean);
	}
	
	
	

}