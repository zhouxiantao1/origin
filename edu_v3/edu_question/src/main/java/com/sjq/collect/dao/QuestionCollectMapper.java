package com.sjq.collect.dao;

import java.util.List;
import java.util.Map;
import com.sjq.collect.vo.QuestionCollectVo;
import com.sjq.collect.bean.QuestionCollectBean;

/**
 * [自动生成]抽象题库模块-题库收藏Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-09 01:36:25
 * @version 1.0
 */
public interface QuestionCollectMapper {


	/**
	 * 根据条件查询题库模块-题库收藏count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryQuestionCollectTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询题库模块-题库收藏
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryQuestionCollectPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除题库模块-题库收藏信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteQuestionCollectById(QuestionCollectBean bean);
	
	/**
	 * (增加)增加题库模块-题库收藏信息
	 * @param bean 题库模块-题库收藏实体
	 * @return     受增加影响的行数
	 */
	int insertQuestionCollect(QuestionCollectBean bean);
	
	
	/**
	 * 根据条件查询所有题库模块-题库收藏信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<QuestionCollectVo> queryQuestionCollectBySearch(Map<String,Object> map);

	
}