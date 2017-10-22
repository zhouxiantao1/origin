package com.sjq.evaluate.answerDetail.controller;

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
import com.sjq.answerDetail.service.EvaluateAnswerDetailService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.answerDetail.bean.EvaluateAnswerDetailBean;
import com.sjq.answerDetail.search.EvaluateAnswerDetailSearch;
import com.sjq.answerDetail.vo.EvaluateAnswerDetailVo;

/**
 * [自动生成]作答明细信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/evaluate/answerDetail")
public class EvaluateAnswerDetailController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="answerDetail/";
	
	// 作答明细信息页面 
	private static final String PAGE = "answerDetailList";
	
	// 作答明细信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存作答明细信息信息";
	private static final String OPERA_LOG_UPDATE = "更新作答明细信息信息";
	private static final String OPERA_LOG_DELETE = "删除作答明细信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除作答明细信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(EvaluateAnswerDetailController.class);
	
	@Autowired
	private EvaluateAnswerDetailService evaluateAnswerDetailService;
	
				
	/**
	 * 查询所有的作答明细信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/ajaxlist")
	@ResponseBody
	public PageBean ajaxQueryEvaluateAnswerDetailAll(EvaluateAnswerDetailSearch search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答明细信息");
		PageBean pageBean = this.evaluateAnswerDetailService.queryEvaluateAnswerDetailPage(pb,new EvaluateAnswerDetailSearch());
		return pageBean;
	    
	}
				
	/**
	 * 根据ID查询作答明细信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public EvaluateAnswerDetailVo ajaxQueryEvaluateAnswerDetailById(EvaluateAnswerDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答明细信息");
		return this.evaluateAnswerDetailService.queryEvaluateAnswerDetailById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有作答明细信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<EvaluateAnswerDetailVo> ajaxQueryEvaluateAnswerDetailBySearch(EvaluateAnswerDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答明细信息");
		return this.evaluateAnswerDetailService.queryEvaluateAnswerDetailBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询作答明细信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryEvaluateAnswerDetailPage(PageBean pb,EvaluateAnswerDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答明细信息");
		return this.evaluateAnswerDetailService.queryEvaluateAnswerDetailPage(pb, search);
	    
	}
				
				
	/**
	 * (同步)根据条件查询所有的作答明细信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllEvaluateAnswerDetail(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateAnswerDetailSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的作答明细信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.evaluateAnswerDetailService.queryEvaluateAnswerDetailPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	
	/**
	 * (增加)增加信息作答明细信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertEvaluateAnswerDetail(EvaluateAnswerDetailBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答明细信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		bean.setUserId(cu.getUserId());
		return this.evaluateAnswerDetailService.insertEvaluateAnswerDetail(bean);
	    
	}
	    
}