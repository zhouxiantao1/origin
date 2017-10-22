package com.sjq.eva.dao;

import java.util.List;
import java.util.Map;
import com.sjq.eva.vo.EvaluateEvaVo;
import com.sjq.eva.bean.EvaluateEvaBean;

/**
 * [自动生成]抽象测评信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:15:58
 * @version 1.0
 */
public interface EvaluateEvaMapper {
	
	/**
	 * (更新)根据ID更新所有测评信息信息
	 * @param bean 测评信息实体
	 * @return     受更新影响的行数
	 */
	int updateEvaluateEvaById(EvaluateEvaBean bean);

	/**
	 * 查询所有的测评信息信息
	 * @return 查询到的列表
	 */
	List<EvaluateEvaVo> queryAllEvaluateEva();
	
	/**
	 * 根据ID查询测评信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	EvaluateEvaVo queryEvaluateEvaById(Long id);
	
	/**
	 * 根据条件查询所有测评信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<EvaluateEvaVo> queryEvaluateEvaBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询测评信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryEvaluateEvaTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询测评信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryEvaluateEvaPage(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有测评信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateEvaluateEvaBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加测评信息信息
	 * @param bean 测评信息实体
	 * @return     受增加影响的行数
	 */
	int insertEvaluateEva(EvaluateEvaBean bean);

	
}