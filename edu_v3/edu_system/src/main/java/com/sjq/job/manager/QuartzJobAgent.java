package com.sjq.job.manager;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.util.StopWatch;

import com.sjq.job.constants.JobConstants;
import com.sjq.job.utils.SpringApplicationContextUtils;



/**
 * 
 * Quartz作业代理
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午3:29:12
 * @version 1.0
 */
public class QuartzJobAgent implements org.quartz.Job {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public void execute(JobExecutionContext quartzJobExecutionContext) throws JobExecutionException {
		// Spring Batch 作业配置文件对应的作业ID : springBatchJobId;
		// 此作业ID存储于QUARTZ触发器作业配置表，并由在Quartz调度器启动作业时,将springBatchJobId作为作业名称作为QUARTZ作业名称
		String springBatchJobId = quartzJobExecutionContext.getJobDetail().getKey().getName();
		StopWatch sw = new StopWatch();
		sw.start();
		try {
			System.out.println("trigger the quartz job [" + springBatchJobId + "] and start timing ......");
			// Spring Batch 作业启动器
			JobLauncher springBatchJobLauncher = (JobLauncher) SpringApplicationContextUtils.getBean("jobLauncher");
			System.out.println("Spring Batch 作业ID :　" + springBatchJobId);
			Job batchJob = (Job) SpringApplicationContextUtils.getBean(springBatchJobId);
			if (springBatchJobLauncher != null && batchJob != null) {
				JobExecution springBatchJobExecution = springBatchJobLauncher.run(
						batchJob,
						new JobParametersBuilder()
								.addString(
										JobConstants.TRIGGER_JOB_NOTE,
										quartzJobExecutionContext.getJobDetail().getJobDataMap()
												.getString(JobConstants.TRIGGER_JOB_NOTE))
								.addString(JobConstants.TRIGGER_JOB_SOURCE, "SCHEDULER")
								.addString(JobConstants.TRIGGER_JOB_DATE, sdf.format(new Date()))
								.addString(JobConstants.SPRING_BATCH_JOB_KEY, springBatchJobId).toJobParameters());// 可根据触发器配置更多的启动参数并添加到此处

				System.out.println("Spring Batch Job Execution Return ID : " + springBatchJobExecution.getId());
			}
		} catch (JobExecutionAlreadyRunningException e) {
			e.printStackTrace();
		} catch (JobRestartException e) {
			e.printStackTrace();
		} catch (JobInstanceAlreadyCompleteException e) {
			e.printStackTrace();
		} catch (JobParametersInvalidException e) {
			e.printStackTrace();
		}
		sw.stop();
		System.out.println("the quartz job [" + springBatchJobId + "] is finished and Time consuming "
				+ sw.getTotalTimeSeconds() + " 秒");
	}
}
