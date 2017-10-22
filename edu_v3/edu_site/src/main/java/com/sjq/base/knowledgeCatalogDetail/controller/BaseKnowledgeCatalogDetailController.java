package com.sjq.base.knowledgeCatalogDetail.controller;

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
import com.sjq.knowledgeCatalogDetail.service.BaseKnowledgeCatalogDetailService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.knowledgeCatalogDetail.bean.BaseKnowledgeCatalogDetailBean;
import com.sjq.knowledgeCatalogDetail.search.BaseKnowledgeCatalogDetailSearch;
import com.sjq.knowledgeCatalogDetail.vo.BaseKnowledgeCatalogDetailVo;

/**
 * [自动生成]知识点目录详情信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "base/knowledge/catalogDetail")
public class BaseKnowledgeCatalogDetailController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="base/knowledge/catalogDetail/";
	
	// 知识点目录详情信息页面 
	private static final String PAGE = "knowledge_catalog_detail_List";
	
	// 知识点目录详情信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存知识点目录详情信息信息";
	private static final String OPERA_LOG_UPDATE = "更新知识点目录详情信息信息";
	private static final String OPERA_LOG_DELETE = "删除知识点目录详情信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除知识点目录详情信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseKnowledgeCatalogDetailController.class);
	
	@Autowired
	private BaseKnowledgeCatalogDetailService baseKnowledgeCatalogDetailService;
	
				
	/**
	 * 根据ID查询知识点目录详情信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseKnowledgeCatalogDetailVo ajaxQueryBaseKnowledgeCatalogDetailById(BaseKnowledgeCatalogDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("知识点目录详情信息");
		return this.baseKnowledgeCatalogDetailService.queryBaseKnowledgeCatalogDetailById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有知识点目录详情信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseKnowledgeCatalogDetailVo> ajaxQueryBaseKnowledgeCatalogDetailBySearch(BaseKnowledgeCatalogDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("知识点目录详情信息");
		return this.baseKnowledgeCatalogDetailService.queryBaseKnowledgeCatalogDetailBySearch(search);
	    
	}
	
}