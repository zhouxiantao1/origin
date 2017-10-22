package com.sjq.knowledgeCatalogDetail.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.knowledgeCatalogDetail.vo.BaseKnowledgeCatalogDetailVo;
import com.sjq.knowledgeCatalogDetail.bean.BaseKnowledgeCatalogDetailBean;
import com.sjq.knowledgeCatalogDetail.dao.BaseKnowledgeCatalogDetailMapper;

/**
 * [自动生成]知识点目录详情信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-01 11:35:00
 * @version 1.0
 */
@Repository("BaseKnowledgeCatalogDetailMapper")
public class BaseKnowledgeCatalogDetailMapperImpl extends BasicSqlSupport implements BaseKnowledgeCatalogDetailMapper {

	/**
	 * 查询所有的知识点目录详情信息信息
	 * @return 查询到的列表
	 */
	public List<BaseKnowledgeCatalogDetailVo> queryAllBaseKnowledgeCatalogDetail(){
	     return this.selectList("com.sjq.knowledgeCatalogDetail.dao.BaseKnowledgeCatalogDetailMapper.queryAllBaseKnowledgeCatalogDetail");
	}
				
	/**
	 * 根据ID查询知识点目录详情信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseKnowledgeCatalogDetailVo queryBaseKnowledgeCatalogDetailById(Long id){
	    return this.selectOne("com.sjq.knowledgeCatalogDetail.dao.BaseKnowledgeCatalogDetailMapper.queryBaseKnowledgeCatalogDetailById",id);
	}

	/**
	 * 根据条件查询所有知识点目录详情信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseKnowledgeCatalogDetailVo>  queryBaseKnowledgeCatalogDetailBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.knowledgeCatalogDetail.dao.BaseKnowledgeCatalogDetailMapper.queryBaseKnowledgeCatalogDetailBySearch",map);
	}
	
	/**
	 * 根据条件查询知识点目录详情信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseKnowledgeCatalogDetailTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.knowledgeCatalogDetail.dao.BaseKnowledgeCatalogDetailMapper.queryBaseKnowledgeCatalogDetailTotalCount",map);
	}
	
	/**
	 * 分页查询知识点目录详情信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseKnowledgeCatalogDetailPage(Map<String, Object> map){
		return this.selectList("com.sjq.knowledgeCatalogDetail.dao.BaseKnowledgeCatalogDetailMapper.queryBaseKnowledgeCatalogDetailPage",map);
	}
	
	/**
	 * (增加)增加知识点目录详情信息信息
	 * @param bean 知识点目录详情信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseKnowledgeCatalogDetail(BaseKnowledgeCatalogDetailBean bean){
		return this.insert("com.sjq.knowledgeCatalogDetail.dao.BaseKnowledgeCatalogDetailMapper.insertBaseKnowledgeCatalogDetail", bean);
	}
	
	

}