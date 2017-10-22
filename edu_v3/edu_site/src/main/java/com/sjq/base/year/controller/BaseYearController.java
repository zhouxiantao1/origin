package com.sjq.base.year.controller;

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
import com.sjq.year.service.BaseYearService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.year.bean.BaseYearBean;
import com.sjq.year.search.BaseYearSearch;
import com.sjq.year.vo.BaseYearVo;

/**
 * [自动生成]基础模块-年份信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/year")
public class BaseYearController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="base/year/";
	
	// 基础模块-年份信息页面 
	private static final String PAGE = "yearList";
	
	// 基础模块-年份信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存基础模块-年份信息信息";
	private static final String OPERA_LOG_UPDATE = "更新基础模块-年份信息信息";
	private static final String OPERA_LOG_DELETE = "删除基础模块-年份信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除基础模块-年份信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseYearController.class);
	
	@Autowired
	private BaseYearService baseYearService;
	
				
	/**
	 * 根据ID查询基础模块-年份信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseYearVo ajaxQueryBaseYearById(BaseYearSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-年份信息");
		return this.baseYearService.queryBaseYearById(search.getId());
	    
	}
	
			
	/**
	 * 根据条件查询所有基础模块-年份信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseYearVo> ajaxQueryBaseYearBySearch(BaseYearSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-年份信息");
		return this.baseYearService.queryBaseYearBySearch(search);
	    
	}
	    
}