package com.sjq.questionscore.service;

import java.util.List;

import com.sjq.questionscore.bean.ExamQuestionscoreBean;
import com.sjq.questionscore.search.ExamQuestionscoreSearch;
import com.sjq.questionscore.vo.ExamQuestionscoreVo;

/**
 * [自动生成]抽象试管理-考生考试试题得分service层
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:05
 * @version 1.0
 */
 
public interface ExamQuestionscoreService {

				
	/**
	 * 根据ID查询试管理-考生考试试题得分信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	ExamQuestionscoreVo queryExamQuestionscoreById(Long id);
				
				
	/**
	 * 根据条件查询所有试管理-考生考试试题得分信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<ExamQuestionscoreVo> queryExamQuestionscoreBySearch(ExamQuestionscoreSearch search);
				
				
	/**
	 * (增加)增加试管理-考生考试试题得分信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertExamQuestionscore(ExamQuestionscoreBean bean);
				
	
}