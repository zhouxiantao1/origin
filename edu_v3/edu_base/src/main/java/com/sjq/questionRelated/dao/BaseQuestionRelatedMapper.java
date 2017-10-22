package com.sjq.questionRelated.dao;

import java.util.List;
import java.util.Map;
import com.sjq.questionRelated.vo.BaseQuestionRelatedVo;
import com.sjq.questionRelated.bean.BaseQuestionRelatedBean;

/**
 * [自动生成]抽象题目知识点目录信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-06 00:47:45
 * @version 1.0
 */
public interface BaseQuestionRelatedMapper {


	/**
	 * 根据ID查询题目知识点目录信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseQuestionRelatedVo queryBaseQuestionRelatedById(Long id);
	
	/**
	 * 根据IDS查询所有题目知识点目录信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List  queryBaseQuestionRelatedByIds(Map map);
	
	/**
	 * 根据条件查询所有题目知识点目录信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseQuestionRelatedVo> queryBaseQuestionRelatedBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询题目知识点目录信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseQuestionRelatedTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询题目知识点目录信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseQuestionRelatedPage(Map<String, Object> map);
	
	/**
	 * (联合题目表查询)根据条件查询题目知识点目录信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseQuestionRelatedTotalCount1(Map<String, Object> map);
	
	/**
	 * (联合题目表查询)分页查询题目知识点目录信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseQuestionRelatedPage1(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除题目知识点目录信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseQuestionRelatedById(BaseQuestionRelatedBean bean);
	
	/**
	 * (更新)根据条件更新所有题目知识点目录信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateBaseQuestionRelatedBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加题目知识点目录信息信息
	 * @param bean 题目知识点目录信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseQuestionRelated(BaseQuestionRelatedBean bean);

	
}