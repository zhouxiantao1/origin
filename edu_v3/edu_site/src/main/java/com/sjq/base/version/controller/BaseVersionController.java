package com.sjq.base.version.controller;

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
import com.sjq.version.service.BaseVersionService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.version.bean.BaseVersionBean;
import com.sjq.version.search.BaseVersionSearch;
import com.sjq.version.vo.BaseVersionVo;

/**
 * [自动生成]基础模块-版本信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/version")
public class BaseVersionController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="base/version/";
	
	// 基础模块-版本信息页面 
	private static final String PAGE = "versionList";
	
	// 基础模块-版本信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存基础模块-版本信息信息";
	private static final String OPERA_LOG_UPDATE = "更新基础模块-版本信息信息";
	private static final String OPERA_LOG_DELETE = "删除基础模块-版本信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除基础模块-版本信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseVersionController.class);
	
	@Autowired
	private BaseVersionService baseVersionService;
	
				
	/**
	 * 根据ID查询基础模块-版本信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseVersionVo ajaxQueryBaseVersionById(BaseVersionSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-版本信息");
		return this.baseVersionService.queryBaseVersionById(search.getId());
	    
	}
			
				
	/**
	 * 根据条件查询所有基础模块-版本信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseVersionVo> ajaxQueryBaseVersionBySearch(BaseVersionSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-版本信息");
		return this.baseVersionService.queryBaseVersionBySearch(search);
	    
	}
			    
}