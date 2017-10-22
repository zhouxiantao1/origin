package com.sjq.dict.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.dict.vo.BaseDictVo;
import com.sjq.dict.bean.BaseDictBean;
import com.sjq.dict.dao.BaseDictMapper;

/**
 * [自动生成]字典工具信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-27 18:11:47
 * @version 1.0
 */
@Repository("BaseDictMapper")
public class BaseDictMapperImpl extends BasicSqlSupport implements BaseDictMapper {

	/**
	 * 查询所有的字典工具信息信息
	 * @return 查询到的列表
	 */
	public List<BaseDictVo> queryAllBaseDict(){
	     return this.selectList("com.sjq.dict.dao.BaseDictMapper.queryAllBaseDict");
	}
				
	/**
	 * 根据ID查询字典工具信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseDictVo queryBaseDictById(Long id){
	    return this.selectOne("com.sjq.dict.dao.BaseDictMapper.queryBaseDictById",id);
	}

	/**
	 * 根据IDS查询所有字典工具信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseDictVo>  queryBaseDictByIds(Map<String, Object> map){
		return this.selectList("com.sjq.dict.dao.BaseDictMapper.queryBaseDictByIds",map);
	}

	/**
	 * 根据条件查询所有字典工具信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseDictVo>  queryBaseDictBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.dict.dao.BaseDictMapper.queryBaseDictBySearch",map);
	}
	
	/**
	 * 根据条件查询字典工具信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseDictTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.dict.dao.BaseDictMapper.queryBaseDictTotalCount",map);
	}
	
	/**
	 * 分页查询字典工具信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseDictPage(Map<String, Object> map){
		return this.selectList("com.sjq.dict.dao.BaseDictMapper.queryBaseDictPage",map);
	}
	
	/**
	 * (删除)根据ID删除字典工具信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseDictById(BaseDictBean bean){
		return this.delete("com.sjq.dict.dao.BaseDictMapper.deleteBaseDictById",bean);
	}
	
	/**
	 * (增加)增加字典工具信息信息
	 * @param bean 字典工具信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseDict(BaseDictBean bean){
		return this.insert("com.sjq.dict.dao.BaseDictMapper.insertBaseDict", bean);
	}
	
	

}