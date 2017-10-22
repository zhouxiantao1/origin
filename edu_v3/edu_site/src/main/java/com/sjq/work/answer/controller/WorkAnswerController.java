package com.sjq.work.answer.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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
import com.sjq.answer.service.WorkAnswerService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.student.service.BaseStudentService;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.security.util.CustomUser;
import com.sjq.answer.bean.WorkAnswerBean;
import com.sjq.answer.search.WorkAnswerSearch;
import com.sjq.answer.vo.WorkAnswerVo;
import com.sjq.answerDetail.search.WorkAnswerDetailSearch;
import com.sjq.answerDetail.service.WorkAnswerDetailService;

/**
 * [自动生成]作答信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/work/answer")
public class WorkAnswerController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="answer/";
	
	// 作答信息页面 
	private static final String PAGE = "answerList";
	
	// 作答信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存作答信息信息";
	private static final String OPERA_LOG_UPDATE = "更新作答信息信息";
	private static final String OPERA_LOG_DELETE = "删除作答信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除作答信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(WorkAnswerController.class);
	
	@Autowired
	private WorkAnswerService workAnswerService;
	@Autowired
	private BaseStudentService baseStudentService;
	@Autowired
	private WorkAnswerDetailService workAnswerDetailService;
	
				
	/**
	 * 根据ID查询作答信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public WorkAnswerVo ajaxQueryWorkAnswerById(WorkAnswerSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答信息");
		return this.workAnswerService.queryWorkAnswerById(search.getId());
	    
	}
	
	/**
	 * 计算正确率(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/updatebyid")
	@ResponseBody
	public int ajaxQupdateWorkAnswerById(WorkAnswerBean bean,WorkAnswerSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答信息");
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		//根据用userID和作业ID获取答题列表
		WorkAnswerDetailSearch workAnswerDetailSearch = new WorkAnswerDetailSearch();
		workAnswerDetailSearch.setHomeworkId(search.getHomeworkId());
		workAnswerDetailSearch.setUserId(cu.getUserId());
		workAnswerDetailSearch.setIsRight("0");
		
		double isTrue = workAnswerDetailService.queryWorkAnswerDetailTotalCount(workAnswerDetailSearch);//正确
		workAnswerDetailSearch.setIsRight("1");
		double isFalse = workAnswerDetailService.queryWorkAnswerDetailTotalCount(workAnswerDetailSearch);//错误
		double tp= isTrue/(isTrue+isFalse)*100;
		DecimalFormat df = new DecimalFormat("0");
		
		bean.setCorrect(df.format(tp));
		
		return this.workAnswerService.updateWorkAnswerById(bean);
	    
	}
				
	/**
	 * 根据条件查询所有作答信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<WorkAnswerVo> ajaxQueryWorkAnswerBySearch(WorkAnswerSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答信息");
		return this.workAnswerService.queryWorkAnswerBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询作答信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryWorkAnswerPage(PageBean pb,WorkAnswerSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答信息");
		return this.workAnswerService.queryWorkAnswerPage(pb, search);
	    
	}
				
				
	/**
	 * (删除)根据条件删除作答信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch/delete")
	@ResponseBody
	public int ajaxDeleteWorkAnswerBySearch(WorkAnswerBean bean,WorkAnswerSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.workAnswerService.deleteWorkAnswerBySearch(bean,search);
	    
	}
	
				
	/**
	 * (同步)根据条件查询所有的作答信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllWorkAnswer(HttpServletRequest request, HttpServletResponse response, PageBean pb, WorkAnswerSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的作答信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.workAnswerService.queryWorkAnswerPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	
	/**
	 * (增加)增加信息作答信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public Long ajaxInsertWorkAnswer(WorkAnswerBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		bean.setCreateTime(new Date());
		
		//通过userid获取学生
		BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
		bean.setCreateName(baseStudentVo.getName());
		bean.setStudentId(baseStudentVo.getId());
		this.workAnswerService.insertWorkAnswer(bean);
		return bean.getId();
	}
	
	    
}