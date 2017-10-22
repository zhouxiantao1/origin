package com.sjq.ask.service;

import java.util.List;
import java.util.Map;

import com.sjq.ask.bean.InterlocutionAskBean;
import com.sjq.ask.search.InterlocutionAskSearch;
import com.sjq.ask.vo.InterlocutionAskVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象提问信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-15 15:18:01
 * @version 1.0
 */
 
public interface InterlocutionAskService {
	
	/**
	 * (更新)根据ID更新所有提问信息信息
	 * @param bean
	 * @return
	 */
	int updateInterlocutionAskById(InterlocutionAskBean bean);
	
	/**
	 * 查询所有的提问信息信息
	 * @return 查询到的结果列表
	 */
	List<InterlocutionAskVo> queryAllInterlocutionAsk();
				
				
	/**
	 * 根据ID查询提问信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	InterlocutionAskVo queryInterlocutionAskById(Long id);
				
				
	/**
	 * 根据条件查询所有提问信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<InterlocutionAskVo> queryInterlocutionAskBySearch(InterlocutionAskSearch search);
				
					
	/**
	 * 根据条件查询提问信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryInterlocutionAskTotalCount(InterlocutionAskSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryInterlocutionAskPage(PageBean pb,InterlocutionAskSearch search);
	
	
	/**
	 *( 更新)根据问题ID更新浏览次数
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int  updateReadeNumByAskId(InterlocutionAskSearch search);
				
	/**
	 * (更新)根据条件更新所有提问信息信息
	 * @param map
	 * @return
	 */
	int updateInterlocutionAskBySearch(InterlocutionAskBean bean,InterlocutionAskSearch search);
				
				
	/**
	 * (增加)增加提问信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertInterlocutionAsk(InterlocutionAskBean bean);
				
	
}