package com.sjq.version.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.version.vo.BaseVersionVo;
import com.sjq.version.bean.BaseVersionBean;
import com.sjq.version.dao.BaseVersionMapper;

/**
 * [自动生成]基础模块-版本信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:30:32
 * @version 1.0
 */
@Repository("BaseVersionMapper")
public class BaseVersionMapperImpl extends BasicSqlSupport implements BaseVersionMapper {

	/**
	 * 查询所有的基础模块-版本信息信息
	 * @return 查询到的列表
	 */
	public List<BaseVersionVo> queryAllBaseVersion(){
	     return this.selectList("com.sjq.version.dao.BaseVersionMapper.queryAllBaseVersion");
	}
				
	/**
	 * 根据ID查询基础模块-版本信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseVersionVo queryBaseVersionById(Long id){
	    return this.selectOne("com.sjq.version.dao.BaseVersionMapper.queryBaseVersionById",id);
	}

	/**
	 * 根据IDS查询所有基础模块-版本信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseVersionVo>  queryBaseVersionByIds(Map<String, Object> map){
		return this.selectList("com.sjq.version.dao.BaseVersionMapper.queryBaseVersionByIds",map);
	}

	/**
	 * 根据条件查询所有基础模块-版本信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseVersionVo>  queryBaseVersionBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.version.dao.BaseVersionMapper.queryBaseVersionBySearch",map);
	}
	
	/**
	 * 分页查询基础模块-版本信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseVersionPage(Map<String, Object> map){
		return this.selectList("com.sjq.version.dao.BaseVersionMapper.queryBaseVersionPage",map);
	}
	
	/**
	 * (删除)根据ID删除基础模块-版本信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseVersionById(BaseVersionBean bean){
		return this.delete("com.sjq.version.dao.BaseVersionMapper.deleteBaseVersionById",bean);
	}
	
	/**
	 * (删除)根据IDS删除基础模块-版本信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseVersionByIds(Map<String, Object> map){
		return this.delete("com.sjq.version.dao.BaseVersionMapper.deleteBaseVersionByIds",map);
	}
	
	/**
	 * (更新)根据ID更新所有基础模块-版本信息信息
	 * @param bean 基础模块-版本信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateBaseVersionById(BaseVersionBean bean){
	    return this.update("com.sjq.version.dao.BaseVersionMapper.updateBaseVersionById", bean);
	}
	
	/**
	 * 根据条件查询基础模块-版本信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseVersionTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.version.dao.BaseVersionMapper.queryBaseVersionTotalCount",map);
	}
	
	

}