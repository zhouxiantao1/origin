package com.sjq.offquestionscore.service;

import java.util.List;

import com.sjq.offquestionscore.bean.OffQuestionscoreBean;

/**
 * [自动生成]抽象试管理-考生考试试题得分service层
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:05
 * @version 1.0
 */
 
public interface OffQuestionscoreService {

	int insertOffQuestionScoreBatch(List<OffQuestionscoreBean> offQuestionscoreBeanList);
	int deleteOffQuestionScoreBatch(Long examId,Long examDetailId);
}