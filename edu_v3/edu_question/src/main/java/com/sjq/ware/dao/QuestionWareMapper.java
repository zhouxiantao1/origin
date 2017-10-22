package com.sjq.ware.dao;

import java.util.List;
import java.util.Map;
import com.sjq.ware.vo.QuestionWareVo;
import com.sjq.ware.bean.QuestionRelatedBean;
import com.sjq.ware.bean.QuestionWareBean;
import com.sjq.ware.search.QuestionWareSearch;

/**
 * [自动生成]抽象题库模块-题库中心Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-25 11:53:57
 * @version 1.0
 */
public interface QuestionWareMapper {


	/**
	 * 根据条件查询题库模块-题库中心count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryQuestionWareTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询题库模块-题库中心
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryQuestionWarePage(Map<String, Object> map);
	
	
	/**
	 * (增加)增加题库模块-题库中心信息
	 * @param bean 题库模块-题库中心实体
	 * @return     受增加影响的行数
	 */
	int insertQuestionWare(QuestionWareBean bean);
	
	/**
	 * (删除)根据ID删除题库模块-题库中心信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteQuestionWareById(QuestionWareBean bean);
	
	/**
	 * 根据条件查询所有题库模块-题库中心信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<QuestionWareVo> queryQuestionWareBySearch(Map<String,Object> map);
	
	/**
	 * (更新)根据ID更新所有题库模块-题库中心信息
	 * @param bean 题库模块-题库中心实体
	 * @return     受更新影响的行数
	 */
	int updateQuestionWareById(QuestionWareBean bean);
	
	/**
	 * 根据ID查询题库模块-题库中心信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	QuestionWareVo queryQuestionWareById(Long id);
	
	/**
	 * 根据条件获取所有的试题id
	 * @param search
	 * @return
	 */
	List<Map<String,Object>> queryQuestionIdsBySearch(Map<String,Object> map);
	
	/**
	 * (更新)根据条件更新所有题库模块-题库中心信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateQuestionWareBySearch(Map<String,Object> map);
	
	
	/**
	 * (增加)增加题库模块-试题关联信息
	 * @param bean 题库模块-题库中心实体
	 * @return     受增加影响的行数
	 */
	int insertQuestionRelated(QuestionRelatedBean bean);
	
	//更新组卷次数
	int updateQuestionWareByIds(Map<String, Object> map);
	
	/**
	 * 清空试题知识点与章节的关联关系
	 * @param questionId
	 * @return
	 */
	int updateQuestionRelatedByQuestionId(Long questionId);
}