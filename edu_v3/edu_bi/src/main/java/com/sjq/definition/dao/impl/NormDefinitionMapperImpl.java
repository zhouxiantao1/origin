package com.sjq.definition.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.definition.vo.NormDefinitionVo;
import com.sjq.definition.bean.NormDefinitionBean;
import com.sjq.definition.dao.NormDefinitionMapper;

/**
 * [自动生成]常模管理-常模定义DAO实现
 * @author  ShuiJingQiu
 * @since   2017-07-06 16:04:08
 * @version 1.0
 */
@Repository("NormDefinitionMapper")
public class NormDefinitionMapperImpl extends BasicSqlSupport implements NormDefinitionMapper {

	/**
	 * 根据ID查询常模管理-常模定义信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public NormDefinitionVo queryNormDefinitionById(Long id){
	    return this.selectOne("com.sjq.definition.dao.NormDefinitionMapper.queryNormDefinitionById",id);
	}

	/**
	 * 根据条件查询所有常模管理-常模定义信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<NormDefinitionVo>  queryNormDefinitionBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.definition.dao.NormDefinitionMapper.queryNormDefinitionBySearch",map);
	}
	
	/**
	 * 根据条件查询常模管理-常模定义count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryNormDefinitionTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.definition.dao.NormDefinitionMapper.queryNormDefinitionTotalCount",map);
	}
	
	/**
	 * 分页查询常模管理-常模定义
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryNormDefinitionPage(Map<String, Object> map){
		return this.selectList("com.sjq.definition.dao.NormDefinitionMapper.queryNormDefinitionPage",map);
	}
	
	/**
	 * (删除)根据ID删除常模管理-常模定义信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteNormDefinitionById(NormDefinitionBean bean){
		return this.delete("com.sjq.definition.dao.NormDefinitionMapper.deleteNormDefinitionById",bean);
	}
	
	/**
	 * (删除)根据条件删除常模管理-常模定义信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteNormDefinitionBySearch(Map<String, Object> map){
		return this.delete("com.sjq.definition.dao.NormDefinitionMapper.deleteNormDefinitionBySearch",map);
	}
	
	/**
	 * (增加)增加常模管理-常模定义信息
	 * @param bean 常模管理-常模定义实体
	 * @return     受增加影响的行数
	 */
	public int  insertNormDefinition(NormDefinitionBean bean){
		return this.insert("com.sjq.definition.dao.NormDefinitionMapper.insertNormDefinition", bean);
	}

	@Override
	public List<Object> queryNormDefinitionPageBySearch(Map<String, Object> map) {
		return this.selectList("com.sjq.definition.dao.NormDefinitionMapper.queryNormDefinitionPageBySearch",map);
	}

	@Override
	public int queryNormBySearchTotalCount(Map<String, Object> map) {
		return this.selectOne("com.sjq.definition.dao.NormDefinitionMapper.queryNormBySearchTotalCount",map);
	}
	
	

}