package com.sjq.ask.dao;

import java.util.List;
import java.util.Map;
import com.sjq.ask.vo.InterlocutionAskVo;
import com.sjq.ask.bean.InterlocutionAskBean;

/**
 * [自动生成]抽象提问信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-15 15:18:01
 * @version 1.0
 */
public interface InterlocutionAskMapper {

	/**
	 * (更新)根据ID更新所有提问信息信息
	 * @param bean 提问信息实体
	 * @return     受更新影响的行数
	 */
	int updateInterlocutionAskById(InterlocutionAskBean bean);
	
	
	/**
	 * 查询所有的提问信息信息
	 * @return 查询到的列表
	 */
	List<InterlocutionAskVo> queryAllInterlocutionAsk();
	
	/**
	 * 根据ID查询提问信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	InterlocutionAskVo queryInterlocutionAskById(Long id);
	
	/**
	 * 根据条件查询所有提问信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<InterlocutionAskVo> queryInterlocutionAskBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询提问信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryInterlocutionAskTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询提问信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryInterlocutionAskPage(Map<String, Object> map);
	
	/**
	 *( 更新)根据问题ID更新浏览次数
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int  updateReadeNumByAskId(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有提问信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateInterlocutionAskBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加提问信息信息
	 * @param bean 提问信息实体
	 * @return     受增加影响的行数
	 */
	int insertInterlocutionAsk(InterlocutionAskBean bean);

	
}