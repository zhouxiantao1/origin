package com.sjq.paperscore.service;

import java.util.List;

import com.sjq.paperscore.bean.ExamPaperscoreBean;
import com.sjq.paperscore.search.ExamPaperscoreSearch;
import com.sjq.paperscore.vo.ExamPaperscoreVo;

/**
 * [自动生成]抽象考生考试卷面得分service层
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:20
 * @version 1.0
 */
 
public interface ExamPaperscoreService {

				
	/**
	 * 根据ID查询考生考试卷面得分信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	ExamPaperscoreVo queryExamPaperscoreById(Long id);
				
				
	/**
	 * 根据条件查询所有考生考试卷面得分信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<ExamPaperscoreVo> queryExamPaperscoreBySearch(ExamPaperscoreSearch search);
				
				
	/**
	 * (增加)增加考生考试卷面得分信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertExamPaperscore(ExamPaperscoreBean bean);
				
	
}