package com.sjq.evaluate.answer.controller;

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
import com.sjq.answer.service.EvaluateAnswerService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.answer.bean.EvaluateAnswerBean;
import com.sjq.answer.search.EvaluateAnswerSearch;
import com.sjq.answer.vo.EvaluateAnswerVo;
import com.sjq.evaDetail.service.EvaluateEvaDetailService;
import com.sjq.evaDetail.vo.EvaluateEvaDetailVo;
import com.sjq.evaDetailPaper.service.EvaluateEvaDetailPaperService;
import com.sjq.evaDetailPaper.vo.EvaluateEvaDetailPaperVo;
import com.sjq.paperQuestion.search.EvaluatePaperQuestionSearch;
import com.sjq.paperQuestion.service.EvaluatePaperQuestionService;
import com.sjq.paperQuestion.vo.EvaluatePaperQuestionVo;

/**
 * [自动生成]作答信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/evaluate/answer")
public class EvaluateAnswerController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/evaluate/";
	
	// 作答信息页面 
	private static final String PAGE = "answer_List";
	private static final String DETAIL = "evaDetail_answer";
	
	// 作答信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存作答信息信息";
	private static final String OPERA_LOG_UPDATE = "更新作答信息信息";
	private static final String OPERA_LOG_DELETE = "删除作答信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除作答信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(EvaluateAnswerController.class);
	
	@Autowired
	private EvaluateAnswerService evaluateAnswerService;
	@Autowired
	private EvaluateEvaDetailPaperService evaluateEvaDetailPaperService;
	@Autowired
	private EvaluatePaperQuestionService evaluatePaperQuestionService;
	@Autowired
	private EvaluateEvaDetailService evaluateEvaDetailService;
				
	/**
	 * 查询所有的作答信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/ajaxlist")
	@ResponseBody
	public PageBean ajaxQueryEvaluateAnswerAll(EvaluateAnswerSearch search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答信息");
		PageBean pageBean = this.evaluateAnswerService.queryEvaluateAnswerPage(pb,new EvaluateAnswerSearch());
		return pageBean;
	    
	}
				
	/**
	 * 根据ID查询作答信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public EvaluateAnswerVo ajaxQueryEvaluateAnswerById(EvaluateAnswerSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答信息");
		return this.evaluateAnswerService.queryEvaluateAnswerById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有作答信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<EvaluateAnswerVo> ajaxQueryEvaluateAnswerBySearch(EvaluateAnswerSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答信息");
		return this.evaluateAnswerService.queryEvaluateAnswerBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询作答信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryEvaluateAnswerPage(PageBean pb,EvaluateAnswerSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答信息");
		return this.evaluateAnswerService.queryEvaluateAnswerPage(pb, search);
	    
	}
				
				
	/**
	 * (同步)根据条件查询所有的作答信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllEvaluateAnswer(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateAnswerSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的作答信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.evaluateAnswerService.queryEvaluateAnswerPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	
	/**
	 * (同步)作答页面(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView detail(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateAnswerSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的作答信息");
		
		//通过测评明细ID获取问卷ID
		EvaluateEvaDetailPaperVo evaluateEvaDetailPaperVo = evaluateEvaDetailPaperService.queryEvaluateEvaDetailPaperByEvaDetailId(search.getEvaDetailId());
		
		//通过测评明细获取答题时间
		EvaluateEvaDetailVo evaluateEvaDetailVo = evaluateEvaDetailService.queryEvaluateEvaDetailById(search.getEvaDetailId());
		
		//通过问卷获取题目列表
		EvaluatePaperQuestionSearch EvaluatePaperQuestionSearch = new EvaluatePaperQuestionSearch();
		EvaluatePaperQuestionSearch.setPaperId(evaluateEvaDetailPaperVo.getPaperId());
		List<EvaluatePaperQuestionVo> evaluatePaperQuestionVoList = evaluatePaperQuestionService.queryEvaluatePaperQuestionBySearch(EvaluatePaperQuestionSearch);
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + DETAIL);
		
		mav.addObject("evaluatePaperQuestionVoList", evaluatePaperQuestionVoList);
		mav.addObject("evaDetailId", search.getEvaDetailId());
		mav.addObject("issueListId", search.getIssueListId());
		mav.addObject("anwerTime", evaluateEvaDetailVo.getAnswerTime());
		return mav;
		
	}
	
	/**
	 * (增加)增加信息作答信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public Long ajaxInsertEvaluateAnswer(EvaluateAnswerBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		bean.setUserId(cu.getUserId());
		this.evaluateAnswerService.insertEvaluateAnswer(bean);
		return bean.getId();
	}
				
	
	    
}