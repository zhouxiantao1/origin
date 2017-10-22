package com.sjq.evaluate.evaIssue.controller;

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
import com.sjq.evaIssue.service.EvaluateEvaIssueService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.teacher.search.BaseTeacherSearch;
import com.sjq.teacher.service.BaseTeacherService;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.security.util.CustomUser;
import com.sjq.classes.search.BaseClassesSearch;
import com.sjq.classes.service.BaseClassesService;
import com.sjq.classes.vo.BaseClassesVo;
import com.sjq.evaDetail.bean.EvaluateEvaDetailBean;
import com.sjq.evaIssue.bean.EvaluateEvaIssueBean;
import com.sjq.evaIssue.search.EvaluateEvaIssueSearch;
import com.sjq.evaIssue.vo.EvaluateEvaIssueVo;
import com.sjq.school.service.BaseSchoolService;
import com.sjq.school.vo.BaseSchoolVo;

/**
 * [自动生成]测评发布信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/evaluate/evaIssue")
public class EvaluateEvaIssueController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/evaluate/";
	
	// 测评发布信息页面 
	private static final String PAGE = "evaIssue_list";
	private static final String SCHOOL = "evaIssue_schoolList";
	
	// 测评发布信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存测评发布信息信息";
	private static final String OPERA_LOG_UPDATE = "更新测评发布信息信息";
	private static final String OPERA_LOG_DELETE = "删除测评发布信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除测评发布信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(EvaluateEvaIssueController.class);
	
	@Autowired
	private EvaluateEvaIssueService evaluateEvaIssueService;
	@Autowired
	private BaseSchoolService baseSchoolService;
	@Autowired
	private BaseClassesService baseClassesService;
	@Autowired
	private BaseTeacherService baseTeacherService;
				
	/**
	 * 查询所有的测评发布信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/ajaxlist")
	@ResponseBody
	public PageBean ajaxQueryEvaluateEvaIssueAll(EvaluateEvaIssueSearch search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评发布信息");
		PageBean pageBean = this.evaluateEvaIssueService.queryEvaluateEvaIssuePage(pb,new EvaluateEvaIssueSearch());
		return pageBean;
	    
	}
				
	/**
	 * 根据ID查询测评发布信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public EvaluateEvaIssueVo ajaxQueryEvaluateEvaIssueById(EvaluateEvaIssueSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评发布信息");
		return this.evaluateEvaIssueService.queryEvaluateEvaIssueById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有测评发布信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<EvaluateEvaIssueVo> ajaxQueryEvaluateEvaIssueBySearch(EvaluateEvaIssueSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评发布信息");
		return this.evaluateEvaIssueService.queryEvaluateEvaIssueBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询测评发布信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryEvaluateEvaIssuePage(PageBean pb,EvaluateEvaIssueSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评发布信息");
		return this.evaluateEvaIssueService.queryEvaluateEvaIssuePage(pb, search);
	    
	}
				
				
	/**
	 * (同步)区域测评信息列表(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllEvaluateEvaIssue(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateEvaIssueSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的测评发布信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		search.setAreaId(5L);
		search.setType("0");
		PageBean pageBean = this.evaluateEvaIssueService.queryEvaluateEvaIssuePage(pb,search);
		
		//根据区域id查询学校列表
		List<BaseSchoolVo> baseSchoolVoList= baseSchoolService.queryBaseSchoolByAreaId(5L);
		
		mav.addObject("pageBean", pageBean);
		mav.addObject("search", search);
		mav.addObject("baseSchoolVoList", baseSchoolVoList);
		mav.addObject("areaId", 5L);
		return mav;
		
	}
	
	/**
	 * (同步)学校测评信息列表(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/school/list", method = RequestMethod.GET)
	public ModelAndView queryAllEvaluateEvaIssueBySchool(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateEvaIssueSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的测评发布信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + SCHOOL);
		search.setSchoolId(514L);
		search.setType("1");
		PageBean pageBean = this.evaluateEvaIssueService.queryEvaluateEvaIssuePage(pb,search);
		
		//根据学校id查询班级列表
		BaseClassesSearch baseClassesSearch = new BaseClassesSearch();
		baseClassesSearch.setSchoolId(514L);
		List<BaseClassesVo> baseClassesVoList= baseClassesService.queryBaseClassesBySearch(baseClassesSearch);

		//根据学校ID查询所有老师
		BaseTeacherSearch baseTeacherSearch = new BaseTeacherSearch();
		baseTeacherSearch.setSchoolId(514L);
		List<BaseTeacherVo> baseTeacherVoList = baseTeacherService.queryBaseTeacherBySearch(baseTeacherSearch);
		
		mav.addObject("pageBean", pageBean);
		mav.addObject("search", search);
		mav.addObject("baseClassesVoList", baseClassesVoList);
		mav.addObject("baseTeacherVoList", baseTeacherVoList);
		mav.addObject("schoolId", 514);
		return mav;
		
	}
	
				
	/**
	 * 增加信息测评发布信息(用到)
	 * @param vo 测评发布信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int saveEvaluateEvaIssue(EvaluateEvaIssueBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息测评发布信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
//		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		
		return this.evaluateEvaIssueService.insertEvaluateEvaIssue(bean);

	}
	
	/**
	 * (更新)根据ID更新所有测评发布信息信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/update")
	@ResponseBody
	public int ajaxUpdateEvaluateEvaIssueById(EvaluateEvaIssueBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评发布信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setModName(cu.getUsername());
//		bean.setCreateName("zhouxiaotao");
		bean.setModTime(new Date());
		return this.evaluateEvaIssueService.updateEvaluateEvaIssueById(bean);
	    
	}
	
	    
}