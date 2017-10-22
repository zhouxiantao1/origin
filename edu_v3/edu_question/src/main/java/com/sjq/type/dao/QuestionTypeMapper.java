package com.sjq.type.dao;

import java.util.List;
import java.util.Map;

import com.sjq.type.bean.QuestionTypeBean;
import com.sjq.type.vo.QuestionTypeVo;

/**
 * [自动生成]抽象题库模块-题型信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-28 19:53:48
 * @version 1.0
 */
public interface QuestionTypeMapper {
	
	/**
	 * 分页查询题库模块-题型信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List queryQuestionTypePage(Map map);
	
	/**
	 * 根据条件查询题库模块-题型信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryQuestionTypeTotalCount(Map map);
	
	/**
	 * (增加)增加题库模块-题型信息信息
	 * @param bean 题库模块-题型信息实体
	 * @return     受增加影响的行数
	 */
	int insertQuestionType(QuestionTypeBean bean);
	
	/**
	 * 查询所有的题库模块-题型信息信息
	 * @return 查询到的列表
	 */
	List<QuestionTypeVo> queryAllQuestionType();
	
	/**
	 * 根据ID查询题库模块-题型信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	QuestionTypeVo queryQuestionTypeById(Long id);
	
	
	/**
	 * 根据ID查询题库模块-题型信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	List<QuestionTypeVo>  queryQuestionTypeBySubjectId(Long subjectId);
	
	List<QuestionTypeVo> queryQuestionTypeBySearch(Map<String, Object> map);


	
}