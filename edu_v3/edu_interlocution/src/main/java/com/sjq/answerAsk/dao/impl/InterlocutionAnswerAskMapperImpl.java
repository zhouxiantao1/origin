package com.sjq.answerAsk.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.answerAsk.vo.InterlocutionAnswerAskVo;
import com.sjq.answerAsk.bean.InterlocutionAnswerAskBean;
import com.sjq.answerAsk.dao.InterlocutionAnswerAskMapper;

/**
 * [自动生成]回答提问信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-04 18:30:14
 * @version 1.0
 */
@Repository("InterlocutionAnswerAskMapper")
public class InterlocutionAnswerAskMapperImpl extends BasicSqlSupport implements InterlocutionAnswerAskMapper {
	
	/**
	 * (更新)根据ID更新所有回答提问信息信息
	 * @param bean 回答提问信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateInterlocutionAnswerAskById(InterlocutionAnswerAskBean bean){
	    return this.update("com.sjq.answerAsk.dao.InterlocutionAnswerAskMapper.updateInterlocutionAnswerAskById", bean);
	}
	
	
	/**
	 * 查询所有的回答提问信息信息
	 * @return 查询到的列表
	 */
	public List<InterlocutionAnswerAskVo> queryAllInterlocutionAnswerAsk(){
	     return this.selectList("com.sjq.answerAsk.dao.InterlocutionAnswerAskMapper.queryAllInterlocutionAnswerAsk");
	}
				
	/**
	 * 根据ID查询回答提问信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public InterlocutionAnswerAskVo queryInterlocutionAnswerAskById(Long id){
	    return this.selectOne("com.sjq.answerAsk.dao.InterlocutionAnswerAskMapper.queryInterlocutionAnswerAskById",id);
	}

	/**
	 * 根据条件查询所有回答提问信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<InterlocutionAnswerAskVo>  queryInterlocutionAnswerAskBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.answerAsk.dao.InterlocutionAnswerAskMapper.queryInterlocutionAnswerAskBySearch",map);
	}
	
	/**
	 * 根据条件查询回答提问信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryInterlocutionAnswerAskTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.answerAsk.dao.InterlocutionAnswerAskMapper.queryInterlocutionAnswerAskTotalCount",map);
	}
	
	/**
	 * 分页查询回答提问信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryInterlocutionAnswerAskPage(Map<String, Object> map){
		return this.selectList("com.sjq.answerAsk.dao.InterlocutionAnswerAskMapper.queryInterlocutionAnswerAskPage",map);
	}
	
	/**
	 * (更新)根据条件更新所有回答提问信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateInterlocutionAnswerAskBySearch(Map<String, Object> map){
	    return this.update("com.sjq.answerAsk.dao.InterlocutionAnswerAskMapper.updateInterlocutionAnswerAskBySearch", map);
	}
	
	/**
	 * (增加)增加回答提问信息信息
	 * @param bean 回答提问信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertInterlocutionAnswerAsk(InterlocutionAnswerAskBean bean){
		return this.insert("com.sjq.answerAsk.dao.InterlocutionAnswerAskMapper.insertInterlocutionAnswerAsk", bean);
	}
	
	

}