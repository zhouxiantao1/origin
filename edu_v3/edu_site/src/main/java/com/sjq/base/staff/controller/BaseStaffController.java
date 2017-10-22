package com.sjq.base.staff.controller;

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
import com.sjq.staff.service.BaseStaffService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.bean.SecurityUser;
import com.sjq.security.service.SecurityUserService;
import com.sjq.security.util.CustomUser;
import com.sjq.staff.bean.BaseStaffBean;
import com.sjq.staff.search.BaseStaffSearch;
import com.sjq.staff.vo.BaseStaffVo;

/**
 * [自动生成]管理者信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/staff")
public class BaseStaffController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="base/";
	
	// 管理者信息页面 
	private static final String PAGE = "base_staff";
	private static final String CREATE = "base_staff_create";
	private static final String VIEW = "base_staff_view";
	
	// 管理者信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存管理者信息信息";
	private static final String OPERA_LOG_UPDATE = "更新管理者信息信息";
	private static final String OPERA_LOG_DELETE = "删除管理者信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除管理者信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseStaffController.class);
	
	@Autowired
	private BaseStaffService baseStaffService;
	@Autowired
	private SecurityUserService securityUserService;
	
				
	/**
	 * 根据ID查询管理者信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseStaffVo ajaxQueryBaseStaffById(BaseStaffSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("管理者信息");
		return this.baseStaffService.queryBaseStaffById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有管理者信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseStaffVo> ajaxQueryBaseStaffBySearch(BaseStaffSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("管理者信息");
		return this.baseStaffService.queryBaseStaffBySearch(search);
	    
	}
	
	
			
	/**
	 * (同步)根据条件查询所有的管理者信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllBaseStaff(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseStaffSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的管理者信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.baseStaffService.queryBaseStaffPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	
	/**
	 * (同步)根据条件查询所有的管理者信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createBaseStaff(HttpServletRequest request, HttpServletResponse response,BaseStaffBean bean, BaseStaffSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的管理者信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CREATE);
		
		return mav;
		
	}
	
	/**
	 * (同步)根据条件查询所有的管理者信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView viewBaseStaff(HttpServletRequest request, HttpServletResponse response,BaseStaffBean bean) {
		
		LOGGER.info("(同步)根据条件查询所有的管理者信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + VIEW);
		
		BaseStaffVo baseStaffVo = baseStaffService.queryBaseStaffById(bean.getId());
		if(baseStaffVo!=null && baseStaffVo.getUserId()!=null){
			SecurityUser securityUser = securityUserService.queryUserById(baseStaffVo.getUserId());
			mav.addObject("securityUser", securityUser);
		}
		mav.addObject("baseStaffVo", baseStaffVo);
		
		return mav;
		
	}
	
	/**
	 * (增加)增加信息管理者信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertBaseStaff(BaseStaffBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("管理者信息");
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
		String type = bean.getType();
		if(type.equals("1")){
			securityUser.setRoleId(2L);
		}else if(type.equals("2")){
			securityUser.setRoleId(3L);
		}else if(type.equals("3")){
			securityUser.setRoleId(4L);
		}else if(type.equals("4")){
			securityUser.setRoleId(5L);
		}else if(type.equals("5")){
			securityUser.setRoleId(7L);
		}else if(type.equals("6")){
			securityUser.setRoleId(8L);
		}else if(type.equals("7")){
			securityUser.setRoleId(6L);
		}
		
		securityUserService.insertUser(securityUser);
		
		bean.setUserId(securityUser.getId());
		
		return this.baseStaffService.insertBaseStaff(bean);
		
	    
	}
				
	/**
	 * (同步）增加信息管理者信息
	 * @param vo 管理者信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveBaseStaff(@Valid BaseStaffBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息管理者信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
//		bean.setCreateName(cu.getUsername());
		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		
		int result = this.baseStaffService.insertBaseStaff(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	    
}