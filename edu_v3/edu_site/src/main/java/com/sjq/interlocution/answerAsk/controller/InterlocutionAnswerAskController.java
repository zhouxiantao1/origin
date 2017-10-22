package com.sjq.interlocution.answerAsk.controller;

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
import com.sjq.answerAsk.service.InterlocutionAnswerAskService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.security.util.CustomUser;
import com.sjq.answerAsk.bean.InterlocutionAnswerAskBean;
import com.sjq.answerAsk.search.InterlocutionAnswerAskSearch;
import com.sjq.answerAsk.vo.InterlocutionAnswerAskVo;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;

/**
 * [自动生成]回答提问信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/interlocution/answerAsk")
public class InterlocutionAnswerAskController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/interlocution/";
	
	// 回答提问信息页面 
	private static final String PAGE = "answer_list";
	
	// 回答提问信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存回答提问信息信息";
	private static final String OPERA_LOG_UPDATE = "更新回答提问信息信息";
	private static final String OPERA_LOG_DELETE = "删除回答提问信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除回答提问信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(InterlocutionAnswerAskController.class);
	
	@Autowired
	private InterlocutionAnswerAskService interlocutionAnswerAskService;
	@Autowired
	private BaseGradeService baseGradeService;
	@Autowired
	private BaseSubjectService baseSubjectService;
				
				
	/**
	 * 根据ID查询回答提问信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public InterlocutionAnswerAskVo ajaxQueryInterlocutionAnswerAskById(InterlocutionAnswerAskSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("回答提问信息");
		return this.interlocutionAnswerAskService.queryInterlocutionAnswerAskById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有回答提问信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<InterlocutionAnswerAskVo> ajaxQueryInterlocutionAnswerAskBySearch(InterlocutionAnswerAskSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("回答提问信息");
		return this.interlocutionAnswerAskService.queryInterlocutionAnswerAskBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询回答提问信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryInterlocutionAnswerAskPage(PageBean pb,InterlocutionAnswerAskSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("回答提问信息");
		return this.interlocutionAnswerAskService.queryInterlocutionAnswerAskPage(pb, search);
	    
	}
				
				
	/**
	 * (更新)根据ID更新所有回答提问信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/update")
	@ResponseBody
	public int ajaxUpdateInterlocutionAnswerAskById(InterlocutionAnswerAskBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("回答提问信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.interlocutionAnswerAskService.updateInterlocutionAnswerAskById(bean);
	    
	}
	
	/**
	 * (增加)增加信息回答提问信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertInterlocutionAnswerAsk(InterlocutionAnswerAskBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("回答提问信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getNameOfUser());
//		bean.setCreateName("zhouxiaotao");
		bean.setStatus("0");
		bean.setCreateTime(new Date());
		bean.setUserId(cu.getUserId());
		return this.interlocutionAnswerAskService.insertInterlocutionAnswerAsk(bean);
	    
	}
	
				
	/**
	 * (同步)根据条件查询所有的回答提问信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllInterlocutionAnswerAsk(HttpServletRequest request, HttpServletResponse response, PageBean pb, InterlocutionAnswerAskSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的回答提问信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		//查询所有年级
		List<BaseGradeVo>  baseGradeVoList = baseGradeService.queryAllBaseGrade();
		
		//查询所有的学科信息
		List<BaseSubjectVo> baseSubjectVoList = baseSubjectService.queryAllBaseSubject();
		
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		search.setUserId(cu.getUserId());
		
		PageBean pageBean = this.interlocutionAnswerAskService.queryInterlocutionAnswerAskPage(pb,search);
		
		mav.addObject("pageBean", pageBean);
		mav.addObject("search", search);
		mav.addObject("baseGradeVoList", baseGradeVoList);
		mav.addObject("baseSubjectVoList", baseSubjectVoList);
		
		return mav;
		
	}
				
	/**
	 * (同步）增加信息回答提问信息
	 * @param vo 回答提问信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveInterlocutionAnswerAsk(@Valid InterlocutionAnswerAskBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息回答提问信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.interlocutionAnswerAskService.insertInterlocutionAnswerAsk(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	    
}