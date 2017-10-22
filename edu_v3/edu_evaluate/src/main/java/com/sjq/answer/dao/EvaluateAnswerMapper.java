package com.sjq.answer.dao;

import java.util.List;
import java.util.Map;
import com.sjq.answer.vo.EvaluateAnswerVo;
import com.sjq.answer.bean.EvaluateAnswerBean;

/**
 * [自动生成]抽象作答信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:38:02
 * @version 1.0
 */
public interface EvaluateAnswerMapper {


	/**
	 * 查询所有的作答信息信息
	 * @return 查询到的列表
	 */
	List<EvaluateAnswerVo> queryAllEvaluateAnswer();
	
	/**
	 * 根据ID查询作答信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	EvaluateAnswerVo queryEvaluateAnswerById(Long id);
	
	/**
	 * 根据条件查询所有作答信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<EvaluateAnswerVo> queryEvaluateAnswerBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询作答信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryEvaluateAnswerTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询作答信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryEvaluateAnswerPage(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有作答信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateEvaluateAnswerBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加作答信息信息
	 * @param bean 作答信息实体
	 * @return     受增加影响的行数
	 */
	int insertEvaluateAnswer(EvaluateAnswerBean bean);

	
}