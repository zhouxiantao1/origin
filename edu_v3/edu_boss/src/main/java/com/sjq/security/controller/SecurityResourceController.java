package com.sjq.security.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.sjq.security.bean.SecurityResource;
import com.sjq.security.bean.SecurityRole;
import com.sjq.security.bean.SecurityUser;
import com.sjq.security.search.SecurityRoleSearch;
import com.sjq.security.search.SecurityUserSearch;
import com.sjq.security.service.SecurityResourceService;
import com.sjq.security.service.SecurityRoleService;
import com.sjq.security.service.SecurityUserService;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.vo.SecurityResourceVo;
import com.sjq.util.MyLogger;
import com.sjq.util.PageBean;

/**
 * 
 * 资源控制器
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月16日下午2:33:23
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/security/resource")
public class SecurityResourceController {
	
    /** jsp跳转目录  **/
	private static final String PAGE_FOLDER="security/";
	
	/** 角色管理页面 **/
	private static final String PAGE = "security_resource";
	
	/** 角色管理访问地址 **/
	private static final String PAGE_HTM = "list.htm";
	
	/** 日志信息  **/
	private static final String OPERA_LOG_INSERT = "保存角色管理信息";
	private static final String OPERA_LOG_UPDATE = "更新角色管理信息";
	private static final String OPERA_LOG_DELETE = "删除角色管理信息";
	private static final String OPERA_LOG_BATCH_DELETE = "指删除角色管理信息";
	
	/** 记录日志对象 */
    private static final MyLogger LOGGER = new MyLogger(SecurityResourceController.class);
	
    
	@Autowired
	private SecurityResourceService securityResourceService;
    
	
	/**
	 * 分页查询角色管理列表信息，跳转到该页面
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView findPageUserList(HttpServletRequest request, HttpServletResponse response, PageBean pb,SecurityUserSearch search) {
		
		LOGGER.info("跳转到资源管理界面...");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
//		//查询所有的角色信息
//		List<SecurityRole> srs = this.securityRoleService.selectAll();
//		
//		PageBean pageBean = this.securityUserService.queryPage(pb,search);
//		
//		mav.addObject("pb", pageBean);
//		mav.addObject("srs",srs);         //角色信息
		
		return mav;
		
	}
	
	/**
	 * 保存用户信息
	 * @param bean 用户管理信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ModelAndView saveResource(@Valid SecurityResource bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("保存用户管理信息...");
		
		bean.setCreateTime(new Date());
		
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateUser(cu.getUsername());
		
		int result = securityResourceService.inserResource(bean);

        return new ModelAndView(new RedirectView(PAGE_HTM));
		
	}
	
	
	
	
	

}
