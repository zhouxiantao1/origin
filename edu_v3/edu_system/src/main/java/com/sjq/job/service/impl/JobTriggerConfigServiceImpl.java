package com.sjq.job.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.job.bean.JobTriggerConfig;
import com.sjq.job.dao.JobTriggerConfigMapper;
import com.sjq.job.service.JobTriggerConfigService;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午5:27:19
 * @version 1.0
 */

@Service("JobTriggerConfigService")
public class JobTriggerConfigServiceImpl implements JobTriggerConfigService {

	@Autowired
	private JobTriggerConfigMapper jobTriggerConfigMapper;
	
	public List<JobTriggerConfig> findListTriggerConfig(Map<String, Object> map) {
		return jobTriggerConfigMapper.findListTriggerConfig(map);
	}

}
