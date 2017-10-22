package com.sjq.job.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.job.bean.JobTriggerConfig;
import com.sjq.job.dao.JobTriggerConfigMapper;
import com.sjq.manager.base.BasicSqlSupport;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午5:27:19
 * @version 1.0
 */
@Repository("JobTriggerConfigMapper")
public class JobTriggerConfigMapperImpl   extends BasicSqlSupport implements JobTriggerConfigMapper {

	public List<JobTriggerConfig> findListTriggerConfig(Map<String, Object> map) {
		return this.selectList("com.sjq.job.dao.jobTriggerConfigMapper.queryJobTriggerConfigBySearch",map);
	}

}
