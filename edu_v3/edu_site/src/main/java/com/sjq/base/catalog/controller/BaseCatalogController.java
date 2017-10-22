package com.sjq.base.catalog.controller;

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
import com.sjq.catalog.service.BaseCatalogService;
import com.sjq.util.PageBean;
import com.sjq.version.service.BaseVersionService;
import com.sjq.version.vo.BaseVersionVo;
import com.sjq.year.service.BaseYearService;
import com.sjq.year.vo.BaseYearVo;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.security.util.CustomUser;
import com.sjq.catalog.bean.BaseCatalogBean;
import com.sjq.catalog.search.BaseCatalogSearch;
import com.sjq.catalog.vo.BaseCatalogVo;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;

/**
 * [自动生成]基础模块-目录信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/catalog")
public class BaseCatalogController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/base/";
	
	// 基础模块-目录信息页面 
	private static final String PAGE = "base_catalog";
	private static final String CREATE = "base_catalog_create";
	
	// 基础模块-目录信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存基础模块-目录信息信息";
	private static final String OPERA_LOG_UPDATE = "更新基础模块-目录信息信息";
	private static final String OPERA_LOG_DELETE = "删除基础模块-目录信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除基础模块-目录信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseCatalogController.class);
	
	@Autowired
	private BaseCatalogService baseCatalogService;
	@Autowired
	private BaseVersionService baseVersionService;
	@Autowired
	private BaseYearService baseYearService;
	@Autowired
	private BaseSubjectService baseSubjectService;
	@Autowired
	private BaseGradeService baseGradeService;
	/**
	 * (同步)根据条件查询所有的基础模块-目录信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllBaseCatalog(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseCatalogSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-目录信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.baseCatalogService.queryBaseCatalogPage(pb,search);
		
		//查询所有学科
		List<BaseSubjectVo> baseSubjectVos = baseSubjectService.queryAllBaseSubject();
		//查询版本信息
		List<BaseVersionVo> baseVersionVos = baseVersionService.queryAllBaseVersion();
		//查询所有年级
		List<BaseGradeVo> baseGradeVos = baseGradeService.queryAllBaseGrade();
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		mav.addObject("baseSubjectVos", baseSubjectVos);
		mav.addObject("baseVersionVos", baseVersionVos);
		mav.addObject("baseGradeVos", baseGradeVos);
		return mav;
		
	}		
	
	/**
	 * (同步)根据条件查询所有的基础模块-目录信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createBaseCatalog(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseCatalogSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-目录信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CREATE);
//		
//		PageBean pageBean = this.baseCatalogService.queryBaseCatalogPage(pb,search);
//		
//		mav.addObject("pb", pageBean);
//		mav.addObject("search", search);
		//查询版本信息
		List<BaseVersionVo> baseVersionVos = baseVersionService.queryAllBaseVersion();
		//查询年份信息
		List<BaseYearVo> baseYearVos = baseYearService.queryAllBaseYear();
		
		
		mav.addObject("baseVersionVos", baseVersionVos);
		mav.addObject("baseYearVos", baseYearVos);
		return mav;
		
	}	
				
	/**
	 * 根据ID查询基础模块-目录信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseCatalogVo ajaxQueryBaseCatalogById(BaseCatalogSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-目录信息");
		return this.baseCatalogService.queryBaseCatalogById(search.getId());
	    
	}
			
				
	/**
	 * 根据条件查询所有基础模块-目录信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseCatalogVo> ajaxQueryBaseCatalogBySearch(BaseCatalogSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-目录信息");
		return this.baseCatalogService.queryBaseCatalogBySearch(search);
	    
	}
	
	/**
	 * (增加)增加信息基础模块-目录信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertBaseCatalog(BaseCatalogBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-目录信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.baseCatalogService.insertBaseCatalog(bean);
	    
	}
    
}