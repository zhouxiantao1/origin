package com.sjq.mute.dao;

import java.util.List;
import java.util.Map;
import com.sjq.mute.vo.InterlocutionMuteVo;
import com.sjq.mute.bean.InterlocutionMuteBean;

/**
 * [自动生成]抽象禁言信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-04 18:30:37
 * @version 1.0
 */
public interface InterlocutionMuteMapper {


	/**
	 * 查询所有的禁言信息信息
	 * @return 查询到的列表
	 */
	List<InterlocutionMuteVo> queryAllInterlocutionMute();
	
	/**
	 * 根据ID查询禁言信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	InterlocutionMuteVo queryInterlocutionMuteById(Long id);
	
	/**
	 * 根据条件查询所有禁言信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<InterlocutionMuteVo> queryInterlocutionMuteBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询禁言信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryInterlocutionMuteTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询禁言信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryInterlocutionMutePage(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有禁言信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateInterlocutionMuteBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加禁言信息信息
	 * @param bean 禁言信息实体
	 * @return     受增加影响的行数
	 */
	int insertInterlocutionMute(InterlocutionMuteBean bean);

	
}