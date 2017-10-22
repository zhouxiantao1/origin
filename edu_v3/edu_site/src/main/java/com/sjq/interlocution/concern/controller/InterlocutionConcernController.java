package com.sjq.interlocution.concern.controller;

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
import com.sjq.concern.service.InterlocutionConcernService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.security.util.CustomUser;
import com.sjq.concern.bean.InterlocutionConcernBean;
import com.sjq.concern.search.InterlocutionConcernSearch;
import com.sjq.concern.vo.InterlocutionConcernVo;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;

/**
 * [自动生成]关注信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/interlocution/concern")
public class InterlocutionConcernController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="interlocution/";
	
	// 关注信息页面 
	private static final String PAGE = "concern_list";
	
	// 关注信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存关注信息信息";
	private static final String OPERA_LOG_UPDATE = "更新关注信息信息";
	private static final String OPERA_LOG_DELETE = "删除关注信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除关注信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(InterlocutionConcernController.class);
	
	@Autowired
	private InterlocutionConcernService interlocutionConcernService;
	@Autowired
	private BaseGradeService baseGradeService;
	@Autowired
	private BaseSubjectService baseSubjectService;
	
				
	/**
	 * 查询所有的关注信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/ajaxlist")
	@ResponseBody
	public PageBean ajaxQueryInterlocutionConcernAll(InterlocutionConcernSearch search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("关注信息");
		PageBean pageBean = this.interlocutionConcernService.queryInterlocutionConcernPage(pb,new InterlocutionConcernSearch());
		return pageBean;
	    
	}
				
	/**
	 * 根据ID查询关注信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public InterlocutionConcernVo ajaxQueryInterlocutionConcernById(InterlocutionConcernSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("关注信息");
		return this.interlocutionConcernService.queryInterlocutionConcernById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有关注信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<InterlocutionConcernVo> ajaxQueryInterlocutionConcernBySearch(InterlocutionConcernSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("关注信息");
		return this.interlocutionConcernService.queryInterlocutionConcernBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询关注信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryInterlocutionConcernPage(PageBean pb,InterlocutionConcernSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("关注信息");
		return this.interlocutionConcernService.queryInterlocutionConcernPage(pb, search);
	    
	}
				
				
	/**
	 * (更新)根据条件更新所有关注信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch/update")
	@ResponseBody
	public int ajaxUpdateInterlocutionConcernBySearch(InterlocutionConcernBean bean,InterlocutionConcernSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("关注信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.interlocutionConcernService.updateInterlocutionConcernBySearch(bean,search);
	    
	}
	
	/**
	 * (增加)增加信息关注信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertInterlocutionConcern(InterlocutionConcernBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("关注信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
//		bean.setCreateName("zhouxiaotao");
		bean.setUserId(cu.getUserId());
		bean.setCreateTime(new Date());
		return this.interlocutionConcernService.insertInterlocutionConcern(bean);
	    
	}
	
				
	/**
	 * (同步)根据条件查询所有的关注信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllInterlocutionConcern(HttpServletRequest request, HttpServletResponse response, PageBean pb, InterlocutionConcernSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的关注信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		search.setUserId(cu.getUserId());
		search.setType("1");
		PageBean pageBean = this.interlocutionConcernService.queryInterlocutionConcernPage(pb,search);
		
		//查询所有年级
		List<BaseGradeVo>  baseGradeVoList = baseGradeService.queryAllBaseGrade();
				
		//查询所有的学科信息
		List<BaseSubjectVo> baseSubjectVoList = baseSubjectService.queryAllBaseSubject();
		
		mav.addObject("pageBean", pageBean);
		mav.addObject("search", search);
		mav.addObject("baseGradeVoList", baseGradeVoList);
		mav.addObject("baseSubjectVoList", baseSubjectVoList);
		
		return mav;
		
	}
				
	/**
	 * (同步）增加信息关注信息
	 * @param vo 关注信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveInterlocutionConcern(@Valid InterlocutionConcernBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息关注信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.interlocutionConcernService.insertInterlocutionConcern(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	
	/**
	 * (删除)根据条件删除关注信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch/delete")
	@ResponseBody
	public int ajaxDeleteInterlocutionConcernBySearch(InterlocutionConcernBean bean,InterlocutionConcernSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("关注信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
//		bean.setModName("zhouxiaotao");
		bean.setModName(cu.getUsername());
		bean.setModTime(new Date());
		search.setUserId(cu.getUserId());
		return this.interlocutionConcernService.deleteInterlocutionConcernBySearch(bean,search);
	    
	}
	    
}