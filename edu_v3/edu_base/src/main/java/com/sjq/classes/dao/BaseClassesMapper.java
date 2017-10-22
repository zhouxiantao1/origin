package com.sjq.classes.dao;

import java.util.List;
import java.util.Map;
import com.sjq.classes.vo.BaseClassesVo;
import com.sjq.classes.bean.BaseClassesBean;
import com.sjq.classes.search.BaseClassesSearch;

/**
 * [自动生成]抽象基础模块-班级信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-25 17:17:24
 * @version 1.0
 */
public interface BaseClassesMapper {

	/**
	 * 根据学校ID查询基础模块-班级信息信息
	 * @return 查询到的列表
	 */
	public List<BaseClassesVo> queryBaseClassesBySchoolId();
	/**
	 * 查询所有的基础模块-班级信息信息
	 * @return 查询到的列表
	 */
	List<BaseClassesVo> queryAllBaseClasses();
	
	/**
	 * 根据ID查询基础模块-班级信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseClassesVo queryBaseClassesById(Long id);
	
	/**
	 * 根据IDS查询所有基础模块-班级信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseClassesVo> queryBaseClassesByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有基础模块-班级信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseClassesVo> queryBaseClassesBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询基础模块-班级信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseClassesTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询基础模块-班级信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseClassesPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除基础模块-班级信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseClassesById(BaseClassesBean bean);
	
	/**
	 * (删除)根据IDS删除基础模块-班级信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseClassesByIds(Map<String, Object> map);
		
	/**
	 * (删除)根据条件删除基础模块-班级信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseClassesBySearch(Map<String, Object> map);
	
	/**
	 * (更新)根据ID更新所有基础模块-班级信息信息
	 * @param bean 基础模块-班级信息实体
	 * @return     受更新影响的行数
	 */
	int updateBaseClassesById(BaseClassesBean bean);
	
	/**
	 * (更新)根据IDS更新所有基础模块-班级信息信息
	 * @param map 封装更新参数(ids) 
	 * @return    受更新影响的行数
	 */
	int updateBaseClassesByIds(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有基础模块-班级信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateBaseClassesBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加基础模块-班级信息信息
	 * @param bean 基础模块-班级信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseClasses(BaseClassesBean bean);

	//获取区域中比如有初三年级的学校
	List<BaseClassesVo> queryBaseClassesByAreaId(Map<String, Object> map);
	
}