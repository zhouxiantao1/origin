package com.sjq.stage.service;

import java.util.List;
import java.util.Map;

import com.sjq.stage.bean.BaseStageBean;
import com.sjq.stage.search.BaseStageSearch;
import com.sjq.stage.vo.BaseStageVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象基础模块-学段信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:27:20
 * @version 1.0
 */
 
public interface BaseStageService {

	/**
	 * 查询所有的基础模块-学段信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseStageVo> queryAllBaseStage();
				
				
	/**
	 * 根据ID查询基础模块-学段信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseStageVo queryBaseStageById(Long id);
				
				
	/**
	 * 根据IDS查询所有基础模块-学段信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseStageVo> queryBaseStageByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有基础模块-学段信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseStageVo> queryBaseStageBySearch(BaseStageSearch search);
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseStagePage(PageBean pb,BaseStageSearch search);
				
				
	/**
	 * (删除)根据ID删除基础模块-学段信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseStageById(BaseStageBean bean);
				
				
	/**
	 * (删除)根据IDS删除基础模块-学段信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseStageByIds(BaseStageBean bean,Long[] ids);
				
				
	/**
	 * (更新)根据ID更新所有基础模块-学段信息信息
	 * @param bean
	 * @return
	 */
	int updateBaseStageById(BaseStageBean bean);
				
					
	/**
	 * 根据条件查询基础模块-学段信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseStageTotalCount(BaseStageSearch search);
	
	
}