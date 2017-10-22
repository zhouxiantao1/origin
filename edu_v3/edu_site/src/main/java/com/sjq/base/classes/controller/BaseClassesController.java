package com.sjq.base.classes.controller;

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
import com.sjq.classes.service.BaseClassesService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.classes.bean.BaseClassesBean;
import com.sjq.classes.search.BaseClassesSearch;
import com.sjq.classes.vo.BaseClassesVo;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;

/**
 * [自动生成]基础模块-班级信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "base/classes")
public class BaseClassesController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/base/";
	
	// 基础模块-班级信息页面 
	private static final String PAGE = "classes_list";
	private static final String LIST = "base_classes";
	private static final String CREATA = "base_classes_create";
	
	// 基础模块-班级信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存基础模块-班级信息信息";
	private static final String OPERA_LOG_UPDATE = "更新基础模块-班级信息信息";
	private static final String OPERA_LOG_DELETE = "删除基础模块-班级信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除基础模块-班级信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseClassesController.class);
	
	@Autowired
	private BaseClassesService baseClassesService;
	@Autowired
	private BaseGradeService baseGradeService;
	
	/**
	 * (同步)根据条件查询所有的基础模块-班级信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllBaseClasses(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseClassesSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-班级信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + LIST);
		
		PageBean pageBean = this.baseClassesService.queryBaseClassesPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	
	/**
	 * (同步)根据条件查询所有的基础模块-班级信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createBaseClasses(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseClassesSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-班级信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CREATA);

		//查询所有年级
		List<BaseGradeVo> baseGradeVos = baseGradeService.queryAllBaseGrade();
		
		mav.addObject("baseGradeVos", baseGradeVos);
		return mav;
		
	}
				
	/**
	 * 根据ID查询基础模块-班级信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseClassesVo ajaxQueryBaseClassesById(BaseClassesSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-班级信息");
		return this.baseClassesService.queryBaseClassesById(search.getId());
	    
	}
			
				
	/**
	 * 根据条件查询所有基础模块-班级信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseClassesVo> ajaxQueryBaseClassesBySearch(BaseClassesSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-班级信息");
		return this.baseClassesService.queryBaseClassesBySearch(search);
	    
	}
		
	/**
	 * (增加)增加信息基础模块-班级信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertBaseClasses(BaseClassesBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-班级信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.baseClassesService.insertBaseClasses(bean);
	    
	}    
}