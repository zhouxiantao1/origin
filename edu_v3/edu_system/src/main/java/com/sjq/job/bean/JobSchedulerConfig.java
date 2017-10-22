package com.sjq.job.bean;

import com.sjq.security.bean.BaseBean;

/**
 * 
 * QUARTZ调度器配置
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午4:09:52
 * @version 1.0
 */
public class JobSchedulerConfig   extends BaseBean{

	// 启动类型
	// LOADED.加载即启动
	// MANUAL.手工启动
	private String startType;

	// 调度器备注
	private String schedulerNote;

	/****************************************以下属性参考QUARTZ配置文件追*********************************************/
	// preference the quartz.jar -> org.quartz.quartz.properties file desc:
	// # Default Properties file for use by StdSchedulerFactory
	// # to create a Quartz Scheduler Instance, if a different
	// # properties file is not explicitly specified.
	// #

	// org.quartz.scheduler.instanceName: DefaultQuartzScheduler
	// org.quartz.scheduler.rmi.export: false
	// org.quartz.scheduler.rmi.proxy: false
	// org.quartz.scheduler.wrapJobExecutionInUserTransaction: false
	//
	// org.quartz.threadPool.class: org.quartz.simpl.SimpleThreadPool
	// org.quartz.threadPool.threadCount: 10
	// org.quartz.threadPool.threadPriority: 5
	// org.quartz.threadPool.threadsInheritContextClassLoaderOfInitializingThread: true
	//
	// org.quartz.jobStore.misfireThreshold: 60000
	//
	// org.quartz.jobStore.class: org.quartz.simpl.RAMJobStore

	// org.quartz.scheduler.instanceName
	// DefaultQuartzScheduler
	private String schedulerName;

	// org.quartz.scheduler.rmi.export
	// false
	private String rmiExport;

	// org.quartz.scheduler.rmi.proxy
	// false
	private String rmiProxy;

	// org.quartz.scheduler.wrapJobExecutionInUserTransaction
	// false
	private String wrapInUserTransaction;

	// org.quartz.threadPool.class
	// org.quartz.simpl.SimpleThreadPool
	private String threadPoolClass;

	// org.quartz.threadPool.threadCount
	// 10
	private Integer threadCount;

	// org.quartz.threadPool.threadPriority
	// 5
	private Integer threadPriority;

	// org.quartz.threadPool.threadsInheritContextClassLoaderOfInitializingThread
	// true
	private String inheritContextClassLoader;

	// org.quartz.jobStore.misfireThreshold
	// 60000
	private Long jobStoreMisfireThreshold;

	// org.quartz.jobStore.class
	// org.quartz.simpl.RAMJobStore
	private String jobStoreClass;

	public String getStartType() {
		return startType;
	}

	public void setStartType(String startType) {
		this.startType = startType;
	}

	public String getSchedulerNote() {
		return schedulerNote;
	}

	public void setSchedulerNote(String schedulerNote) {
		this.schedulerNote = schedulerNote;
	}

	public String getSchedulerName() {
		return schedulerName;
	}

	public void setSchedulerName(String schedulerName) {
		this.schedulerName = schedulerName;
	}

	public String getRmiExport() {
		return rmiExport;
	}

	public void setRmiExport(String rmiExport) {
		this.rmiExport = rmiExport;
	}

	public String getRmiProxy() {
		return rmiProxy;
	}

	public void setRmiProxy(String rmiProxy) {
		this.rmiProxy = rmiProxy;
	}

	public String getWrapInUserTransaction() {
		return wrapInUserTransaction;
	}

	public void setWrapInUserTransaction(String wrapInUserTransaction) {
		this.wrapInUserTransaction = wrapInUserTransaction;
	}

	public String getThreadPoolClass() {
		return threadPoolClass;
	}

	public void setThreadPoolClass(String threadPoolClass) {
		this.threadPoolClass = threadPoolClass;
	}

	public Integer getThreadCount() {
		return threadCount;
	}

	public void setThreadCount(Integer threadCount) {
		this.threadCount = threadCount;
	}

	public Integer getThreadPriority() {
		return threadPriority;
	}

	public void setThreadPriority(Integer threadPriority) {
		this.threadPriority = threadPriority;
	}

	public Long getJobStoreMisfireThreshold() {
		return jobStoreMisfireThreshold;
	}

	public void setJobStoreMisfireThreshold(Long jobStoreMisfireThreshold) {
		this.jobStoreMisfireThreshold = jobStoreMisfireThreshold;
	}

	public String getJobStoreClass() {
		return jobStoreClass;
	}

	public void setJobStoreClass(String jobStoreClass) {
		this.jobStoreClass = jobStoreClass;
	}

	public String getInheritContextClassLoader() {
		return inheritContextClassLoader;
	}

	public void setInheritContextClassLoader(String inheritContextClassLoader) {
		this.inheritContextClassLoader = inheritContextClassLoader;
	}

}
