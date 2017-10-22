package com.sjq.paperQuestion.dao;

import java.util.List;
import java.util.Map;
import com.sjq.paperQuestion.vo.EvaluatePaperQuestionVo;
import com.sjq.paperQuestion.bean.EvaluatePaperQuestionBean;

/**
 * [自动生成]抽象题目信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-23 00:00:21
 * @version 1.0
 */
public interface EvaluatePaperQuestionMapper {

	/**
	 * 根据PaperID查询题目排序最大值
	 * @param PaperID 标识
	 * @return   查询到的列表
	 */
	Long queryPaperQuestionMaxByPaperId(Long paperId);
	
	/**
	 * 查询所有的题目信息信息
	 * @return 查询到的列表
	 */
	List<EvaluatePaperQuestionVo> queryAllEvaluatePaperQuestion();
	
	/**
	 * 根据ID查询题目信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	EvaluatePaperQuestionVo queryEvaluatePaperQuestionById(Long id);
	
	/**
	 * 根据条件查询所有题目信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<EvaluatePaperQuestionVo> queryEvaluatePaperQuestionBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询题目信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryEvaluatePaperQuestionTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询题目信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryEvaluatePaperQuestionPage(Map<String, Object> map);
	
	/**
	 * (删除)根据条件删除题目信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteEvaluatePaperQuestionBySearch(Map<String, Object> map);
	
	/**
	 * (更新)根据ID更新所有题目信息信息
	 * @param bean 题目信息实体
	 * @return     受更新影响的行数
	 */
	int updateEvaluatePaperQuestionById(EvaluatePaperQuestionBean bean);
	
	/**
	 * (更新)根据条件更新所有题目信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateEvaluatePaperQuestionBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加题目信息信息
	 * @param bean 题目信息实体
	 * @return     受增加影响的行数
	 */
	int insertEvaluatePaperQuestion(EvaluatePaperQuestionBean bean);

	
}