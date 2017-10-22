package com.sjq.catalog.dao;

import java.util.List;
import java.util.Map;
import com.sjq.catalog.vo.BaseCatalogVo;
import com.sjq.catalog.bean.BaseCatalogBean;

/**
 * [自动生成]抽象基础模块-目录信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-25 15:01:36
 * @version 1.0
 */
public interface BaseCatalogMapper {

	/**
	 * (增加)增加基础模块-目录信息信息
	 * @param bean 基础模块-目录信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseCatalog(BaseCatalogBean bean);
	
	/**
	 * 查询所有的基础模块-目录信息信息
	 * @return 查询到的列表
	 */
	List<BaseCatalogVo> queryAllBaseCatalog();
	
	/**
	 * 根据ID查询基础模块-目录信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseCatalogVo queryBaseCatalogById(Long id);
	
	/**
	 * 根据IDS查询所有基础模块-目录信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseCatalogVo> queryBaseCatalogByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有基础模块-目录信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseCatalogVo> queryBaseCatalogBySearch(Map<String, Object> map);
	
	/**
	 * 分页查询基础模块-目录信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseCatalogPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除基础模块-目录信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseCatalogById(BaseCatalogBean bean);
	
	/**
	 * (删除)根据IDS删除基础模块-目录信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseCatalogByIds(Map<String, Object> map);
		
	/**
	 * (更新)根据ID更新所有基础模块-目录信息信息
	 * @param bean 基础模块-目录信息实体
	 * @return     受更新影响的行数
	 */
	int updateBaseCatalogById(BaseCatalogBean bean);
	
	/**
	 * 根据条件查询基础模块-目录信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseCatalogTotalCount(Map<String, Object> map);
	
	
}