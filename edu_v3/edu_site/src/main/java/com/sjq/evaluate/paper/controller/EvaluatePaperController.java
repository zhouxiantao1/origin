package com.sjq.evaluate.paper.controller;

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
import com.sjq.paper.service.EvaluatePaperService;
import com.sjq.util.PageBean;
import com.sjq.ware.dto.ZTreeNodesDto;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.evaDetail.vo.EvaluateEvaDetailVo;
import com.sjq.evaDetailPaper.vo.EvaluateEvaDetailPaperVo;
import com.sjq.indicator.search.EvaluateIndicatorSearch;
import com.sjq.indicator.service.EvaluateIndicatorService;
import com.sjq.indicator.vo.EvaluateIndicatorVo;
import com.sjq.paper.bean.EvaluatePaperBean;
import com.sjq.paper.search.EvaluatePaperSearch;
import com.sjq.paper.vo.EvaluatePaperVo;
import com.sjq.paperQuestion.search.EvaluatePaperQuestionSearch;
import com.sjq.paperQuestion.service.EvaluatePaperQuestionService;
import com.sjq.paperQuestion.vo.EvaluatePaperQuestionVo;

/**
 * [自动生成]问卷信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/evaluate/paper")
public class EvaluatePaperController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="evaluate/";
	
	// 问卷信息页面 
	private static final String PAGE = "paper_list";
	private static final String CREATE = "paper_create1";
	private static final String VIEW = "paper_view";
	
	// 问卷信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存问卷信息信息";
	private static final String OPERA_LOG_UPDATE = "更新问卷信息信息";
	private static final String OPERA_LOG_DELETE = "删除问卷信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除问卷信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(EvaluatePaperController.class);
	
	@Autowired
	private EvaluatePaperService evaluatePaperService;
	@Autowired
	private EvaluatePaperQuestionService evaluatePaperQuestionService;
	@Autowired
	private EvaluateIndicatorService evaluateIndicatorService;
	
				
	/**
	 * 根据ID查询问卷信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public EvaluatePaperVo ajaxQueryEvaluatePaperById(EvaluatePaperSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("问卷信息");
		return this.evaluatePaperService.queryEvaluatePaperById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有问卷信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<EvaluatePaperVo> ajaxQueryEvaluatePaperBySearch(EvaluatePaperSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("问卷信息");
		return this.evaluatePaperService.queryEvaluatePaperBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询问卷信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryEvaluatePaperPage(PageBean pb,EvaluatePaperSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("问卷信息");
		return this.evaluatePaperService.queryEvaluatePaperPage(pb, search);
	    
	}
	
	
				
	/**
	 * (删除)根据条件删除问卷信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch/delete")
	@ResponseBody
	public int ajaxDeleteEvaluatePaperBySearch(EvaluatePaperBean bean,EvaluatePaperSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("问卷信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.evaluatePaperService.deleteEvaluatePaperBySearch(bean,search);
	    
	}
	
				
	/**
	 * (同步)根据条件查询所有的问卷信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllEvaluatePaper(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluatePaperSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的问卷信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		search.setUserId(cu.getUserId());
		PageBean pageBean = this.evaluatePaperService.queryEvaluatePaperPage(pb,search);
		
		mav.addObject("pageBean", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	
	/**
	 * (同步)问卷查看页面
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView viewEvaluatePaper(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluatePaperSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的问卷信息");
		
		//根据问卷ID查询问卷
		EvaluatePaperVo evaluatePaperVo = evaluatePaperService.queryEvaluatePaperById(search.getId());
		
		//通过问卷获取题目列表
		EvaluatePaperQuestionSearch EvaluatePaperQuestionSearch = new EvaluatePaperQuestionSearch();
		EvaluatePaperQuestionSearch.setPaperId(search.getId());
		EvaluatePaperQuestionSearch.setDelflag("0");
		List<EvaluatePaperQuestionVo> evaluatePaperQuestionVoList = evaluatePaperQuestionService.queryEvaluatePaperQuestionBySearch(EvaluatePaperQuestionSearch);
				
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + VIEW);
				
		mav.addObject("evaluatePaperQuestionVoList", evaluatePaperQuestionVoList);
		mav.addObject("evaluatePaperVo", evaluatePaperVo);
		return mav;
		
	}
	
	
	/**
	 * (同步)新增问卷信息(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createEvaluatePaper(EvaluatePaperBean bean,HttpServletRequest request, HttpServletResponse response, EvaluatePaperSearch search) {
		
		LOGGER.info("(同步)新增问卷信息");
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();

		//查询问卷中题目的最大排序
		Long sortMax = evaluatePaperQuestionService.queryPaperQuestionMaxByPaperId(search.getId());
		if(sortMax==null){
			sortMax = 1L;
		}else{
			sortMax = sortMax + 1L;
		}
		
		//查询所有指标体系
		EvaluateIndicatorSearch evaluateIndicatorSearch = new EvaluateIndicatorSearch();
		evaluateIndicatorSearch.setParentId(0L);
		evaluateIndicatorSearch.setDelflag("0");
		evaluateIndicatorSearch.setType("3");
		evaluateIndicatorSearch.setUserId(cu.getUserId());
		List<EvaluateIndicatorVo> evaluateIndicatorVoList = evaluateIndicatorService.queryEvaluateIndicatorBySearch1(evaluateIndicatorSearch);
		
		//查询问卷题目列表
		EvaluatePaperQuestionSearch evaluatePaperQuestionSearch = new EvaluatePaperQuestionSearch();
		evaluatePaperQuestionSearch.setPaperId(search.getId());
		List<EvaluatePaperQuestionVo> evaluatePaperQuestionVoList = evaluatePaperQuestionService.queryEvaluatePaperQuestionBySearch(evaluatePaperQuestionSearch);
		
		//根据问卷Id查询问卷
		EvaluatePaperVo evaluatePaperVo = evaluatePaperService.queryEvaluatePaperById(search.getId());
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CREATE);
		mav.addObject("evaluatePaperQuestionVoList", evaluatePaperQuestionVoList);
		mav.addObject("sortMax", sortMax);
		mav.addObject("paperId", search.getId());
		mav.addObject("evaluateIndicatorVoList", evaluateIndicatorVoList);
		mav.addObject("search", search);
		mav.addObject("evaluatePaperVo", evaluatePaperVo);
		
		return mav;
		
	}
	
	/**
	 * (更新)根据ID更新所有问卷信息信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/update")
	@ResponseBody
	public int ajaxUpdateEvaluatePaperById(EvaluatePaperBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("问卷信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setModName(cu.getUsername());
//		bean.setModName("zhouxiaotao");
		bean.setModTime(new Date());
		return this.evaluatePaperService.updateEvaluatePaperById(bean);
	    
	}
	
	/**
	 * (更新)根据ID物理删除记录(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/delete")
	@ResponseBody
	public int ajaxDeleteEvaluatePaperById(EvaluatePaperSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("物理删除问卷信息");
		//操作人信息
		return this.evaluatePaperService.deleteEvaluatePaperById(search.getId());
	    
	}
	
	/**
	 * (增加)增加信息问卷信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public Long ajaxInsertEvaluatePaper(EvaluatePaperBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("问卷信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getNameOfUser());
//		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		bean.setUserId(cu.getUserId());
		this.evaluatePaperService.insertEvaluatePaper(bean);
		return bean.getId();
	    
	}
	
	
	    
}