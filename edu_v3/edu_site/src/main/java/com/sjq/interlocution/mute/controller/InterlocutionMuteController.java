package com.sjq.interlocution.mute.controller;

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
import com.sjq.mute.service.InterlocutionMuteService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.mute.bean.InterlocutionMuteBean;
import com.sjq.mute.search.InterlocutionMuteSearch;
import com.sjq.mute.vo.InterlocutionMuteVo;

/**
 * [自动生成]禁言信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/interlocution/mute")
public class InterlocutionMuteController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="mute/";
	
	// 禁言信息页面 
	private static final String PAGE = "muteList";
	
	// 禁言信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存禁言信息信息";
	private static final String OPERA_LOG_UPDATE = "更新禁言信息信息";
	private static final String OPERA_LOG_DELETE = "删除禁言信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除禁言信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(InterlocutionMuteController.class);
	
	@Autowired
	private InterlocutionMuteService interlocutionMuteService;
	
				
	/**
	 * 查询所有的禁言信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/ajaxlist")
	@ResponseBody
	public PageBean ajaxQueryInterlocutionMuteAll(InterlocutionMuteSearch search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("禁言信息");
		PageBean pageBean = this.interlocutionMuteService.queryInterlocutionMutePage(pb,new InterlocutionMuteSearch());
		return pageBean;
	    
	}
				
	/**
	 * 根据ID查询禁言信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public InterlocutionMuteVo ajaxQueryInterlocutionMuteById(InterlocutionMuteSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("禁言信息");
		return this.interlocutionMuteService.queryInterlocutionMuteById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有禁言信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<InterlocutionMuteVo> ajaxQueryInterlocutionMuteBySearch(InterlocutionMuteSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("禁言信息");
		return this.interlocutionMuteService.queryInterlocutionMuteBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询禁言信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryInterlocutionMutePage(PageBean pb,InterlocutionMuteSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("禁言信息");
		return this.interlocutionMuteService.queryInterlocutionMutePage(pb, search);
	    
	}
				
				
	/**
	 * (同步)根据条件查询所有的禁言信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllInterlocutionMute(HttpServletRequest request, HttpServletResponse response, PageBean pb, InterlocutionMuteSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的禁言信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.interlocutionMuteService.queryInterlocutionMutePage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
				
	/**
	 * (同步）增加信息禁言信息
	 * @param vo 禁言信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveInterlocutionMute(@Valid InterlocutionMuteBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息禁言信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.interlocutionMuteService.insertInterlocutionMute(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	    
}