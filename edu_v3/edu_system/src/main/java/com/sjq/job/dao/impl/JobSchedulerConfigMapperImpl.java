package com.sjq.job.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sjq.job.bean.JobSchedulerConfig;
import com.sjq.job.dao.JobSchedulerConfigMapper;
import com.sjq.manager.base.BasicSqlSupport;

/**
 *
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午5:26:39
 * @version 1.0
 */
@Repository("JobShedulerConfigMapper")
public class JobSchedulerConfigMapperImpl  extends BasicSqlSupport implements JobSchedulerConfigMapper {
	

	public List<JobSchedulerConfig> findListSchedulerConfig(Map<String, Object> map) {
		return this.selectList("com.sjq.job.dao.jobSchedulerConfigMapper.queryJobSchedulerConfigBySearch",map);
	}

	public int queryTotalCount(Map<String, Object> map) {
		return this.selectOne("com.sjq.job.dao.jobSchedulerConfigMapper.queryTotalCount",map);
	}

	public List<Object> queryByPageBean(Map<String, Object> map) {
		return this.selectList("com.sjq.job.dao.jobSchedulerConfigMapper.queryByPageBean",map);
	}

	public int insertSchedulerConfig(JobSchedulerConfig bean) {
		return this.insert("com.sjq.job.dao.jobSchedulerConfigMapper.insertSchedulerConfig",bean);
	}

}
