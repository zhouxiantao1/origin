package com.sjq.answerAsk.service;

import java.util.List;
import java.util.Map;

import com.sjq.answerAsk.bean.InterlocutionAnswerAskBean;
import com.sjq.answerAsk.search.InterlocutionAnswerAskSearch;
import com.sjq.answerAsk.vo.InterlocutionAnswerAskVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象回答提问信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 18:30:14
 * @version 1.0
 */
 
public interface InterlocutionAnswerAskService {
	
	/**
	 * (更新)根据ID更新所有回答提问信息信息
	 * @param bean
	 * @return
	 */
	int updateInterlocutionAnswerAskById(InterlocutionAnswerAskBean bean);
				
	
	/**
	 * 查询所有的回答提问信息信息
	 * @return 查询到的结果列表
	 */
	List<InterlocutionAnswerAskVo> queryAllInterlocutionAnswerAsk();
				
				
	/**
	 * 根据ID查询回答提问信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	InterlocutionAnswerAskVo queryInterlocutionAnswerAskById(Long id);
				
				
	/**
	 * 根据条件查询所有回答提问信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<InterlocutionAnswerAskVo> queryInterlocutionAnswerAskBySearch(InterlocutionAnswerAskSearch search);
				
					
	/**
	 * 根据条件查询回答提问信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryInterlocutionAnswerAskTotalCount(InterlocutionAnswerAskSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryInterlocutionAnswerAskPage(PageBean pb,InterlocutionAnswerAskSearch search);
				
				
	/**
	 * (更新)根据条件更新所有回答提问信息信息
	 * @param map
	 * @return
	 */
	int updateInterlocutionAnswerAskBySearch(InterlocutionAnswerAskBean bean,InterlocutionAnswerAskSearch search);
				
				
	/**
	 * (增加)增加回答提问信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertInterlocutionAnswerAsk(InterlocutionAnswerAskBean bean);
				
	
}