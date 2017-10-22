package com.sjq.concern.service;

import java.util.List;
import java.util.Map;

import com.sjq.concern.bean.InterlocutionConcernBean;
import com.sjq.concern.search.InterlocutionConcernSearch;
import com.sjq.concern.vo.InterlocutionConcernVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象关注信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-17 11:29:41
 * @version 1.0
 */
 
public interface InterlocutionConcernService {
	
	/**
	 * (删除)根据条件删除关注信息信息
	 * @param map
	 * @return
	 */
	int deleteInterlocutionConcernBySearch(InterlocutionConcernBean bean,InterlocutionConcernSearch search);
	
	/**
	 * (删除)根据ID删除关注信息信息
	 * @param id
	 * @return
	 */
	int deleteInterlocutionConcernById(InterlocutionConcernBean bean);
	
	/**
	 * 查询所有的关注信息信息
	 * @return 查询到的结果列表
	 */
	List<InterlocutionConcernVo> queryAllInterlocutionConcern();
				
				
	/**
	 * 根据ID查询关注信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	InterlocutionConcernVo queryInterlocutionConcernById(Long id);
				
				
	/**
	 * 根据条件查询所有关注信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<InterlocutionConcernVo> queryInterlocutionConcernBySearch(InterlocutionConcernSearch search);
				
					
	/**
	 * 根据条件查询关注信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryInterlocutionConcernTotalCount(InterlocutionConcernSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryInterlocutionConcernPage(PageBean pb,InterlocutionConcernSearch search);
				
				
	/**
	 * (更新)根据条件更新所有关注信息信息
	 * @param map
	 * @return
	 */
	int updateInterlocutionConcernBySearch(InterlocutionConcernBean bean,InterlocutionConcernSearch search);
				
				
	/**
	 * (增加)增加关注信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertInterlocutionConcern(InterlocutionConcernBean bean);
				
	
}