package com.sjq.evaluate.evaDetailPaper.controller;

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
import com.sjq.evaDetailPaper.service.EvaluateEvaDetailPaperService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.evaDetailPaper.bean.EvaluateEvaDetailPaperBean;
import com.sjq.evaDetailPaper.search.EvaluateEvaDetailPaperSearch;
import com.sjq.evaDetailPaper.vo.EvaluateEvaDetailPaperVo;

/**
 * [自动生成]测评明细问卷信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/evaluate/evaDetailPaper")
public class EvaluateEvaDetailPaperController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="evaDetailPaper/";
	
	// 测评明细问卷信息页面 
	private static final String PAGE = "evaDetailPaperList";
	
	// 测评明细问卷信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存测评明细问卷信息信息";
	private static final String OPERA_LOG_UPDATE = "更新测评明细问卷信息信息";
	private static final String OPERA_LOG_DELETE = "删除测评明细问卷信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除测评明细问卷信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(EvaluateEvaDetailPaperController.class);
	
	@Autowired
	private EvaluateEvaDetailPaperService evaluateEvaDetailPaperService;
	
				
	/**
	 * 查询所有的测评明细问卷信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/ajaxlist")
	@ResponseBody
	public PageBean ajaxQueryEvaluateEvaDetailPaperAll(EvaluateEvaDetailPaperSearch search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评明细问卷信息");
		PageBean pageBean = this.evaluateEvaDetailPaperService.queryEvaluateEvaDetailPaperPage(pb,new EvaluateEvaDetailPaperSearch());
		return pageBean;
	    
	}
				
	/**
	 * 根据ID查询测评明细问卷信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public EvaluateEvaDetailPaperVo ajaxQueryEvaluateEvaDetailPaperById(EvaluateEvaDetailPaperSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评明细问卷信息");
		return this.evaluateEvaDetailPaperService.queryEvaluateEvaDetailPaperById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有测评明细问卷信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<EvaluateEvaDetailPaperVo> ajaxQueryEvaluateEvaDetailPaperBySearch(EvaluateEvaDetailPaperSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评明细问卷信息");
		return this.evaluateEvaDetailPaperService.queryEvaluateEvaDetailPaperBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询测评明细问卷信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryEvaluateEvaDetailPaperPage(PageBean pb,EvaluateEvaDetailPaperSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评明细问卷信息");
		return this.evaluateEvaDetailPaperService.queryEvaluateEvaDetailPaperPage(pb, search);
	    
	}
				
				
	/**
	 * (同步)根据条件查询所有的测评明细问卷信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllEvaluateEvaDetailPaper(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateEvaDetailPaperSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的测评明细问卷信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.evaluateEvaDetailPaperService.queryEvaluateEvaDetailPaperPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
				
	/**
	 * 增加信息测评明细问卷信息(用到)
	 * @param vo 测评明细问卷信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int saveEvaluateEvaDetailPaper(EvaluateEvaDetailPaperBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("增加信息测评明细问卷信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
//		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		
		return this.evaluateEvaDetailPaperService.insertEvaluateEvaDetailPaper(bean);

	}
	    
}