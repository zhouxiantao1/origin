package com.sjq.job.dao;

import java.util.List;
import java.util.Map;

import com.sjq.job.bean.JobSchedulerConfig;

/**
 * 
 * 调度dao
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午5:22:41
 * @version 1.0
 */
public interface JobSchedulerConfigMapper {

	/**
	 * 获取调度信息
	 * @param map
	 * @return
	 */
	List<JobSchedulerConfig> findListSchedulerConfig(Map<String,Object> map);
	
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
	 * (增加)增加信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertSchedulerConfig(JobSchedulerConfig bean);
}


