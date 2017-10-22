package com.sjq.job.controller;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.sjq.job.bean.JobSchedulerConfig;
import com.sjq.job.search.JobSchedulerConfigSearch;
import com.sjq.job.service.JobSchedulerConfigService;
import com.sjq.security.bean.SecurityUser;
import com.sjq.security.controller.SecurityUserController;
import com.sjq.security.search.SecurityUserSearch;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.util.MyLogger;
import com.sjq.util.PageBean;

@Controller
@RequestMapping(value = "/job/scheduler")
public class JobSchedulerConfigController {
	
	
   /** ftl跳转目录  **/
	private static final String PAGE_FOLDER="job/";
	
	/** 调度配置页面 **/
	private static final String PAGE = "job_scheduler_config";
	
	/** 调度配置访问地址 **/
	private static final String PAGE_HTM = "list.htm";
	
	/** 日志信息  **/
	private static final String OPERA_LOG_INSERT = "保存调度配置信息";
	private static final String OPERA_LOG_UPDATE = "更新调度配置信息";
	private static final String OPERA_LOG_DELETE = "删除调度配置信息";
	private static final String OPERA_LOG_BATCH_DELETE = "指删除调度配置信息";
	
	/** 记录日志对象 */
    private static final MyLogger LOGGER = new MyLogger(SecurityUserController.class);
    
    
    @Autowired
    private JobSchedulerConfigService jobSchedulerConfigService;
	
    
	/**
	 * 分页查询调度配置列表信息，跳转到该页面
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView findPageUserList(HttpServletRequest request, HttpServletResponse response, PageBean pb,JobSchedulerConfigSearch search) {
		
		LOGGER.info("跳转到调度配置界面...");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("startType", search.getStartType());
		map.put("schedulerName", search.getSchedulerName());
		
		PageBean pageBean = this.jobSchedulerConfigService.queryPage(pb, map);
		
		mav.addObject("pb", pageBean);
		
		return mav;
		
	}
	
	
	/**
	 * 保存用户信息
	 * @param bean 用户管理信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ModelAndView saveSchedulerConfig(@Valid JobSchedulerConfig bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("保存调度配置信息...");
		
		bean.setCreateTime(new Date());
		
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateUser(cu.getUsername());
		
		int result = this.jobSchedulerConfigService.insertSchedulerConfig(bean);
		
        return new ModelAndView(new RedirectView(PAGE_HTM));
		
	}

}
