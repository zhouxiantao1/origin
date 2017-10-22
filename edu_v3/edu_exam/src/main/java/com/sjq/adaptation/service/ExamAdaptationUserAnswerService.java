package com.sjq.adaptation.service;

import java.util.List;

import com.sjq.adaptation.bean.ExamAdaptationUserAnswerBean;
import com.sjq.adaptation.search.ExamAdaptationUserAnswerSearch;
import com.sjq.adaptation.vo.ExamAdaptationUserAnswerVo;

/**
 * [自动生成]抽象考试模块-自适应测试用户答题记录表service层
 * @author  ShuiJingQiu
 * @since   2017-05-22 17:34:42
 * @version 1.0
 */
 
public interface ExamAdaptationUserAnswerService {

				
	/**
	 * 根据条件查询所有考试模块-自适应测试用户答题记录表信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<ExamAdaptationUserAnswerVo> queryExamAdaptationUserAnswerBySearch(ExamAdaptationUserAnswerSearch search);
				
					
	/**
	 * 根据条件查询考试模块-自适应测试用户答题记录表count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryExamAdaptationUserAnswerTotalCount(ExamAdaptationUserAnswerSearch search);
	
				
	/**
	 * (更新)根据ID更新所有考试模块-自适应测试用户答题记录表信息
	 * @param bean
	 * @return
	 */
	int updateExamAdaptationUserAnswerById(ExamAdaptationUserAnswerBean bean);
				
				
	/**
	 * (更新)根据条件更新所有考试模块-自适应测试用户答题记录表信息
	 * @param map
	 * @return
	 */
	int updateExamAdaptationUserAnswerBySearch(ExamAdaptationUserAnswerBean bean,ExamAdaptationUserAnswerSearch search);
		
	/**
	 * 根据条件获取最新的考试模块-自适应测试用户答题记录表信息
	 * @param map
	 * @return
	 */
	ExamAdaptationUserAnswerVo queryRecentExamAdaptationUserAnswerLimit1BySearch(ExamAdaptationUserAnswerSearch search);
		
	
				
	/**
	 * (增加)增加考试模块-自适应测试用户答题记录表信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertExamAdaptationUserAnswer(ExamAdaptationUserAnswerBean bean);
				
	
	

	/**
	 * 根据自适应id与用户id查询总共所花时间
	 * @param map
	 * @return
	 */
	int getExamAdaptationUserAnswerSecond(Long AdaptationId,Long userId);
}