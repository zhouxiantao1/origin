package com.sjq.year.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.year.vo.BaseYearVo;
import com.sjq.year.bean.BaseYearBean;
import com.sjq.year.dao.BaseYearMapper;

/**
 * [自动生成]基础模块-年份信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:29:37
 * @version 1.0
 */
@Repository("BaseYearMapper")
public class BaseYearMapperImpl extends BasicSqlSupport implements BaseYearMapper {

	/**
	 * 查询所有的基础模块-年份信息信息
	 * @return 查询到的列表
	 */
	public List<BaseYearVo> queryAllBaseYear(){
	     return this.selectList("com.sjq.year.dao.BaseYearMapper.queryAllBaseYear");
	}
				
	/**
	 * 根据ID查询基础模块-年份信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseYearVo queryBaseYearById(Long id){
	    return this.selectOne("com.sjq.year.dao.BaseYearMapper.queryBaseYearById",id);
	}

	/**
	 * 根据IDS查询所有基础模块-年份信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseYearVo>  queryBaseYearByIds(Map<String, Object> map){
		return this.selectList("com.sjq.year.dao.BaseYearMapper.queryBaseYearByIds",map);
	}

	/**
	 * 根据条件查询所有基础模块-年份信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseYearVo>  queryBaseYearBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.year.dao.BaseYearMapper.queryBaseYearBySearch",map);
	}
	
	/**
	 * 分页查询基础模块-年份信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseYearPage(Map<String, Object> map){
		return this.selectList("com.sjq.year.dao.BaseYearMapper.queryBaseYearPage",map);
	}
	
	/**
	 * (删除)根据ID删除基础模块-年份信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseYearById(BaseYearBean bean){
		return this.delete("com.sjq.year.dao.BaseYearMapper.deleteBaseYearById",bean);
	}
	
	/**
	 * (删除)根据IDS删除基础模块-年份信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseYearByIds(Map<String, Object> map){
		return this.delete("com.sjq.year.dao.BaseYearMapper.deleteBaseYearByIds",map);
	}
	
	/**
	 * (更新)根据ID更新所有基础模块-年份信息信息
	 * @param bean 基础模块-年份信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateBaseYearById(BaseYearBean bean){
	    return this.update("com.sjq.year.dao.BaseYearMapper.updateBaseYearById", bean);
	}
	
	/**
	 * 根据条件查询基础模块-年份信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseYearTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.year.dao.BaseYearMapper.queryBaseYearTotalCount",map);
	}
	
	

}