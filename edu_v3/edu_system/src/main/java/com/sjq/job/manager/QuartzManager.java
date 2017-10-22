package com.sjq.job.manager;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.quartz.impl.StdSchedulerFactory;

import com.sjq.job.bean.JobTriggerConfig;
import com.sjq.job.constants.JobConstants;


/**
 * 
 * Quartz管理器
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午3:36:31
 * @version 1.0
 */
public class QuartzManager {

	/**
	 * 默认调度器工厂
	 */
	private static final StdSchedulerFactory factory = new StdSchedulerFactory();

	/**
	 * 调度器映射
	 */
	private static Map<String, Scheduler> schedulerMap = new HashMap<String, Scheduler>();

	/**
	 * 获取工厂
	 * @param factoryKey
	 * @return
	 */
	public static StdSchedulerFactory getDefaultSchedulerFactory() {
		return factory;
	}

	/**
	 * 加入调度器
	 * @param schedulerKey
	 * @param scheduler
	 */
	public static synchronized void putScheduler(String schedulerKey, Scheduler scheduler) {
		schedulerMap.put(schedulerKey, scheduler);
	}

	/**
	 * 获取调度器
	 * @param schedulerKey
	 * @return
	 */
	public static Scheduler getScheduler(String schedulerKey) {
		return schedulerMap.get(schedulerKey);
	}

	/**
	 * 启动作业调度
	 * @param model
	 * @throws SchedulerException
	 */
	public static Date scheduleJob(JobTriggerConfig model) throws SchedulerException {
		Scheduler scheduler = getScheduler(model.getSchedulerName());
		Trigger cronTrigger = TriggerBuilder.newTrigger().withIdentity(model.getTriggerName(), model.getGroupName())
				.withSchedule(CronScheduleBuilder.cronSchedule(model.getCronExpression())).build();
		JobDetail jobDetail = JobBuilder.newJob(QuartzJobAgent.class)
				.withIdentity(model.getSpringBatchJobId(), model.getGroupName()).build();
		jobDetail.getJobDataMap().put(JobConstants.TRIGGER_JOB_NOTE, model.getTriggerNote());
		return scheduler.scheduleJob(jobDetail, cronTrigger);
	}

	/**
	 * 停止作业调度
	 * @param model
	 * @throws SchedulerException
	 */
	public static boolean unscheduleJob(JobTriggerConfig model) throws SchedulerException {
		Scheduler scheduler = getScheduler(model.getSchedulerName());
		TriggerKey triggerKey = new TriggerKey(model.getTriggerName(), model.getGroupName());
		return scheduler.unscheduleJob(triggerKey);
	}

}
