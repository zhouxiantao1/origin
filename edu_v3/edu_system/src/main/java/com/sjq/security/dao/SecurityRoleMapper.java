package com.sjq.security.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.security.bean.SecurityRole;

/**
 * [自动生成]抽象角色管理Dao层
 * @author Zheng.ZeJie
 * @since  
 * @version 1.0
 */


public interface SecurityRoleMapper {

	/**
	 * (查询)查询所有的信息
	 * @return 查询到的列表
	 */
	List<SecurityRole> selectAll();
	
	/**
	 * (查询)根据ID查询所有信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	SecurityRole queryRoleById(Long id);
	
	/**
	 * (查询)根据IDS查询所有信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<SecurityRole> queryRoleByIds(Map<String, Object> map);

	/**
	 * (查询)根据条件查询所有信息 
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<SecurityRole> queryRoleBySearch(Map<String, Object> map);
	
	/**
	 * (查询)分页根据条件查询count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryTotalCount(Map<String, Object> map);
	
	/**
	 * (查询)分布根据条件查询信息 
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryByPageBean(Map<String, Object> map);
	
	/**
	 * (删除)删除所有的 信息
	 * @return  受删除影响的行数
	 */
	int deleteAll();
	
	/**
	 * (删除)根据ID删除信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteRoleById(Long id);
	
	/**
	 * (删除)根据IDS删除信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteRoleByIds(Map<String, Object> map);
	
	/**
	 * (删除)根据条件删除信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteRoleBySearch(Map<String, Object> map);
	
	/**
	 * (更新)更新所有信息 (慎用)
	 * @param bean 角色管理实体
	 * @return     受更新影响的行数
	 */
	int updateRole(SecurityRole bean);
	
	/**
	 * (更新)根据ID更新所有信息
	 * @param bean 角色管理实体
	 * @return     受更新影响的行数
	 */
	int updateRoleById(SecurityRole bean);
	
	/**
	 * (更新)根据IDS更新有信息
	 * @param map 封装更新参数(ids) 
	 * @return    受更新影响的行数
	 */
	int updateRoleByIds(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有信息 
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateRoleBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加信息
	 * @param bean 角色管理实体
	 * @return     受增加影响的行数
	 */
	int insertRole(SecurityRole bean);
}