package com.sjq.catalogDetail.service;

import java.util.List;
import java.util.Map;

import com.sjq.catalogDetail.bean.BaseCatalogDetailBean;
import com.sjq.catalogDetail.search.BaseCatalogDetailSearch;
import com.sjq.catalogDetail.vo.BaseCatalogDetailVo;
import com.sjq.knowledge.search.BaseKnowledgeSearch;
import com.sjq.util.PageBean;
import com.sjq.ware.dto.ZTreeNodesDto;

/**
 * [自动生成]抽象基础模块-目录详情信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:34:19
 * @version 1.0
 */
 
public interface BaseCatalogDetailService {
	
	/**
	 * (增加)增加基础模块-目录详情信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseCatalogDetail(BaseCatalogDetailBean bean);
	
	/**
	 * 查询所有的基础模块-目录详情信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseCatalogDetailVo> queryAllBaseCatalogDetail();
				
				
	/**
	 * 根据ID查询基础模块-目录详情信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseCatalogDetailVo queryBaseCatalogDetailById(Long id);
				
				
	/**
	 * 根据IDS查询所有基础模块-目录详情信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseCatalogDetailVo> queryBaseCatalogDetailByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有基础模块-目录详情信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseCatalogDetailVo> queryBaseCatalogDetailBySearch(BaseCatalogDetailSearch search);
				
					
	/**
	 * 根据条件查询基础模块-目录详情信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseCatalogDetailTotalCount(BaseCatalogDetailSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseCatalogDetailPage(PageBean pb,BaseCatalogDetailSearch search);
				
				
	/**
	 * (删除)根据ID删除基础模块-目录详情信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseCatalogDetailById(BaseCatalogDetailBean bean);
				
				
	/**
	 * (删除)根据IDS删除基础模块-目录详情信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseCatalogDetailByIds(BaseCatalogDetailBean bean,Long[] ids);
				
								
	/**
	 * (删除)根据条件删除基础模块-目录详情信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseCatalogDetailBySearch(BaseCatalogDetailBean bean,BaseCatalogDetailSearch search);
				
				
	/**
	 * (更新)根据ID更新所有基础模块-目录详情信息信息
	 * @param bean
	 * @return
	 */
	int updateBaseCatalogDetailById(BaseCatalogDetailBean bean);
				
				
	/**
	 * (更新)根据IDS更新基础模块-目录详情信息信息
	 * @param map
	 * @return
	 */
	int updateBaseCatalogDetailByIds(Long[] ids,BaseCatalogDetailBean bean);
				

	/**
	 * 根据条件查询所有基础模块-目录详情信息信息(树型）
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<ZTreeNodesDto> queryTreeNodesBaseCatalogDetailBySearch(BaseCatalogDetailSearch search);
	
}