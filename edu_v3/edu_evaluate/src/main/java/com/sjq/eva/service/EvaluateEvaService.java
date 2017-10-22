package com.sjq.eva.service;

import java.util.List;
import java.util.Map;

import com.sjq.eva.bean.EvaluateEvaBean;
import com.sjq.eva.search.EvaluateEvaSearch;
import com.sjq.eva.vo.EvaluateEvaVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象测评信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:15:58
 * @version 1.0
 */
 
public interface EvaluateEvaService {
	
	/**
	 * (更新)根据ID更新所有测评信息信息
	 * @param bean
	 * @return
	 */
	int updateEvaluateEvaById(EvaluateEvaBean bean);
	
	/**
	 * 查询所有的测评信息信息
	 * @return 查询到的结果列表
	 */
	List<EvaluateEvaVo> queryAllEvaluateEva();
				
				
	/**
	 * 根据ID查询测评信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	EvaluateEvaVo queryEvaluateEvaById(Long id);
				
				
	/**
	 * 根据条件查询所有测评信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<EvaluateEvaVo> queryEvaluateEvaBySearch(EvaluateEvaSearch search);
				
					
	/**
	 * 根据条件查询测评信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryEvaluateEvaTotalCount(EvaluateEvaSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryEvaluateEvaPage(PageBean pb,EvaluateEvaSearch search);
				
				
	/**
	 * (更新)根据条件更新所有测评信息信息
	 * @param map
	 * @return
	 */
	int updateEvaluateEvaBySearch(EvaluateEvaBean bean,EvaluateEvaSearch search);
				
				
	/**
	 * (增加)增加测评信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertEvaluateEva(EvaluateEvaBean bean);
				
	
}