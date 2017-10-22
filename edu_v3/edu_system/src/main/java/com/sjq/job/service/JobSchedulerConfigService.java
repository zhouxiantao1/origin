package com.sjq.job.service;

import java.util.List;
import java.util.Map;

import com.sjq.job.bean.JobSchedulerConfig;
import com.sjq.security.bean.SecurityUser;
import com.sjq.util.PageBean;

/**
 * 
 * 调度dao
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午5:22:41
 * @version 1.0
 */
public interface JobSchedulerConfigService {
	
	/**
	 * 获取调度信息
	 * @param map
	 * @return
	 */
	List<JobSchedulerConfig> findListSchedulerConfig(Map<String,Object> map);
	
	/**
	 * （查询）分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryPage(PageBean pb,Map<String,Object> map);
	
	
	/**
	 * (增加)增加信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertSchedulerConfig(JobSchedulerConfig bean);

}
