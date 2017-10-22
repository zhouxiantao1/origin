package com.sjq.security.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.security.bean.SecurityOperationLogBean;
import com.sjq.security.dao.SecurityOperationLogMapper;

/**
 * [自动生成]系统日志操作DAO实现
 * @author  ShuiJingQiu
 * @since   2017-07-06 15:34:36
 * @version 1.0
 */
@Repository("SecurityOperationLogMapper")
public class SecurityOperationLogMapperImpl extends BasicSqlSupport implements SecurityOperationLogMapper {

	/**
	 * 根据条件查询系统日志操作count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  querySecurityOperationLogTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.operationLog.dao.SecurityOperationLogMapper.querySecurityOperationLogTotalCount",map);
	}
	
	/**
	 * 分页查询系统日志操作
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  querySecurityOperationLogPage(Map<String, Object> map){
		return this.selectList("com.sjq.operationLog.dao.SecurityOperationLogMapper.querySecurityOperationLogPage",map);
	}
	
	/**
	 * (增加)增加系统日志操作信息
	 * @param bean 系统日志操作实体
	 * @return     受增加影响的行数
	 */
	public int  insertSecurityOperationLog(SecurityOperationLogBean bean){
		return this.insert("com.sjq.operationLog.dao.SecurityOperationLogMapper.insertSecurityOperationLog", bean);
	}
	
	

}