package com.sjq.base.stageSubject.controller;

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
import com.sjq.stageSubject.service.BaseStageSubjectService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.stageSubject.bean.BaseStageSubjectBean;
import com.sjq.stageSubject.search.BaseStageSubjectSearch;
import com.sjq.stageSubject.vo.BaseStageSubjectVo;

/**
 * [自动生成]学段学科信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/stageSubject")
public class BaseStageSubjectController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="stageSubject/";
	
	// 学段学科信息页面 
	private static final String PAGE = "stageSubjectList";
	
	// 学段学科信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存学段学科信息信息";
	private static final String OPERA_LOG_UPDATE = "更新学段学科信息信息";
	private static final String OPERA_LOG_DELETE = "删除学段学科信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除学段学科信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseStageSubjectController.class);
	
	@Autowired
	private BaseStageSubjectService baseStageSubjectService;
	
				
	/**
	 * 根据条件查询所有学段学科信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseStageSubjectVo> ajaxQueryBaseStageSubjectBySearch(BaseStageSubjectSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("学段学科信息");
		return this.baseStageSubjectService.queryBaseStageSubjectBySearch(search);
	    
	}
	
	/**
	 * (同步)根据条件查询所有的学段学科信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllBaseStageSubject(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseStageSubjectSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的学段学科信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.baseStageSubjectService.queryBaseStageSubjectPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
   
}