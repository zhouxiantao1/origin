package com.sjq.exam.offline.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.exam.offline.dao.OfflineSchedulingConfMapper;
import com.sjq.manager.base.BasicSqlSupport;

/**
 * 
 * @ClassName:OfflineSchedulingConfMapperImp
 * @Description:线下考试调度daoImp
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:23:34
 * @version 1.0
 */
@Repository("OfflineSchedulingConfMapper")
public class OfflineSchedulingConfMapperImpl extends BasicSqlSupport implements OfflineSchedulingConfMapper {
	
	@Override
	public int allSurveyProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.offline.dao.OfflineSchedulingConfMapper.allSurveyProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allSumSegmentedProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.offline.dao.OfflineSchedulingConfMapper.allSumSegmentedProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allEachSegmentedProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.offline.dao.OfflineSchedulingConfMapper.allEachSegmentedProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allLevelSpreadProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.offline.dao.OfflineSchedulingConfMapper.allLevelSpreadProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allScoreContrastProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.offline.dao.OfflineSchedulingConfMapper.allScoreContrastProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allExamSituationProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.offline.dao.OfflineSchedulingConfMapper.allExamSituationProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allPointNameProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.offline.dao.OfflineSchedulingConfMapper.allPointNameProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allAbilityNameProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.offline.dao.OfflineSchedulingConfMapper.allAbilityNameProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allQuestionTypeProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.offline.dao.OfflineSchedulingConfMapper.allQuestionTypeProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allQuestionNoProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.offline.dao.OfflineSchedulingConfMapper.allQuestionNoProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allSubjectScatterProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.offline.dao.OfflineSchedulingConfMapper.allSubjectScatterProc", map);
		return (int) map.get("out_flag");
	}

}
