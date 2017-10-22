package com.sjq.job.monitor;

import org.springframework.batch.core.JobExecution;

/**
 * 
 * 通知器接口
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午3:31:08
 * @version 1.0
 */
public interface JobMonitorNotifier {

	void notify(JobExecution jobExecution);

}
