package com.sjq.question.type;

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
import com.sjq.type.service.QuestionTypeService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.type.bean.QuestionTypeBean;
import com.sjq.type.search.QuestionTypeSearch;
import com.sjq.type.vo.QuestionTypeVo;

/**
 * [自动生成]题库模块-题型信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/question/type")
public class QuestionTypeController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="type/";
	
	// 题库模块-题型信息页面 
	private static final String PAGE = "typeList";
	private static final String LIST = "/base/question_type";
	private static final String CREATE = "/base/question_type_create";
	
	// 题库模块-题型信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存题库模块-题型信息信息";
	private static final String OPERA_LOG_UPDATE = "更新题库模块-题型信息信息";
	private static final String OPERA_LOG_DELETE = "删除题库模块-题型信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除题库模块-题型信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(QuestionTypeController.class);
	
	@Autowired
	private QuestionTypeService questionTypeService;
	
				
	/**
	 * 根据ID查询题库模块-题型信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysubjectid")
	@ResponseBody
	public List<QuestionTypeVo> ajaxQueryQuestionTypeById(QuestionTypeSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题库模块-题型信息");
		return this.questionTypeService.queryQuestionTypeBySubjectId(search.getSubjectId());
	    
	}
	
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<QuestionTypeVo> ajaxQueryQuestionTypeBylistbySearch(QuestionTypeSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题库模块-题型信息");
		return this.questionTypeService.queryQuestionTypeBySearch(search);
	    
	}
	
	/**
	 * (增加)增加信息题库模块-题型信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertQuestionType(QuestionTypeBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题库模块-题型信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.questionTypeService.insertQuestionType(bean);
	    
	}
	
	/**
	 * (同步)根据条件查询所有的题库模块-题型信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllQuestionType(HttpServletRequest request, HttpServletResponse response, PageBean pb, QuestionTypeSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的题库模块-题型信息");
		
		ModelAndView mav = new ModelAndView(LIST);
		
		PageBean pageBean = this.questionTypeService.queryQuestionTypePage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	
	/**
	 * 新增页面-题型信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createQuestionType(HttpServletRequest request, HttpServletResponse response, PageBean pb, QuestionTypeSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的题库模块-题型信息");
		
		ModelAndView mav = new ModelAndView(CREATE);

		return mav;
		
	}
}		