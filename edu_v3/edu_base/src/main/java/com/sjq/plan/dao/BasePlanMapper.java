package com.sjq.plan.dao;

import java.util.List;
import java.util.Map;
import com.sjq.plan.vo.BasePlanVo;
import com.sjq.plan.bean.BasePlanBean;

/**
 * [自动生成]抽象基础模块-学制信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-25 15:02:21
 * @version 1.0
 */
public interface BasePlanMapper {


	/**
	 * 查询所有的基础模块-学制信息信息
	 * @return 查询到的列表
	 */
	List<BasePlanVo> queryAllBasePlan();
	
	/**
	 * 根据ID查询基础模块-学制信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BasePlanVo queryBasePlanById(Long id);
	
	/**
	 * 根据IDS查询所有基础模块-学制信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BasePlanVo> queryBasePlanByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有基础模块-学制信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BasePlanVo> queryBasePlanBySearch(Map<String, Object> map);
	
	/**
	 * 分页查询基础模块-学制信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBasePlanPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除基础模块-学制信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBasePlanById(BasePlanBean bean);
	
	/**
	 * (删除)根据IDS删除基础模块-学制信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBasePlanByIds(Map<String, Object> map);
		
	/**
	 * (更新)根据ID更新所有基础模块-学制信息信息
	 * @param bean 基础模块-学制信息实体
	 * @return     受更新影响的行数
	 */
	int updateBasePlanById(BasePlanBean bean);
	
	/**
	 * 根据条件查询基础模块-学制信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBasePlanTotalCount(Map<String, Object> map);
	
	
}