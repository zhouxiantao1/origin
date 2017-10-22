package com.sjq.log;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sjq.security.search.SecurityOperationLogSearch;
import com.sjq.security.service.SecurityOperationLogService;
import com.sjq.util.MyLogger;
import com.sjq.util.PageBean;

/**
 * [自动生成]系统日志操作控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author  ShuiJingQiu
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/log")
public class LogController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="log/";
	
	// 系统日志操作页面 
	private static final String OPERATATION_PAGE = "log_operation";
	
	// 系统日志操作访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(LogController.class);
	
	@Autowired
	private SecurityOperationLogService securityOperationLogService;
	
	
	/**
	 * (同步)根据条件查询所有的系统日志操作
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/operation/list", method = RequestMethod.GET)
	public ModelAndView queryAllSecurityOperationLog(HttpServletRequest request, HttpServletResponse response, PageBean pb, SecurityOperationLogSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的系统日志操作");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + OPERATATION_PAGE);
		
		PageBean pageBean = this.securityOperationLogService.querySecurityOperationLogPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
				
	    
}