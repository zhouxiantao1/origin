package com.sjq.base.studentHistory.controller;

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
import com.sjq.studentHistory.service.BaseStudentHistoryService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.studentHistory.bean.BaseStudentHistoryBean;
import com.sjq.studentHistory.search.BaseStudentHistorySearch;
import com.sjq.studentHistory.vo.BaseStudentHistoryVo;

/**
 * [自动生成]学生历史信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/studentHistory")
public class BaseStudentHistoryController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="studentHistory/";
	
	// 学生历史信息页面 
	private static final String PAGE = "studentHistoryList";
	
	// 学生历史信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存学生历史信息信息";
	private static final String OPERA_LOG_UPDATE = "更新学生历史信息信息";
	private static final String OPERA_LOG_DELETE = "删除学生历史信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除学生历史信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseStudentHistoryController.class);
	
	@Autowired
	private BaseStudentHistoryService baseStudentHistoryService;
	
				
	/**
	 * 根据条件查询所有学生历史信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseStudentHistoryVo> ajaxQueryBaseStudentHistoryBySearch(BaseStudentHistorySearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("学生历史信息");
		return this.baseStudentHistoryService.queryBaseStudentHistoryBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询学生历史信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryBaseStudentHistoryPage(PageBean pb,BaseStudentHistorySearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("学生历史信息");
		return this.baseStudentHistoryService.queryBaseStudentHistoryPage(pb, search);
	    
	}
				
				
	/**
	 * (增加)增加信息学生历史信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertBaseStudentHistory(BaseStudentHistoryBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("学生历史信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.baseStudentHistoryService.insertBaseStudentHistory(bean);
	    
	}
			
				
	/**
	 * (同步）增加信息学生历史信息
	 * @param vo 学生历史信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveBaseStudentHistory(@Valid BaseStudentHistoryBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息学生历史信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.baseStudentHistoryService.insertBaseStudentHistory(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	    
}