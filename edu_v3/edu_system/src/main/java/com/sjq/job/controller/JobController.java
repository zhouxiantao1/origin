package com.sjq.job.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.JobOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sjq.job.constants.JobConstants;
import com.sjq.job.dto.JobExecutionDto;
import com.sjq.security.constant.Constant;

/**
 * 
 * 任务调度控制器
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月7日上午11:06:55
 * @version 1.0
 */
@Controller
@RequestMapping("/job")
public class JobController {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat(Constant.LOCAL_DATE_TIME_LONG_FORMAT24);
	
	@Autowired
	private JobExplorer jobExplorer;

	@Autowired
	private JobOperator jobOperator;

	@Autowired
	private JobLauncher jobLauncher;
	
	/**
	 * 获取所有的正运行中的任务信息
	 * @param request
	 * @param response
	 * @param searchCriteriaModel
	 */
	@RequestMapping(value = "/jobExecution/monitor/getData", method = RequestMethod.GET)
	@ResponseBody
	public List<JobExecutionDto> getDataMonitorJobExecutions(HttpServletRequest request, HttpServletResponse response) {

		List<JobExecutionDto> dtoList = new ArrayList<JobExecutionDto>();
		try {

			Set<Long> runningJobIdSet = jobOperator.getRunningExecutions("job1BatchJob");
			for (Long jobId : runningJobIdSet) {
				JobExecution jobExecution = jobExplorer.getJobExecution(jobId);
				JobExecutionDto dto = new JobExecutionDto();
				dto.setJobInstanceId(jobExecution.getJobInstance().getId());
				dto.setJobInstanceName(jobExecution.getJobInstance().getJobName());
				dto.setJobParameterMap(jobExecution.getJobParameters().getParameters());
				dto.setJobExecutionId(jobExecution.getId());
				dto.setStartTime(jobExecution.getStartTime()==null?"-------":sdf.format(jobExecution.getStartTime()));
				if (jobExecution.getEndTime() != null) {
					dto.setEndTime(sdf.format(jobExecution.getEndTime()));
				} else {
					dto.setEndTime("------");
				}
				dto.setExitStatus(jobExecution.getExitStatus().getExitCode());
				dto.setExitDescription(jobExecution.getExitStatus().getExitDescription());
				dtoList.add(dto);
			}
			
			return dtoList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;

	}
	
	/**
	 * 手工停止作业
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/jobExecution/manual/stop", method = RequestMethod.GET)
	@ResponseBody
	public String stopRunningJobExecution(HttpServletRequest request, HttpServletResponse response) {
		String runningJobExecutionId = request.getParameter(JobConstants.JOB_EXECUTION_ID);
		try {
			Long jobExecutionId = Long.valueOf(runningJobExecutionId);
			// 对于抛出特殊异常的作业,其状态STATUS取值为STARTED,EXIT_CODE取值为UNKNOWN,并且END_TIME取值为NULL，
			// 且该作业的作业步骤必定有一步的EXIT_CODE为EXECUTING，END_TIME取值为NULL，
			// Spring Batch框架认为JobExecution的END_TIME为NULL的作业仍在进行中，因此需先使用STOP方法将其停止。具体如下：
			boolean isStoped = jobOperator.stop(jobExecutionId);
			if (isStoped) {
				// 当对JobExecution执行stop操作后，其END_TIME取值仍然为NULL，继而使用abandon将其放弃，如此则END_TIME取值为abandon放弃操作的时间。
				// 此时Spring Batch框架认为JobExecution已经结束（因为END_TIME不再为NULL）.
				// Tells Spring Batch to abandon a previously stopped execution
				jobOperator.abandon(jobExecutionId);
				// 虽然可以不通过abandon方法，直接通过自己的DAO类修改END_TIME字段，但个人建议使用接口操作。例如：
				// JobExecutionSearch jobExecutionSearch = new JobExecutionSearch();
				// jobExecutionSearch.setJobExecutionId(jobExecutionId);
				// jobFacade.updateJobExecutionEndTime(jobExecutionSearch);
				return  "正在中断作业执行,请稍后重新查询......";
			} else {
				return  "中断作业执行失败，请重试！";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "";
	}

}
