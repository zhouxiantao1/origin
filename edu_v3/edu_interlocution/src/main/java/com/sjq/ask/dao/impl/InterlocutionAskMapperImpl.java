package com.sjq.ask.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.ask.vo.InterlocutionAskVo;
import com.sjq.ask.bean.InterlocutionAskBean;
import com.sjq.ask.dao.InterlocutionAskMapper;

/**
 * [自动生成]提问信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-15 15:18:01
 * @version 1.0
 */
@Repository("InterlocutionAskMapper")
public class InterlocutionAskMapperImpl extends BasicSqlSupport implements InterlocutionAskMapper {
	
	/**
	 * (更新)根据ID更新所有提问信息信息
	 * @param bean 提问信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateInterlocutionAskById(InterlocutionAskBean bean){
	    return this.update("com.sjq.ask.dao.InterlocutionAskMapper.updateInterlocutionAskById", bean);
	}
	
	/**
	 * 查询所有的提问信息信息
	 * @return 查询到的列表
	 */
	public List<InterlocutionAskVo> queryAllInterlocutionAsk(){
	     return this.selectList("com.sjq.ask.dao.InterlocutionAskMapper.queryAllInterlocutionAsk");
	}
				
	/**
	 * 根据ID查询提问信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public InterlocutionAskVo queryInterlocutionAskById(Long id){
	    return this.selectOne("com.sjq.ask.dao.InterlocutionAskMapper.queryInterlocutionAskById",id);
	}

	/**
	 * 根据条件查询所有提问信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<InterlocutionAskVo>  queryInterlocutionAskBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.ask.dao.InterlocutionAskMapper.queryInterlocutionAskBySearch",map);
	}
	
	/**
	 * 根据条件查询提问信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryInterlocutionAskTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.ask.dao.InterlocutionAskMapper.queryInterlocutionAskTotalCount",map);
	}
	
	/**
	 * 分页查询提问信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryInterlocutionAskPage(Map<String, Object> map){
		return this.selectList("com.sjq.ask.dao.InterlocutionAskMapper.queryInterlocutionAskPage",map);
	}
	
	/**
	 *( 更新)根据问题ID更新浏览次数
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateReadeNumByAskId(Map<String, Object> map){
	    return this.update("com.sjq.ask.dao.InterlocutionAskMapper.updateReadeNumByAskId", map);
	}
	/**
	 * (更新)根据条件更新所有提问信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateInterlocutionAskBySearch(Map<String, Object> map){
	    return this.update("com.sjq.ask.dao.InterlocutionAskMapper.updateInterlocutionAskBySearch", map);
	}
	
	/**
	 * (增加)增加提问信息信息
	 * @param bean 提问信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertInterlocutionAsk(InterlocutionAskBean bean){
		return this.insert("com.sjq.ask.dao.InterlocutionAskMapper.insertInterlocutionAsk", bean);
	}
	
	

}