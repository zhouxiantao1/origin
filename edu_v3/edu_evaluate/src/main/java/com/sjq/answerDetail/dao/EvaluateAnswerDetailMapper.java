package com.sjq.answerDetail.dao;

import java.util.List;
import java.util.Map;
import com.sjq.answerDetail.vo.EvaluateAnswerDetailVo;
import com.sjq.answerDetail.bean.EvaluateAnswerDetailBean;

/**
 * [自动生成]抽象作答明细信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:58
 * @version 1.0
 */
public interface EvaluateAnswerDetailMapper {


	/**
	 * 查询所有的作答明细信息信息
	 * @return 查询到的列表
	 */
	List<EvaluateAnswerDetailVo> queryAllEvaluateAnswerDetail();
	
	/**
	 * 根据ID查询作答明细信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	EvaluateAnswerDetailVo queryEvaluateAnswerDetailById(Long id);
	
	/**
	 * 根据条件查询所有作答明细信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<EvaluateAnswerDetailVo> queryEvaluateAnswerDetailBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询作答明细信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryEvaluateAnswerDetailTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询作答明细信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryEvaluateAnswerDetailPage(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有作答明细信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateEvaluateAnswerDetailBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加作答明细信息信息
	 * @param bean 作答明细信息实体
	 * @return     受增加影响的行数
	 */
	int insertEvaluateAnswerDetail(EvaluateAnswerDetailBean bean);

	
}