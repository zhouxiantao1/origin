package com.sjq.base.questionRelated.controller;

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
import com.sjq.questionRelated.service.BaseQuestionRelatedService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.questionRelated.bean.BaseQuestionRelatedBean;
import com.sjq.questionRelated.search.BaseQuestionRelatedSearch;
import com.sjq.questionRelated.vo.BaseQuestionRelatedVo;

/**
 * [自动生成]题目知识点目录信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/questionRelated")
public class BaseQuestionRelatedController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="questionRelated/";
	
	// 题目知识点目录信息页面 
	private static final String PAGE = "questionRelatedList";
	
	// 题目知识点目录信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存题目知识点目录信息信息";
	private static final String OPERA_LOG_UPDATE = "更新题目知识点目录信息信息";
	private static final String OPERA_LOG_DELETE = "删除题目知识点目录信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除题目知识点目录信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseQuestionRelatedController.class);
	
	@Autowired
	private BaseQuestionRelatedService baseQuestionRelatedService;
	
				
	/**
	 * 根据ID查询题目知识点目录信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseQuestionRelatedVo ajaxQueryBaseQuestionRelatedById(BaseQuestionRelatedSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题目知识点目录信息");
		return this.baseQuestionRelatedService.queryBaseQuestionRelatedById(search.getId());
	    
	}
	
	/**
	 * 根据IDS查询所有题目知识点目录信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyids")
	@ResponseBody
	public List ajaxQueryBaseQuestionRelatedByIds(Long[] ids,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题目知识点目录信息");
		return this.baseQuestionRelatedService.queryBaseQuestionRelatedByIds(ids);
	    
	}
				
	/**
	 * 根据条件查询所有题目知识点目录信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseQuestionRelatedVo> ajaxQueryBaseQuestionRelatedBySearch(BaseQuestionRelatedSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题目知识点目录信息");
		return this.baseQuestionRelatedService.queryBaseQuestionRelatedBySearch(search);
	    
	}
	
	/**
	 * 分页查询题目知识点目录信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryBaseQuestionRelatedPage(PageBean pb,BaseQuestionRelatedSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题目知识点目录信息");
		return this.baseQuestionRelatedService.queryBaseQuestionRelatedPage(pb, search);
	    
	}
	    
}