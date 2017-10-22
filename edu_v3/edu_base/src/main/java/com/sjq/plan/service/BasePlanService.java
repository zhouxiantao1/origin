package com.sjq.plan.service;

import java.util.List;
import java.util.Map;

import com.sjq.plan.bean.BasePlanBean;
import com.sjq.plan.search.BasePlanSearch;
import com.sjq.plan.vo.BasePlanVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象基础模块-学制信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 15:02:21
 * @version 1.0
 */
 
public interface BasePlanService {

	/**
	 * 查询所有的基础模块-学制信息信息
	 * @return 查询到的结果列表
	 */
	List<BasePlanVo> queryAllBasePlan();
				
				
	/**
	 * 根据ID查询基础模块-学制信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BasePlanVo queryBasePlanById(Long id);
				
				
	/**
	 * 根据IDS查询所有基础模块-学制信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BasePlanVo> queryBasePlanByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有基础模块-学制信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BasePlanVo> queryBasePlanBySearch(BasePlanSearch search);
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBasePlanPage(PageBean pb,BasePlanSearch search);
				
				
	/**
	 * (删除)根据ID删除基础模块-学制信息信息
	 * @param id
	 * @return
	 */
	int deleteBasePlanById(BasePlanBean bean);
				
				
	/**
	 * (删除)根据IDS删除基础模块-学制信息信息
	 * @param map
	 * @return
	 */
	int deleteBasePlanByIds(BasePlanBean bean,Long[] ids);
				
				
	/**
	 * (更新)根据ID更新所有基础模块-学制信息信息
	 * @param bean
	 * @return
	 */
	int updateBasePlanById(BasePlanBean bean);
				
					
	/**
	 * 根据条件查询基础模块-学制信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBasePlanTotalCount(BasePlanSearch search);
	
	
}