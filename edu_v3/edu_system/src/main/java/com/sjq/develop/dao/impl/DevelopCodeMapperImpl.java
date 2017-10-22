package com.sjq.develop.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.develop.bean.DevelopCodeBean;
import com.sjq.develop.dao.DevelopCodeMapper;
import com.sjq.develop.vo.DevelopCodeVo;
import com.sjq.manager.base.BasicSqlSupport;

/**
 * 
 * 代码生成模块DAO实现
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月11日下午3:51:06
 * @version 1.0
 */
@Repository("DevelopCodeMapper")
public class DevelopCodeMapperImpl extends BasicSqlSupport implements DevelopCodeMapper {

	/**
	 * (查询)查询所有的信息
	 * @return 查询到的列表
	 */
	public List<DevelopCodeVo> selectAll(){
	     return this.selectList("com.sjq.develop.dao.DevelopCodeMapper.selectAll");
	}
	
	/**
	 * (查询)根据ID查询所有信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public DevelopCodeVo queryCodeById(Long id){
	    return this.selectOne("com.sjq.develop.dao.DevelopCodeMapper.queryCodeById",id);
	}

	/**
	 * (查询)根据IDS查询所有信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */

	public List<DevelopCodeVo> queryCodeByIds(Map<String, Object> map){
		return this.selectList("com.sjq.develop.dao.DevelopCodeMapper.queryCodeByIds",map);
	}

	/**
	 * (查询)根据条件查询所有信息 
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	
	public List<DevelopCodeVo> queryCodeBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.develop.dao.DevelopCodeMapper.queryCodeBySearch",map);
	}
	
	/**
	 * (查询)分页根据条件查询count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	
	public int queryTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.develop.dao.DevelopCodeMapper.queryTotalCount",map);
	}
	
	/**
	 * (查询)分布根据条件查询信息 
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	
	public List<Object> queryByPageBean(Map<String, Object> map){
		return this.selectList("com.sjq.develop.dao.DevelopCodeMapper.queryByPageBean",map);
	}
	
	/**
	 * (删除)删除所有的 信息
	 * @return  受删除影响的行数
	 */
	
	public int deleteAll(){
	    return this.delete("com.sjq.develop.dao.DevelopCodeMapper.deleteAll");
	}
	
	/**
	 * (删除)根据ID删除信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	
	public int deleteCodeById(Long id){
		return this.delete("com.sjq.develop.dao.DevelopCodeMapper.deleteCodeById",id);
	}
	
	/**
	 * (删除)根据IDS删除信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	
	public int deleteCodeByIds(Map<String, Object> map){
		return this.delete("com.sjq.develop.dao.DevelopCodeMapper.deleteCodeByIds",map);
	}
	
	/**
	 * (删除)根据条件删除信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	
	public int deleteCodeBySearch(Map<String, Object> map){
		return this.delete("com.sjq.develop.dao.DevelopCodeMapper.deleteCodeBySearch",map);
	}
	
	/**
	 * (更新)更新所有信息 (慎用)
	 * @param bean 代码生成模块实体
	 * @return     受更新影响的行数
	 */
	
	public int updateCode(DevelopCodeBean bean){
	    return this.update("com.sjq.develop.dao.DevelopCodeMapper.updateCode", bean);
	}
	
	/**
	 * (更新)根据ID更新所有信息
	 * @param bean 代码生成模块实体
	 * @return     受更新影响的行数
	 */
	
	public int updateCodeById(DevelopCodeBean bean){
	    return this.update("com.sjq.develop.dao.DevelopCodeMapper.updateCodeById", bean);
	}
	
	/**
	 * (更新)根据IDS更新有信息
	 * @param map 封装更新参数(ids) 
	 * @return    受更新影响的行数
	 */
	
	public int updateCodeByIds(Map<String, Object> map){
	    return this.update("com.sjq.develop.dao.DevelopCodeMapper.updateCodeByIds", map);
	}
	
	/**
	 * (更新)根据条件更新所有信息 
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	
	public int updateCodeBySearch(Map<String, Object> map){
	    return this.update("com.sjq.develop.dao.DevelopCodeMapper.updateCodeBySearch", map);
	}
	
	/**
	 * (增加)增加信息
	 * @param bean 代码生成模块实体
	 * @return     受增加影响的行数
	 */
	
	public int insertCode(DevelopCodeBean bean){
		return this.insert("com.sjq.develop.dao.DevelopCodeMapper.insertCode", bean);
	}

}