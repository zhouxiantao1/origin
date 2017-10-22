package com.sjq.security.service;

import com.sjq.security.bean.SecurityOperationLogBean;
import com.sjq.security.search.SecurityOperationLogSearch;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象系统日志操作service层
 * @author  ShuiJingQiu
 * @since   2017-07-06 15:34:36
 * @version 1.0
 */
 
public interface SecurityOperationLogService {

	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean querySecurityOperationLogPage(PageBean pb,SecurityOperationLogSearch search);
				
				
	/**
	 * (增加)增加系统日志操作信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertSecurityOperationLog(SecurityOperationLogBean bean);
				
	
}