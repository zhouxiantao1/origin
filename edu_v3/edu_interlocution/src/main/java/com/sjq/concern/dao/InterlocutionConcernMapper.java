package com.sjq.concern.dao;

import java.util.List;
import java.util.Map;
import com.sjq.concern.vo.InterlocutionConcernVo;
import com.sjq.concern.bean.InterlocutionConcernBean;

/**
 * [自动生成]抽象关注信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-17 11:29:41
 * @version 1.0
 */
public interface InterlocutionConcernMapper {
	
	/**
	 * 根据条件查询关注信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int  queryInterlocutionAnswerCount(Map<String, Object> map);
	
	/**
	 * (删除)根据条件删除关注信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteInterlocutionConcernBySearch(Map map);
	
	/**
	 * (删除)根据ID删除关注信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteInterlocutionConcernById(InterlocutionConcernBean bean);
	
	/**
	 * 查询所有的关注信息信息
	 * @return 查询到的列表
	 */
	List<InterlocutionConcernVo> queryAllInterlocutionConcern();
	
	/**
	 * 根据ID查询关注信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	InterlocutionConcernVo queryInterlocutionConcernById(Long id);
	
	/**
	 * 根据条件查询所有关注信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<InterlocutionConcernVo> queryInterlocutionConcernBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询关注信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryInterlocutionConcernTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询关注信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryInterlocutionConcernPage(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有关注信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateInterlocutionConcernBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加关注信息信息
	 * @param bean 关注信息实体
	 * @return     受增加影响的行数
	 */
	int insertInterlocutionConcern(InterlocutionConcernBean bean);

	
}