package com.sjq.work.homeworkClasses.controller;

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
import com.sjq.homeworkClasses.service.WorkHomeworkClassesService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.homeworkClasses.bean.WorkHomeworkClassesBean;
import com.sjq.homeworkClasses.search.WorkHomeworkClassesSearch;
import com.sjq.homeworkClasses.vo.WorkHomeworkClassesVo;

/**
 * [自动生成]作业班级信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/work/homework/classes")
public class WorkHomeworkClassesController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="homework/classes/";
	
	// 作业班级信息页面 
	private static final String PAGE = "homeworkClassesList";
	
	// 作业班级信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存作业班级信息信息";
	private static final String OPERA_LOG_UPDATE = "更新作业班级信息信息";
	private static final String OPERA_LOG_DELETE = "删除作业班级信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除作业班级信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(WorkHomeworkClassesController.class);
	
	@Autowired
	private WorkHomeworkClassesService workHomeworkClassesService;
	
				
	/**
	 * 根据ID查询作业班级信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public WorkHomeworkClassesVo ajaxQueryWorkHomeworkClassesById(WorkHomeworkClassesSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作业班级信息");
		return this.workHomeworkClassesService.queryWorkHomeworkClassesById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有作业班级信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<WorkHomeworkClassesVo> ajaxQueryWorkHomeworkClassesBySearch(WorkHomeworkClassesSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作业班级信息");
		return this.workHomeworkClassesService.queryWorkHomeworkClassesBySearch(search);
	    
	}
	
	
				
	/**
	 * (增加)增加信息作业班级信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertWorkHomeworkClasses(WorkHomeworkClassesBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作业班级信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.workHomeworkClassesService.insertWorkHomeworkClasses(bean);
	    
	}
			
	    
}