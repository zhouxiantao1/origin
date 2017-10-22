package com.sjq.base.teacher.controller;

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
import com.sjq.teacher.service.BaseTeacherService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.classes.search.BaseClassesSearch;
import com.sjq.classes.service.BaseClassesService;
import com.sjq.classes.vo.BaseClassesVo;
import com.sjq.security.bean.SecurityUser;
import com.sjq.security.service.SecurityUserService;
import com.sjq.security.util.CustomUser;
import com.sjq.teacher.bean.BaseTeacherBean;
import com.sjq.teacher.search.BaseTeacherSearch;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.teacherClasses.service.BaseTeacherClassesService;
import com.sjq.teacherClasses.vo.BaseTeacherClassesVo;

/**
 * [自动生成]教师信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/teacher")
public class BaseTeacherController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/base/";
	
	// 教师信息页面 
	private static final String LIST = "teacher/teacher_List";
	private static final String PAGE = "base_teacher";
	private static final String CREATE = "base_teacher_create";
	private static final String CLASSES = "base_teacher_classes";
	private static final String VIEW = "base_teacher_view";
	
	// 教师信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存教师信息信息";
	private static final String OPERA_LOG_UPDATE = "更新教师信息信息";
	private static final String OPERA_LOG_DELETE = "删除教师信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除教师信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseTeacherController.class);
	
	@Autowired
	private BaseTeacherService baseTeacherService;
	@Autowired
	private BaseClassesService baseClassesService;
	@Autowired
	private BaseSubjectService baseSubjectService;	
	@Autowired
	private SecurityUserService securityUserService;
	@Autowired
	private BaseTeacherClassesService baseTeacherClassesService;
	/**
	 * 根据ID查询教师信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseTeacherVo ajaxQueryBaseTeacherById(BaseTeacherSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("教师信息");
		return this.baseTeacherService.queryBaseTeacherById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有教师信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseTeacherVo> ajaxQueryBaseTeacherBySearch(BaseTeacherSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("教师信息");
		return this.baseTeacherService.queryBaseTeacherBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询教师信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryBaseTeacherPage(PageBean pb,BaseTeacherSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("教师信息");
		return this.baseTeacherService.queryBaseTeacherPage(pb, search);
	    
	}
				
	
	/**
	 * (同步)根据条件查询所有的教师信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllBaseTeacher(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseTeacherSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的教师信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.baseTeacherService.queryBaseTeacherPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	
	/**
	 * (同步)根据条件查询所有的教师信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createBaseTeacher(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseTeacherSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的教师信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CREATE);
		
		return mav;
		
	}
	
	/**
	 * (同步)根据条件查询所有的教师信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView viewBaseTeacher(HttpServletRequest request, HttpServletResponse response, BaseTeacherSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的教师信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + VIEW);
		
		BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherById(search.getId());
		SecurityUser securityUser = securityUserService.queryUserById(baseTeacherVo.getUserId());
		
		//查询任教学科
		List<BaseTeacherClassesVo> baseTeacherClassesVos = baseTeacherClassesService.queryBaseTeacherClassesByteacherId(baseTeacherVo.getId());
		
		mav.addObject("baseTeacherVo", baseTeacherVo);
		mav.addObject("securityUser", securityUser);
		mav.addObject("baseTeacherClassesVos", baseTeacherClassesVos);
		return mav;
		
	}
	
	/**
	 * (同步)根据条件查询所有的教师信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/classes", method = RequestMethod.GET)
	public ModelAndView classesBaseTeacher(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseTeacherSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的教师信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CLASSES);
		
		BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherById(search.getId());
		
		//根据老师所属学校ID获取班级
		BaseClassesSearch baseClassesSearch = new BaseClassesSearch();
		if(baseTeacherVo.getSchoolId()!=null){
			baseClassesSearch.setSchoolId(baseTeacherVo.getSchoolId());
		}else{
			baseClassesSearch.setSchoolId(0L);
		}
		
		List<BaseClassesVo> baseClassesVoList = baseClassesService.queryBaseClassesBySearch(baseClassesSearch);
		
		//查询所有学科
		List<BaseSubjectVo> baseSubjectVoList = baseSubjectService.queryAllBaseSubject();
		
		mav.addObject("baseClassesVoList", baseClassesVoList);
		mav.addObject("baseSubjectVoList", baseSubjectVoList);
		mav.addObject("teacherId",search.getId());
		return mav;
		
	}
	
	/**
	 * (增加)增加信息教师信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertBaseTeacher(BaseTeacherBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("教师信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		//保存用户信息
		SecurityUser securityUser = new SecurityUser();
		securityUser.setCode(bean.getLoginName());
		securityUser.setName(bean.getName());
		//密码加密
		securityUser.setCreateTime(new Date());
		securityUser.setCreateUser(cu.getUsername());
		Md5PasswordEncoder md5 = new Md5PasswordEncoder();
		securityUser.setPassword(md5.encodePassword(bean.getPasswork(), bean.getLoginName()));
		securityUser.setRoleId(9L);
		securityUserService.insertUser(securityUser);
		
		bean.setUserId(securityUser.getId());
		return this.baseTeacherService.insertBaseTeacher(bean);
	    
	}
				
	/**
	 * (同步）增加信息教师信息
	 * @param vo 教师信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveBaseTeacher(@Valid BaseTeacherBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息教师信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.baseTeacherService.insertBaseTeacher(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	    
}