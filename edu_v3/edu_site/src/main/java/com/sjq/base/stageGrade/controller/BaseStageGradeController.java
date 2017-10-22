package com.sjq.base.stageGrade.controller;

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
import com.sjq.stageGrade.service.BaseStageGradeService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.stageGrade.bean.BaseStageGradeBean;
import com.sjq.stageGrade.search.BaseStageGradeSearch;
import com.sjq.stageGrade.vo.BaseStageGradeVo;

/**
 * [自动生成]学段年级信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/stageGrade")
public class BaseStageGradeController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="stageGrade/";
	
	// 学段年级信息页面 
	private static final String PAGE = "stageGradeList";
	
	// 学段年级信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存学段年级信息信息";
	private static final String OPERA_LOG_UPDATE = "更新学段年级信息信息";
	private static final String OPERA_LOG_DELETE = "删除学段年级信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除学段年级信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseStageGradeController.class);
	
	@Autowired
	private BaseStageGradeService baseStageGradeService;
	
	/**
	 * 根据条件查询所有学段年级信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseStageGradeVo> ajaxQueryBaseStageGradeBySearch(BaseStageGradeSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("学段年级信息");
		return this.baseStageGradeService.queryBaseStageGradeBySearch(search);
	    
	}
				
				
	/**
	 * (同步）增加信息学段年级信息
	 * @param vo 学段年级信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveBaseStageGrade(@Valid BaseStageGradeBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息学段年级信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.baseStageGradeService.insertBaseStageGrade(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	    
}