package com.sjq.evaDetailPaper.service;

import java.util.List;
import java.util.Map;

import com.sjq.evaDetailPaper.bean.EvaluateEvaDetailPaperBean;
import com.sjq.evaDetailPaper.search.EvaluateEvaDetailPaperSearch;
import com.sjq.evaDetailPaper.vo.EvaluateEvaDetailPaperVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象测评明细问卷信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:17:14
 * @version 1.0
 */
 
public interface EvaluateEvaDetailPaperService {

	/**
	 * 查询所有的测评明细问卷信息信息
	 * @return 查询到的结果列表
	 */
	List<EvaluateEvaDetailPaperVo> queryAllEvaluateEvaDetailPaper();
				
				
	/**
	 * 根据ID查询测评明细问卷信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	EvaluateEvaDetailPaperVo queryEvaluateEvaDetailPaperById(Long id);
				
	/**
	 * 根据ID查询测评明细问卷信息信息
	 * @return
	 */
	EvaluateEvaDetailPaperVo queryEvaluateEvaDetailPaperByEvaDetailId(Long evaDetailId);
	
	/**
	 * 根据条件查询所有测评明细问卷信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<EvaluateEvaDetailPaperVo> queryEvaluateEvaDetailPaperBySearch(EvaluateEvaDetailPaperSearch search);
				
					
	/**
	 * 根据条件查询测评明细问卷信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryEvaluateEvaDetailPaperTotalCount(EvaluateEvaDetailPaperSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryEvaluateEvaDetailPaperPage(PageBean pb,EvaluateEvaDetailPaperSearch search);
				
				
	/**
	 * (更新)根据条件更新所有测评明细问卷信息信息
	 * @param map
	 * @return
	 */
	int updateEvaluateEvaDetailPaperBySearch(EvaluateEvaDetailPaperBean bean,EvaluateEvaDetailPaperSearch search);
				
				
	/**
	 * (增加)增加测评明细问卷信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertEvaluateEvaDetailPaper(EvaluateEvaDetailPaperBean bean);
				
	
}