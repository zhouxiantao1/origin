package com.sjq.evaluate.selection.controller;

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
import com.sjq.selection.service.EvaluateSelectionService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.selection.bean.EvaluateSelectionBean;
import com.sjq.selection.search.EvaluateSelectionSearch;
import com.sjq.selection.vo.EvaluateSelectionVo;

/**
 * [自动生成]选项信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/evaluate/selection")
public class EvaluateSelectionController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="selection/";
	
	// 选项信息页面 
	private static final String PAGE = "selectionList";
	
	// 选项信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存选项信息信息";
	private static final String OPERA_LOG_UPDATE = "更新选项信息信息";
	private static final String OPERA_LOG_DELETE = "删除选项信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除选项信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(EvaluateSelectionController.class);
	
	@Autowired
	private EvaluateSelectionService evaluateSelectionService;
	
				
	/**
	 * 查询所有的选项信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/ajaxlist")
	@ResponseBody
	public PageBean ajaxQueryEvaluateSelectionAll(EvaluateSelectionSearch search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("选项信息");
		PageBean pageBean = this.evaluateSelectionService.queryEvaluateSelectionPage(pb,new EvaluateSelectionSearch());
		return pageBean;
	    
	}
				
	/**
	 * 根据ID查询选项信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public EvaluateSelectionVo ajaxQueryEvaluateSelectionById(EvaluateSelectionSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("选项信息");
		return this.evaluateSelectionService.queryEvaluateSelectionById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有选项信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<EvaluateSelectionVo> ajaxQueryEvaluateSelectionBySearch(EvaluateSelectionSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("选项信息");
		return this.evaluateSelectionService.queryEvaluateSelectionBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询选项信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryEvaluateSelectionPage(PageBean pb,EvaluateSelectionSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("选项信息");
		return this.evaluateSelectionService.queryEvaluateSelectionPage(pb, search);
	    
	}
				
				
	/**
	 * (删除)根据条件删除选项信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch/delete")
	@ResponseBody
	public int ajaxDeleteEvaluateSelectionBySearch(EvaluateSelectionBean bean,EvaluateSelectionSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("选项信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.evaluateSelectionService.deleteEvaluateSelectionBySearch(bean,search);
	    
	}
	
				
	/**
	 * (增加)增加信息选项信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertEvaluateSelection(EvaluateSelectionBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("选项信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
//		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		return this.evaluateSelectionService.insertEvaluateSelection(bean);
	    
	}
			
				
	/**
	 * (同步)根据条件查询所有的选项信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllEvaluateSelection(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateSelectionSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的选项信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.evaluateSelectionService.queryEvaluateSelectionPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
				
	/**
	 * (同步）增加信息选项信息
	 * @param vo 选项信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEvaluateSelection(@Valid EvaluateSelectionBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息选项信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.evaluateSelectionService.insertEvaluateSelection(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	    
}