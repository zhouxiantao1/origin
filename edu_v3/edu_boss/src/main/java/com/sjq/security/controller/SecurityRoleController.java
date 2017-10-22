package com.sjq.security.controller;

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
import com.sjq.security.bean.SecurityRole;
import com.sjq.security.bean.SecurityUser;
import com.sjq.security.search.SecurityRoleSearch;
import com.sjq.security.search.SecurityUserSearch;
import com.sjq.security.service.SecurityRoleService;
import com.sjq.security.service.SecurityUserService;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.util.MyLogger;
import com.sjq.util.PageBean;

/**
 * 角色控制器
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月14日下午5:09:42
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/security/role")
public class SecurityRoleController {
	
    /** jsp跳转目录  **/
	private static final String PAGE_FOLDER="security/";
	
	/** 角色管理页面 **/
	private static final String PAGE = "security_user";
	
	/** 角色管理访问地址 **/
	private static final String PAGE_HTM = "list.htm";
	
	/** 日志信息  **/
	private static final String OPERA_LOG_INSERT = "保存角色管理信息";
	private static final String OPERA_LOG_UPDATE = "更新角色管理信息";
	private static final String OPERA_LOG_DELETE = "删除角色管理信息";
	private static final String OPERA_LOG_BATCH_DELETE = "指删除角色管理信息";
	
	/** 记录日志对象 */
    private static final MyLogger LOGGER = new MyLogger(SecurityRoleController.class);
	
	@Autowired
	private SecurityRoleService securityRoleService;
	
	@Autowired
	private SecurityUserService securityUserService;
	
	/**
	 * 分页查询角色管理列表信息，跳转到该页面
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView findPageRoleList(Long roleId,HttpServletRequest request, HttpServletResponse response, PageBean pb,SecurityUserSearch search) {
		

		LOGGER.info("跳转到用户角色管理界面...");
		
		pb.setUrl("findRoleList.htm");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		//查询所有的角色信息
		List<SecurityRole> srs = this.securityRoleService.selectAll();
		
		if(roleId == null) roleId = srs != null ? srs.get(0).getId():0;
		search.setRoleId(roleId);
		
		PageBean pageBean = this.securityUserService.queryPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("srs",srs);         //角色信息
		mav.addObject("roleid", roleId);  //角色id
		
		return mav;
		
	}
	

	/**
	 * 保存角色管理信息
	 * @param bean 角色管理信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ModelAndView saveRole(@Valid SecurityRole bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("保存角色管理信息...");
		
		bean.setCreateTime(new Date());
		
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateUser(cu.getUsername());
		
        int result = this.securityRoleService.insertRole(bean);

        return new ModelAndView(new RedirectView(PAGE_HTM));
		
	}
	

	
	/**
	 * 修改角色管理信息
	 * @param id  标识
	 * @param request 请求体
	 * @return    视图
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateRole(@Valid SecurityRole bean, HttpServletRequest request) {
		
		LOGGER.info("保存角色管理信息...");
		
        int result = this.securityRoleService.updateRoleById(bean);
        
        return new ModelAndView(new RedirectView(PAGE_HTM));
		
	}
	
	/**
	 * 删除角色管理信息
	 * @param id 标识
	 * @param response
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	@ResponseBody
	public String deleteRole(@Valid Long id,  HttpServletRequest request) {
		
		LOGGER.info("保存角色管理信息...");
		
        int result = this.securityRoleService.deleteRoleById(id);
        
        // 记录日志
        LOGGER.info(OPERA_LOG_INSERT+"[id:"+id);
        
		return PAGE_HTM;
		
	}


	/**
     * 根据ID查询角色管理 Ajax方法
     *
     * @param id
     *            角色管理ID {@link Long}
     * @return 
     */
    @RequestMapping("/queryRoleById")
    @ResponseBody
    public SecurityRole queryRoleById(Long id) {
    	
    	LOGGER.info("根据ID查询角色管理信息...");
    	
    	SecurityRole bean = this.securityRoleService.queryRoleById(id);
    	
        return bean;
        
    }
    
    
    

	/**
	 * 指删除角色管理
	 * @param ids      待删除的id数组
	 * @param request  请求体
	 * @param pb       分页
	 * @return
	 */
    @RequestMapping("/batchDelRole")
    public ModelAndView batchDelRole(Long[] ids, HttpServletRequest request, PageBean pb) {
    	
    	LOGGER.info("批量删除角色管理信息...");
    	
		// 执行批量删除操作，删除人名称应该是当前登陆的用户名称
		this.securityRoleService.deleteRoleByIds(ids);
		
		LOGGER.info("分页查询角色管理信息...");
		
		pb.setUrl("jsp/role/roleList");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		//重新查实时数据
		PageBean pageBean = this.securityRoleService.queryPage(pb,new SecurityRoleSearch());
		
		mav.addObject("pb", pageBean);
		
        return mav;
    }
    
    
    
   /**
     * 查询所有的角色管理并转换为JSON返回
     * @param search   查询条件
     * @return         所有的角色管理集合
     */
    @RequestMapping("/queryAllRoleBySearch")
    @ResponseBody
    public List<SecurityRole> queryAllRoleBySearch(SecurityRoleSearch search) {
    	
        LOGGER.info("根据查询条件查询角色管理结果");
        
        return this.securityRoleService.queryRoleBySearch(search);
        
    }
	
	

}
