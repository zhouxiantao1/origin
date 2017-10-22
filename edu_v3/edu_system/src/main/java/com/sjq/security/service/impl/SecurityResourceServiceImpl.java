package com.sjq.security.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.security.bean.SecurityAuthorization;
import com.sjq.security.bean.SecurityResource;
import com.sjq.security.dao.SecurityResourceMapper;
import com.sjq.security.service.SecurityResourceService;
import com.sjq.security.vo.SecurityResourceVo;

/**
 * [自动生成]实现角色管理service层
 * @author Zheng.ZeJie
 * @since  
 * @version 1.0
 */

@Service("SecurityResourceService")
public class SecurityResourceServiceImpl implements SecurityResourceService {

	@Autowired
	private SecurityResourceMapper securityResourceMapper;
	
	/**
	 * (增加)增加信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int inserResource(SecurityResource bean) {
		return this.securityResourceMapper.insertResource(bean);
	}

	public List<SecurityResourceVo> queryBossAllResource() {
		return this.securityResourceMapper.queryBossAllResource();
	}

	public List<Map<String, Object>> queryBossLeftMenu(Map<String,Object> map) {
		
		return this.securityResourceMapper.queryBossLeftMenu(map);
	}

	public List<SecurityResource> querySecurityResourceBySearch(Map<String, Object> map) {
		
		return this.securityResourceMapper.querySecurityResourceBySearch(map);
	}

	public List<Map<String, Object>> querySecurityRoleResourceByResourceId(Long resourceId) {
		
		return this.securityResourceMapper.querySecurityRoleResourceByResourceId(resourceId);
	}
	
	
	public int checkSecurityAuthorizationByRoleAndResource(Map<String, Object> map) {
		
		return this.securityResourceMapper.checkSecurityAuthorizationByRoleAndResource(map);
	}

	public int batchDeleteSecurityAuthorizationByRoleId(Map<String, Object> map) {
		return this.securityResourceMapper.batchDeleteSecurityAuthorizationByRoleId(map);
	}

	public int insertSecurityAuthorization(SecurityAuthorization bean) {
		return this.securityResourceMapper.insertSecurityAuthorization(bean);
	}

	@Override
	public List<Map<String, Object>> querySiteLeftMenu(Long roleId) {
		return securityResourceMapper.querySiteLeftMenu(roleId);
	}

	
}
