package com.sjq.issueList.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.issueList.vo.EvaluateIssueListVo;
import com.sjq.issueList.bean.EvaluateIssueListBean;
import com.sjq.issueList.dao.EvaluateIssueListMapper;

/**
 * [自动生成]发布列表DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-27 17:12:25
 * @version 1.0
 */
@Repository("EvaluateIssueListMapper")
public class EvaluateIssueListMapperImpl extends BasicSqlSupport implements EvaluateIssueListMapper {

	/**
	 * 查询所有的发布列表信息
	 * @return 查询到的列表
	 */
	public List<EvaluateIssueListVo> queryAllEvaluateIssueList(){
	     return this.selectList("com.sjq.issueList.dao.EvaluateIssueListMapper.queryAllEvaluateIssueList");
	}
				
	/**
	 * 根据ID查询发布列表信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public EvaluateIssueListVo queryEvaluateIssueListById(Long id){
	    return this.selectOne("com.sjq.issueList.dao.EvaluateIssueListMapper.queryEvaluateIssueListById",id);
	}

	/**
	 * 根据条件查询所有发布列表信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<EvaluateIssueListVo>  queryEvaluateIssueListBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.issueList.dao.EvaluateIssueListMapper.queryEvaluateIssueListBySearch",map);
	}
	
	/**
	 * 根据条件查询发布列表count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryEvaluateIssueListTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.issueList.dao.EvaluateIssueListMapper.queryEvaluateIssueListTotalCount",map);
	}
	
	/**
	 * 分页查询发布列表
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryEvaluateIssueListPage(Map<String, Object> map){
		return this.selectList("com.sjq.issueList.dao.EvaluateIssueListMapper.queryEvaluateIssueListPage",map);
	}
	
	/**
	 * (更新)根据ID更新所有发布列表信息
	 * @param bean 发布列表实体
	 * @return     受更新影响的行数
	 */
	public int  updateEvaluateIssueListById(EvaluateIssueListBean bean){
	    return this.update("com.sjq.issueList.dao.EvaluateIssueListMapper.updateEvaluateIssueListById", bean);
	}
	
	/**
	 * (更新)根据条件更新所有发布列表信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateEvaluateIssueListBySearch(Map<String, Object> map){
	    return this.update("com.sjq.issueList.dao.EvaluateIssueListMapper.updateEvaluateIssueListBySearch", map);
	}
	
	/**
	 * (增加)增加发布列表信息
	 * @param bean 发布列表实体
	 * @return     受增加影响的行数
	 */
	public int  insertEvaluateIssueList(EvaluateIssueListBean bean){
		return this.insert("com.sjq.issueList.dao.EvaluateIssueListMapper.insertEvaluateIssueList", bean);
	}
	
	

}