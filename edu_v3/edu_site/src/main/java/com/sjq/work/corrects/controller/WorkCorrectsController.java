package com.sjq.work.corrects.controller;

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
import com.sjq.corrects.service.WorkCorrectsService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.corrects.bean.WorkCorrectsBean;
import com.sjq.corrects.search.WorkCorrectsSearch;
import com.sjq.corrects.vo.WorkCorrectsVo;

/**
 * [自动生成]批改信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/work/corrects")
public class WorkCorrectsController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="corrects/";
	
	// 批改信息页面 
	private static final String PAGE = "correctsList";
	
	// 批改信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存批改信息信息";
	private static final String OPERA_LOG_UPDATE = "更新批改信息信息";
	private static final String OPERA_LOG_DELETE = "删除批改信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除批改信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(WorkCorrectsController.class);
	
	@Autowired
	private WorkCorrectsService workCorrectsService;
	
				
	/**
	 * 查询所有的批改信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/ajaxlist")
	@ResponseBody
	public PageBean ajaxQueryWorkCorrectsAll(WorkCorrectsSearch search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("批改信息");
		PageBean pageBean = this.workCorrectsService.queryWorkCorrectsPage(pb,new WorkCorrectsSearch());
		return pageBean;
	    
	}
				
	/**
	 * 根据ID查询批改信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public WorkCorrectsVo ajaxQueryWorkCorrectsById(WorkCorrectsSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("批改信息");
		return this.workCorrectsService.queryWorkCorrectsById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有批改信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<WorkCorrectsVo> ajaxQueryWorkCorrectsBySearch(WorkCorrectsSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("批改信息");
		return this.workCorrectsService.queryWorkCorrectsBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询批改信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryWorkCorrectsPage(PageBean pb,WorkCorrectsSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("批改信息");
		return this.workCorrectsService.queryWorkCorrectsPage(pb, search);
	    
	}
				
				
	/**
	 * (删除)根据ID删除批改信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/delete")
	@ResponseBody
	public int ajaxDeleteWorkCorrectsById(WorkCorrectsBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("批改信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.workCorrectsService.deleteWorkCorrectsById(bean);
	    
	}
	
				
	/**
	 * (同步)根据条件查询所有的批改信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllWorkCorrects(HttpServletRequest request, HttpServletResponse response, PageBean pb, WorkCorrectsSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的批改信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.workCorrectsService.queryWorkCorrectsPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
				
	/**
	 * (同步）增加信息批改信息
	 * @param vo 批改信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveWorkCorrects(@Valid WorkCorrectsBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息批改信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.workCorrectsService.insertWorkCorrects(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	    
}