package com.sjq.answerDetail.service;

import java.util.List;
import java.util.Map;

import com.sjq.answerDetail.bean.EvaluateAnswerDetailBean;
import com.sjq.answerDetail.search.EvaluateAnswerDetailSearch;
import com.sjq.answerDetail.vo.EvaluateAnswerDetailVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象作答明细信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:58
 * @version 1.0
 */
 
public interface EvaluateAnswerDetailService {

	/**
	 * 查询所有的作答明细信息信息
	 * @return 查询到的结果列表
	 */
	List<EvaluateAnswerDetailVo> queryAllEvaluateAnswerDetail();
				
				
	/**
	 * 根据ID查询作答明细信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	EvaluateAnswerDetailVo queryEvaluateAnswerDetailById(Long id);
				
				
	/**
	 * 根据条件查询所有作答明细信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<EvaluateAnswerDetailVo> queryEvaluateAnswerDetailBySearch(EvaluateAnswerDetailSearch search);
				
					
	/**
	 * 根据条件查询作答明细信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryEvaluateAnswerDetailTotalCount(EvaluateAnswerDetailSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryEvaluateAnswerDetailPage(PageBean pb,EvaluateAnswerDetailSearch search);
				
				
	/**
	 * (更新)根据条件更新所有作答明细信息信息
	 * @param map
	 * @return
	 */
	int updateEvaluateAnswerDetailBySearch(EvaluateAnswerDetailBean bean,EvaluateAnswerDetailSearch search);
				
				
	/**
	 * (增加)增加作答明细信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertEvaluateAnswerDetail(EvaluateAnswerDetailBean bean);
				
	
}