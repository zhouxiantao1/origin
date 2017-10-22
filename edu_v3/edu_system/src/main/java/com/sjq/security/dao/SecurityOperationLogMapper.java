package com.sjq.security.dao;

import java.util.List;
import java.util.Map;

import com.sjq.security.bean.SecurityOperationLogBean;

/**
 * [自动生成]抽象系统日志操作Dao层
 * @author  ShuiJingQiu
 * @since   2017-07-06 15:34:36
 * @version 1.0
 */
public interface SecurityOperationLogMapper {


	/**
	 * 根据条件查询系统日志操作count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int querySecurityOperationLogTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询系统日志操作
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> querySecurityOperationLogPage(Map<String, Object> map);
	
	/**
	 * (增加)增加系统日志操作信息
	 * @param bean 系统日志操作实体
	 * @return     受增加影响的行数
	 */
	int insertSecurityOperationLog(SecurityOperationLogBean bean);

	
}