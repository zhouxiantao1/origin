package com.sjq.evaDetail.service;

import java.util.List;
import java.util.Map;

import com.sjq.evaDetail.bean.EvaluateEvaDetailBean;
import com.sjq.evaDetail.search.EvaluateEvaDetailSearch;
import com.sjq.evaDetail.vo.EvaluateEvaDetailVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象测评明细信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:17
 * @version 1.0
 */
 
public interface EvaluateEvaDetailService {
	
	/**
	 * (更新)根据ID更新所有测评明细信息信息
	 * @param bean
	 * @return
	 */
	int updateEvaluateEvaDetailById(EvaluateEvaDetailBean bean);
	
	/**
	 * 查询所有的测评明细信息信息
	 * @return 查询到的结果列表
	 */
	List<EvaluateEvaDetailVo> queryAllEvaluateEvaDetail();
				
				
	/**
	 * 根据ID查询测评明细信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	EvaluateEvaDetailVo queryEvaluateEvaDetailById(Long id);
				
				
	/**
	 * 根据条件查询所有测评明细信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<EvaluateEvaDetailVo> queryEvaluateEvaDetailBySearch(EvaluateEvaDetailSearch search);
				
					
	/**
	 * 根据条件查询测评明细信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryEvaluateEvaDetailTotalCount(EvaluateEvaDetailSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryEvaluateEvaDetailPage(PageBean pb,EvaluateEvaDetailSearch search);
				
				
	/**
	 * (更新)根据条件更新所有测评明细信息信息
	 * @param map
	 * @return
	 */
	int updateEvaluateEvaDetailBySearch(EvaluateEvaDetailBean bean,EvaluateEvaDetailSearch search);
				
				
	/**
	 * (增加)增加测评明细信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertEvaluateEvaDetail(EvaluateEvaDetailBean bean);
				
	
}