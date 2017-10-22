package com.sjq.plan.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.plan.vo.BasePlanVo;
import com.sjq.plan.bean.BasePlanBean;
import com.sjq.plan.dao.BasePlanMapper;

/**
 * [自动生成]基础模块-学制信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-25 15:02:21
 * @version 1.0
 */
@Repository("BasePlanMapper")
public class BasePlanMapperImpl extends BasicSqlSupport implements BasePlanMapper {

	/**
	 * 查询所有的基础模块-学制信息信息
	 * @return 查询到的列表
	 */
	public List<BasePlanVo> queryAllBasePlan(){
	     return this.selectList("com.sjq.plan.dao.BasePlanMapper.queryAllBasePlan");
	}
				
	/**
	 * 根据ID查询基础模块-学制信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BasePlanVo queryBasePlanById(Long id){
	    return this.selectOne("com.sjq.plan.dao.BasePlanMapper.queryBasePlanById",id);
	}

	/**
	 * 根据IDS查询所有基础模块-学制信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BasePlanVo>  queryBasePlanByIds(Map<String, Object> map){
		return this.selectList("com.sjq.plan.dao.BasePlanMapper.queryBasePlanByIds",map);
	}

	/**
	 * 根据条件查询所有基础模块-学制信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BasePlanVo>  queryBasePlanBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.plan.dao.BasePlanMapper.queryBasePlanBySearch",map);
	}
	
	/**
	 * 分页查询基础模块-学制信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBasePlanPage(Map<String, Object> map){
		return this.selectList("com.sjq.plan.dao.BasePlanMapper.queryBasePlanPage",map);
	}
	
	/**
	 * (删除)根据ID删除基础模块-学制信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBasePlanById(BasePlanBean bean){
		return this.delete("com.sjq.plan.dao.BasePlanMapper.deleteBasePlanById",bean);
	}
	
	/**
	 * (删除)根据IDS删除基础模块-学制信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBasePlanByIds(Map<String, Object> map){
		return this.delete("com.sjq.plan.dao.BasePlanMapper.deleteBasePlanByIds",map);
	}
	
	/**
	 * (更新)根据ID更新所有基础模块-学制信息信息
	 * @param bean 基础模块-学制信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateBasePlanById(BasePlanBean bean){
	    return this.update("com.sjq.plan.dao.BasePlanMapper.updateBasePlanById", bean);
	}
	
	/**
	 * 根据条件查询基础模块-学制信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBasePlanTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.plan.dao.BasePlanMapper.queryBasePlanTotalCount",map);
	}
	
	

}