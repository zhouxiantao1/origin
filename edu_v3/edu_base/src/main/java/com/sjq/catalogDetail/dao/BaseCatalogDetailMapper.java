package com.sjq.catalogDetail.dao;

import java.util.List;
import java.util.Map;
import com.sjq.catalogDetail.vo.BaseCatalogDetailVo;
import com.sjq.ware.dto.ZTreeNodesDto;
import com.sjq.catalogDetail.bean.BaseCatalogDetailBean;

/**
 * [自动生成]抽象基础模块-目录详情信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:34:19
 * @version 1.0
 */
public interface BaseCatalogDetailMapper {

	/**
	 * (增加)增加基础模块-目录详情信息信息
	 * @param bean 基础模块-目录详情信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseCatalogDetail(BaseCatalogDetailBean bean);
	
	/**
	 * 查询所有的基础模块-目录详情信息信息
	 * @return 查询到的列表
	 */
	List<BaseCatalogDetailVo> queryAllBaseCatalogDetail();
	
	/**
	 * 根据ID查询基础模块-目录详情信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseCatalogDetailVo queryBaseCatalogDetailById(Long id);
	
	/**
	 * 根据IDS查询所有基础模块-目录详情信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseCatalogDetailVo> queryBaseCatalogDetailByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有基础模块-目录详情信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseCatalogDetailVo> queryBaseCatalogDetailBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询所有基础模块-目录详情信息信息(树型）
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<ZTreeNodesDto> queryTreeNodesBaseCatalogDetailBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询基础模块-目录详情信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseCatalogDetailTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询基础模块-目录详情信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseCatalogDetailPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除基础模块-目录详情信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseCatalogDetailById(BaseCatalogDetailBean bean);
	
	/**
	 * (删除)根据IDS删除基础模块-目录详情信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseCatalogDetailByIds(Map<String, Object> map);
		
	/**
	 * (删除)根据条件删除基础模块-目录详情信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseCatalogDetailBySearch(Map<String, Object> map);
	
	/**
	 * (更新)根据ID更新所有基础模块-目录详情信息信息
	 * @param bean 基础模块-目录详情信息实体
	 * @return     受更新影响的行数
	 */
	int updateBaseCatalogDetailById(BaseCatalogDetailBean bean);
	
	/**
	 * (更新)根据IDS更新所有基础模块-目录详情信息信息
	 * @param map 封装更新参数(ids) 
	 * @return    受更新影响的行数
	 */
	int updateBaseCatalogDetailByIds(Map<String, Object> map);
	
	
}