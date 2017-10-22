package com.sjq.evaluate.issueList.controller;

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
import com.sjq.issueList.service.EvaluateIssueListService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.student.service.BaseStudentService;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.security.util.CustomUser;
import com.sjq.issueList.bean.EvaluateIssueListBean;
import com.sjq.issueList.search.EvaluateIssueListSearch;
import com.sjq.issueList.vo.EvaluateIssueListVo;
import com.sjq.parent.search.BaseParentSearch;
import com.sjq.parent.service.BaseParentService;
import com.sjq.parent.vo.BaseParentVo;

/**
 * [自动生成]发布列表控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/evaluate/issueList")
public class EvaluateIssueListController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/evaluate/";
	
	// 发布列表页面 
	private static final String PAGE = "issueList_list";
	private static final String REPORT = "person_report";
	
	// 发布列表访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存发布列表信息";
	private static final String OPERA_LOG_UPDATE = "更新发布列表信息";
	private static final String OPERA_LOG_DELETE = "删除发布列表信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除发布列表信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(EvaluateIssueListController.class);
	
	@Autowired
	private EvaluateIssueListService evaluateIssueListService;
	@Autowired
	private BaseStudentService baseStudentService;
	@Autowired
	private BaseParentService baseParentService;
	
				
	/**
	 * 根据ID查询发布列表信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public EvaluateIssueListVo ajaxQueryEvaluateIssueListById(EvaluateIssueListSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("发布列表");
		return this.evaluateIssueListService.queryEvaluateIssueListById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有发布列表信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<EvaluateIssueListVo> ajaxQueryEvaluateIssueListBySearch(EvaluateIssueListSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("发布列表");
		return this.evaluateIssueListService.queryEvaluateIssueListBySearch(search);
	    
	}
	
	
				
	/**
	 * (更新)根据ID更新所有发布列表信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/update")
	@ResponseBody
	public int ajaxUpdateEvaluateIssueListById(EvaluateIssueListBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("发布列表");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.evaluateIssueListService.updateEvaluateIssueListById(bean);
	    
	}
	
				
	/**
	 * (增加)增加信息发布列表
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertEvaluateIssueList(EvaluateIssueListBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("发布列表");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
//		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		return this.evaluateIssueListService.insertEvaluateIssueList(bean);
	    
	}
			
				
	/**
	 * (同步)根据条件查询所有的发布列表
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllEvaluateIssueList(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateIssueListSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的发布列表");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		String code = cu.getRole().getCode();

		if(search.getType()==null||search.getType()==""){
			search.setType("1");
		}
		
		if(code.equals("ROLE_11")){//学生
			//通过用户ID获取班级ID
			BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
			search.setClassesId(baseStudentVo.getClassesId());
			search.setEvaObject("1");
		}else if(code.equals("ROLE_10")){//家长
			//通过家长ID获取学生班级ID
			BaseParentVo baseParentVo = baseParentService.queryBaseParentByUserId(cu.getUserId());
			BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentById(baseParentVo.getStudentId());
			search.setClassesId(baseStudentVo.getClassesId());
			search.setEvaObject("2");
		}else{//老师和校长
			search.setUserId(cu.getUserId());
		}
		
		PageBean pageBean = this.evaluateIssueListService.queryEvaluateIssueListPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		mav.addObject("type", search.getType());
		
		return mav;
		
	}
	
	/**
	 * (同步)报告页面
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/report", method = RequestMethod.GET)
	public ModelAndView reportEvaluateIssueList(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateIssueListSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的发布列表");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + REPORT);
		
		return mav;
		
	}
	    
}