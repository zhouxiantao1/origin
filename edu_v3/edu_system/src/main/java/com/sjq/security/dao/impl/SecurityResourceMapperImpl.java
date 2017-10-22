package com.sjq.security.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.security.bean.SecurityAuthorization;
import com.sjq.security.bean.SecurityResource;
import com.sjq.security.dao.SecurityResourceMapper;
import com.sjq.security.vo.SecurityResourceVo;

/**
 * 
 * 资源管理DAO实现
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月16日下午4:13:42
 * @version 1.0
 */

@Repository("SecurityResourceMapper")
public class SecurityResourceMapperImpl  extends BasicSqlSupport implements SecurityResourceMapper {

	public int insertResource(SecurityResource bean) {
		
		return this.insert("com.sjq.security.dao.securityResourceMapper.insertSecurityResource", bean);
	}

	public List<SecurityResourceVo> queryBossAllResource() {
		return this.selectList("com.sjq.security.dao.securityResourceMapper.queryBossAllResource");
	}

	public List<Map<String, Object>> queryBossLeftMenu(Map<String,Object> map) {
		return this.selectList("com.sjq.security.dao.securityResourceMapper.queryBossLeftMenu",map);
	}

	public List<SecurityResource> querySecurityResourceBySearch(Map<String, Object> map) {
		return this.selectList("com.sjq.security.dao.securityResourceMapper.querySecurityResourceBySearch",map);
	}

	public List<Map<String, Object>> querySecurityRoleResourceByResourceId(Long resourceId) {
		return this.selectList("com.sjq.security.dao.securityResourceMapper.querySecurityRoleResourceByResourceId",resourceId);
	}

	public int checkSecurityAuthorizationByRoleAndResource(Map<String, Object> map) {
		return this.selectOne("com.sjq.security.dao.securityResourceMapper.querySecurityAuthorizationBySearch",map);
		
	}

	public int batchDeleteSecurityAuthorizationByRoleId(Map<String, Object> map) {
		return this.update("com.sjq.security.dao.securityResourceMapper.batchDeleteSecurityAuthorizationByRoleId",map);
	}

	public int insertSecurityAuthorization(SecurityAuthorization bean) {
		return this.insert("com.sjq.security.dao.securityResourceMapper.insertSecurityAuthorization", bean);
	}

	@Override
	public List<Map<String, Object>> querySiteLeftMenu(Long roleId) {
		return this.selectList("com.sjq.security.dao.securityResourceMapper.querySiteLeftMenu",roleId);
	}

}
