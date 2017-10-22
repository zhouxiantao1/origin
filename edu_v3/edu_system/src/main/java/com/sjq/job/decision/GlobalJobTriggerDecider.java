package com.sjq.job.decision;

import java.util.Random;

import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerKey;
import org.quartz.listeners.TriggerListenerSupport;

/**
 * 
 * 全局作业出发判决器
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午3:28:07
 * @version 1.0
 */
public class GlobalJobTriggerDecider extends TriggerListenerSupport {

	private static final boolean NOT_VETO = false;

	private static final boolean VETO = true;

	/**
	 * 根据当前作业调度情况对刚刚触发的作业调度进行表决
	 * 返回true,表示被否决。
	 * 返回false,表示通过，开始作业。
	 * 主要是为了避免上一次作业未完成，本次作业就开始，引起数据干扰。
	 * 在 Trigger 触发后，Job 将要被执行时由 Scheduler 调用这个方法。TriggerListener 给了一个选择去否决 Job 的执行.
	 * 假如 这个方法返回 true，这个 Job 将不会为此次 Trigger 触发而得到执行。
	 */
	@Override
	public boolean vetoJobExecution(Trigger trigger, JobExecutionContext context) {
		Scheduler scheduler = context.getScheduler();
		JobDetail jobDetail = context.getJobDetail();

		System.out.println("=========================== JOB KEY ==========================");
		JobKey jobKey = jobDetail.getKey();
		System.out.println("JOB KEY CTONTAINS 1.GROUP:[" + jobKey.getGroup() + "] 2.NAME:[" + jobKey.getName()
				+ "] 3.CLASS:[" + jobKey.getClass().getName() + "]");
		System.out.println("=========================== JOB DATA MAP KEY ==========================");
		String[] jobDataMapKeys = jobDetail.getJobDataMap().getKeys();
		for (String jobDataKey : jobDataMapKeys) {
			System.out.println(jobDataKey + " : " + jobDetail.getJobDataMap().getString(jobDataKey));
		}

		System.out.println("=========================== TRIGGER KEY ==========================");
		TriggerKey triggerKey = trigger.getKey();
		System.out.println("TRIGGER KEY CTONTAINS 1.GROUP:[" + triggerKey.getGroup() + "] 2.NAME:["
				+ triggerKey.getName() + "] 3.CLASS:[" + triggerKey.getClass().getName() + "]");
		System.out.println("=========================== TRIGGER DESC ==========================");
		System.out.println("TRIGGER DESC : " + trigger.getDescription());
		System.out.println("=========================== TRIGGER JOB DATA MAP KEY ==========================");
		String[] triggerJobDataMapKeys = trigger.getJobDataMap().getKeys();
		for (String jobDataKey : triggerJobDataMapKeys) {
			System.out.println(jobDataKey + " : " + trigger.getJobDataMap().getString(jobDataKey));
		}

		// Long lastSameNameJobExecutionId =
		// SpringApplicationContextUtils.getLastJobExecutionId(jobKey.getName());
		// if (lastSameNameJobExecutionId == null) {
		// System.out.println("首次调度作业【" + jobKey.getName() + "】，必须执行！");
		// return NOT_VETO;
		// }
		//
		// JobExplorer jobExplorer = (JobExplorer)
		// SpringApplicationContextUtils.getBean("jobExplorer");
		// if (jobExplorer == null) {
		// System.out.println("JobExplorer发生故障，不予执行！");
		// return VETO;
		// }
		//
		// JobExecution jobExecution = jobExplorer.getJobExecution(lastSameNameJobExecutionId);
		// BatchStatus status = jobExecution.getStatus();
		// System.out.println("Spring Batch Job Execution Status : " + status);
		// if (status == BatchStatus.COMPLETED || status == BatchStatus.FAILED) {
		// System.out.println("上次作业已完成或以失败结束,继续执行本次作业！");
		// return NOT_VETO;
		// } else {
		// System.out.println("上次作业状态未结束,不允许执行本次作业！");
		// return VETO;
		// }

		int random = new Random(8).nextInt() % 2;
		System.out.println("GlobalJobTriggerDecider RANDOM DECISION : " + random);
		if (random == 1) {
			return NOT_VETO;
		}
		return VETO;
	}

	public String getName() {
		return "GlobalJobTriggerDecider";
	}

}
