package com.sjq.mute.service;

import java.util.List;
import java.util.Map;

import com.sjq.mute.bean.InterlocutionMuteBean;
import com.sjq.mute.search.InterlocutionMuteSearch;
import com.sjq.mute.vo.InterlocutionMuteVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象禁言信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 18:30:37
 * @version 1.0
 */
 
public interface InterlocutionMuteService {

	/**
	 * 查询所有的禁言信息信息
	 * @return 查询到的结果列表
	 */
	List<InterlocutionMuteVo> queryAllInterlocutionMute();
				
				
	/**
	 * 根据ID查询禁言信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	InterlocutionMuteVo queryInterlocutionMuteById(Long id);
				
				
	/**
	 * 根据条件查询所有禁言信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<InterlocutionMuteVo> queryInterlocutionMuteBySearch(InterlocutionMuteSearch search);
				
					
	/**
	 * 根据条件查询禁言信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryInterlocutionMuteTotalCount(InterlocutionMuteSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryInterlocutionMutePage(PageBean pb,InterlocutionMuteSearch search);
				
				
	/**
	 * (更新)根据条件更新所有禁言信息信息
	 * @param map
	 * @return
	 */
	int updateInterlocutionMuteBySearch(InterlocutionMuteBean bean,InterlocutionMuteSearch search);
				
				
	/**
	 * (增加)增加禁言信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertInterlocutionMute(InterlocutionMuteBean bean);
				
	
}