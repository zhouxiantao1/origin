package com.sjq.issueList.service;

import java.util.List;
import java.util.Map;

import com.sjq.issueList.bean.EvaluateIssueListBean;
import com.sjq.issueList.search.EvaluateIssueListSearch;
import com.sjq.issueList.vo.EvaluateIssueListVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象发布列表service层
 * @author  ShuiJingQiu
 * @since   2017-05-27 17:12:25
 * @version 1.0
 */
 
public interface EvaluateIssueListService {

	/**
	 * 查询所有的发布列表信息
	 * @return 查询到的结果列表
	 */
	List<EvaluateIssueListVo> queryAllEvaluateIssueList();
				
				
	/**
	 * 根据ID查询发布列表信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	EvaluateIssueListVo queryEvaluateIssueListById(Long id);
				
				
	/**
	 * 根据条件查询所有发布列表信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<EvaluateIssueListVo> queryEvaluateIssueListBySearch(EvaluateIssueListSearch search);
				
					
	/**
	 * 根据条件查询发布列表count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryEvaluateIssueListTotalCount(EvaluateIssueListSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryEvaluateIssueListPage(PageBean pb,EvaluateIssueListSearch search);
				
				
	/**
	 * (更新)根据ID更新所有发布列表信息
	 * @param bean
	 * @return
	 */
	int updateEvaluateIssueListById(EvaluateIssueListBean bean);
				
				
	/**
	 * (更新)根据条件更新所有发布列表信息
	 * @param map
	 * @return
	 */
	int updateEvaluateIssueListBySearch(EvaluateIssueListBean bean,EvaluateIssueListSearch search);
				
				
	/**
	 * (增加)增加发布列表信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertEvaluateIssueList(EvaluateIssueListBean bean);
				
	
}