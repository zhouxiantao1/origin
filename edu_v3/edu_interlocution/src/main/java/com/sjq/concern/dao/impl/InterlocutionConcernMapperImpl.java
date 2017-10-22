package com.sjq.concern.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.concern.vo.InterlocutionConcernVo;
import com.sjq.concern.bean.InterlocutionConcernBean;
import com.sjq.concern.dao.InterlocutionConcernMapper;

/**
 * [自动生成]关注信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-17 11:29:41
 * @version 1.0
 */
@Repository("InterlocutionConcernMapper")
public class InterlocutionConcernMapperImpl extends BasicSqlSupport implements InterlocutionConcernMapper {
	
	/**
	 * (删除)根据条件删除关注信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteInterlocutionConcernBySearch(Map map){
		return this.delete("com.sjq.concern.dao.InterlocutionConcernMapper.deleteInterlocutionConcernBySearch",map);
	}
	
	/**
	 * 根据条件查询关注信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryInterlocutionAnswerCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.concern.dao.InterlocutionConcernMapper.queryInterlocutionAnswerCount",map);
	}
	
	/**
	 * (删除)根据ID删除关注信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteInterlocutionConcernById(InterlocutionConcernBean bean){
		return this.delete("com.sjq.concern.dao.InterlocutionConcernMapper.deleteInterlocutionConcernById",bean);
	}
	
	/**
	 * 查询所有的关注信息信息
	 * @return 查询到的列表
	 */
	public List<InterlocutionConcernVo> queryAllInterlocutionConcern(){
	     return this.selectList("com.sjq.concern.dao.InterlocutionConcernMapper.queryAllInterlocutionConcern");
	}
				
	/**
	 * 根据ID查询关注信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public InterlocutionConcernVo queryInterlocutionConcernById(Long id){
	    return this.selectOne("com.sjq.concern.dao.InterlocutionConcernMapper.queryInterlocutionConcernById",id);
	}

	/**
	 * 根据条件查询所有关注信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<InterlocutionConcernVo>  queryInterlocutionConcernBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.concern.dao.InterlocutionConcernMapper.queryInterlocutionConcernBySearch",map);
	}
	
	/**
	 * 根据条件查询关注信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryInterlocutionConcernTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.concern.dao.InterlocutionConcernMapper.queryInterlocutionConcernTotalCount",map);
	}
	
	/**
	 * 分页查询关注信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryInterlocutionConcernPage(Map<String, Object> map){
		return this.selectList("com.sjq.concern.dao.InterlocutionConcernMapper.queryInterlocutionConcernPage",map);
	}
	
	/**
	 * (更新)根据条件更新所有关注信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateInterlocutionConcernBySearch(Map<String, Object> map){
	    return this.update("com.sjq.concern.dao.InterlocutionConcernMapper.updateInterlocutionConcernBySearch", map);
	}
	
	/**
	 * (增加)增加关注信息信息
	 * @param bean 关注信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertInterlocutionConcern(InterlocutionConcernBean bean){
		return this.insert("com.sjq.concern.dao.InterlocutionConcernMapper.insertInterlocutionConcern", bean);
	}
	
	

}