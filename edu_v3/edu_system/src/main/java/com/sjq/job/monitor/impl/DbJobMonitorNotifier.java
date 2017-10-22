package com.sjq.job.monitor.impl;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import com.sjq.job.monitor.JobMonitorNotifier;



/**
 * 
 *  作业监控数据库记录 实现
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午3:32:18
 * @version 1.0
 */
public class DbJobMonitorNotifier implements JobMonitorNotifier {

	// private static final Logger log = Logger.getLogger(DbJobMonitorNotifier.class);
	private static final Logger log = LoggerFactory.getLogger(DbJobMonitorNotifier.class);

	private String formatExceptionMessage(Throwable exception) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		exception.printStackTrace(new PrintStream(baos));
		return baos.toString();
	}

	private String createMessageContent(JobExecution jobExecution) {

		System.out.println("JOB ..... ERROR ......");
		List<Throwable> exceptions = jobExecution.getAllFailureExceptions();
		StringBuilder content = new StringBuilder();
		// content.append("Job execution #");
		// content.append(jobExecution.getId());
		// content.append(" of job instance #");
		// content.append(jobExecution.getJobInstance().getId());
		// content.append(" failed with following exceptions:");
		// for (Throwable exception : exceptions) {
		// content.append("");
		// content.append(formatExceptionMessage(exception));
		// }
		return content.toString();
	}

	public void notify(JobExecution jobExecution) {
		String message = createMessageContent(jobExecution);
		// log.info(message);
	}

}
