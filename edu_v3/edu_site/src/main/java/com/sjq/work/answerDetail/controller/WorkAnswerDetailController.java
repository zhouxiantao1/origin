package com.sjq.work.answerDetail.controller;

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
import com.sjq.answerDetail.service.WorkAnswerDetailService;
import com.sjq.util.PageBean;
import com.sjq.ware.service.QuestionWareService;
import com.sjq.ware.vo.QuestionWareVo;
import com.sjq.wrong.bean.WorkWrongBean;
import com.sjq.wrong.search.WorkWrongSearch;
import com.sjq.wrong.service.WorkWrongService;
import com.sjq.wrong.vo.WorkWrongVo;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.answerDetail.bean.WorkAnswerDetailBean;
import com.sjq.answerDetail.search.WorkAnswerDetailSearch;
import com.sjq.answerDetail.vo.WorkAnswerDetailVo;

/**
 * [自动生成]作答详细信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/work/answerDetail")
public class WorkAnswerDetailController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="answerDetail/";
	
	// 作答详细信息页面 
	private static final String PAGE = "answerDetailList";
	
	// 作答详细信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存作答详细信息信息";
	private static final String OPERA_LOG_UPDATE = "更新作答详细信息信息";
	private static final String OPERA_LOG_DELETE = "删除作答详细信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除作答详细信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(WorkAnswerDetailController.class);
	
	@Autowired
	private WorkAnswerDetailService workAnswerDetailService;
	@Autowired
	private QuestionWareService questionWareService;
	@Autowired
	private WorkWrongService workWrongService;
	
				
	/**
	 * 根据ID查询作答详细信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public WorkAnswerDetailVo ajaxQueryWorkAnswerDetailById(WorkAnswerDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答详细信息");
		return this.workAnswerDetailService.queryWorkAnswerDetailById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有作答详细信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<WorkAnswerDetailVo> ajaxQueryWorkAnswerDetailBySearch(WorkAnswerDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答详细信息");
		return this.workAnswerDetailService.queryWorkAnswerDetailBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询作答详细信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryWorkAnswerDetailPage(PageBean pb,WorkAnswerDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答详细信息");
		return this.workAnswerDetailService.queryWorkAnswerDetailPage(pb, search);
	    
	}
				
				
	/**
	 * (删除)根据条件删除作答详细信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch/delete")
	@ResponseBody
	public int ajaxDeleteWorkAnswerDetailBySearch(WorkAnswerDetailBean bean,WorkAnswerDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答详细信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.workAnswerDetailService.deleteWorkAnswerDetailBySearch(bean,search);
	    
	}
	
				
	/**
	 * (更新)根据条件更新所有作答详细信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch/update")
	@ResponseBody
	public int ajaxUpdateWorkAnswerDetailBySearch(WorkAnswerDetailBean bean,WorkAnswerDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答详细信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.workAnswerDetailService.updateWorkAnswerDetailBySearch(bean,search);
	    
	}
	
	
				
	/**
	 * (同步)根据条件查询所有的作答详细信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllWorkAnswerDetail(HttpServletRequest request, HttpServletResponse response, PageBean pb, WorkAnswerDetailSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的作答详细信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.workAnswerDetailService.queryWorkAnswerDetailPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
				
	/**
	 * (增加)增加信息作答详细信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertWorkAnswerDetail(WorkAnswerDetailBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作答详细信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		bean.setUserId(cu.getUserId());
		//判断答题是否正确
		boolean isRight = questionWareService.checkQuestionWareAnswer(bean.getQuestionId(), bean.getSelectNum());
		bean.setIsRight(isRight?"0":"1"); //0-z正确，1-错误
		
		if("1".equals(bean.getIsRight())){//如果错误加入错题集
			WorkWrongSearch workWrongSearch = new WorkWrongSearch();
			workWrongSearch.setQuestionId(bean.getQuestionId());
			workWrongSearch.setDelflag("0");
			List<WorkWrongVo> workWrongVoList = workWrongService.queryWorkWrongBySearch(workWrongSearch);
			if(workWrongVoList.size()>0){
				for(WorkWrongVo workWrongVo : workWrongVoList){
					WorkWrongBean workWrongBean = new WorkWrongBean();
					Long num = workWrongVo.getWrongNum();
					workWrongBean.setWrongNum(num+1);
					workWrongBean.setId(workWrongVo.getId());
					workWrongService.updateWorkWrongById(workWrongBean);
				}
			}else{
				QuestionWareVo questionWareVo = questionWareService.queryQuestionWareById(bean.getQuestionId());
				WorkWrongBean workWrongBean = new WorkWrongBean();
				workWrongBean.setQuestionId(questionWareVo.getId());
				workWrongBean.setGradeId(questionWareVo.getGradeId());
				workWrongBean.setSubjectId(questionWareVo.getSubjectId());
				workWrongBean.setStageId(questionWareVo.getStageId());
				workWrongBean.setQuestionType(questionWareVo.getTypeId());
				workWrongBean.setUserId(cu.getUserId());
				workWrongBean.setHomeworkId(bean.getHomeworkId());
				workWrongBean.setStatus("0");
				workWrongBean.setType("0");
				workWrongBean.setWrongNum(1L);
				workWrongBean.setCreateName(cu.getNameOfUser());
				workWrongBean.setCreateTime(new Date());
				workWrongService.insertWorkWrong(workWrongBean);
			}
		}
		return this.workAnswerDetailService.insertWorkAnswerDetail(bean);
	    
	}
	    
}