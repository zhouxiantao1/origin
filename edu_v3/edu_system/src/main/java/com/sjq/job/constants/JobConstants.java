package com.sjq.job.constants;


/**
 * 
 * 作业调度常量
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午2:06:55
 * @version 1.0
 */
public class JobConstants {

	public static final String QUARTZ_FACTORY_KEY = "stdSchedulerFactory";

	public static final String QUARTZ_SCHEDULER_KEY = "schedulerName";

	public static final String QUARTZ_JOB_KEY = "jobName";

	public static final String QUARTZ_GROUP_KEY = "groupName";

	public static final String QUARTZ_TRIGGER_KEY = "triggerName";

	public static final String QUARTZ_CRON_EXPRESSION_KEY = "cronExpression";

	public static final String SPRING_BATCH_JOB_KEY = "springBatchJobId";

	public static final String TRIGGER_JOB_NOTE = "jobTriggerNote";

	public static final String TRIGGER_JOB_SOURCE = "jobTriggerSource";

	public static final String TRIGGER_JOB_DATE = "date";

	public static final String JOB_EXECUTION_ID = "jobExecutionId";

	public static final String JOB_RESULT = "JOB_RESULT";

	// 本地操作成功个数
	public static final String COUNT_TOTAL_RECORD = "totalRecordCount";

	// 本地操作成功个数
	public static final String COUNT_LOCAL_SUCCESS = "localSuccessCount";

	// 本地操作失败个数
	public static final String COUNT_LOCAL_FAILED = "localFailedCount";

	// 门户操作成功个数
	public static final String COUNT_PORTAL_SUCCESS = "portalSuccessCount";

	// 门户操作失败个数
	public static final String COUNT_PORTAL_FAILED = "portalFailedCount";

}
