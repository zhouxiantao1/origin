package com.sjq.catalog.service;

import java.util.List;
import java.util.Map;

import com.sjq.catalog.bean.BaseCatalogBean;
import com.sjq.catalog.search.BaseCatalogSearch;
import com.sjq.catalog.vo.BaseCatalogVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象基础模块-目录信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 15:01:36
 * @version 1.0
 */
 
public interface BaseCatalogService {
	
	/**
	 * (增加)增加基础模块-目录信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseCatalog(BaseCatalogBean bean);
	
	/**
	 * 查询所有的基础模块-目录信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseCatalogVo> queryAllBaseCatalog();
				
				
	/**
	 * 根据ID查询基础模块-目录信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseCatalogVo queryBaseCatalogById(Long id);
				
				
	/**
	 * 根据IDS查询所有基础模块-目录信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseCatalogVo> queryBaseCatalogByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有基础模块-目录信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseCatalogVo> queryBaseCatalogBySearch(BaseCatalogSearch search);
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseCatalogPage(PageBean pb,BaseCatalogSearch search);
				
				
	/**
	 * (删除)根据ID删除基础模块-目录信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseCatalogById(BaseCatalogBean bean);
				
				
	/**
	 * (删除)根据IDS删除基础模块-目录信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseCatalogByIds(BaseCatalogBean bean,Long[] ids);
				
				
	/**
	 * (更新)根据ID更新所有基础模块-目录信息信息
	 * @param bean
	 * @return
	 */
	int updateBaseCatalogById(BaseCatalogBean bean);
				
					
	/**
	 * 根据条件查询基础模块-目录信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseCatalogTotalCount(BaseCatalogSearch search);
	
	
}