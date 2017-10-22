package com.sjq.job.dao;

import com.sjq.job.bean.JobLog;

/**
 * 
 * 调试触发日志
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午5:24:33
 * @version 1.0
 */
public interface JobLogMapper {

	/**
	 * (增加)增加作业日志信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int inserJobLog(JobLog bean);
}
