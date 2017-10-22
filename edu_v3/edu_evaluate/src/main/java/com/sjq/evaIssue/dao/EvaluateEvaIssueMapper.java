package com.sjq.evaIssue.dao;

import java.util.List;
import java.util.Map;
import com.sjq.evaIssue.vo.EvaluateEvaIssueVo;
import com.sjq.evaIssue.bean.EvaluateEvaIssueBean;

/**
 * [自动生成]抽象测评发布信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:28
 * @version 1.0
 */
public interface EvaluateEvaIssueMapper {

	/**
	 * (更新)根据ID更新所有测评发布信息信息
	 * @param bean 测评发布信息实体
	 * @return     受更新影响的行数
	 */
	int updateEvaluateEvaIssueById(EvaluateEvaIssueBean bean);
	
	/**
	 * 查询所有的测评发布信息信息
	 * @return 查询到的列表
	 */
	List<EvaluateEvaIssueVo> queryAllEvaluateEvaIssue();
	
	/**
	 * 根据ID查询测评发布信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	EvaluateEvaIssueVo queryEvaluateEvaIssueById(Long id);
	
	/**
	 * 根据条件查询所有测评发布信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<EvaluateEvaIssueVo> queryEvaluateEvaIssueBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询测评发布信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryEvaluateEvaIssueTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询测评发布信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryEvaluateEvaIssuePage(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有测评发布信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateEvaluateEvaIssueBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加测评发布信息信息
	 * @param bean 测评发布信息实体
	 * @return     受增加影响的行数
	 */
	int insertEvaluateEvaIssue(EvaluateEvaIssueBean bean);

	
}