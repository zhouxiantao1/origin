package com.sjq.evaluate.evaDetail.controller;

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
import com.sjq.evaDetail.service.EvaluateEvaDetailService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.eva.service.EvaluateEvaService;
import com.sjq.eva.vo.EvaluateEvaVo;
import com.sjq.evaDetail.bean.EvaluateEvaDetailBean;
import com.sjq.evaDetail.search.EvaluateEvaDetailSearch;
import com.sjq.evaDetail.vo.EvaluateEvaDetailVo;
import com.sjq.evaDetailPaper.service.EvaluateEvaDetailPaperService;
import com.sjq.evaDetailPaper.vo.EvaluateEvaDetailPaperVo;
import com.sjq.evaIssue.search.EvaluateEvaIssueSearch;
import com.sjq.evaIssue.service.EvaluateEvaIssueService;
import com.sjq.evaIssue.vo.EvaluateEvaIssueVo;
import com.sjq.indicator.search.EvaluateIndicatorSearch;
import com.sjq.indicator.service.EvaluateIndicatorService;
import com.sjq.indicator.vo.EvaluateIndicatorVo;
import com.sjq.paper.service.EvaluatePaperService;
import com.sjq.paper.vo.EvaluatePaperVo;

/**
 * [自动生成]测评明细信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/evaluate/evaDetail")
public class EvaluateEvaDetailController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/evaluate/";
	
	// 测评明细信息页面 
	private static final String PAGE = "evaDetailList";
	private static final String CREATE = "evaDetail_create";
	private static final String REPORT = "single_report";
	private static final String EDIT = "evaDetail_edit";
	
	// 测评明细信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存测评明细信息信息";
	private static final String OPERA_LOG_UPDATE = "更新测评明细信息信息";
	private static final String OPERA_LOG_DELETE = "删除测评明细信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除测评明细信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(EvaluateEvaDetailController.class);
	
	@Autowired
	private EvaluateEvaDetailService evaluateEvaDetailService;
	@Autowired
	private EvaluateEvaService evaluateEvaService;
	@Autowired
	private EvaluateIndicatorService evaluateIndicatorService;
	@Autowired
	private EvaluateEvaDetailPaperService evaluateEvaDetailPaperService;
	@Autowired
	private EvaluatePaperService evaluatePaperService;
	@Autowired
	private EvaluateEvaIssueService evaluateEvaIssueService;
	/**
	 * 查询所有的测评明细信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/ajaxlist")
	@ResponseBody
	public PageBean ajaxQueryEvaluateEvaDetailAll(EvaluateEvaDetailSearch search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评明细信息");
		PageBean pageBean = this.evaluateEvaDetailService.queryEvaluateEvaDetailPage(pb,new EvaluateEvaDetailSearch());
		return pageBean;
	    
	}
				
	/**
	 * 根据ID查询测评明细信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public EvaluateEvaDetailVo ajaxQueryEvaluateEvaDetailById(EvaluateEvaDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评明细信息");
		return this.evaluateEvaDetailService.queryEvaluateEvaDetailById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有测评明细信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<EvaluateEvaDetailVo> ajaxQueryEvaluateEvaDetailBySearch(EvaluateEvaDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评明细信息");
		return this.evaluateEvaDetailService.queryEvaluateEvaDetailBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询测评明细信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryEvaluateEvaDetailPage(PageBean pb,EvaluateEvaDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评明细信息");
		return this.evaluateEvaDetailService.queryEvaluateEvaDetailPage(pb, search);
	    
	}
				
				
	/**
	 * (同步)根据条件查询所有的测评明细信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllEvaluateEvaDetail(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateEvaDetailSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的测评明细信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.evaluateEvaDetailService.queryEvaluateEvaDetailPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	
	/**
	 * (同步)单个测试新增页面
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createEvaluateEvaDetail(HttpServletRequest request, HttpServletResponse response, EvaluateEvaDetailSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的测评明细信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CREATE);
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		//查询指标体系
		EvaluateIndicatorSearch evaluateIndicatorSearch = new EvaluateIndicatorSearch();
		evaluateIndicatorSearch.setDelflag("0");
		evaluateIndicatorSearch.setParentId(0L);
		evaluateIndicatorSearch.setType("3");
		evaluateIndicatorSearch.setUserId(cu.getUserId());
		List<EvaluateIndicatorVo>  evaluateIndicatorVoList = evaluateIndicatorService.queryEvaluateIndicatorBySearch1(evaluateIndicatorSearch);
		
		EvaluateEvaVo evaluateEvaVo = evaluateEvaService.queryEvaluateEvaById(search.getEvaId());
		mav.addObject("evaId", search.getEvaId());
		mav.addObject("evaluateEvaVo", evaluateEvaVo);
		mav.addObject("evaluateIndicatorVoList", evaluateIndicatorVoList);
		mav.addObject("userId", cu.getUserId());
		
		return mav;
		
	}
	
	/**
	 * (同步)单个测试编辑页面
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editEvaluateEvaDetail(HttpServletRequest request, HttpServletResponse response, EvaluateEvaDetailSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的测评明细信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + EDIT);
		
		//根据测评ID查询
		EvaluateEvaDetailVo evaluateEvaDetailVo = evaluateEvaDetailService.queryEvaluateEvaDetailById(search.getId());
		EvaluateEvaVo evaluateEvaVo = evaluateEvaService.queryEvaluateEvaById(search.getEvaId());
		EvaluateEvaDetailPaperVo evaluateEvaDetailPaperVo = evaluateEvaDetailPaperService.queryEvaluateEvaDetailPaperByEvaDetailId(search.getId());
		
		//查询问卷
		EvaluatePaperVo evaluatePaperVo = evaluatePaperService.queryEvaluatePaperById(evaluateEvaDetailPaperVo.getPaperId());
		
		//查询发布的区域
		EvaluateEvaIssueSearch evaluateEvaIssueSearch = new EvaluateEvaIssueSearch();
		evaluateEvaIssueSearch.setEvaDetailId(search.getId());
		evaluateEvaIssueSearch.setType("0");
		List<EvaluateEvaIssueVo> evaluateEvaIssueVoList = evaluateEvaIssueService.queryEvaluateEvaIssueBySearch(evaluateEvaIssueSearch);
		
		mav.addObject("evaId", search.getEvaId());
		mav.addObject("evaluateEvaVo", evaluateEvaVo);
		mav.addObject("evaluateEvaDetailVo", evaluateEvaDetailVo);
		mav.addObject("evaluatePaperVo", evaluatePaperVo);
		mav.addObject("evaluateEvaIssueVoList", evaluateEvaIssueVoList);
		
		return mav;
		
	}
	
	/**
	 * (增加)增加信息测评明细信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public Long ajaxInsertEvaluateEvaDetail(EvaluateEvaDetailBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评明细信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
//		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		this.evaluateEvaDetailService.insertEvaluateEvaDetail(bean);
		return bean.getId();
	}
				
	/**
	 * (同步）增加信息测评明细信息
	 * @param vo 测评明细信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEvaluateEvaDetail(@Valid EvaluateEvaDetailBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息测评明细信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.evaluateEvaDetailService.insertEvaluateEvaDetail(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	/**
	 * 报告页面
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/report", method = RequestMethod.GET)
	public ModelAndView reportEvaluateEvaDetail(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateEvaDetailSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的测评明细信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + REPORT);
		
		
		return mav;
		
	}
	
	/**
	 * (同步）增加信息测评明细信息
	 * @param vo 测评明细信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping("/listbyid/update")
	@ResponseBody
	public int updatebyidEvaluateEvaDetail(EvaluateEvaDetailBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息测评明细信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setModName(cu.getNameOfUser());
		bean.setModTime(new Date());
		
		return this.evaluateEvaDetailService.updateEvaluateEvaDetailById(bean);
	
	}   
}