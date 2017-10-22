package com.sjq.indicator.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.ware.dto.ZTreeNodesDto;
import com.sjq.indicator.vo.EvaluateIndicatorVo;
import com.sjq.indicator.bean.EvaluateIndicatorBean;
import com.sjq.indicator.dao.EvaluateIndicatorMapper;

/**
 * [自动生成]指标信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:55:02
 * @version 1.0
 */
@Repository("EvaluateIndicatorMapper")
public class EvaluateIndicatorMapperImpl extends BasicSqlSupport implements EvaluateIndicatorMapper {
	
	/**
	 * 根据ID删除指标 物理删除
	 * @param bean 指标信息实体
	 * @return     受更新影响的行数
	 */
	public int  deleteEvaluateIndicatorById(Long id){
	    return this.delete("com.sjq.indicator.dao.EvaluateIndicatorMapper.deleteEvaluateIndicatorById", id);
	}
	
	
	/**
	 * 查询所有的指标信息信息
	 * @return 查询到的列表
	 */
	public List<EvaluateIndicatorVo> queryAllEvaluateIndicator(){
	     return this.selectList("com.sjq.indicator.dao.EvaluateIndicatorMapper.queryAllEvaluateIndicator");
	}
	
	/**
	 *  根据ID查询状态为1的信息指标信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public EvaluateIndicatorVo queryEvaluateIndicatorById1(Long id){
	    return this.selectOne("com.sjq.indicator.dao.EvaluateIndicatorMapper.queryEvaluateIndicatorById1",id);
	}
				
	/**
	 * 根据ID查询指标信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public EvaluateIndicatorVo queryEvaluateIndicatorById(Long id){
	    return this.selectOne("com.sjq.indicator.dao.EvaluateIndicatorMapper.queryEvaluateIndicatorById",id);
	}
	
	/**
	 * 根据条件查询所有指标信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<EvaluateIndicatorVo>  queryEvaluateIndicatorBySearch1(Map<String, Object> map){
		return this.selectList("com.sjq.indicator.dao.EvaluateIndicatorMapper.queryEvaluateIndicatorBySearch1",map);
	}

	/**
	 * 根据条件查询所有指标信息信息-树
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<ZTreeNodesDto>  queryEvaluateIndicatorBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.indicator.dao.EvaluateIndicatorMapper.queryEvaluateIndicatorBySearch",map);
	}
	
	/**
	 * 根据条件查询指标信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryEvaluateIndicatorTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.indicator.dao.EvaluateIndicatorMapper.queryEvaluateIndicatorTotalCount",map);
	}
	
	/**
	 * 分页查询指标信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryEvaluateIndicatorPage(Map<String, Object> map){
		return this.selectList("com.sjq.indicator.dao.EvaluateIndicatorMapper.queryEvaluateIndicatorPage",map);
	}
	
	/**
	 * (更新)根据ID更新所有指标信息信息
	 * @param bean 指标信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateEvaluateIndicatorById(EvaluateIndicatorBean bean){
	    return this.update("com.sjq.indicator.dao.EvaluateIndicatorMapper.updateEvaluateIndicatorById", bean);
	}
	
	/**
	 * (更新)根据条件更新所有指标信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateEvaluateIndicatorBySearch(Map<String, Object> map){
	    return this.update("com.sjq.indicator.dao.EvaluateIndicatorMapper.updateEvaluateIndicatorBySearch", map);
	}
	
	/**
	 * (增加)增加指标信息信息
	 * @param bean 指标信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertEvaluateIndicator(EvaluateIndicatorBean bean){
		return this.insert("com.sjq.indicator.dao.EvaluateIndicatorMapper.insertEvaluateIndicator", bean);
	}
	
	

}