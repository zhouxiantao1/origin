package com.sjq.indicator.dao;

import java.util.List;
import java.util.Map;
import com.sjq.indicator.vo.EvaluateIndicatorVo;
import com.sjq.ware.dto.ZTreeNodesDto;
import com.sjq.indicator.bean.EvaluateIndicatorBean;

/**
 * [自动生成]抽象指标信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:55:02
 * @version 1.0
 */
public interface EvaluateIndicatorMapper {
	
	/**
	 * 根据ID删除指标 物理删除
	 * @param bean 指标信息实体
	 * @return     受更新影响的行数
	 */
	int  deleteEvaluateIndicatorById(Long id);
	
	/**
	 * 根据条件查询所有指标信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<EvaluateIndicatorVo>  queryEvaluateIndicatorBySearch1(Map<String, Object> map);
	
	/**
	 * 查询所有的指标信息信息
	 * @return 查询到的列表
	 */
	List<EvaluateIndicatorVo> queryAllEvaluateIndicator();
	
	/**
	 * 根据ID查询状态为1的信息指标信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	EvaluateIndicatorVo queryEvaluateIndicatorById1(Long id);
	/**
	 * 根据ID查询指标信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	EvaluateIndicatorVo queryEvaluateIndicatorById(Long id);
	
	/**
	 * 根据条件查询所有指标信息信息-树
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<ZTreeNodesDto>  queryEvaluateIndicatorBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询指标信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryEvaluateIndicatorTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询指标信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryEvaluateIndicatorPage(Map<String, Object> map);
	
	/**
	 * (更新)根据ID更新所有指标信息信息
	 * @param bean 指标信息实体
	 * @return     受更新影响的行数
	 */
	int updateEvaluateIndicatorById(EvaluateIndicatorBean bean);
	
	/**
	 * (更新)根据条件更新所有指标信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateEvaluateIndicatorBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加指标信息信息
	 * @param bean 指标信息实体
	 * @return     受增加影响的行数
	 */
	int insertEvaluateIndicator(EvaluateIndicatorBean bean);

	
}