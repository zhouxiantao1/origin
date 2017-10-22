package com.sjq.knowledgeCatalogDetail.service;

import java.util.List;
import java.util.Map;

import com.sjq.knowledgeCatalogDetail.bean.BaseKnowledgeCatalogDetailBean;
import com.sjq.knowledgeCatalogDetail.search.BaseKnowledgeCatalogDetailSearch;
import com.sjq.knowledgeCatalogDetail.vo.BaseKnowledgeCatalogDetailVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象知识点目录详情信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-01 11:35:00
 * @version 1.0
 */
 
public interface BaseKnowledgeCatalogDetailService {

	/**
	 * 查询所有的知识点目录详情信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseKnowledgeCatalogDetailVo> queryAllBaseKnowledgeCatalogDetail();
				
				
	/**
	 * 根据ID查询知识点目录详情信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseKnowledgeCatalogDetailVo queryBaseKnowledgeCatalogDetailById(Long id);
				
				
	/**
	 * 根据条件查询所有知识点目录详情信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseKnowledgeCatalogDetailVo> queryBaseKnowledgeCatalogDetailBySearch(BaseKnowledgeCatalogDetailSearch search);
				
					
	/**
	 * 根据条件查询知识点目录详情信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseKnowledgeCatalogDetailTotalCount(BaseKnowledgeCatalogDetailSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseKnowledgeCatalogDetailPage(PageBean pb,BaseKnowledgeCatalogDetailSearch search);
				
				
	/**
	 * (增加)增加知识点目录详情信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseKnowledgeCatalogDetail(BaseKnowledgeCatalogDetailBean bean);
				
	
}