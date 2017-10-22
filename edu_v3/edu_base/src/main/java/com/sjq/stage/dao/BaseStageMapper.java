package com.sjq.stage.dao;

import java.util.List;
import java.util.Map;
import com.sjq.stage.vo.BaseStageVo;
import com.sjq.stage.bean.BaseStageBean;

/**
 * [自动生成]抽象基础模块-学段信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:27:20
 * @version 1.0
 */
public interface BaseStageMapper {


	/**
	 * 查询所有的基础模块-学段信息信息
	 * @return 查询到的列表
	 */
	List<BaseStageVo> queryAllBaseStage();
	
	/**
	 * 根据ID查询基础模块-学段信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseStageVo queryBaseStageById(Long id);
	
	/**
	 * 根据IDS查询所有基础模块-学段信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseStageVo> queryBaseStageByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有基础模块-学段信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseStageVo> queryBaseStageBySearch(Map<String, Object> map);
	
	/**
	 * 分页查询基础模块-学段信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseStagePage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除基础模块-学段信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseStageById(BaseStageBean bean);
	
	/**
	 * (删除)根据IDS删除基础模块-学段信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseStageByIds(Map<String, Object> map);
		
	/**
	 * (更新)根据ID更新所有基础模块-学段信息信息
	 * @param bean 基础模块-学段信息实体
	 * @return     受更新影响的行数
	 */
	int updateBaseStageById(BaseStageBean bean);
	
	/**
	 * 根据条件查询基础模块-学段信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseStageTotalCount(Map<String, Object> map);
	
	
}