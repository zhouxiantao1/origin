package com.sjq.security.service;

import java.util.List;
import java.util.Map;

import com.sjq.security.bean.SecurityAuthorization;
import com.sjq.security.bean.SecurityResource;
import com.sjq.security.vo.SecurityResourceVo;


/**
 * 
 * 资源管理service层
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月16日下午4:22:35
 * @version 1.0
 */
public interface SecurityResourceService {

	/**
	 * (增加)增加信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int inserResource(SecurityResource bean);
	
	
	/**
	 * 获取全部的资源信息（后台专用，配合Bootstraptreeview插件使用）
	 * @return
	 */
	List<SecurityResourceVo> queryBossAllResource();
	
	
	/**
	 * 返回后台菜单
	 * @return
	 */
	List<Map<String, Object>> queryBossLeftMenu(Map<String,Object> map);
	
	
	/**
	 * 根据查询条件查询资源
	 * @param map
	 * @return
	 */
	List<SecurityResource> querySecurityResourceBySearch(Map<String,Object> map);
	
	
	
	/**
	 * 
	 * 根据资源id查询所具备该权限的角色
	 * @param resourceId
	 * @return
	 */
	List<Map<String,Object>> querySecurityRoleResourceByResourceId(Long resourceId);
	
	
	/**
	 * 通过权限信息能过查询条件
	 * @param map
	 * @return
	 */
	public int checkSecurityAuthorizationByRoleAndResource(Map<String, Object> map);
	
	
	/**
	 * 批量删除授权信息
	 * @param roleId
	 * @return
	 */
	int batchDeleteSecurityAuthorizationByRoleId(Map<String, Object> map);
	
	/**
	 * 添加授权信息
	 * @param bean
	 * @return
	 */
	int insertSecurityAuthorization(SecurityAuthorization bean);
	
	
	/**
	 * 返回前台菜单
	 * @return
	 */
	List<Map<String, Object>> querySiteLeftMenu(Long roleId);
	
	
}