package com.sjq.paperQuestion.service;

import java.util.List;
import java.util.Map;

import com.sjq.paperQuestion.bean.EvaluatePaperQuestionBean;
import com.sjq.paperQuestion.search.EvaluatePaperQuestionSearch;
import com.sjq.paperQuestion.vo.EvaluatePaperQuestionVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象题目信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-23 00:00:21
 * @version 1.0
 */
 
public interface EvaluatePaperQuestionService {
	

	/**
	 * 根据PaperID查询题目排序最大值
	 * @param PaperID 标识
	 * @return   查询到的列表
	 */
	Long queryPaperQuestionMaxByPaperId(Long paperId);
	
	/**
	 * 查询所有的题目信息信息
	 * @return 查询到的结果列表
	 */
	List<EvaluatePaperQuestionVo> queryAllEvaluatePaperQuestion();
				
				
	/**
	 * 根据ID查询题目信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	EvaluatePaperQuestionVo queryEvaluatePaperQuestionById(Long id);
				
				
	/**
	 * 根据条件查询所有题目信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<EvaluatePaperQuestionVo> queryEvaluatePaperQuestionBySearch(EvaluatePaperQuestionSearch search);
				
					
	/**
	 * 根据条件查询题目信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryEvaluatePaperQuestionTotalCount(EvaluatePaperQuestionSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryEvaluatePaperQuestionPage(PageBean pb,EvaluatePaperQuestionSearch search);
				
								
	/**
	 * (删除)根据条件删除题目信息信息
	 * @param map
	 * @return
	 */
	int deleteEvaluatePaperQuestionBySearch(EvaluatePaperQuestionBean bean,EvaluatePaperQuestionSearch search);
				
				
	/**
	 * (更新)根据ID更新所有题目信息信息
	 * @param bean
	 * @return
	 */
	int updateEvaluatePaperQuestionById(EvaluatePaperQuestionBean bean);
				
				
	/**
	 * (更新)根据条件更新所有题目信息信息
	 * @param map
	 * @return
	 */
	int updateEvaluatePaperQuestionBySearch(EvaluatePaperQuestionBean bean,EvaluatePaperQuestionSearch search);
				
				
	/**
	 * (增加)增加题目信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertEvaluatePaperQuestion(EvaluatePaperQuestionBean bean);
				
	
}