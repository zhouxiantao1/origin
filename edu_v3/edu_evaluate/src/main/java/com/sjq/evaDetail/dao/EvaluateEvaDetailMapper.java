package com.sjq.evaDetail.dao;

import java.util.List;
import java.util.Map;
import com.sjq.evaDetail.vo.EvaluateEvaDetailVo;
import com.sjq.evaDetail.bean.EvaluateEvaDetailBean;

/**
 * [自动生成]抽象测评明细信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:17
 * @version 1.0
 */
public interface EvaluateEvaDetailMapper {

	/**
	 * (更新)根据ID更新所有测评明细信息信息
	 * @param bean 测评明细信息实体
	 * @return     受更新影响的行数
	 */
	int updateEvaluateEvaDetailById(EvaluateEvaDetailBean bean);
	
	/**
	 * 查询所有的测评明细信息信息
	 * @return 查询到的列表
	 */
	List<EvaluateEvaDetailVo> queryAllEvaluateEvaDetail();
	
	/**
	 * 根据ID查询测评明细信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	EvaluateEvaDetailVo queryEvaluateEvaDetailById(Long id);
	
	/**
	 * 根据条件查询所有测评明细信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<EvaluateEvaDetailVo> queryEvaluateEvaDetailBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询测评明细信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryEvaluateEvaDetailTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询测评明细信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryEvaluateEvaDetailPage(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有测评明细信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateEvaluateEvaDetailBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加测评明细信息信息
	 * @param bean 测评明细信息实体
	 * @return     受增加影响的行数
	 */
	int insertEvaluateEvaDetail(EvaluateEvaDetailBean bean);

	
}