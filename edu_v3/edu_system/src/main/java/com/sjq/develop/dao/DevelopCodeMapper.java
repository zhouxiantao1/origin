package com.sjq.develop.dao;

import java.util.List;
import java.util.Map;

import com.sjq.develop.bean.DevelopCodeBean;
import com.sjq.develop.vo.DevelopCodeVo;




/**
 * 
 * 抽象代码生成模块Dao层
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月11日下午3:50:41
 * @version 1.0
 */
public interface DevelopCodeMapper {

	/**
	 * (查询)查询所有的信息
	 * @return 查询到的列表
	 */
	List<DevelopCodeVo> selectAll();
	
	/**
	 * (查询)根据ID查询所有信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	DevelopCodeVo queryCodeById(Long id);
	
	/**
	 * (查询)根据IDS查询所有信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<DevelopCodeVo> queryCodeByIds(Map<String, Object> map);

	/**
	 * (查询)根据条件查询所有信息 
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<DevelopCodeVo> queryCodeBySearch(Map<String, Object> map);
	
	/**
	 * (查询)分页根据条件查询count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryTotalCount(Map<String, Object> map);
	
	/**
	 * (查询)分布根据条件查询信息 
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryByPageBean(Map<String, Object> map);
	
	/**
	 * (删除)删除所有的 信息
	 * @return  受删除影响的行数
	 */
	int deleteAll();
	
	/**
	 * (删除)根据ID删除信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteCodeById(Long id);
	
	/**
	 * (删除)根据IDS删除信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteCodeByIds(Map<String, Object> map);
	
	/**
	 * (删除)根据条件删除信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteCodeBySearch(Map<String, Object> map);
	
	/**
	 * (更新)更新所有信息 (慎用)
	 * @param bean 代码生成模块实体
	 * @return     受更新影响的行数
	 */
	int updateCode(DevelopCodeBean bean);
	
	/**
	 * (更新)根据ID更新所有信息
	 * @param bean 代码生成模块实体
	 * @return     受更新影响的行数
	 */
	int updateCodeById(DevelopCodeBean bean);
	
	/**
	 * (更新)根据IDS更新有信息
	 * @param map 封装更新参数(ids) 
	 * @return    受更新影响的行数
	 */
	int updateCodeByIds(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有信息 
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateCodeBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加信息
	 * @param bean 代码生成模块实体
	 * @return     受增加影响的行数
	 */
	int insertCode(DevelopCodeBean bean);
}