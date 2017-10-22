package com.sjq.exam.online.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.exam.online.bean.OnlineSchedulingConfBean;
import com.sjq.exam.online.dao.OnlineSchedulingConfMapper;
import com.sjq.exam.online.vo.OnlineSchedulingConfVo;
import com.sjq.manager.base.BasicSqlSupport;

/**
 * 
 * @ClassName:OnlineSchedulingConfMapperImp
 * @Description:线下考试调度daoImp
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:23:34
 * @version 1.0
 */
@Repository("OnlineSchedulingConfMapper")
public class OnlineSchedulingConfMapperImpl extends BasicSqlSupport implements OnlineSchedulingConfMapper {

	@Override
	public int updateOnlineSchedulingConfById(Map<String, Object> map) {
		return this.update("com.sjq.exam.online.dao.OnlineSchedulingConfMapper.updateOnlineSchedulingConfById", map);
	}
	
	@Override
	public int allSurveyProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.online.dao.OnlineSchedulingConfMapper.allSurveyProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allSumSegmentedProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.online.dao.OnlineSchedulingConfMapper.allSumSegmentedProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allEachSegmentedProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.online.dao.OnlineSchedulingConfMapper.allEachSegmentedProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allLevelSpreadProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.online.dao.OnlineSchedulingConfMapper.allLevelSpreadProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allScoreContrastProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.online.dao.OnlineSchedulingConfMapper.allScoreContrastProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allExamSituationProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.online.dao.OnlineSchedulingConfMapper.allExamSituationProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allPointNameProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.online.dao.OnlineSchedulingConfMapper.allPointNameProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allAbilityNameProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.online.dao.OnlineSchedulingConfMapper.allAbilityNameProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allQuestionTypeProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.online.dao.OnlineSchedulingConfMapper.allQuestionTypeProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allQuestionNoProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.online.dao.OnlineSchedulingConfMapper.allQuestionNoProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public int allSubjectScatterProc(Map<String, Object> map) {
		this.insert("com.sjq.exam.online.dao.OnlineSchedulingConfMapper.allSubjectScatterProc", map);
		return (int) map.get("out_flag");
	}

	@Override
	public OnlineSchedulingConfVo selectSchedulingStatus(Long examId) {
		return this.selectOne("com.sjq.exam.online.dao.OnlineSchedulingConfMapper.selectSchedulingStatus", examId);
	}

	@Override
	public int insertOnlineSchedulingConfBean(OnlineSchedulingConfBean bean) {
		return this.insert("com.sjq.exam.online.dao.OnlineSchedulingConfMapper.insertOnlineSchedulingConfBean", bean);
	}

}
