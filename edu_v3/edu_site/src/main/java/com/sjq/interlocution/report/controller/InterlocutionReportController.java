package com.sjq.interlocution.report.controller;

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
import com.sjq.report.service.InterlocutionReportService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.report.bean.InterlocutionReportBean;
import com.sjq.report.search.InterlocutionReportSearch;
import com.sjq.report.vo.InterlocutionReportVo;

/**
 * [自动生成]举报信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/interlocution/report")
public class InterlocutionReportController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/interlocution/";
	
	// 举报信息页面 
	private static final String PAGE = "report_list";
	
	// 举报信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存举报信息信息";
	private static final String OPERA_LOG_UPDATE = "更新举报信息信息";
	private static final String OPERA_LOG_DELETE = "删除举报信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除举报信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(InterlocutionReportController.class);
	
	@Autowired
	private InterlocutionReportService interlocutionReportService;
	
				
	/**
	 * 根据ID查询举报信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public InterlocutionReportVo ajaxQueryInterlocutionReportById(InterlocutionReportSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("举报信息");
		return this.interlocutionReportService.queryInterlocutionReportById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有举报信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<InterlocutionReportVo> ajaxQueryInterlocutionReportBySearch(InterlocutionReportSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("举报信息");
		return this.interlocutionReportService.queryInterlocutionReportBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询举报信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryInterlocutionReportPage(PageBean pb,InterlocutionReportSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("举报信息");
		return this.interlocutionReportService.queryInterlocutionReportPage(pb, search);
	    
	}
				
				
	/**
	 * (更新)根据条件更新所有举报信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch/update")
	@ResponseBody
	public int ajaxUpdateInterlocutionReportBySearch(InterlocutionReportBean bean,InterlocutionReportSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("举报信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
//		bean.setModName("zhouxiaotao");
		bean.setModTime(new Date());
//		System.out.println("======beanstuts=========="+bean.getStatus());
		return this.interlocutionReportService.updateInterlocutionReportBySearch(bean,search);
	    
	}
	
	
				
	/**
	 * (增加)增加信息举报信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertInterlocutionReport(Long isAddNum,InterlocutionReportSearch search,InterlocutionReportBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("举报信息");
		//如果举报存在则举报次数加1，不存在侧新增
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
//		bean.setCreateName(cu.getUsername());
		
//		System.out.println("========getAnswerId=============="+search.getAnswerId());
		int i = interlocutionReportService.queryInterlocutionReportTotalCount(search);
		if(i==0){
//			bean.setCreateName("zhouxiaotao");
			bean.setCreateName(cu.getUsername());
			bean.setCreateTime(new Date());
			bean.setReportNum(1L);
			bean.setStatus("0");
			return this.interlocutionReportService.insertInterlocutionReport(bean);
		}else{//举报已存在
			bean.setModName("zhouxiaotao");
			bean.setModTime(new Date());
			if(isAddNum==1){
				search.setReportNum("report_num + 1");
			}else{
				search.setReportNum("report_num - 1");
			}
			return this.interlocutionReportService.updateInterlocutionReportBySearch(bean, search);
		}  
	}
			
				
	/**
	 * (同步)根据条件查询所有的举报信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllInterlocutionReport(HttpServletRequest request, HttpServletResponse response, PageBean pb, InterlocutionReportSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的举报信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.interlocutionReportService.queryInterlocutionReportPage(pb,search);
		
		mav.addObject("pageBean", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
				
	/**
	 * (同步）增加信息举报信息
	 * @param vo 举报信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveInterlocutionReport(@Valid InterlocutionReportBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息举报信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		int result = this.interlocutionReportService.insertInterlocutionReport(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	
	/**
	 * (更新)根据ID更新所有举报信息信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/update")
	@ResponseBody
	public int ajaxUpdateInterlocutionReportById(InterlocutionReportBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("举报信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setModName("zhouxiaotao");
		bean.setModTime(new Date());
		return this.interlocutionReportService.updateInterlocutionReportById(bean);
	    
	}
	    
}