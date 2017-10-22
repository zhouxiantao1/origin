package com.sjq.base.parent.controller;

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
import com.sjq.parent.service.BaseParentService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.bean.SecurityUser;
import com.sjq.security.service.SecurityUserService;
import com.sjq.security.util.CustomUser;
import com.sjq.parent.bean.BaseParentBean;
import com.sjq.parent.search.BaseParentSearch;
import com.sjq.parent.vo.BaseParentVo;

/**
 * [自动生成]基础模块-家长信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/parent")
public class BaseParentController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/base/";
	
	// 基础模块-家长信息页面 
	private static final String PAGE = "parent_list";
	private static final String LIST = "base_parent";
	private static final String CREATE = "base_parent_create";
	private static final String VIEW = "base_parent_view";
	
	// 基础模块-家长信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存基础模块-家长信息信息";
	private static final String OPERA_LOG_UPDATE = "更新基础模块-家长信息信息";
	private static final String OPERA_LOG_DELETE = "删除基础模块-家长信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除基础模块-家长信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseParentController.class);
	
	@Autowired
	private BaseParentService baseParentService;
	@Autowired
	private SecurityUserService securityUserService;
	
				
	/**
	 * 根据ID查询基础模块-家长信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseParentVo ajaxQueryBaseParentById(BaseParentSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-家长信息");
		return this.baseParentService.queryBaseParentById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有基础模块-家长信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseParentVo> ajaxQueryBaseParentBySearch(BaseParentSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-家长信息");
		return this.baseParentService.queryBaseParentBySearch(search);
	    
	}
	
				
	/**
	 * (同步)根据条件查询所有的基础模块-家长信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllBaseParent(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseParentSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-家长信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + LIST);
		
		PageBean pageBean = this.baseParentService.queryBaseParentPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	
	/**
	 * (同步)根据条件查询所有的基础模块-家长信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView viewBaseParent(HttpServletRequest request, HttpServletResponse response, BaseParentSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-家长信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + VIEW);
		
		BaseParentVo baseParentVo = baseParentService.queryBaseParentById(search.getId());
		if(baseParentVo.getUserId()!=null){
			SecurityUser securityUser = securityUserService.queryUserById(baseParentVo.getUserId());
			mav.addObject("securityUser", securityUser);
		}
		
		mav.addObject("baseParentVo", baseParentVo);
		
		return mav;
		
	}
	
	/**
	 * (同步)根据条件查询所有的基础模块-家长信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createBaseParent(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseParentSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-家长信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CREATE);
		
		
		return mav;
		
	}
	
	/**
	 * (增加)增加信息基础模块-家长信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertBaseParent(BaseParentBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-家长信息");
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
		securityUser.setRoleId(10L);
		securityUserService.insertUser(securityUser);
		
		bean.setUserId(securityUser.getId());
		return this.baseParentService.insertBaseParent(bean);
	    
	}
				
	/**
	 * (同步）增加信息基础模块-家长信息
	 * @param vo 基础模块-家长信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveBaseParent(@Valid BaseParentBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息基础模块-家长信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
//		bean.setCreateName(cu.getUsername());
		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		
		int result = this.baseParentService.insertBaseParent(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	    
}