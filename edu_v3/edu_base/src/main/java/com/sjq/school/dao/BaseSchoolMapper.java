package com.sjq.school.dao;

import java.util.List;
import java.util.Map;
import com.sjq.school.vo.BaseSchoolVo;
import com.sjq.school.bean.BaseSchoolBean;

/**
 * [自动生成]抽象基础模块-学校信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-25 16:53:37
 * @version 1.0
 */
public interface BaseSchoolMapper {


	/**
	 * 查询所有的基础模块-学校信息信息
	 * @return 查询到的列表
	 */
	List<BaseSchoolVo> queryAllBaseSchool();
	
	/**
	 * 根据ID查询基础模块-学校信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseSchoolVo queryBaseSchoolById(Long id);
	
	/**
	 * 根据IDS查询所有基础模块-学校信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseSchoolVo> queryBaseSchoolByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有基础模块-学校信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseSchoolVo> queryBaseSchoolBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询基础模块-学校信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseSchoolTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询基础模块-学校信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseSchoolPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除基础模块-学校信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseSchoolById(BaseSchoolBean bean);
	
	/**
	 * (删除)根据IDS删除基础模块-学校信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseSchoolByIds(Map<String, Object> map);
		
	/**
	 * (删除)根据条件删除基础模块-学校信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseSchoolBySearch(Map<String, Object> map);
	
	/**
	 * (更新)根据ID更新所有基础模块-学校信息信息
	 * @param bean 基础模块-学校信息实体
	 * @return     受更新影响的行数
	 */
	int updateBaseSchoolById(BaseSchoolBean bean);
	
	/**
	 * (更新)根据IDS更新所有基础模块-学校信息信息
	 * @param map 封装更新参数(ids) 
	 * @return    受更新影响的行数
	 */
	int updateBaseSchoolByIds(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有基础模块-学校信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateBaseSchoolBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加基础模块-学校信息信息
	 * @param bean 基础模块-学校信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseSchool(BaseSchoolBean bean);
	
	/**
	 * 根据区域id给学校列表
	 * */
	List<BaseSchoolVo> queryBaseSchoolByAreaId(Long areaId);
	
}