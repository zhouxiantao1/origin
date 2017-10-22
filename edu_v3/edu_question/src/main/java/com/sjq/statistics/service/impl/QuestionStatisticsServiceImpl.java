package com.sjq.statistics.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.statistics.dao.QuestionStatisticsMapper;
import com.sjq.statistics.service.QuestionStatisticsService;
import com.sjq.ware.dao.QuestionWareMapper;

/**
 * 
 * 题库统计
 * @author ZeJie.Zheng
 * @since 2017年7月5日
 * @version 1.0
 */
@Service("QuestionStatisticsService")
public class QuestionStatisticsServiceImpl implements QuestionStatisticsService {
	

	@Autowired
	private QuestionStatisticsMapper questionStatisticsMapper;
	
	
	@Override
	public int queryQuestionStatisticsCount() {
		
		return this.questionStatisticsMapper.queryQuestionStatisticsCount();
		
	}

	@Override
	public int queryQuestionStatisticsCountByToDay() {
		
		return this.questionStatisticsMapper.queryQuestionStatisticsCountByToDay();
		
	}

	@Override
	public List<Map<String, Object>> queryQuestionStatisticsCountGroupByCheckStatus() {
		
		return this.questionStatisticsMapper.queryQuestionStatisticsCountGroupByCheckStatus();
		
	}

	@Override
	public List<Map<String, Object>> queryQuestionStatisticsCountGroupByStage() {
		
		return this.questionStatisticsMapper.queryQuestionStatisticsCountGroupByStage();
		
	}

	@Override
	public List<Map<String, Object>> queryQuestionStatisticsCountGroupByGrade() {
		
		return this.questionStatisticsMapper.queryQuestionStatisticsCountGroupByGrade();
		
	}

	@Override
	public List<Map<String, Object>> queryQuestionStatisticsCountGroupByBelongToLib() {
		
		return this.questionStatisticsMapper.queryQuestionStatisticsCountGroupByBelongToLib();
		
	}

	@Override
	public List<Map<String, Object>> queryQuestionStatisticsCountGroupBySubject() {
		return this.questionStatisticsMapper.queryQuestionStatisticsCountGroupBySubject();
	}

	
}
