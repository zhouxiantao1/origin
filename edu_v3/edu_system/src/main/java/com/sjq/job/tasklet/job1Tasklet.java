package com.sjq.job.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;

import com.sjq.job.constants.JobConstants;
import com.sjq.job.exception.JobException;

/**
 * 
 * 纯属为了测试用的...
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午4:23:06
 * @version 1.0
 */
public class job1Tasklet  implements Tasklet{

	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) {
		
		System.out.println("执行job1");
		
		// 一个容器，用于执行时需要保存的用户数据
		ExecutionContext jec = chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext();
		
		jec.put("job1", "job1");
		jec.put("job2", "job2");
		
		//测试异常
//		try {
//			int i = 1/0;
//		} catch (Exception e) {
//			JobException exception = new JobException(chunkContext.getStepContext().getStepExecution().getStepName(),
//					e.getMessage());
//			jec.put(JobConstants.JOB_RESULT, exception);
//			e.printStackTrace();
//		}
		
		return RepeatStatus.FINISHED;
	}

}
