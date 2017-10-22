package com.sjq.answer.service;

import java.util.List;
import java.util.Map;

import com.sjq.answer.bean.EvaluateAnswerBean;
import com.sjq.answer.search.EvaluateAnswerSearch;
import com.sjq.answer.vo.EvaluateAnswerVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象作答信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:38:02
 * @version 1.0
 */
 
public interface EvaluateAnswerService {

	/**
	 * 查询所有的作答信息信息
	 * @return 查询到的结果列表
	 */
	List<EvaluateAnswerVo> queryAllEvaluateAnswer();
				
				
	/**
	 * 根据ID查询作答信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	EvaluateAnswerVo queryEvaluateAnswerById(Long id);
				
				
	/**
	 * 根据条件查询所有作答信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<EvaluateAnswerVo> queryEvaluateAnswerBySearch(EvaluateAnswerSearch search);
				
					
	/**
	 * 根据条件查询作答信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryEvaluateAnswerTotalCount(EvaluateAnswerSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryEvaluateAnswerPage(PageBean pb,EvaluateAnswerSearch search);
				
				
	/**
	 * (更新)根据条件更新所有作答信息信息
	 * @param map
	 * @return
	 */
	int updateEvaluateAnswerBySearch(EvaluateAnswerBean bean,EvaluateAnswerSearch search);
				
				
	/**
	 * (增加)增加作答信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertEvaluateAnswer(EvaluateAnswerBean bean);
				
	
}