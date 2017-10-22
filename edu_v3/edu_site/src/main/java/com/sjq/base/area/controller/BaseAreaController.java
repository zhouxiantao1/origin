package com.sjq.base.area.controller;

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
import com.sjq.area.service.BaseAreaService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.area.bean.BaseAreaBean;
import com.sjq.area.search.BaseAreaSearch;
import com.sjq.area.vo.BaseAreaVo;

/**
 * [自动生成]基础模块-区域信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/area")
public class BaseAreaController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/base/";
	
	// 基础模块-区域信息页面 
	private static final String PAGE = "areaList";
	private static final String LIST = "base_area";
	
	// 基础模块-区域信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存基础模块-区域信息信息";
	private static final String OPERA_LOG_UPDATE = "更新基础模块-区域信息信息";
	private static final String OPERA_LOG_DELETE = "删除基础模块-区域信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除基础模块-区域信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseAreaController.class);
	
	@Autowired
	private BaseAreaService baseAreaService;
	
				
	/**
	 * 根据父类ID查询基础模块-区域信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyparentid")
	@ResponseBody
	public List<BaseAreaVo> ajaxQueryBaseAreaByParentId(BaseAreaSearch search,Long parentId,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-区域信息");
		return this.baseAreaService.queryBaseAreaByParentId(parentId);
	    
	}
				
	/**
	 * 根据ID查询基础模块-区域信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseAreaVo ajaxQueryBaseAreaById(BaseAreaSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-区域信息");
		return this.baseAreaService.queryBaseAreaById(search.getId());
	    
	}
		
			
				
	/**
	 * 根据条件查询所有基础模块-区域信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseAreaVo> ajaxQueryBaseAreaBySearch(BaseAreaSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-区域信息");
		return this.baseAreaService.queryBaseAreaBySearch(search);
	    
	}
	
	/**
	 * (同步)根据条件查询所有的基础模块-区域信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllBaseArea(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseAreaSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-区域信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + LIST);
		
		PageBean pageBean = this.baseAreaService.queryBaseAreaPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	
	/**
	 * (增加)增加信息基础模块-区域信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertBaseArea(BaseAreaBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-区域信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.baseAreaService.insertBaseArea(bean);
	    
	}
	    
}