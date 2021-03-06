package com.sjq.job.dao;

import java.util.List;
import java.util.Map;

import com.sjq.job.bean.JobTriggerConfig;

/**
 * 
 * 触发dao
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午5:23:16
 * @version 1.0
 */
public interface JobTriggerConfigMapper {
	
	/**
	 * 获取触发信息
	 * @param map
	 * @return
	 */
	List<JobTriggerConfig> findListTriggerConfig(Map<String,Object> map);

}
