package com.sjq.job.listener;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

import com.sjq.job.bean.JobSchedulerConfig;
import com.sjq.job.bean.JobTriggerConfig;
import com.sjq.job.enums.QuartzStartTypeEnum;
import com.sjq.job.manager.QuartzManager;
import com.sjq.job.service.JobSchedulerConfigService;
import com.sjq.job.service.JobTriggerConfigService;
import com.sjq.job.utils.SpringApplicationContextUtils;

/**
 * 
 * 作业调度启动器
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午3:28:57
 * @version 1.0
 */
public class QuartzServletContextListener implements ServletContextListener {

	private static Log logger = LogFactory.getLog(QuartzServletContextListener.class);

	public QuartzServletContextListener() {

	}

	/**
	 * Called when the container is first started.
	 * 
	 */
	public void contextInitialized(ServletContextEvent event) {
		
		System.out.println("初始化调度任务...");

		try {
			StdSchedulerFactory factory = QuartzManager.getDefaultSchedulerFactory();

			JobSchedulerConfigService jobShedulerConfigService = (JobSchedulerConfigService) SpringApplicationContextUtils.getApplicationContext().getBean(
					JobSchedulerConfigService.class);
			
			JobTriggerConfigService jobTriggerConfigService = (JobTriggerConfigService) SpringApplicationContextUtils.getApplicationContext().getBean(
					JobTriggerConfigService.class);
			
			Map<String,Object> map  = new HashMap<String,Object>();
			map.put("startType", "0");   //默认加载启动
			List<JobSchedulerConfig> schedulerList = jobShedulerConfigService.findListSchedulerConfig(map);
			
			if(schedulerList != null){
				for (JobSchedulerConfig model : schedulerList) {
					Properties props = new Properties();
					// 注意:props只接受字符串变量，数字变量需要转为字符串(+"")，否则会导致启动失败
					props.put("org.quartz.scheduler.instanceName", model.getSchedulerName());
					props.put("org.quartz.scheduler.rmi.export", model.getRmiExport());
					props.put("org.quartz.scheduler.rmi.proxy", model.getRmiProxy());
					props.put("org.quartz.threadPool.class", model.getThreadPoolClass());
					props.put("org.quartz.scheduler.wrapJobExecutionInUserTransaction", model.getWrapInUserTransaction());
					props.put("org.quartz.threadPool.threadCount", model.getThreadCount() + "");//
					props.put("org.quartz.threadPool.threadPriority", model.getThreadPriority() + "");//
					props.put("org.quartz.threadPool.threadsInheritContextClassLoaderOfInitializingThread",
							model.getInheritContextClassLoader());
					props.put("org.quartz.jobStore.misfireThreshold", model.getJobStoreMisfireThreshold() + "");//
					props.put("org.quartz.jobStore.class", model.getJobStoreClass());
	
					factory.initialize(props);
					Scheduler scheduler = factory.getScheduler();
					scheduler.start();
					QuartzManager.putScheduler(scheduler.getSchedulerName(), scheduler);
				}
			}

			Collection<Scheduler> schedulers = factory.getAllSchedulers();
			Map<String,Object> triggerMap = null;
			if(schedulers != null){
				for (Scheduler scheduler : schedulers) {
					
					System.out.println(scheduler.getMetaData().getSummary());
					
					triggerMap = new HashMap<String,Object>();
					triggerMap.put("triggerType", "0");
					
					List<JobTriggerConfig> toLoadTriggerList = jobTriggerConfigService.findListTriggerConfig(map);
					for (JobTriggerConfig trigger : toLoadTriggerList) {
						QuartzManager.scheduleJob(trigger);
					}
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Quartz failed to initialize " + ex.getMessage());
		}
	}

	/**
	 * Called when the container is shutting down.
	 * 
	 */
	public void contextDestroyed(ServletContextEvent event) {
		try {
			StdSchedulerFactory factory = QuartzManager.getDefaultSchedulerFactory();
			Collection<Scheduler> schedulerList = factory.getAllSchedulers();
			for (Scheduler scheduler : schedulerList) {
				if (!scheduler.isShutdown()) {
					scheduler.shutdown(true);
				}
			}
			System.out.println("Quartz Sheduler stopping ...... " + new Date());
		} catch (SchedulerException ex) {
			System.out.println("Error stopping Quartz " + ex.getMessage());
			
			
		}
	}

}
