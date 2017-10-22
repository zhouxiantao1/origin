package com.sjq.evaIssue.service;

import java.util.List;
import java.util.Map;

import com.sjq.evaIssue.bean.EvaluateEvaIssueBean;
import com.sjq.evaIssue.search.EvaluateEvaIssueSearch;
import com.sjq.evaIssue.vo.EvaluateEvaIssueVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象测评发布信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:28
 * @version 1.0
 */
 
public interface EvaluateEvaIssueService {
	
	/**
	 * (更新)根据ID更新所有测评发布信息信息
	 * @param bean
	 * @return
	 */
	int updateEvaluateEvaIssueById(EvaluateEvaIssueBean bean);
	
	/**
	 * 查询所有的测评发布信息信息
	 * @return 查询到的结果列表
	 */
	List<EvaluateEvaIssueVo> queryAllEvaluateEvaIssue();
				
				
	/**
	 * 根据ID查询测评发布信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	EvaluateEvaIssueVo queryEvaluateEvaIssueById(Long id);
				
				
	/**
	 * 根据条件查询所有测评发布信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<EvaluateEvaIssueVo> queryEvaluateEvaIssueBySearch(EvaluateEvaIssueSearch search);
				
					
	/**
	 * 根据条件查询测评发布信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryEvaluateEvaIssueTotalCount(EvaluateEvaIssueSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryEvaluateEvaIssuePage(PageBean pb,EvaluateEvaIssueSearch search);
				
				
	/**
	 * (更新)根据条件更新所有测评发布信息信息
	 * @param map
	 * @return
	 */
	int updateEvaluateEvaIssueBySearch(EvaluateEvaIssueBean bean,EvaluateEvaIssueSearch search);
				
				
	/**
	 * (增加)增加测评发布信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertEvaluateEvaIssue(EvaluateEvaIssueBean bean);
				
	
}