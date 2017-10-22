package com.sjq.exam.offline.servlet.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.exam.offline.dao.OfflineSchedulingConfMapper;
import com.sjq.exam.offline.servlet.OfflineSchedulingConfService;

/**
 * 
 * @ClassName:OfflinePaperConfServiceImpl
 * @Description:线下考试试卷配置ServiceImpl
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:25:55
 * @version 1.0
 */
@Service("OfflineSchedulingConfService")
public class OfflineSchedulingConfServiceImpl implements OfflineSchedulingConfService {

	@Autowired
	private OfflineSchedulingConfMapper offlineSchedulingConfMapper;

	@Override
	public int allSurveyProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return offlineSchedulingConfMapper.allSurveyProc(map);
	}

	@Override
	public int allSumSegmentedProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return offlineSchedulingConfMapper.allSumSegmentedProc(map);
	}

	@Override
	public int allEachSegmentedProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return offlineSchedulingConfMapper.allEachSegmentedProc(map);
	}

	@Override
	public int allLevelSpreadProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return offlineSchedulingConfMapper.allLevelSpreadProc(map);
	}

	@Override
	public int allScoreContrastProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return offlineSchedulingConfMapper.allScoreContrastProc(map);
	}

	@Override
	public int allExamSituationProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return offlineSchedulingConfMapper.allExamSituationProc(map);
	}

	@Override
	public int allPointNameProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return offlineSchedulingConfMapper.allPointNameProc(map);
	}

	@Override
	public int allAbilityNameProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return offlineSchedulingConfMapper.allAbilityNameProc(map);
	}

	@Override
	public int allQuestionTypeProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return offlineSchedulingConfMapper.allQuestionTypeProc(map);
	}

	@Override
	public int allQuestionNoProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return offlineSchedulingConfMapper.allQuestionNoProc(map);
	}

	@Override
	public int allSubjectScatterProc(Long examId, String examRange) {
		if(examId == null || examRange == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("examRange", examRange);
		
		return offlineSchedulingConfMapper.allSubjectScatterProc(map);
	}

}
