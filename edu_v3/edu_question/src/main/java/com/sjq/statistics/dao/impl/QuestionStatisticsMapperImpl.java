package com.sjq.statistics.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.statistics.dao.QuestionStatisticsMapper;

/**
 * 
 * 题库统计
 * @author ZeJie.Zheng
 * @since 2017年7月5日
 * @version 1.0
 */
@Repository("QuestionStatisticsMapper")
public class QuestionStatisticsMapperImpl extends BasicSqlSupport  implements QuestionStatisticsMapper {

	
	@Override
	public int queryQuestionStatisticsCount() {
		 return this.selectOne("com.sjq.statistics.dao.QuestionStatisticsMapper.queryQuestionStatisticsCount");
	}

	@Override
	public int queryQuestionStatisticsCountByToDay() {
		return this.selectOne("com.sjq.statistics.dao.QuestionStatisticsMapper.queryQuestionStatisticsCountByToDay");
	}

	@Override
	public List<Map<String, Object>> queryQuestionStatisticsCountGroupByCheckStatus() {
		return this.selectList("com.sjq.statistics.dao.QuestionStatisticsMapper.queryQuestionStatisticsCountGroupByCheckStatus");
	}

	@Override
	public List<Map<String, Object>> queryQuestionStatisticsCountGroupByStage() {
		return this.selectList("com.sjq.statistics.dao.QuestionStatisticsMapper.queryQuestionStatisticsCountGroupByStage");
	}

	@Override
	public List<Map<String, Object>> queryQuestionStatisticsCountGroupByGrade() {
		return this.selectList("com.sjq.statistics.dao.QuestionStatisticsMapper.queryQuestionStatisticsCountGroupByGrade");
	}

	@Override
	public List<Map<String, Object>> queryQuestionStatisticsCountGroupByBelongToLib() {
		return this.selectList("com.sjq.statistics.dao.QuestionStatisticsMapper.queryQuestionStatisticsCountGroupByBelongToLib");
	}

	@Override
	public List<Map<String, Object>> queryQuestionStatisticsCountGroupBySubject() {
		return this.selectList("com.sjq.statistics.dao.QuestionStatisticsMapper.queryQuestionStatisticsCountGroupBySubject");
	}
	
}
