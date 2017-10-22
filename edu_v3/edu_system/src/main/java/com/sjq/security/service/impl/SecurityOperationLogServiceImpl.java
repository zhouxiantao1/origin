package com.sjq.security.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.security.bean.SecurityOperationLogBean;
import com.sjq.security.dao.SecurityOperationLogMapper;
import com.sjq.security.search.SecurityOperationLogSearch;
import com.sjq.security.service.SecurityOperationLogService;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现系统日志操作service层
 * @author  ShuiJingQiu
 * @since   2017-07-06 15:34:36
 * @version 1.0
 */
 
@Service("SecurityOperationLogService")
public class SecurityOperationLogServiceImpl implements SecurityOperationLogService {
	

	@Autowired
	private SecurityOperationLogMapper securityOperationLogMapper;
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean querySecurityOperationLogPage(PageBean pb,SecurityOperationLogSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("delflag",search.getDelflag());
  		map.put("ip",search.getIp());
  		map.put("userCode",search.getUserCode());
  		map.put("userName",search.getUserName());
  		map.put("operateTime",search.getOperateTime());
  		map.put("operateUrl",search.getOperateUrl());
	
        // 设置PageBean的行数参数
        pb.setRows(this.securityOperationLogMapper.querySecurityOperationLogTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.securityOperationLogMapper.querySecurityOperationLogPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (增加)增加系统日志操作信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertSecurityOperationLog(SecurityOperationLogBean bean){
	
		
		return this.securityOperationLogMapper.insertSecurityOperationLog(bean);
		
	}
	
	
	
}
