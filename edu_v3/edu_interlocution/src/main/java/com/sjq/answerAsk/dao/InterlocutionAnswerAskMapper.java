package com.sjq.answerAsk.dao;

import java.util.List;
import java.util.Map;
import com.sjq.answerAsk.vo.InterlocutionAnswerAskVo;
import com.sjq.answerAsk.bean.InterlocutionAnswerAskBean;

/**
 * [自动生成]抽象回答提问信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-04 18:30:14
 * @version 1.0
 */
public interface InterlocutionAnswerAskMapper {
	
	/**
	 * (更新)根据ID更新所有回答提问信息信息
	 * @param bean 回答提问信息实体
	 * @return     受更新影响的行数
	 */
	int updateInterlocutionAnswerAskById(InterlocutionAnswerAskBean bean);

	/**
	 * 查询所有的回答提问信息信息
	 * @return 查询到的列表
	 */
	List<InterlocutionAnswerAskVo> queryAllInterlocutionAnswerAsk();
	
	/**
	 * 根据ID查询回答提问信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	InterlocutionAnswerAskVo queryInterlocutionAnswerAskById(Long id);
	
	/**
	 * 根据条件查询所有回答提问信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<InterlocutionAnswerAskVo> queryInterlocutionAnswerAskBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询回答提问信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryInterlocutionAnswerAskTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询回答提问信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryInterlocutionAnswerAskPage(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有回答提问信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateInterlocutionAnswerAskBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加回答提问信息信息
	 * @param bean 回答提问信息实体
	 * @return     受增加影响的行数
	 */
	int insertInterlocutionAnswerAsk(InterlocutionAnswerAskBean bean);

	
}