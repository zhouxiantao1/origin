package com.sjq.question.collect;

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
import com.sjq.collect.service.QuestionCollectService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.collect.bean.QuestionCollectBean;
import com.sjq.collect.search.QuestionCollectSearch;
import com.sjq.collect.vo.QuestionCollectVo;

/**
 * [自动生成]题库模块-题库收藏控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/question/collect")
public class QuestionCollectController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="collect/";
	
	// 题库模块-题库收藏页面 
	private static final String PAGE = "collectList";
	
	// 题库模块-题库收藏访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存题库模块-题库收藏信息";
	private static final String OPERA_LOG_UPDATE = "更新题库模块-题库收藏信息";
	private static final String OPERA_LOG_DELETE = "删除题库模块-题库收藏信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除题库模块-题库收藏信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(QuestionCollectController.class);
	
	@Autowired
	private QuestionCollectService questionCollectService;
	
				
	/**
	 * (增加)增加信息题库模块-题库收藏
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertQuestionCollect(QuestionCollectBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题库模块-题库收藏");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		bean.setUserId(cu.getUserId());
		return this.questionCollectService.insertQuestionCollect(bean);
	    
	}
			
				
	/**
	 * (同步)根据条件查询所有的题库模块-题库收藏
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllQuestionCollect(HttpServletRequest request, HttpServletResponse response, PageBean pb, QuestionCollectSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的题库模块-题库收藏");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.questionCollectService.queryQuestionCollectPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	    
}