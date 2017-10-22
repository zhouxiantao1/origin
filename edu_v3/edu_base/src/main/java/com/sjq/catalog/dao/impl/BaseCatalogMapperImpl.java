package com.sjq.catalog.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.catalog.vo.BaseCatalogVo;
import com.sjq.catalog.bean.BaseCatalogBean;
import com.sjq.catalog.dao.BaseCatalogMapper;

/**
 * [自动生成]基础模块-目录信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-25 15:01:36
 * @version 1.0
 */
@Repository("BaseCatalogMapper")
public class BaseCatalogMapperImpl extends BasicSqlSupport implements BaseCatalogMapper {
	
	/**
	 * (增加)增加基础模块-目录信息信息
	 * @param bean 基础模块-目录信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseCatalog(BaseCatalogBean bean){
		return this.insert("com.sjq.catalog.dao.BaseCatalogMapper.insertBaseCatalog", bean);
	}
	
	/**
	 * 查询所有的基础模块-目录信息信息
	 * @return 查询到的列表
	 */
	public List<BaseCatalogVo> queryAllBaseCatalog(){
	     return this.selectList("com.sjq.catalog.dao.BaseCatalogMapper.queryAllBaseCatalog");
	}
				
	/**
	 * 根据ID查询基础模块-目录信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseCatalogVo queryBaseCatalogById(Long id){
	    return this.selectOne("com.sjq.catalog.dao.BaseCatalogMapper.queryBaseCatalogById",id);
	}

	/**
	 * 根据IDS查询所有基础模块-目录信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseCatalogVo>  queryBaseCatalogByIds(Map<String, Object> map){
		return this.selectList("com.sjq.catalog.dao.BaseCatalogMapper.queryBaseCatalogByIds",map);
	}

	/**
	 * 根据条件查询所有基础模块-目录信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseCatalogVo>  queryBaseCatalogBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.catalog.dao.BaseCatalogMapper.queryBaseCatalogBySearch",map);
	}
	
	/**
	 * 分页查询基础模块-目录信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseCatalogPage(Map<String, Object> map){
		return this.selectList("com.sjq.catalog.dao.BaseCatalogMapper.queryBaseCatalogPage",map);
	}
	
	/**
	 * (删除)根据ID删除基础模块-目录信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseCatalogById(BaseCatalogBean bean){
		return this.delete("com.sjq.catalog.dao.BaseCatalogMapper.deleteBaseCatalogById",bean);
	}
	
	/**
	 * (删除)根据IDS删除基础模块-目录信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseCatalogByIds(Map<String, Object> map){
		return this.delete("com.sjq.catalog.dao.BaseCatalogMapper.deleteBaseCatalogByIds",map);
	}
	
	/**
	 * (更新)根据ID更新所有基础模块-目录信息信息
	 * @param bean 基础模块-目录信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateBaseCatalogById(BaseCatalogBean bean){
	    return this.update("com.sjq.catalog.dao.BaseCatalogMapper.updateBaseCatalogById", bean);
	}
	
	/**
	 * 根据条件查询基础模块-目录信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseCatalogTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.catalog.dao.BaseCatalogMapper.queryBaseCatalogTotalCount",map);
	}
	
	

}