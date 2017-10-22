package com.sjq.evaluate.paperQuestion.controller;

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
import com.sjq.paperQuestion.service.EvaluatePaperQuestionService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.paperQuestion.bean.EvaluatePaperQuestionBean;
import com.sjq.paperQuestion.search.EvaluatePaperQuestionSearch;
import com.sjq.paperQuestion.vo.EvaluatePaperQuestionVo;

/**
 * [自动生成]题目信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/evaluate/paperQuestion")
public class EvaluatePaperQuestionController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="paperQuestion/";
	
	// 题目信息页面 
	private static final String PAGE = "paperQuestionList";
	
	// 题目信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存题目信息信息";
	private static final String OPERA_LOG_UPDATE = "更新题目信息信息";
	private static final String OPERA_LOG_DELETE = "删除题目信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除题目信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(EvaluatePaperQuestionController.class);
	
	@Autowired
	private EvaluatePaperQuestionService evaluatePaperQuestionService;
	
				
	/**
	 * 根据ID查询题目信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public EvaluatePaperQuestionVo ajaxQueryEvaluatePaperQuestionById(EvaluatePaperQuestionSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题目信息");
		return this.evaluatePaperQuestionService.queryEvaluatePaperQuestionById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有题目信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<EvaluatePaperQuestionVo> ajaxQueryEvaluatePaperQuestionBySearch(EvaluatePaperQuestionSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题目信息");
		return this.evaluatePaperQuestionService.queryEvaluatePaperQuestionBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询题目信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryEvaluatePaperQuestionPage(PageBean pb,EvaluatePaperQuestionSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题目信息");
		return this.evaluatePaperQuestionService.queryEvaluatePaperQuestionPage(pb, search);
	    
	}
				
				
	/**
	 * (删除)根据条件删除题目信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch/delete")
	@ResponseBody
	public int ajaxDeleteEvaluatePaperQuestionBySearch(EvaluatePaperQuestionBean bean,EvaluatePaperQuestionSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题目信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.evaluatePaperQuestionService.deleteEvaluatePaperQuestionBySearch(bean,search);
	    
	}
	
				
	/**
	 * (增加)增加信息题目信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public Long ajaxInsertEvaluatePaperQuestion(EvaluatePaperQuestionBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题目信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
//		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		this.evaluatePaperQuestionService.insertEvaluatePaperQuestion(bean);
		return bean.getId();
	}
			
				
	/**
	 * (同步)根据条件查询所有的题目信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllEvaluatePaperQuestion(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluatePaperQuestionSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的题目信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.evaluatePaperQuestionService.queryEvaluatePaperQuestionPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
				
	/**
	 * (同步）增加信息题目信息
	 * @param vo 题目信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEvaluatePaperQuestion(@Valid EvaluatePaperQuestionBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息题目信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.evaluatePaperQuestionService.insertEvaluatePaperQuestion(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	    
}