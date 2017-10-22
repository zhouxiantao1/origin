package com.sjq.version.dao;

import java.util.List;
import java.util.Map;
import com.sjq.version.vo.BaseVersionVo;
import com.sjq.version.bean.BaseVersionBean;

/**
 * [自动生成]抽象基础模块-版本信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:30:32
 * @version 1.0
 */
public interface BaseVersionMapper {


	/**
	 * 查询所有的基础模块-版本信息信息
	 * @return 查询到的列表
	 */
	List<BaseVersionVo> queryAllBaseVersion();
	
	/**
	 * 根据ID查询基础模块-版本信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseVersionVo queryBaseVersionById(Long id);
	
	/**
	 * 根据IDS查询所有基础模块-版本信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseVersionVo> queryBaseVersionByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有基础模块-版本信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseVersionVo> queryBaseVersionBySearch(Map<String, Object> map);
	
	/**
	 * 分页查询基础模块-版本信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseVersionPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除基础模块-版本信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseVersionById(BaseVersionBean bean);
	
	/**
	 * (删除)根据IDS删除基础模块-版本信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseVersionByIds(Map<String, Object> map);
		
	/**
	 * (更新)根据ID更新所有基础模块-版本信息信息
	 * @param bean 基础模块-版本信息实体
	 * @return     受更新影响的行数
	 */
	int updateBaseVersionById(BaseVersionBean bean);
	
	/**
	 * 根据条件查询基础模块-版本信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseVersionTotalCount(Map<String, Object> map);
	
	
}