package com.sjq.evaIssue.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.evaIssue.vo.EvaluateEvaIssueVo;
import com.sjq.evaIssue.bean.EvaluateEvaIssueBean;
import com.sjq.evaIssue.dao.EvaluateEvaIssueMapper;

/**
 * [自动生成]测评发布信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:28
 * @version 1.0
 */
@Repository("EvaluateEvaIssueMapper")
public class EvaluateEvaIssueMapperImpl extends BasicSqlSupport implements EvaluateEvaIssueMapper {
	
	/**
	 * (更新)根据ID更新所有测评发布信息信息
	 * @param bean 测评发布信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateEvaluateEvaIssueById(EvaluateEvaIssueBean bean){
	    return this.update("com.sjq.evaIssue.dao.EvaluateEvaIssueMapper.updateEvaluateEvaIssueById", bean);
	}
	
	/**
	 * 查询所有的测评发布信息信息
	 * @return 查询到的列表
	 */
	public List<EvaluateEvaIssueVo> queryAllEvaluateEvaIssue(){
	     return this.selectList("com.sjq.evaIssue.dao.EvaluateEvaIssueMapper.queryAllEvaluateEvaIssue");
	}
				
	/**
	 * 根据ID查询测评发布信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public EvaluateEvaIssueVo queryEvaluateEvaIssueById(Long id){
	    return this.selectOne("com.sjq.evaIssue.dao.EvaluateEvaIssueMapper.queryEvaluateEvaIssueById",id);
	}

	/**
	 * 根据条件查询所有测评发布信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<EvaluateEvaIssueVo>  queryEvaluateEvaIssueBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.evaIssue.dao.EvaluateEvaIssueMapper.queryEvaluateEvaIssueBySearch",map);
	}
	
	/**
	 * 根据条件查询测评发布信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryEvaluateEvaIssueTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.evaIssue.dao.EvaluateEvaIssueMapper.queryEvaluateEvaIssueTotalCount",map);
	}
	
	/**
	 * 分页查询测评发布信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryEvaluateEvaIssuePage(Map<String, Object> map){
		return this.selectList("com.sjq.evaIssue.dao.EvaluateEvaIssueMapper.queryEvaluateEvaIssuePage",map);
	}
	
	/**
	 * (更新)根据条件更新所有测评发布信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateEvaluateEvaIssueBySearch(Map<String, Object> map){
	    return this.update("com.sjq.evaIssue.dao.EvaluateEvaIssueMapper.updateEvaluateEvaIssueBySearch", map);
	}
	
	/**
	 * (增加)增加测评发布信息信息
	 * @param bean 测评发布信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertEvaluateEvaIssue(EvaluateEvaIssueBean bean){
		return this.insert("com.sjq.evaIssue.dao.EvaluateEvaIssueMapper.insertEvaluateEvaIssue", bean);
	}
	
	

}