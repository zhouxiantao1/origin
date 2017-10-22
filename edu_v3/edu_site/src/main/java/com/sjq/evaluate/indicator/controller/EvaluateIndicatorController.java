package com.sjq.evaluate.indicator.controller;

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
import com.sjq.indicator.service.EvaluateIndicatorService;
import com.sjq.util.PageBean;
import com.sjq.ware.dto.ZTreeNodesDto;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.indicator.bean.EvaluateIndicatorBean;
import com.sjq.indicator.search.EvaluateIndicatorSearch;
import com.sjq.indicator.vo.EvaluateIndicatorVo;

/**
 * [自动生成]指标信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/evaluate/indicator")
public class EvaluateIndicatorController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/evaluate/";
	
	// 指标信息页面 
	private static final String PAGE = "indicator_list";
	private static final String CREATE = "indicator_create";
	private static final String LEVEL = "indicator_create_level";
	private static final String VIEW = "indicator_view";
	
	// 指标信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存指标信息信息";
	private static final String OPERA_LOG_UPDATE = "更新指标信息信息";
	private static final String OPERA_LOG_DELETE = "删除指标信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除指标信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(EvaluateIndicatorController.class);
	
	@Autowired
	private EvaluateIndicatorService evaluateIndicatorService;
	
				
	/**
	 * 查询所有的指标信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/ajaxlist")
	@ResponseBody
	public PageBean ajaxQueryEvaluateIndicatorAll(EvaluateIndicatorSearch search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("指标信息");
		PageBean pageBean = this.evaluateIndicatorService.queryEvaluateIndicatorPage(pb,new EvaluateIndicatorSearch());
		return pageBean;
	    
	}
				
	/**
	 * 根据ID查询状态为1指标信息信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid1")
	@ResponseBody
	public EvaluateIndicatorVo ajaxQueryEvaluateIndicatorById1(EvaluateIndicatorSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("指标信息");
		return this.evaluateIndicatorService.queryEvaluateIndicatorById1(search.getId());
	    
	}
	
	/**
	 * 根据ID查询指标信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public EvaluateIndicatorVo ajaxQueryEvaluateIndicatorById(EvaluateIndicatorSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("指标信息");
		return this.evaluateIndicatorService.queryEvaluateIndicatorById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有指标信息信息-树(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<ZTreeNodesDto> ajaxQueryEvaluateIndicatorBySearch(EvaluateIndicatorSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("指标信息");
		return this.evaluateIndicatorService.queryEvaluateIndicatorBySearch(search);
	    
	}
	
				
	/**
	 * 分页查询指标信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryEvaluateIndicatorPage(PageBean pb,EvaluateIndicatorSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("指标信息");
		return this.evaluateIndicatorService.queryEvaluateIndicatorPage(pb, search);
	    
	}
				
				
	/**
	 * (更新)根据ID更新所有指标信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/update")
	@ResponseBody
	public int ajaxUpdateEvaluateIndicatorById(EvaluateIndicatorBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("指标信息");
		//操作人信息
//		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
//		bean.setCreateName(cu.getUsername());
//		bean.setCreateTime(new Date());
		return this.evaluateIndicatorService.updateEvaluateIndicatorById(bean);
	    
	}
	
	/**
	 * (更新)根据ID更新所有指标信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/delete")
	@ResponseBody
	public int deleteEvaluateIndicatorById(EvaluateIndicatorBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("指标信息");
		//操作人信息
		return this.evaluateIndicatorService.deleteEvaluateIndicatorById(bean.getId());
	    
	}
	
				
	/**
	 * (同步)根据条件查询所有的指标信息(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllEvaluateIndicator(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateIndicatorSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的指标信息");
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		search.setParentId(0L);
		if(search.getType()==null){
			search.setType("3");
		}
		search.setUserId(cu.getUserId());
		PageBean pageBean = this.evaluateIndicatorService.queryEvaluateIndicatorPage(pb,search);
		
		String type = search.getType();
		mav.addObject("pageBean", pageBean);
		mav.addObject("search", search);
		mav.addObject("type", search.getType());
		
		return mav;
		
	}
	
	/**
	 * (同步)新增指标体系(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createEvaluateIndicator(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateIndicatorSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的指标信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CREATE);
	
		return mav;
		
	}
	/**
	 * (同步)新增下级指标体系(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView viewEvaluateIndicator(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateIndicatorSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的指标信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + VIEW);
	
		return mav;
		
	}
	
	/**
	 * (同步)新增下级指标体系(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create/level", method = RequestMethod.GET)
	public ModelAndView createLevelEvaluateIndicator(HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateIndicatorSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的指标信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + LEVEL);
	
		return mav;
		
	}
	
	
	/**
	 * (增加)增加信息指标信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public Long ajaxInsertEvaluateIndicator(EvaluateIndicatorBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("指标信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getNameOfUser());
//		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		bean.setUserId(cu.getUserId());
		bean.setUseNum(0L);
		this.evaluateIndicatorService.insertEvaluateIndicator(bean);
		return bean.getId();
	    
	}
				
	/**
	 * (同步）增加信息指标信息
	 * @param vo 指标信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEvaluateIndicator(@Valid EvaluateIndicatorBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息指标信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.evaluateIndicatorService.insertEvaluateIndicator(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	    
}