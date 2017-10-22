package com.sjq.evaDetail.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.evaDetail.vo.EvaluateEvaDetailVo;
import com.sjq.evaDetail.bean.EvaluateEvaDetailBean;
import com.sjq.evaDetail.dao.EvaluateEvaDetailMapper;

/**
 * [自动生成]测评明细信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:17
 * @version 1.0
 */
@Repository("EvaluateEvaDetailMapper")
public class EvaluateEvaDetailMapperImpl extends BasicSqlSupport implements EvaluateEvaDetailMapper {
	
	/**
	 * (更新)根据ID更新所有测评明细信息信息
	 * @param bean 测评明细信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateEvaluateEvaDetailById(EvaluateEvaDetailBean bean){
	    return this.update("com.sjq.evaDetail.dao.EvaluateEvaDetailMapper.updateEvaluateEvaDetailById", bean);
	}
	
	/**
	 * 查询所有的测评明细信息信息
	 * @return 查询到的列表
	 */
	public List<EvaluateEvaDetailVo> queryAllEvaluateEvaDetail(){
	     return this.selectList("com.sjq.evaDetail.dao.EvaluateEvaDetailMapper.queryAllEvaluateEvaDetail");
	}
				
	/**
	 * 根据ID查询测评明细信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public EvaluateEvaDetailVo queryEvaluateEvaDetailById(Long id){
	    return this.selectOne("com.sjq.evaDetail.dao.EvaluateEvaDetailMapper.queryEvaluateEvaDetailById",id);
	}

	/**
	 * 根据条件查询所有测评明细信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<EvaluateEvaDetailVo>  queryEvaluateEvaDetailBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.evaDetail.dao.EvaluateEvaDetailMapper.queryEvaluateEvaDetailBySearch",map);
	}
	
	/**
	 * 根据条件查询测评明细信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryEvaluateEvaDetailTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.evaDetail.dao.EvaluateEvaDetailMapper.queryEvaluateEvaDetailTotalCount",map);
	}
	
	/**
	 * 分页查询测评明细信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryEvaluateEvaDetailPage(Map<String, Object> map){
		return this.selectList("com.sjq.evaDetail.dao.EvaluateEvaDetailMapper.queryEvaluateEvaDetailPage",map);
	}
	
	/**
	 * (更新)根据条件更新所有测评明细信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateEvaluateEvaDetailBySearch(Map<String, Object> map){
	    return this.update("com.sjq.evaDetail.dao.EvaluateEvaDetailMapper.updateEvaluateEvaDetailBySearch", map);
	}
	
	/**
	 * (增加)增加测评明细信息信息
	 * @param bean 测评明细信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertEvaluateEvaDetail(EvaluateEvaDetailBean bean){
		return this.insert("com.sjq.evaDetail.dao.EvaluateEvaDetailMapper.insertEvaluateEvaDetail", bean);
	}
	
	

}