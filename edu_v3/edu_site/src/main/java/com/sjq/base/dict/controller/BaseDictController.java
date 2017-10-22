package com.sjq.base.dict.controller;

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
import com.sjq.dict.service.BaseDictService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.dict.bean.BaseDictBean;
import com.sjq.dict.search.BaseDictSearch;
import com.sjq.dict.vo.BaseDictVo;

/**
 * [自动生成]字典工具信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "base/dict")
public class BaseDictController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="base/dict/";
	
	// 字典工具信息页面 
	private static final String PAGE = "dict_list";
	
	// 字典工具信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存字典工具信息信息";
	private static final String OPERA_LOG_UPDATE = "更新字典工具信息信息";
	private static final String OPERA_LOG_DELETE = "删除字典工具信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除字典工具信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseDictController.class);
	
	@Autowired
	private BaseDictService baseDictService;
		
				
	/**
	 * 根据ID查询字典工具信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseDictVo ajaxQueryBaseDictById(BaseDictSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("字典工具信息");
		return this.baseDictService.queryBaseDictById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有字典工具信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseDictVo> ajaxQueryBaseDictBySearch(BaseDictSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		LOGGER.info("字典工具信息");
		return this.baseDictService.queryBaseDictBySearch(search);
	    
	}
   
}