package com.sjq.mute.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.mute.vo.InterlocutionMuteVo;
import com.sjq.mute.bean.InterlocutionMuteBean;
import com.sjq.mute.dao.InterlocutionMuteMapper;

/**
 * [自动生成]禁言信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-04 18:30:37
 * @version 1.0
 */
@Repository("InterlocutionMuteMapper")
public class InterlocutionMuteMapperImpl extends BasicSqlSupport implements InterlocutionMuteMapper {

	/**
	 * 查询所有的禁言信息信息
	 * @return 查询到的列表
	 */
	public List<InterlocutionMuteVo> queryAllInterlocutionMute(){
	     return this.selectList("com.sjq.mute.dao.InterlocutionMuteMapper.queryAllInterlocutionMute");
	}
				
	/**
	 * 根据ID查询禁言信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public InterlocutionMuteVo queryInterlocutionMuteById(Long id){
	    return this.selectOne("com.sjq.mute.dao.InterlocutionMuteMapper.queryInterlocutionMuteById",id);
	}

	/**
	 * 根据条件查询所有禁言信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<InterlocutionMuteVo>  queryInterlocutionMuteBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.mute.dao.InterlocutionMuteMapper.queryInterlocutionMuteBySearch",map);
	}
	
	/**
	 * 根据条件查询禁言信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryInterlocutionMuteTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.mute.dao.InterlocutionMuteMapper.queryInterlocutionMuteTotalCount",map);
	}
	
	/**
	 * 分页查询禁言信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryInterlocutionMutePage(Map<String, Object> map){
		return this.selectList("com.sjq.mute.dao.InterlocutionMuteMapper.queryInterlocutionMutePage",map);
	}
	
	/**
	 * (更新)根据条件更新所有禁言信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateInterlocutionMuteBySearch(Map<String, Object> map){
	    return this.update("com.sjq.mute.dao.InterlocutionMuteMapper.updateInterlocutionMuteBySearch", map);
	}
	
	/**
	 * (增加)增加禁言信息信息
	 * @param bean 禁言信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertInterlocutionMute(InterlocutionMuteBean bean){
		return this.insert("com.sjq.mute.dao.InterlocutionMuteMapper.insertInterlocutionMute", bean);
	}
	
	

}