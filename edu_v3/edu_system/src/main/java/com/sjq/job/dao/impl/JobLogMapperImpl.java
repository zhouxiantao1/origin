package com.sjq.job.dao.impl;

import org.springframework.stereotype.Repository;

import com.sjq.job.bean.JobLog;
import com.sjq.job.dao.JobLogMapper;
import com.sjq.manager.base.BasicSqlSupport;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午5:26:06
 * @version 1.0
 */
@Repository("JobLogMapper")
public class JobLogMapperImpl  extends BasicSqlSupport implements JobLogMapper {

	public int inserJobLog(JobLog bean) {
		
		return this.insert("com.sjq.job.dao.JobLogMapper.insertJobLog",bean);
	}

}
