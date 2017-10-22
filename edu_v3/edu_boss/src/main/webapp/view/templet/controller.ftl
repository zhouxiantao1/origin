package com.sjq.${dco.moduleName!''}.controller;

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
import com.sjq.${dco.moduleName!''}.service.${dco.upperProjectName!''}${dco.upperModuleName!''}Service;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.${dco.moduleName!''}.bean.${dco.upperProjectName!''}${dco.upperModuleName!''}Bean;
import com.sjq.${dco.moduleName!''}.search.${dco.upperProjectName!''}${dco.upperModuleName!''}Search;
import com.sjq.${dco.moduleName!''}.vo.${dco.upperProjectName!''}${dco.upperModuleName!''}Vo;

/**
 * [自动生成]${dco.codeComment!''}控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author  ShuiJingQiu
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/${dco.lowerProjectName!''}/${dco.moduleName!''}")
public class ${dco.upperProjectName!''}${dco.upperModuleName!''}Controller {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="${dco.lowerProjectName!''}/${dco.moduleName!''}/";
	
	// ${dco.codeComment!''}页面 
	private static final String PAGE = "${dco.lowerProjectName!''}_${dco.moduleName!''}";
	
	// ${dco.codeComment!''}访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存${dco.codeComment!''}信息";
	private static final String OPERA_LOG_UPDATE = "更新${dco.codeComment!''}信息";
	private static final String OPERA_LOG_DELETE = "删除${dco.codeComment!''}信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除${dco.codeComment!''}信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(${dco.upperProjectName!''}${dco.upperModuleName!''}Controller.class);
	
	@Autowired
	private ${dco.upperProjectName!''}${dco.upperModuleName!''}Service ${dco.lowerProjectName!''}${dco.upperModuleName!''}Service;
	
	<#if dmvs?? && dmvs?size != 0>
		<#list dmvs as dmv>
			<#if dmv.methodClassType == 'C'>
				<#if dmv.methodCode == 'C_M_S1'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("${dmv.controllerRequestMapping!''}")
	@ResponseBody
	public PageBean ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Search search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("${dco.codeComment}");
		PageBean pageBean = this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.query${dco.upperProjectName!''}${dco.upperModuleName!''}Page(pb,new ${dco.upperProjectName!''}${dco.upperModuleName!''}Search());
		return pageBean;
	    
	}
				</#if>
				<#if dmv.methodCode == 'C_M_S2'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("${dmv.controllerRequestMapping!''}")
	@ResponseBody
	public ${dco.upperProjectName!''}${dco.upperModuleName!''}Vo ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Search search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("${dco.codeComment!''}");
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.query${dco.upperProjectName!''}${dco.upperModuleName!''}ById(search.getId());
	    
	}
	
				</#if>
				<#if dmv.methodCode == 'C_M_S3'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("${dmv.controllerRequestMapping!''}")
	@ResponseBody
	public List<${dco.upperProjectName!''}${dco.upperModuleName!''}Vo> ${dmv.methodName!''}(Long[] ids,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("${dco.codeComment}");
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.query${dco.upperProjectName!''}${dco.upperModuleName!''}ByIds(ids);
	    
	}
	
				
			
				</#if>
				<#if dmv.methodCode == 'C_M_S4'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("${dmv.controllerRequestMapping!''}")
	@ResponseBody
	public List<${dco.upperProjectName!''}${dco.upperModuleName!''}Vo> ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Search search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("${dco.codeComment}");
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.query${dco.upperProjectName!''}${dco.upperModuleName!''}BySearch(search);
	    
	}
	
	
				</#if>
				<#if dmv.methodCode == 'C_M_S5'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("${dmv.controllerRequestMapping!''}")
	@ResponseBody
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Search search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("${dco.codeComment}");
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.query${dco.upperProjectName!''}${dco.upperModuleName!''}TotalCount(search);
	    
	}
	
				</#if>
				<#if dmv.methodCode == 'C_M_S7'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("${dmv.controllerRequestMapping!''}")
	@ResponseBody
	public PageBean ${dmv.methodName!''}(PageBean pb,${dco.upperProjectName!''}${dco.upperModuleName!''}Search search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("${dco.codeComment}");
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.query${dco.upperProjectName!''}${dco.upperModuleName!''}Page(pb, search);
	    
	}
				
				</#if>
				<#if dmv.methodCode == 'C_M_D2'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("${dmv.controllerRequestMapping!''}")
	@ResponseBody
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("${dco.codeComment}");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.deleteAll${dco.upperProjectName!''}${dco.upperModuleName!''}(bean);
	    
	}
	
				</#if>
				<#if dmv.methodCode == 'C_M_D3'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("${dmv.controllerRequestMapping!''}")
	@ResponseBody
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("${dco.codeComment}");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.delete${dco.upperProjectName!''}${dco.upperModuleName!''}ById(bean);
	    
	}
	
				</#if>
				<#if dmv.methodCode == 'C_M_D4'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("${dmv.controllerRequestMapping!''}")
	@ResponseBody
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean,Long[] ids,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("${dco.codeComment}");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.delete${dco.upperProjectName!''}${dco.upperModuleName!''}ByIds(bean,ids);
	    
	}
	
				</#if>
				<#if dmv.methodCode == 'C_M_D6'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("${dmv.controllerRequestMapping!''}")
	@ResponseBody
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean,${dco.upperProjectName!''}${dco.upperModuleName!''}Search search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("${dco.codeComment}");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.delete${dco.upperProjectName!''}${dco.upperModuleName!''}BySearch(bean,search);
	    
	}
	
				</#if>
				<#if dmv.methodCode == 'C_M_U2'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("${dmv.controllerRequestMapping!''}")
	@ResponseBody
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("${dco.codeComment}");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.update${dco.upperProjectName!''}${dco.upperModuleName!''}(bean);
	    
	}
	
				</#if>
				<#if dmv.methodCode == 'C_M_U3'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("${dmv.controllerRequestMapping!''}")
	@ResponseBody
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("${dco.codeComment}");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.update${dco.upperProjectName!''}${dco.upperModuleName!''}ById(bean);
	    
	}
	
				</#if>
				<#if dmv.methodCode == 'C_M_U4'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("${dmv.controllerRequestMapping!''}")
	@ResponseBody
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean,Long[] ids,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("${dco.codeComment}");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.update${dco.upperProjectName!''}${dco.upperModuleName!''}ByIds(ids,bean);
	    
	}
	
				</#if>
				<#if dmv.methodCode == 'C_M_U5'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("${dmv.controllerRequestMapping!''}")
	@ResponseBody
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean,${dco.upperProjectName!''}${dco.upperModuleName!''}Search search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("${dco.codeComment}");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.update${dco.upperProjectName!''}${dco.upperModuleName!''}BySearch(bean,search);
	    
	}
	
	
				</#if>
				<#if dmv.methodCode == 'C_M_I1'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("${dmv.controllerRequestMapping!''}")
	@ResponseBody
	public int ${dmv.methodName!''}(${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("${dco.codeComment}");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.insert${dco.upperProjectName!''}${dco.upperModuleName!''}(bean);
	    
	}
			
				</#if>
				<#if dmv.methodCode == 'C_M_S6'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "${dmv.controllerRequestMapping!''}", method = RequestMethod.GET)
	public ModelAndView ${dmv.methodName!''}(HttpServletRequest request, HttpServletResponse response, PageBean pb, ${dco.upperProjectName!''}${dco.upperModuleName!''}Search search) {
		
		LOGGER.info("${dmv.methodComment!''}");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.query${dco.upperProjectName!''}${dco.upperModuleName!''}Page(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
				</#if>
				<#if dmv.methodCode == 'C_M_I2'>
				
	/**
	 * ${dmv.methodComment!''}
	 * @param vo ${dco.codeComment}信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "${dmv.controllerRequestMapping!''}", method = RequestMethod.POST)
	public ModelAndView ${dmv.methodName!''}(@Valid ${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("${dmv.methodComment!''}");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.insert${dco.upperProjectName!''}${dco.upperModuleName!''}(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
				</#if>
				<#if dmv.methodCode == 'C_M_U6'>
	
	/**
	 * ${dmv.methodComment!''}
	 * @param id  标识
	 * @param request 请求体
	 * @return    视图
	 */
	@RequestMapping(value = "${dmv.controllerRequestMapping!''}", method = RequestMethod.POST)
	public ModelAndView ${dmv.methodName!''}(@Valid ${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean, HttpServletRequest request) {
		
		LOGGER.info("${dmv.methodComment!''}");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.update${dco.upperProjectName!''}${dco.upperModuleName!''}ById(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
		
	}
				</#if>
				<#if dmv.methodCode == 'C_M_D5'>	
	
	/**
	 * ${dmv.methodComment!''}
	 * @param id 标识
	 * @param response
	 */
	@RequestMapping(value = "${dmv.controllerRequestMapping!''}", method = RequestMethod.GET)
	public ModelAndView ${dmv.methodName!''}(@Valid Long id,  HttpServletRequest request) {
		
		LOGGER.info("${dmv.methodComment!''}");
		
		//操作人信息
		${dco.upperProjectName!''}${dco.upperModuleName!''}Bean bean = new ${dco.upperProjectName!''}${dco.upperModuleName!''}Bean();
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.${dco.lowerProjectName!''}${dco.upperModuleName!''}Service.delete${dco.upperProjectName!''}${dco.upperModuleName!''}ById(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
		
	}
				</#if>
			</#if>
		</#list>
	</#if>
	    
}