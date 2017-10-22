package com.sjq.exam.online.servlet.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.exam.online.bean.OnlineSchedulingConfBean;
import com.sjq.exam.online.dao.OnlineSchedulingConfMapper;
import com.sjq.exam.online.servlet.OnlineSchedulingConfService;
import com.sjq.exam.online.vo.OnlineSchedulingConfVo;

/**
 * 
 * @ClassName:OnlinePaperConfServiceImpl
 * @Description:线下考试试卷配置ServiceImpl
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:25:55
 * @version 1.0
 */
@Service("OnlineSchedulingConfService")
public class OnlineSchedulingConfServiceImpl implements OnlineSchedulingConfService {

	@Autowired
	private OnlineSchedulingConfMapper onlineSchedulingConfMapper;
	
	@Override
	public int updateOnlineSchedulingConfById(Long examId,String runningState) {
		if(examId == null || runningState == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("runningState", runningState);
		return onlineSchedulingConfMapper.updateOnlineSchedulingConfById(map);
	}

	@Override
	public int allSurveyProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return onlineSchedulingConfMapper.allSurveyProc(map);
	}

	@Override
	public int allSumSegmentedProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return onlineSchedulingConfMapper.allSumSegmentedProc(map);
	}

	@Override
	public int allEachSegmentedProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return onlineSchedulingConfMapper.allEachSegmentedProc(map);
	}

	@Override
	public int allLevelSpreadProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return onlineSchedulingConfMapper.allLevelSpreadProc(map);
	}

	@Override
	public int allScoreContrastProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return onlineSchedulingConfMapper.allScoreContrastProc(map);
	}

	@Override
	public int allExamSituationProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return onlineSchedulingConfMapper.allExamSituationProc(map);
	}

	@Override
	public int allPointNameProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return onlineSchedulingConfMapper.allPointNameProc(map);
	}

	@Override
	public int allAbilityNameProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return onlineSchedulingConfMapper.allAbilityNameProc(map);
	}

	@Override
	public int allQuestionTypeProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return onlineSchedulingConfMapper.allQuestionTypeProc(map);
	}

	@Override
	public int allQuestionNoProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return onlineSchedulingConfMapper.allQuestionNoProc(map);
	}

	@Override
	public int allSubjectScatterProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return onlineSchedulingConfMapper.allSubjectScatterProc(map);
	}

	public OnlineSchedulingConfVo selectSchedulingStatus(Long examId) {
		return this.onlineSchedulingConfMapper.selectSchedulingStatus(examId);
	}

	@Override
	public int insertOnlineSchedulingConfBean(OnlineSchedulingConfBean bean) {
		return this.onlineSchedulingConfMapper.insertOnlineSchedulingConfBean(bean);
	}

}
