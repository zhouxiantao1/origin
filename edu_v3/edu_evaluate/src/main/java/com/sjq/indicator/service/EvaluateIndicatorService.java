package com.sjq.indicator.service;

import java.util.List;
import java.util.Map;

import com.sjq.indicator.bean.EvaluateIndicatorBean;
import com.sjq.indicator.search.EvaluateIndicatorSearch;
import com.sjq.indicator.vo.EvaluateIndicatorVo;
import com.sjq.util.PageBean;
import com.sjq.ware.dto.ZTreeNodesDto;

/**
 * [自动生成]抽象指标信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:55:02
 * @version 1.0
 */
 
public interface EvaluateIndicatorService {
	
	/**
	 * 根据ID删除指标 物理删除
	 * @param bean 指标信息实体
	 * @return     受更新影响的行数
	 */
	int  deleteEvaluateIndicatorById(Long id);
	
	/**
	 * 根据条件查询所有指标信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<EvaluateIndicatorVo> queryEvaluateIndicatorBySearch1(EvaluateIndicatorSearch search);
	
	/**
	 * 查询所有的指标信息信息
	 * @return 查询到的结果列表
	 */
	List<EvaluateIndicatorVo> queryAllEvaluateIndicator();
	
	/**
	 *  根据ID查询状态为1的信息指标信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	EvaluateIndicatorVo queryEvaluateIndicatorById1(Long id);
	
	/**
	 * 根据ID查询指标信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	EvaluateIndicatorVo queryEvaluateIndicatorById(Long id);
				
				
	/**
	 * 根据条件查询所有指标信息信息-树
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<ZTreeNodesDto> queryEvaluateIndicatorBySearch(EvaluateIndicatorSearch search);
				
					
	/**
	 * 根据条件查询指标信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryEvaluateIndicatorTotalCount(EvaluateIndicatorSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryEvaluateIndicatorPage(PageBean pb,EvaluateIndicatorSearch search);
				
				
	/**
	 * (更新)根据ID更新所有指标信息信息
	 * @param bean
	 * @return
	 */
	int updateEvaluateIndicatorById(EvaluateIndicatorBean bean);
				
				
	/**
	 * (更新)根据条件更新所有指标信息信息
	 * @param map
	 * @return
	 */
	int updateEvaluateIndicatorBySearch(EvaluateIndicatorBean bean,EvaluateIndicatorSearch search);
				
				
	/**
	 * (增加)增加指标信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertEvaluateIndicator(EvaluateIndicatorBean bean);
				
	
}