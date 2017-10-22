package com.sjq.base.school.controller;

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
import com.sjq.school.service.BaseSchoolService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.school.bean.BaseSchoolBean;
import com.sjq.school.search.BaseSchoolSearch;
import com.sjq.school.vo.BaseSchoolVo;

/**
 * [自动生成]基础模块-学校信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/school")
public class BaseSchoolController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/base/";
	
	// 基础模块-学校信息页面
	private static final String PAGE = "school_list";
	private static final String LIST = "base_school";
	private static final String CREATE = "base_school_create";
	
	// 基础模块-学校信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存基础模块-学校信息信息";
	private static final String OPERA_LOG_UPDATE = "更新基础模块-学校信息信息";
	private static final String OPERA_LOG_DELETE = "删除基础模块-学校信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除基础模块-学校信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseSchoolController.class);
	
	@Autowired
	private BaseSchoolService baseSchoolService;
	
	/**
	 * 根据区域ID查询的基础模块-学校信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyareaid")
	@ResponseBody
	public List<BaseSchoolVo> ajaxQueryBaseSchoolByAreaId(BaseSchoolSearch search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-学校信息");
		return this.baseSchoolService.queryBaseSchoolByAreaId(search.getAreaId());
	    
	}
				
	/**
	 * 根据ID查询基础模块-学校信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseSchoolVo ajaxQueryBaseSchoolById(BaseSchoolSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-学校信息");
		return this.baseSchoolService.queryBaseSchoolById(search.getId());
	    
	}
	
	
	/**
	* (同步)根据条件查询所有的基础模块-学校信息
	* @param request  请求体
	* @param response 响应体
	* @param pb       分页实体
	* @param search   搜索条件
	* @return         视图
	*/
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllBaseSchool(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseSchoolSearch search) {
	
	LOGGER.info("(同步)根据条件查询所有的基础模块-学校信息");
	
	ModelAndView mav = new ModelAndView(PAGE_FOLDER + LIST);
	
	PageBean pageBean = this.baseSchoolService.queryBaseSchoolPage(pb,search);
	
	mav.addObject("pb", pageBean);
	mav.addObject("search", search);
	
	return mav;
	
	}	
	
	/**
	* (同步)新增-学校信息
	* @param request  请求体
	* @param response 响应体
	* @param pb       分页实体
	* @param search   搜索条件
	* @return         视图
	*/
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createBaseSchool(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseSchoolSearch search) {
	
	LOGGER.info("(同步)根据条件查询所有的基础模块-学校信息");
	
	ModelAndView mav = new ModelAndView(PAGE_FOLDER + CREATE);
	
	return mav;
	
	}	
			
				
	/**
	 * 根据条件查询所有基础模块-学校信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseSchoolVo> ajaxQueryBaseSchoolBySearch(BaseSchoolSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-学校信息");
		return this.baseSchoolService.queryBaseSchoolBySearch(search);
	    
	}
	    
	
	/**
	 * (同步）增加信息基础模块-学校信息
	 * @param vo 基础模块-学校信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveBaseSchool(@Valid BaseSchoolBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息基础模块-学校信息");
		
		//操作人信息
//		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		int result = this.baseSchoolService.insertBaseSchool(bean);
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	
	/**
	 * (增加)增加信息基础模块-学校信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertBaseSchool(BaseSchoolBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-学校信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.baseSchoolService.insertBaseSchool(bean);
	    
	}
}