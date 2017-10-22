package com.sjq.job.monitor;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.BeforeJob;
import org.springframework.batch.core.launch.JobExecutionNotRunningException;
import org.springframework.batch.core.launch.JobOperator;
import org.springframework.batch.core.launch.NoSuchJobException;
import org.springframework.batch.core.launch.NoSuchJobExecutionException;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.sjq.job.bean.JobLog;
import com.sjq.job.constants.JobConstants;
import com.sjq.job.exception.JobException;
import com.sjq.job.service.JobLogService;
import com.sjq.security.constant.Constant;


/**
 * 
 * 作业执行情况监听器
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午3:31:17
 * @version 1.0
 */
public class MonitorJobExecutionListener {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat(Constant.LOCAL_DATE_TIME_LONG_FORMAT24);

	private static final String defaultJobNote = "默认作业备注";

	@Autowired
	private JobLogService jobLogService;

	@Autowired
	private JobOperator jobOperator;

	// private static final Logger log = Logger.getLogger(MonitorJobExecutionListener.class);
	private static final Logger log = LoggerFactory.getLogger(MonitorJobExecutionListener.class);

	private JobMonitorNotifier jobMonitorNotifier;

	public void setJobMonitorNotifier(JobMonitorNotifier jobMonitorNotifier) {
		this.jobMonitorNotifier = jobMonitorNotifier;
	}

	@BeforeJob
	public void executeBeforeJob(JobExecution jobExecution) {
		// Do nothing
		log.info("作业即将执行，开始监控进展。");
		// jobExecution.setExitStatus(ExitStatus.STOPPED);
		String jobName = jobExecution.getJobInstance().getJobName();
		System.out.println("executeBeforeJob:" + jobName);
		try {
			Set<Long> runningJobExecutionIdSet = jobOperator.getRunningExecutions(jobName);
			if (runningJobExecutionIdSet != null && runningJobExecutionIdSet.size() > 1) {
				// 存在正在运行同名作业，停止当前作业
				System.out.println("存在正在运行同名作业，停止当前作业");
				Iterator it = runningJobExecutionIdSet.iterator();
				while (it.hasNext()) {
					Long runId = (Long) it.next();
					System.out.println("Running Job Id : " + runId);
				}
				jobOperator.stop(jobExecution.getId());
			}
		} catch (NoSuchJobException e) {
			e.printStackTrace();
		} catch (NoSuchJobExecutionException e) {
			e.printStackTrace();
		} catch (JobExecutionNotRunningException e) {
			e.printStackTrace();
		}
	}

	@AfterJob
	public void executeAfterJob(JobExecution jobExecution) {
		JobParameters jobParams = jobExecution.getJobParameters();

		JobLog model = new JobLog();
		model.setJobNote(jobParams.getString(JobConstants.TRIGGER_JOB_NOTE, defaultJobNote));
		model.setStatus(jobExecution.getExitStatus().getExitCode());
		model.setJobExecutionId(jobExecution.getId());
		model.setOccurTime(jobParams.getString(JobConstants.TRIGGER_JOB_DATE));

		// 保存异常信息
		ExecutionContext jec = jobExecution.getExecutionContext();
		if (jec.get(JobConstants.JOB_RESULT) != null) {
			JobException ex = (JobException) jec.get(JobConstants.JOB_RESULT);

			StringBuilder sb = new StringBuilder();
			for (Map.Entry<String, String> entry : ex.getStepExecution().entrySet()) {
				sb.append(entry.getKey() + ":" + entry.getValue());
				sb.append(",");
			}
			model.setJobExecException(Arrays.toString(sb.toString().split(",")));   //

			// System.out.println("参数map.............." + ex.getStepExecution());
		}
		jobLogService.inserJobLog(model);  //保存日志信息

		System.out.println("JobInstanceId: " + jobExecution.getJobInstance().getId());
		System.out.println("JobId: " + jobExecution.getJobId());
		System.out.println("JobName : " + jobExecution.getJobInstance().getJobName());
		System.out.println("JobExecutionID : " + jobExecution.getId());
		System.out.println("StartTime : " + jobExecution.getStartTime());
		System.out.println("EndTime : " + jobExecution.getEndTime());
		System.out.println("ExitStatus : " + jobExecution.getExitStatus());

		// 打印所有自动调用环节情况
		Collection<StepExecution> stepExecutionList = jobExecution.getStepExecutions();
		for (StepExecution stepExecution : stepExecutionList) {
			System.out.println(stepExecution.toString());
		}

		// 打印所有异常情况
		List<Throwable> exceptionList = jobExecution.getFailureExceptions();
		for (Throwable exception : exceptionList) {
			System.out.println(exception.getMessage());
		}

		JobParameters params = jobExecution.getJobParameters();
		if (!params.isEmpty()) {
			Map<String, JobParameter> paramsMap = params.getParameters();
			Iterator<String> paramsIt = paramsMap.keySet().iterator();
			while (paramsIt.hasNext()) {
				String paramKey = paramsIt.next();
				JobParameter param = paramsMap.get(paramKey);
				Object paramValue = param.getValue();
				System.out.println("paramKey : " + paramKey + "  paramValue : " + paramValue);
			}
//
//			String paramJson = JacksonUtil.modelToJson(paramsMap);
//			System.out.println("paramJson : " + paramJson);
		}

		System.out.println("作业完成情况:" + jobExecution.getStatus());
		// 作业完成情况记录。。。。。。
		// 作业失败通知，例如，短信，邮件
		if (jobExecution.getStatus() == BatchStatus.FAILED) {
			// 日志记录失败情况通知
			jobMonitorNotifier.notify(jobExecution);
		}

		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			// Called when job ends successfully
		} else if (jobExecution.getStatus() == BatchStatus.FAILED) {
			// Called when job ends in failure
		}
	}
}
