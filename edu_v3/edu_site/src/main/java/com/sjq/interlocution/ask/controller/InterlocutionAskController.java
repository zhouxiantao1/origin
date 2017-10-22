package com.sjq.interlocution.ask.controller;

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
import com.sjq.ask.service.InterlocutionAskService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.security.util.CustomUser;
import com.sjq.answerAsk.search.InterlocutionAnswerAskSearch;
import com.sjq.answerAsk.service.InterlocutionAnswerAskService;
import com.sjq.answerAsk.vo.InterlocutionAnswerAskVo;
import com.sjq.ask.bean.InterlocutionAskBean;
import com.sjq.ask.search.InterlocutionAskSearch;
import com.sjq.ask.vo.InterlocutionAskVo;
import com.sjq.concern.search.InterlocutionConcernSearch;
import com.sjq.concern.service.InterlocutionConcernService;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;

/**
 * [自动生成]提问信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/interlocution/ask")
public class InterlocutionAskController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="interlocution/";
	
	// 提问信息页面 
	private static final String PAGE = "ask_list";
	private static final String CREATE = "ask_create";
	private static final String DETAIL = "ask_detail";
	private static final String PERSON = "personAsk_list";
	
	// 提问信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存提问信息信息";
	private static final String OPERA_LOG_UPDATE = "更新提问信息信息";
	private static final String OPERA_LOG_DELETE = "删除提问信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除提问信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(InterlocutionAskController.class);
	
	@Autowired
	private InterlocutionAskService interlocutionAskService;
	@Autowired
	private BaseGradeService baseGradeService;
	@Autowired
	private BaseSubjectService baseSubjectService;
	@Autowired
	private InterlocutionAnswerAskService interlocutionAnswerAskService;
	@Autowired
	private InterlocutionConcernService interlocutionConcernService;
				
	/**
	 * 查询所有的提问信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/ajaxlist")
	@ResponseBody
	public PageBean ajaxQueryInterlocutionAskAll(InterlocutionAskSearch search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("提问信息");
		PageBean pageBean = this.interlocutionAskService.queryInterlocutionAskPage(pb,new InterlocutionAskSearch());
		return pageBean;
	    
	}
				
	/**
	 * 根据ID查询提问信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public InterlocutionAskVo ajaxQueryInterlocutionAskById(InterlocutionAskSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("提问信息");
		return this.interlocutionAskService.queryInterlocutionAskById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有提问信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<InterlocutionAskVo> ajaxQueryInterlocutionAskBySearch(InterlocutionAskSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("提问信息");
		return this.interlocutionAskService.queryInterlocutionAskBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询提问信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryInterlocutionAskPage(PageBean pb,InterlocutionAskSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("提问信息");
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		search.setUserId(cu.getUserId());
		return this.interlocutionAskService.queryInterlocutionAskPage(pb, search);
	    
	}
				
				
	/**
	 * (更新)根据条件更新所有提问信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch/update")
	@ResponseBody
	public int ajaxUpdateInterlocutionAskBySearch(InterlocutionAskBean bean,InterlocutionAskSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("提问信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		bean.setReadNum(1L);
		return this.interlocutionAskService.updateInterlocutionAskBySearch(bean,search);
	    
	}
	
	/**
	 * (更新)根据条件更新所有提问信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/updateReadnum")
	@ResponseBody
	public int ajaxUpdateReadeNum(InterlocutionAskSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("提问信息");
		//操作人信息
		search.setReadNum(1L);
		return this.interlocutionAskService.updateReadeNumByAskId(search);
	    
	}
				
	/**
	 * (同步)根据条件查询所有的提问信息(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllInterlocutionAsk(HttpServletRequest request, HttpServletResponse response, PageBean pb, InterlocutionAskSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的提问信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		if(search.getType()==null){
			search.setType(0L);
		}
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		search.setUserId(cu.getUserId());
		search.setIsAsk("1");
		//查询所有年级
		List<BaseGradeVo>  baseGradeVoList = baseGradeService.queryAllBaseGrade();
		
		//查询所有的学科信息
		List<BaseSubjectVo> baseSubjectVoList = baseSubjectService.queryAllBaseSubject();
		
		PageBean pageBean = this.interlocutionAskService.queryInterlocutionAskPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		mav.addObject("gradeId", search.getGradeId());
		mav.addObject("subjectId", search.getSubjectId());
		mav.addObject("baseGradeVoList", baseGradeVoList);
		mav.addObject("baseSubjectVoList", baseSubjectVoList);
		
		return mav;
		
	}
	
	/**
	 * (同步)根据条件查询所有的关注信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "person/list", method = RequestMethod.GET)
	public ModelAndView personAllInterlocutionAsk(HttpServletRequest request, HttpServletResponse response, PageBean pb, InterlocutionAskSearch search) {
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PERSON);
		if(search.getType()==null){
			search.setType(0L);
		}
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		search.setUserId(cu.getUserId());
		search.setIsAsk("2");
		//查询所有年级
		List<BaseGradeVo>  baseGradeVoList = baseGradeService.queryAllBaseGrade();
		
		//查询所有的学科信息
		List<BaseSubjectVo> baseSubjectVoList = baseSubjectService.queryAllBaseSubject();
		
		PageBean pageBean = this.interlocutionAskService.queryInterlocutionAskPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		mav.addObject("gradeId", search.getGradeId());
		mav.addObject("subjectId", search.getSubjectId());
		mav.addObject("baseGradeVoList", baseGradeVoList);
		mav.addObject("baseSubjectVoList", baseSubjectVoList);
		
		return mav;
		
	}
	
	/**
	 * 新增提问信息页面(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createlInterlocutionAsk(HttpServletRequest request, HttpServletResponse response, InterlocutionAskSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的提问信息");
		
		//查询所有年级
		List<BaseGradeVo>  baseGradeVoList = baseGradeService.queryAllBaseGrade();
				
		//查询所有的学科信息
		List<BaseSubjectVo> baseSubjectVoList = baseSubjectService.queryAllBaseSubject();
		
		if(search.getGradeId()==null){
			search.setGradeId(1L);
		}
		if(search.getSubjectId()==null){
			search.setSubjectId(1L);
		}
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CREATE);
		mav.addObject("search", search);
		mav.addObject("gradeId", search.getGradeId());
		mav.addObject("subjectId", search.getSubjectId());
		mav.addObject("title", search.getTitle());
		mav.addObject("content", search.getContent());
		mav.addObject("baseGradeVoList", baseGradeVoList);
		mav.addObject("baseSubjectVoList", baseSubjectVoList);
		
		return mav;
		
	}
	
	/**
	 * 新增提问信息页面(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView detaillInterlocutionAsk(HttpServletRequest request, HttpServletResponse response, InterlocutionAskSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的提问信息");
		//根据问题ID查询问题
		InterlocutionAskVo interlocutionAskVo = interlocutionAskService.queryInterlocutionAskById(search.getId());
		
		//通过问题ID查询回答列表
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		InterlocutionAnswerAskSearch interlocutionAnswerAskSearch = new InterlocutionAnswerAskSearch();
		interlocutionAnswerAskSearch.setAskId(search.getId());
		interlocutionAnswerAskSearch.setDelflag("0");
		interlocutionAnswerAskSearch.setUserId(cu.getUserId());
		
		List<InterlocutionAnswerAskVo> interlocutionAnswerAskVoList = interlocutionAnswerAskService.queryInterlocutionAnswerAskBySearch(interlocutionAnswerAskSearch);
				
		//根据问题的ID查询回答数量
		int answerNum = interlocutionAnswerAskService.queryInterlocutionAnswerAskTotalCount(interlocutionAnswerAskSearch);
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + DETAIL);
		mav.addObject("interlocutionAnswerAskVoList", interlocutionAnswerAskVoList);
		mav.addObject("interlocutionAskVo", interlocutionAskVo);
		mav.addObject("answerNum", answerNum);
		mav.addObject("askId", search.getId());
		mav.addObject("status", search.getStatus());
		return mav;
		
	}
	
	/**
	 * (增加)增加信息提问信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertInterlocutionAsk(InterlocutionAskBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("提问信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getNameOfUser());
//		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		bean.setStatus("0");
		bean.setReadNum(0L);
		bean.setUserId(cu.getUserId());
		return this.interlocutionAskService.insertInterlocutionAsk(bean);
	    
	}
				
	/**
	 * (同步）增加信息提问信息
	 * @param vo 提问信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveInterlocutionAsk(@Valid InterlocutionAskBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息提问信息");
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
//		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		
		int result = this.interlocutionAskService.insertInterlocutionAsk(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	
	 /** (更新)根据ID更新所有提问信息信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/update")
	@ResponseBody
	public int ajaxUpdateInterlocutionAskById(InterlocutionAskBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("提问信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setModName(cu.getUsername());
		bean.setModTime(new Date());
		return this.interlocutionAskService.updateInterlocutionAskById(bean);
	    
	}
	    
}