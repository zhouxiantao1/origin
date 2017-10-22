package com.sjq.base.teacherHistory.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.sjq.teacherHistory.service.BaseTeacherHistoryService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.teacherHistory.bean.BaseTeacherHistoryBean;
import com.sjq.teacherHistory.search.BaseTeacherHistorySearch;
import com.sjq.teacherHistory.vo.BaseTeacherHistoryVo;

/**
 * [自动生成]教师任教历史信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/teacherHistory")
public class BaseTeacherHistoryController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="base/teacherHistory/";
	
	// 教师任教历史信息页面 
	private static final String PAGE = "teacherHistoryList";
	
	// 教师任教历史信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存教师任教历史信息信息";
	private static final String OPERA_LOG_UPDATE = "更新教师任教历史信息信息";
	private static final String OPERA_LOG_DELETE = "删除教师任教历史信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除教师任教历史信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseTeacherHistoryController.class);
	
	@Autowired
	private BaseTeacherHistoryService baseTeacherHistoryService;
	
				
	/**
	 * 根据ID查询教师任教历史信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseTeacherHistoryVo ajaxQueryBaseTeacherHistoryById(BaseTeacherHistorySearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("教师任教历史信息");
		return this.baseTeacherHistoryService.queryBaseTeacherHistoryById(search.getId());
	    
	}
	
	
				
	/**
	 * 根据条件查询所有教师任教历史信息信息
	 * @param search 
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseTeacherHistoryVo> ajaxQueryBaseTeacherHistoryBySearch(BaseTeacherHistorySearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("教师任教历史信息");
		return this.baseTeacherHistoryService.queryBaseTeacherHistoryBySearch(search);
	    
	}
						
	/**
	 * (同步）增加信息教师任教历史信息
	 * @param vo 教师任教历史信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveBaseTeacherHistory(@Valid BaseTeacherHistoryBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息教师任教历史信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.baseTeacherHistoryService.insertBaseTeacherHistory(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	    
}