package com.sjq.school.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.school.vo.BaseSchoolVo;
import com.sjq.school.bean.BaseSchoolBean;
import com.sjq.school.dao.BaseSchoolMapper;

/**
 * [自动生成]基础模块-学校信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-25 16:53:37
 * @version 1.0
 */
@Repository("BaseSchoolMapper")
public class BaseSchoolMapperImpl extends BasicSqlSupport implements BaseSchoolMapper {

	/**
	 * 查询所有的基础模块-学校信息信息
	 * @return 查询到的列表
	 */
	public List<BaseSchoolVo> queryAllBaseSchool(){
	     return this.selectList("com.sjq.school.dao.BaseSchoolMapper.queryAllBaseSchool");
	}
				
	/**
	 * 根据ID查询基础模块-学校信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseSchoolVo queryBaseSchoolById(Long id){
	    return this.selectOne("com.sjq.school.dao.BaseSchoolMapper.queryBaseSchoolById",id);
	}

	/**
	 * 根据IDS查询所有基础模块-学校信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseSchoolVo>  queryBaseSchoolByIds(Map<String, Object> map){
		return this.selectList("com.sjq.school.dao.BaseSchoolMapper.queryBaseSchoolByIds",map);
	}

	/**
	 * 根据条件查询所有基础模块-学校信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseSchoolVo>  queryBaseSchoolBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.school.dao.BaseSchoolMapper.queryBaseSchoolBySearch",map);
	}
	
	/**
	 * 根据条件查询基础模块-学校信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseSchoolTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.school.dao.BaseSchoolMapper.queryBaseSchoolTotalCount",map);
	}
	
	/**
	 * 分页查询基础模块-学校信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseSchoolPage(Map<String, Object> map){
		return this.selectList("com.sjq.school.dao.BaseSchoolMapper.queryBaseSchoolPage",map);
	}
	
	/**
	 * (删除)根据ID删除基础模块-学校信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseSchoolById(BaseSchoolBean bean){
		return this.delete("com.sjq.school.dao.BaseSchoolMapper.deleteBaseSchoolById",bean);
	}
	
	/**
	 * (删除)根据IDS删除基础模块-学校信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseSchoolByIds(Map<String, Object> map){
		return this.delete("com.sjq.school.dao.BaseSchoolMapper.deleteBaseSchoolByIds",map);
	}
	
	/**
	 * (删除)根据条件删除基础模块-学校信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseSchoolBySearch(Map<String, Object> map){
		return this.delete("com.sjq.school.dao.BaseSchoolMapper.deleteBaseSchoolBySearch",map);
	}
	
	/**
	 * (更新)根据ID更新所有基础模块-学校信息信息
	 * @param bean 基础模块-学校信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateBaseSchoolById(BaseSchoolBean bean){
	    return this.update("com.sjq.school.dao.BaseSchoolMapper.updateBaseSchoolById", bean);
	}
	
	/**
	 * (更新)根据IDS更新所有基础模块-学校信息信息
	 * @param map 封装更新参数(ids) 
	 * @return    受更新影响的行数
	 */
	public int  updateBaseSchoolByIds(Map<String, Object> map){
	    return this.update("com.sjq.school.dao.BaseSchoolMapper.updateBaseSchoolByIds", map);
	}
	
	/**
	 * (更新)根据条件更新所有基础模块-学校信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateBaseSchoolBySearch(Map<String, Object> map){
	    return this.update("com.sjq.school.dao.BaseSchoolMapper.updateBaseSchoolBySearch", map);
	}
	
	/**
	 * (增加)增加基础模块-学校信息信息
	 * @param bean 基础模块-学校信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseSchool(BaseSchoolBean bean){
		return this.insert("com.sjq.school.dao.BaseSchoolMapper.insertBaseSchool", bean);
	}
	
	/**
	 * 根据区域id给学校列表
	 * */
	public List<BaseSchoolVo> queryBaseSchoolByAreaId(Long areaId){
		 return this.selectList("com.sjq.school.dao.BaseSchoolMapper.queryBaseSchoolByAreaId",areaId);
	}
}