package com.sjq.question.statistics;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sjq.collect.search.QuestionCollectSearch;
import com.sjq.collect.service.QuestionCollectService;
import com.sjq.statistics.service.QuestionStatisticsService;
import com.sjq.util.PageBean;

/**
 * 
 * 题库统计
 * @author ZeJie.Zheng
 * @since 2017年7月5日
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/question/statistics")
public class QuestionStatisticsController {
	
	@Autowired
	private QuestionStatisticsService questionStatisticsService;

	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="question/";
	
	// 题库模块-题库中心页面 
	private static final String PAGE = "question_statistics";
	
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
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		return mav;
		
	}

	
	@RequestMapping("/base/get")
	@ResponseBody
	public Map<String,Object> ajaxQueryQuestionStatisticsBase(HttpServletRequest reuqest,HttpServletResponse response) throws UnsupportedEncodingException {
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		int qc = this.questionStatisticsService.queryQuestionStatisticsCount();
		int qtc = this.questionStatisticsService.queryQuestionStatisticsCountByToDay();
		
		map.put("qc", qc);
		map.put("qtc", qtc);
		map.put("qs", this.questionStatisticsService.queryQuestionStatisticsCountGroupByCheckStatus());
		
		return map;
		
	}
	
	
	@RequestMapping("/stage/get")
	@ResponseBody
	public List<Map<String,Object>> ajaxQueryQuestionStatisticsStage(HttpServletRequest reuqest,HttpServletResponse response) throws UnsupportedEncodingException {
		
		return this.questionStatisticsService.queryQuestionStatisticsCountGroupByStage();
		
	}
	
	

	@RequestMapping("/grade/get")
	@ResponseBody
	public List<Map<String,Object>> ajaxQueryQuestionStatisticsGrade(HttpServletRequest reuqest,HttpServletResponse response) throws UnsupportedEncodingException {
		
		return this.questionStatisticsService.queryQuestionStatisticsCountGroupByGrade();
		
	}
	
	
	@RequestMapping("/subject/get")
	@ResponseBody
	public List<Map<String,Object>> ajaxQueryQuestionStatisticsSubject(HttpServletRequest reuqest,HttpServletResponse response) throws UnsupportedEncodingException {
		
		return this.questionStatisticsService.queryQuestionStatisticsCountGroupBySubject();
		
	}
	
	@RequestMapping("/lib/get")
	@ResponseBody
	public List<Map<String,Object>> ajaxQueryQuestionStatisticsLib(HttpServletRequest reuqest,HttpServletResponse response) throws UnsupportedEncodingException {
		
		return this.questionStatisticsService.queryQuestionStatisticsCountGroupByBelongToLib();
		
	}
	
	
	
	
}
