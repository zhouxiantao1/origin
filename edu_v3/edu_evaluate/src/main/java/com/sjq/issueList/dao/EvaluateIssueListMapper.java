package com.sjq.issueList.dao;

import java.util.List;
import java.util.Map;
import com.sjq.issueList.vo.EvaluateIssueListVo;
import com.sjq.issueList.bean.EvaluateIssueListBean;

/**
 * [自动生成]抽象发布列表Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-27 17:12:25
 * @version 1.0
 */
public interface EvaluateIssueListMapper {


	/**
	 * 查询所有的发布列表信息
	 * @return 查询到的列表
	 */
	List<EvaluateIssueListVo> queryAllEvaluateIssueList();
	
	/**
	 * 根据ID查询发布列表信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	EvaluateIssueListVo queryEvaluateIssueListById(Long id);
	
	/**
	 * 根据条件查询所有发布列表信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<EvaluateIssueListVo> queryEvaluateIssueListBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询发布列表count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryEvaluateIssueListTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询发布列表
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryEvaluateIssueListPage(Map<String, Object> map);
	
	/**
	 * (更新)根据ID更新所有发布列表信息
	 * @param bean 发布列表实体
	 * @return     受更新影响的行数
	 */
	int updateEvaluateIssueListById(EvaluateIssueListBean bean);
	
	/**
	 * (更新)根据条件更新所有发布列表信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateEvaluateIssueListBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加发布列表信息
	 * @param bean 发布列表实体
	 * @return     受增加影响的行数
	 */
	int insertEvaluateIssueList(EvaluateIssueListBean bean);

	
}