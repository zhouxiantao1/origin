package com.sjq.security.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.security.bean.SecurityRole;
import com.sjq.security.dao.SecurityRoleMapper;

/**
 * [自动生成]角色管理DAO实现
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */
@Repository("SecurityRoleMapper")
public class SecurityRoleMapperImpl extends BasicSqlSupport implements SecurityRoleMapper {

	/**
	 * (查询)查询所有的信息
	 * @return 查询到的列表
	 */
	public List<SecurityRole> selectAll(){
	     return this.selectList("com.sjq.security.dao.securityRoleMapper.selectAll");
	}
	
	/**
	 * (查询)根据ID查询所有信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public SecurityRole queryRoleById(Long id){
	    return this.selectOne("com.sjq.security.dao.securityRoleMapper.queryRoleById",id);
	}

	/**
	 * (查询)根据IDS查询所有信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<SecurityRole> queryRoleByIds(Map<String, Object> map){
		return this.selectList("com.sjq.security.dao.securityRoleMapper.queryRoleByIds",map);
	}

	/**
	 * (查询)根据条件查询所有信息 
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	
	public List<SecurityRole> queryRoleBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.security.dao.securityRoleMapper.queryRoleBySearch",map);
	}
	
	/**
	 * (查询)分页根据条件查询count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	
	public int queryTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.security.dao.securityRoleMapper.queryTotalCount",map);
	}
	
	/**
	 * (查询)分布根据条件查询信息 
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	
	public List<Object> queryByPageBean(Map<String, Object> map){
		return this.selectList("com.sjq.security.dao.securityRoleMapper.queryByPageBean",map);
	}
	
	/**
	 * (删除)删除所有的 信息
	 * @return  受删除影响的行数
	 */
	
	public int deleteAll(){
	    return this.delete("com.sjq.security.dao.securityRoleMapper.deleteAll");
	}
	
	/**
	 * (删除)根据ID删除信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	
	public int deleteRoleById(Long id){
		return this.delete("com.sjq.security.dao.securityRoleMapper.deleteRoleById",id);
	}
	
	/**
	 * (删除)根据IDS删除信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	
	public int deleteRoleByIds(Map<String, Object> map){
		return this.delete("com.sjq.security.dao.securityRoleMapper.deleteRoleByIds",map);
	}
	
	/**
	 * (删除)根据条件删除信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	
	public int deleteRoleBySearch(Map<String, Object> map){
		return this.delete("com.sjq.security.dao.securityRoleMapper.deleteRoleBySearch",map);
	}
	
	/**
	 * (更新)更新所有信息 (慎用)
	 * @param bean 角色管理实体
	 * @return     受更新影响的行数
	 */
	
	public int updateRole(SecurityRole bean){
	    return this.update("com.sjq.security.dao.securityRoleMapper.updateRole", bean);
	}
	
	/**
	 * (更新)根据ID更新所有信息
	 * @param bean 角色管理实体
	 * @return     受更新影响的行数
	 */
	
	public int updateRoleById(SecurityRole bean){
	    return this.update("com.sjq.security.dao.securityRoleMapper.updateRoleById", bean);
	}
	
	/**
	 * (更新)根据IDS更新有信息
	 * @param map 封装更新参数(ids) 
	 * @return    受更新影响的行数
	 */
	
	public int updateRoleByIds(Map<String, Object> map){
	    return this.update("com.sjq.security.dao.securityRoleMapper.updateRoleByIds", map);
	}
	
	/**
	 * (更新)根据条件更新所有信息 
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	
	public int updateRoleBySearch(Map<String, Object> map){
	    return this.update("com.sjq.security.dao.securityRoleMapper.updateRoleBySearch", map);
	}
	
	/**
	 * (增加)增加信息
	 * @param bean 角色管理实体
	 * @return     受增加影响的行数
	 */
	
	public int insertRole(SecurityRole bean){
		return this.insert("com.sjq.security.dao.securityRoleMapper.insertRole", bean);
	}

}