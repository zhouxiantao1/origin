package com.sjq.knowledgeCatalogDetail.dao;

import java.util.List;
import java.util.Map;
import com.sjq.knowledgeCatalogDetail.vo.BaseKnowledgeCatalogDetailVo;
import com.sjq.knowledgeCatalogDetail.bean.BaseKnowledgeCatalogDetailBean;

/**
 * [自动生成]抽象知识点目录详情信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-01 11:35:00
 * @version 1.0
 */
public interface BaseKnowledgeCatalogDetailMapper {


	/**
	 * 查询所有的知识点目录详情信息信息
	 * @return 查询到的列表
	 */
	List<BaseKnowledgeCatalogDetailVo> queryAllBaseKnowledgeCatalogDetail();
	
	/**
	 * 根据ID查询知识点目录详情信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseKnowledgeCatalogDetailVo queryBaseKnowledgeCatalogDetailById(Long id);
	
	/**
	 * 根据条件查询所有知识点目录详情信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseKnowledgeCatalogDetailVo> queryBaseKnowledgeCatalogDetailBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询知识点目录详情信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseKnowledgeCatalogDetailTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询知识点目录详情信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseKnowledgeCatalogDetailPage(Map<String, Object> map);
	
	/**
	 * (增加)增加知识点目录详情信息信息
	 * @param bean 知识点目录详情信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseKnowledgeCatalogDetail(BaseKnowledgeCatalogDetailBean bean);

	
}