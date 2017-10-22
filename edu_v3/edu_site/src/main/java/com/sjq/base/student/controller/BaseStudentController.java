package com.sjq.base.student.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.sjq.student.service.BaseStudentService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.stageGrade.search.BaseStageGradeSearch;
import com.sjq.stageGrade.service.BaseStageGradeService;
import com.sjq.stageGrade.vo.BaseStageGradeVo;
import com.sjq.classes.service.BaseClassesService;
import com.sjq.classes.vo.BaseClassesVo;
import com.sjq.security.bean.SecurityUser;
import com.sjq.security.service.SecurityUserService;
import com.sjq.security.util.CustomUser;
import com.sjq.student.bean.BaseStudentBean;
import com.sjq.student.search.BaseStudentSearch;
import com.sjq.student.vo.BaseStudentVo;

/**
 * [自动生成]基础模块-学生信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/student")
public class BaseStudentController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/base/";
	
	// 基础模块-学生信息页面 
	private static final String PAGE = "student_list";
	private static final String LIST = "base_student";
	private static final String CREATE = "base_student_create";
	private static final String VIEW = "base_student_view";
	
	// 基础模块-学生信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存基础模块-学生信息信息";
	private static final String OPERA_LOG_UPDATE = "更新基础模块-学生信息信息";
	private static final String OPERA_LOG_DELETE = "删除基础模块-学生信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除基础模块-学生信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseStudentController.class);
	
	@Autowired
	private BaseStudentService baseStudentService;
	@Autowired
	private SecurityUserService securityUserService;
	@Autowired
	private BaseClassesService baseClassesService;
	@Autowired
	private BaseStageGradeService baseStageGradeService;
				
	/**
	 * 根据ID查询基础模块-学生信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseStudentVo ajaxQueryBaseStudentById(BaseStudentSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-学生信息");
		return this.baseStudentService.queryBaseStudentById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有基础模块-学生信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseStudentVo> ajaxQueryBaseStudentBySearch(BaseStudentSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-学生信息");
		return this.baseStudentService.queryBaseStudentBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询基础模块-学生信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryBaseStudentPage(PageBean pb,BaseStudentSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-学生信息");
		return this.baseStudentService.queryBaseStudentPage(pb, search);
	    
	}
				
				
	/**
	 * (删除)根据ID删除基础模块-学生信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/delete")
	@ResponseBody
	public int ajaxDeleteBaseStudentById(BaseStudentBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-学生信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.baseStudentService.deleteBaseStudentById(bean);
	    
	}
	
				
	/**
	 * (增加)增加信息基础模块-学生信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertBaseStudent(BaseStudentBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-学生信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		//获取班级信息
		BaseClassesVo baseClassesVo = baseClassesService.queryBaseClassesById(bean.getClassesId());
		bean.setGradeId(baseClassesVo.getGradeId());
		//通过年级的id获取学段id
		BaseStageGradeSearch baseStageGradeSearch = new BaseStageGradeSearch();
		baseStageGradeSearch.setGradeId(baseClassesVo.getGradeId());
		List<BaseStageGradeVo> baseStageGradeVoList = baseStageGradeService.queryBaseStageGradeBySearch(baseStageGradeSearch);
		for(BaseStageGradeVo baseStageGradeVo : baseStageGradeVoList){
			bean.setStageId(baseStageGradeVo.getStageId());
		}
		
		//保存用户信息
		SecurityUser securityUser = new SecurityUser();
		securityUser.setCode(bean.getLoginName());
		securityUser.setName(bean.getName());
		//密码加密
		securityUser.setCreateTime(new Date());
		securityUser.setCreateUser(cu.getUsername());
		Md5PasswordEncoder md5 = new Md5PasswordEncoder();
		securityUser.setPassword(md5.encodePassword(bean.getPasswork(), bean.getLoginName()));
		securityUser.setRoleId(11L);
		securityUserService.insertUser(securityUser);
		
		bean.setUserId(securityUser.getId());
		return this.baseStudentService.insertBaseStudent(bean);
	    
	}
			
				
	/**
	 * (同步)根据条件查询所有的基础模块-学生信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllBaseStudent(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseStudentSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-学生信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + LIST);
		
		PageBean pageBean = this.baseStudentService.queryBaseStudentPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	
	/**
	 * (同步)根据条件查询所有的基础模块-学生信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView viewBaseStudent(HttpServletRequest request, HttpServletResponse response, BaseStudentSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-学生信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + VIEW);
		
		BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentById(search.getId());
		SecurityUser securityUser = securityUserService.queryUserById(baseStudentVo.getUserId());
		
		mav.addObject("baseStudentVo", baseStudentVo);
		mav.addObject("securityUser", securityUser);
		return mav;
		
	}
	
	/**
	 * (同步)根据条件查询所有的基础模块-学生信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createBaseStudent(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseStudentSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-学生信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CREATE);

		return mav;
		
	}
				
	/**
	 * (同步）增加信息基础模块-学生信息
	 * @param vo 基础模块-学生信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveBaseStudent(@Valid BaseStudentBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息基础模块-学生信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.baseStudentService.insertBaseStudent(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	    
}