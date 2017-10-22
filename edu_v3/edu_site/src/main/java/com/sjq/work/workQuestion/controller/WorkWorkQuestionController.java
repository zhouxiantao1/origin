package com.sjq.work.workQuestion.controller;

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
import com.sjq.workQuestion.service.WorkWorkQuestionService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.workQuestion.bean.WorkWorkQuestionBean;
import com.sjq.workQuestion.search.WorkWorkQuestionSearch;
import com.sjq.workQuestion.vo.WorkWorkQuestionVo;

/**
 * [自动生成]作业题目信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/work/workQuestion")
public class WorkWorkQuestionController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="work/homework/";
	
	// 作业题目信息页面 
//	private static final String PAGE = "workQuestion_list";
	private static final String PAGE = "homework_select";
	
	// 作业题目信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存作业题目信息信息";
	private static final String OPERA_LOG_UPDATE = "更新作业题目信息信息";
	private static final String OPERA_LOG_DELETE = "删除作业题目信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除作业题目信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(WorkWorkQuestionController.class);
	
	@Autowired
	private WorkWorkQuestionService workWorkQuestionService;
	
				
	
				
	/**
	 * 根据ID查询作业题目信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public WorkWorkQuestionVo ajaxQueryWorkWorkQuestionById(WorkWorkQuestionSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作业题目信息");
		return this.workWorkQuestionService.queryWorkWorkQuestionById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有作业题目信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<WorkWorkQuestionVo> ajaxQueryWorkWorkQuestionBySearch(WorkWorkQuestionSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作业题目信息");
		return this.workWorkQuestionService.queryWorkWorkQuestionBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询作业题目信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryWorkWorkQuestionPage(PageBean pb,WorkWorkQuestionSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作业题目信息");
		return this.workWorkQuestionService.queryWorkWorkQuestionPage(pb, search);
	    
	}
				
				
	/**
	 * (同步)根据条件查询所有的作业题目信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllWorkWorkQuestion(HttpServletRequest request, HttpServletResponse response, PageBean pb, WorkWorkQuestionSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的作业题目信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.workWorkQuestionService.queryWorkWorkQuestionPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
				
	/**
	 * (同步）增加信息作业题目信息
	 * @param vo 作业题目信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveWorkWorkQuestion(@Valid WorkWorkQuestionBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息作业题目信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
//		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		
		int result = this.workWorkQuestionService.insertWorkWorkQuestion(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	
	/**
	 * (增加)增加信息作业题目信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertWorkWorkQuestion(WorkWorkQuestionBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作业题目信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
//		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		return this.workWorkQuestionService.insertWorkWorkQuestion(bean);
	    
	}
	
	/**
	 * (删除)根据条件删除作业题目信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch/delete")
	@ResponseBody
	public int ajaxDeleteWorkWorkQuestionBySearch(WorkWorkQuestionBean bean,WorkWorkQuestionSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作业题目信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setModName(cu.getUsername());
		bean.setModTime(new Date());
		return this.workWorkQuestionService.deleteWorkWorkQuestionBySearch(bean,search);
	    
	}
	    
}