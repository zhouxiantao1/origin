package com.sjq.catalogDetail.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.ware.dto.ZTreeNodesDto;
import com.sjq.catalogDetail.vo.BaseCatalogDetailVo;
import com.sjq.catalogDetail.bean.BaseCatalogDetailBean;
import com.sjq.catalogDetail.dao.BaseCatalogDetailMapper;

/**
 * [自动生成]基础模块-目录详情信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:34:19
 * @version 1.0
 */
@Repository("BaseCatalogDetailMapper")
public class BaseCatalogDetailMapperImpl extends BasicSqlSupport implements BaseCatalogDetailMapper {
	
	/**
	 * (增加)增加基础模块-目录详情信息信息
	 * @param bean 基础模块-目录详情信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseCatalogDetail(BaseCatalogDetailBean bean){
		return this.insert("com.sjq.catalogDetail.dao.BaseCatalogDetailMapper.insertBaseCatalogDetail", bean);
	}
	
	/**
	 * 查询所有的基础模块-目录详情信息信息
	 * @return 查询到的列表
	 */
	public List<BaseCatalogDetailVo> queryAllBaseCatalogDetail(){
	     return this.selectList("com.sjq.catalogDetail.dao.BaseCatalogDetailMapper.queryAllBaseCatalogDetail");
	}
				
	/**
	 * 根据ID查询基础模块-目录详情信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseCatalogDetailVo queryBaseCatalogDetailById(Long id){
	    return this.selectOne("com.sjq.catalogDetail.dao.BaseCatalogDetailMapper.queryBaseCatalogDetailById",id);
	}

	/**
	 * 根据IDS查询所有基础模块-目录详情信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseCatalogDetailVo>  queryBaseCatalogDetailByIds(Map<String, Object> map){
		return this.selectList("com.sjq.catalogDetail.dao.BaseCatalogDetailMapper.queryBaseCatalogDetailByIds",map);
	}

	/**
	 * 根据条件查询所有基础模块-目录详情信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseCatalogDetailVo>  queryBaseCatalogDetailBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.catalogDetail.dao.BaseCatalogDetailMapper.queryBaseCatalogDetailBySearch",map);
	}
	
	/**
	 * 根据条件查询基础模块-目录详情信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseCatalogDetailTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.catalogDetail.dao.BaseCatalogDetailMapper.queryBaseCatalogDetailTotalCount",map);
	}
	
	/**
	 * 分页查询基础模块-目录详情信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseCatalogDetailPage(Map<String, Object> map){
		return this.selectList("com.sjq.catalogDetail.dao.BaseCatalogDetailMapper.queryBaseCatalogDetailPage",map);
	}
	
	/**
	 * (删除)根据ID删除基础模块-目录详情信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseCatalogDetailById(BaseCatalogDetailBean bean){
		return this.delete("com.sjq.catalogDetail.dao.BaseCatalogDetailMapper.deleteBaseCatalogDetailById",bean);
	}
	
	/**
	 * (删除)根据IDS删除基础模块-目录详情信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseCatalogDetailByIds(Map<String, Object> map){
		return this.delete("com.sjq.catalogDetail.dao.BaseCatalogDetailMapper.deleteBaseCatalogDetailByIds",map);
	}
	
	/**
	 * (删除)根据条件删除基础模块-目录详情信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseCatalogDetailBySearch(Map<String, Object> map){
		return this.delete("com.sjq.catalogDetail.dao.BaseCatalogDetailMapper.deleteBaseCatalogDetailBySearch",map);
	}
	
	/**
	 * (更新)根据ID更新所有基础模块-目录详情信息信息
	 * @param bean 基础模块-目录详情信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateBaseCatalogDetailById(BaseCatalogDetailBean bean){
	    return this.update("com.sjq.catalogDetail.dao.BaseCatalogDetailMapper.updateBaseCatalogDetailById", bean);
	}
	
	/**
	 * (更新)根据IDS更新所有基础模块-目录详情信息信息
	 * @param map 封装更新参数(ids) 
	 * @return    受更新影响的行数
	 */
	public int  updateBaseCatalogDetailByIds(Map<String, Object> map){
	    return this.update("com.sjq.catalogDetail.dao.BaseCatalogDetailMapper.updateBaseCatalogDetailByIds", map);
	}

	@Override
	public List<ZTreeNodesDto> queryTreeNodesBaseCatalogDetailBySearch(Map<String, Object> map) {
		return this.selectList("com.sjq.catalogDetail.dao.BaseCatalogDetailMapper.queryTreeNodesBaseCatalogDetailBySearch",map);
	}
	
	

}