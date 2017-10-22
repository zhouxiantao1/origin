package com.sjq.job.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.job.bean.JobLog;
import com.sjq.job.dao.JobLogMapper;
import com.sjq.job.service.JobLogService;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午5:26:06
 * @version 1.0
 */
@Service("JobLogService")
public class JobLogServiceImpl implements JobLogService {
	
	@Autowired
	private JobLogMapper jobLogMapper;

	public int inserJobLog(JobLog bean) {
		return jobLogMapper.inserJobLog(bean);
	}

}
