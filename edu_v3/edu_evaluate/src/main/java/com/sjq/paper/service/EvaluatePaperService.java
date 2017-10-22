package com.sjq.paper.service;

import java.util.List;
import java.util.Map;

import com.sjq.paper.bean.EvaluatePaperBean;
import com.sjq.paper.search.EvaluatePaperSearch;
import com.sjq.paper.vo.EvaluatePaperVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象问卷信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:15:23
 * @version 1.0
 */
 
public interface EvaluatePaperService {
	
	/**
	 * (更新)根据ID物理删除记录
	 * @param bean 问卷信息实体
	 * @return     受更新影响的行数
	 */
	int  deleteEvaluatePaperById(Long id);
	
	/**
	 * (更新)根据ID更新所有问卷信息信息
	 * @param bean
	 * @return
	 */
	int updateEvaluatePaperById(EvaluatePaperBean bean);
	
	/**
	 * 查询所有的问卷信息信息
	 * @return 查询到的结果列表
	 */
	List<EvaluatePaperVo> queryAllEvaluatePaper();
				
				
	/**
	 * 根据ID查询问卷信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	EvaluatePaperVo queryEvaluatePaperById(Long id);
				
				
	/**
	 * 根据条件查询所有问卷信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<EvaluatePaperVo> queryEvaluatePaperBySearch(EvaluatePaperSearch search);
				
					
	/**
	 * 根据条件查询问卷信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryEvaluatePaperTotalCount(EvaluatePaperSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryEvaluatePaperPage(PageBean pb,EvaluatePaperSearch search);
				
								
	/**
	 * (删除)根据条件删除问卷信息信息
	 * @param map
	 * @return
	 */
	int deleteEvaluatePaperBySearch(EvaluatePaperBean bean,EvaluatePaperSearch search);
				
				
	/**
	 * (增加)增加问卷信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertEvaluatePaper(EvaluatePaperBean bean);
				
	
}