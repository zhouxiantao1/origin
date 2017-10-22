package com.sjq.base.subject.controller;

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
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.subject.bean.BaseSubjectBean;
import com.sjq.subject.search.BaseSubjectSearch;
import com.sjq.subject.vo.BaseSubjectVo;

/**
 * [自动生成]基础模块-学科信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/subject")
public class BaseSubjectController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/base/";
	
	// 基础模块-学科信息页面 
	private static final String PAGE = "base_subject";
	private static final String CREATE = "base_subject_create";
	
	// 基础模块-学科信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存基础模块-学科信息信息";
	private static final String OPERA_LOG_UPDATE = "更新基础模块-学科信息信息";
	private static final String OPERA_LOG_DELETE = "删除基础模块-学科信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除基础模块-学科信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseSubjectController.class);
	
	@Autowired
	private BaseSubjectService baseSubjectService;
	
	/**
	 * (同步)根据条件查询所有的基础模块-学科信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllBaseSubject(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseSubjectSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-学科信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.baseSubjectService.queryBaseSubjectPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	
	/**
	 * (同步)根据条件查询所有的基础模块-学科信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createBaseSubject(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseSubjectSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-学科信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CREATE);
		
//		PageBean pageBean = this.baseSubjectService.queryBaseSubjectPage(pb,search);
//		
//		mav.addObject("pb", pageBean);
//		mav.addObject("search", search);
		
		return mav;
		
	}
	
	/**
	 * 查询所有的基础模块-学科信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbystageid")
	@ResponseBody
	public List<BaseSubjectVo> queryBaseSubjectByStageId(BaseSubjectSearch search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-学科信息");
		return this.baseSubjectService.queryBaseSubjectByStageId(search.getStageId());
	    
	}
				
				
	/**
	 * 根据ID查询基础模块-学科信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseSubjectVo ajaxQueryBaseSubjectById(BaseSubjectSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-学科信息");
		return this.baseSubjectService.queryBaseSubjectById(search.getId());
	    
	}
	
				
			
				
	/**
	 * 根据条件查询所有基础模块-学科信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseSubjectVo> ajaxQueryBaseSubjectBySearch(BaseSubjectSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-学科信息");
		return this.baseSubjectService.queryBaseSubjectBySearch(search);
	    
	}
			
	/**
	 * (增加)增加信息基础模块-学科信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertBaseSubject(BaseSubjectBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-学科信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.baseSubjectService.insertBaseSubject(bean);
	    
	}   
}