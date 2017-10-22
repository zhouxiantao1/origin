package com.sjq.offquestionscore.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.offquestionscore.bean.OffQuestionscoreBean;
import com.sjq.offquestionscore.dao.OffQuestionscoreMapper;
import com.sjq.offquestionscore.service.OffQuestionscoreService;

/**
 * [自动生成]实现试管理-考生考试试题得分service层
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:05
 * @version 1.0
 */
 
@Service("OffQuestionscoreService")
public class OffQuestionscoreServiceImpl implements OffQuestionscoreService {

	@Autowired
	private OffQuestionscoreMapper offQuestionscoreMapper;

	@Override
	public int insertOffQuestionScoreBatch(List<OffQuestionscoreBean> offQuestionscoreBeanList) {
		return offQuestionscoreMapper.insertOffQuestionScoreBatch(offQuestionscoreBeanList);
	}

	@Override
	public int deleteOffQuestionScoreBatch(Long examId, Long examDetailId) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",examId);
  		map.put("examDetailId", examDetailId);
		return offQuestionscoreMapper.deleteOffQuestionScoreBatch(map);
	}
}
