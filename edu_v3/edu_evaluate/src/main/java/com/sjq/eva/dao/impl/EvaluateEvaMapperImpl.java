package com.sjq.eva.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.eva.vo.EvaluateEvaVo;
import com.sjq.eva.bean.EvaluateEvaBean;
import com.sjq.eva.dao.EvaluateEvaMapper;

/**
 * [自动生成]测评信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:15:58
 * @version 1.0
 */
@Repository("EvaluateEvaMapper")
public class EvaluateEvaMapperImpl extends BasicSqlSupport implements EvaluateEvaMapper {
	
	/**
	 * (更新)根据ID更新所有测评信息信息
	 * @param bean 测评信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateEvaluateEvaById(EvaluateEvaBean bean){
	    return this.update("com.sjq.eva.dao.EvaluateEvaMapper.updateEvaluateEvaById", bean);
	}
	
	/**
	 * 查询所有的测评信息信息
	 * @return 查询到的列表
	 */
	public List<EvaluateEvaVo> queryAllEvaluateEva(){
	     return this.selectList("com.sjq.eva.dao.EvaluateEvaMapper.queryAllEvaluateEva");
	}
				
	/**
	 * 根据ID查询测评信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public EvaluateEvaVo queryEvaluateEvaById(Long id){
	    return this.selectOne("com.sjq.eva.dao.EvaluateEvaMapper.queryEvaluateEvaById",id);
	}

	/**
	 * 根据条件查询所有测评信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<EvaluateEvaVo>  queryEvaluateEvaBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.eva.dao.EvaluateEvaMapper.queryEvaluateEvaBySearch",map);
	}
	
	/**
	 * 根据条件查询测评信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryEvaluateEvaTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.eva.dao.EvaluateEvaMapper.queryEvaluateEvaTotalCount",map);
	}
	
	/**
	 * 分页查询测评信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryEvaluateEvaPage(Map<String, Object> map){
		return this.selectList("com.sjq.eva.dao.EvaluateEvaMapper.queryEvaluateEvaPage",map);
	}
	
	/**
	 * (更新)根据条件更新所有测评信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateEvaluateEvaBySearch(Map<String, Object> map){
	    return this.update("com.sjq.eva.dao.EvaluateEvaMapper.updateEvaluateEvaBySearch", map);
	}
	
	/**
	 * (增加)增加测评信息信息
	 * @param bean 测评信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertEvaluateEva(EvaluateEvaBean bean){
		return this.insert("com.sjq.eva.dao.EvaluateEvaMapper.insertEvaluateEva", bean);
	}
	
	

}