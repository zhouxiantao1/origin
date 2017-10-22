package com.sjq.classes.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.classes.vo.BaseClassesVo;
import com.sjq.classes.bean.BaseClassesBean;
import com.sjq.classes.dao.BaseClassesMapper;

/**
 * [自动生成]基础模块-班级信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-25 17:17:24
 * @version 1.0
 */
@Repository("BaseClassesMapper")
public class BaseClassesMapperImpl extends BasicSqlSupport implements BaseClassesMapper {
	
	/**
	 * 根据学校ID查询基础模块-班级信息信息
	 * @return 查询到的列表
	 */
	public List<BaseClassesVo> queryBaseClassesBySchoolId(){
		return this.selectList("com.sjq.classes.dao.BaseClassesMapper.queryBaseClassesBySchoolId");
	}
	
	
	/**
	 * 查询所有的基础模块-班级信息信息
	 * @return 查询到的列表
	 */
	public List<BaseClassesVo> queryAllBaseClasses(){
	     return this.selectList("com.sjq.classes.dao.BaseClassesMapper.queryAllBaseClasses");
	}
				
	/**
	 * 根据ID查询基础模块-班级信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseClassesVo queryBaseClassesById(Long id){
	    return this.selectOne("com.sjq.classes.dao.BaseClassesMapper.queryBaseClassesById",id);
	}

	/**
	 * 根据IDS查询所有基础模块-班级信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseClassesVo>  queryBaseClassesByIds(Map<String, Object> map){
		return this.selectList("com.sjq.classes.dao.BaseClassesMapper.queryBaseClassesByIds",map);
	}

	/**
	 * 根据条件查询所有基础模块-班级信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseClassesVo>  queryBaseClassesBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.classes.dao.BaseClassesMapper.queryBaseClassesBySearch",map);
	}
	
	/**
	 * 根据条件查询基础模块-班级信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseClassesTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.classes.dao.BaseClassesMapper.queryBaseClassesTotalCount",map);
	}
	
	/**
	 * 分页查询基础模块-班级信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseClassesPage(Map<String, Object> map){
		return this.selectList("com.sjq.classes.dao.BaseClassesMapper.queryBaseClassesPage",map);
	}
	
	/**
	 * (删除)根据ID删除基础模块-班级信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseClassesById(BaseClassesBean bean){
		return this.delete("com.sjq.classes.dao.BaseClassesMapper.deleteBaseClassesById",bean);
	}
	
	/**
	 * (删除)根据IDS删除基础模块-班级信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseClassesByIds(Map<String, Object> map){
		return this.delete("com.sjq.classes.dao.BaseClassesMapper.deleteBaseClassesByIds",map);
	}
	
	/**
	 * (删除)根据条件删除基础模块-班级信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseClassesBySearch(Map<String, Object> map){
		return this.delete("com.sjq.classes.dao.BaseClassesMapper.deleteBaseClassesBySearch",map);
	}
	
	/**
	 * (更新)根据ID更新所有基础模块-班级信息信息
	 * @param bean 基础模块-班级信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateBaseClassesById(BaseClassesBean bean){
	    return this.update("com.sjq.classes.dao.BaseClassesMapper.updateBaseClassesById", bean);
	}
	
	/**
	 * (更新)根据IDS更新所有基础模块-班级信息信息
	 * @param map 封装更新参数(ids) 
	 * @return    受更新影响的行数
	 */
	public int  updateBaseClassesByIds(Map<String, Object> map){
	    return this.update("com.sjq.classes.dao.BaseClassesMapper.updateBaseClassesByIds", map);
	}
	
	/**
	 * (更新)根据条件更新所有基础模块-班级信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateBaseClassesBySearch(Map<String, Object> map){
	    return this.update("com.sjq.classes.dao.BaseClassesMapper.updateBaseClassesBySearch", map);
	}
	
	/**
	 * (增加)增加基础模块-班级信息信息
	 * @param bean 基础模块-班级信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseClasses(BaseClassesBean bean){
		return this.insert("com.sjq.classes.dao.BaseClassesMapper.insertBaseClasses", bean);
	}


	@Override
	public List<BaseClassesVo> queryBaseClassesByAreaId(Map<String, Object> map) {
		return this.selectList("com.sjq.classes.dao.BaseClassesMapper.queryBaseClassesByAreaId",map);
	}
	
	

}