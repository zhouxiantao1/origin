package com.sjq.security.controller;

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

import com.sjq.security.bean.SecurityAuthorization;
import com.sjq.security.bean.SecurityRole;
import com.sjq.security.bean.SecurityUser;
import com.sjq.security.search.SecurityRoleSearch;
import com.sjq.security.search.SecurityUserSearch;
import com.sjq.security.service.SecurityResourceService;
import com.sjq.security.service.SecurityRoleService;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.vo.SecurityResourceVo;
import com.sjq.util.MyLogger;
import com.sjq.util.PageBean;

/**
 * 角色授权管理
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月14日下午5:09:42
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/security/authorization")
public class SecurityAuthorizationController {
	
    /** jsp跳转目录  **/
	private static final String PAGE_FOLDER="security/";
	
	/** 角色管理页面 **/
	private static final String PAGE = "security_authorization";
	
	/** 角色管理访问地址 **/
	private static final String PAGE_HTM = "list.htm";
	
	/** 日志信息  **/
	private static final String OPERA_LOG_INSERT = "保存角色管理信息";
	private static final String OPERA_LOG_UPDATE = "更新角色管理信息";
	private static final String OPERA_LOG_DELETE = "删除角色管理信息";
	private static final String OPERA_LOG_BATCH_DELETE = "指删除角色管理信息";
	
	/** 记录日志对象 */
    private static final MyLogger LOGGER = new MyLogger(SecurityAuthorizationController.class);
	
    
	@Autowired
	private SecurityRoleService securityRoleService;
    
	
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
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView findPageUserList(Long roleId,HttpServletRequest request, HttpServletResponse response, PageBean pb,SecurityUserSearch search) {
		
		
		LOGGER.info("跳转到资源管理界面...");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
//		//查询所有的角色信息
		List<SecurityRole> srs = this.securityRoleService.selectAll();

		if(roleId == null) roleId = srs != null ? srs.get(0).getId():0;
		
//		PageBean pageBean = this.securityUserService.queryPage(pb,search);
//		
//		mav.addObject("pb", pageBean);
		mav.addObject("srs",srs);         //角色信息
		mav.addObject("roleid", roleId);  //角色id
		
		return mav;
		
	}
	
	

	/**
	 * 获取所有的资源信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "ajaxqueryallresource", method = RequestMethod.GET)
	@ResponseBody
	public List<SecurityResourceVo> queryAllResource(Long roleId, HttpServletRequest request, HttpServletResponse response){
		
		List<SecurityResourceVo> srv = securityResourceService.queryBossAllResource();
		
		this.mateResourceChecked(srv, roleId);
		
		return srv;
		
	}
	
	
	/**
	 * 保存授权信息
	 * @param roleId  角色id
	 * @param rids    授权信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView saveSecurityAuthorization(Long roleId,Long[] rids, HttpServletRequest request, HttpServletResponse response){
		
		
		//批量删除该角色下的授权信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("updateUser", cu.getNameOfUser());
		map.put("roleId", roleId);
		this.securityResourceService.batchDeleteSecurityAuthorizationByRoleId(map);
		
		//批量生成该角色下的授权信息
		SecurityAuthorization sa = null;
		for(Long rid:rids){
			sa = new SecurityAuthorization();
			sa.setDelflag("0");
			sa.setRoleId(roleId);
			sa.setResourceId(rid);
			sa.setCreateUser(cu.getUsername());
			this.securityResourceService.insertSecurityAuthorization(sa);
		}
		
		return new ModelAndView(new RedirectView(PAGE_HTM+"?roleId="+roleId));
		
	}
	
	
	/**
	 * 匹配验证该角色资源角色是否存在
	 * @param srv
	 * @return
	 */
	public void mateResourceChecked(List<SecurityResourceVo> srv,Long roleId){
		
		if(srv != null){
			for(SecurityResourceVo vo:srv){
				//根据角色id和资源id查询是否有此权限
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("roleId", roleId);
				map.put("resourceId", vo.getRid());
				
				if(this.securityResourceService.checkSecurityAuthorizationByRoleAndResource(map) >0 ){
					vo.getState().setChecked(true);
				}
				
				this.mateResourceChecked(vo.getNodes(),roleId);
			}
		}
		
	}
	

}
