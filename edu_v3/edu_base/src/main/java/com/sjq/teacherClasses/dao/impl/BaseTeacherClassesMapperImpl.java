package com.sjq.teacherClasses.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.teacherClasses.vo.BaseTeacherClassesVo;
import com.sjq.teacherClasses.bean.BaseTeacherClassesBean;
import com.sjq.teacherClasses.dao.BaseTeacherClassesMapper;

/**
 * [自动生成]教师班级信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-27 15:29:16
 * @version 1.0
 */
@Repository("BaseTeacherClassesMapper")
public class BaseTeacherClassesMapperImpl extends BasicSqlSupport implements BaseTeacherClassesMapper {
	
	/**
	 * 根据老师ID查询教师班级信息获取不重复学科
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	public List<BaseTeacherClassesVo> querySubjectByteacherId(Long teacherId){
	    return this.selectList("com.sjq.teacherClasses.dao.BaseTeacherClassesMapper.querySubjectByteacherId",teacherId);
	}
	
	/**
	 * 根据老师ID查询教师班级信息获取不重复班级
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	public List<BaseTeacherClassesVo> queryClassesByteacherId(Long teacherId){
	    return this.selectList("com.sjq.teacherClasses.dao.BaseTeacherClassesMapper.queryClassesByteacherId",teacherId);
	}
	
	/**
	 * 根据老师ID查询教师班级信息获取不重复年级
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	public List<BaseTeacherClassesVo> queryBaseTeacherClassesByteacherId(Long teacherId){
	    return this.selectList("com.sjq.teacherClasses.dao.BaseTeacherClassesMapper.queryBaseTeacherClassesByteacherId",teacherId);
	}
	
	/**
	 * 根据ID查询教师班级信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseTeacherClassesVo queryBaseTeacherClassesById(Long id){
	    return this.selectOne("com.sjq.teacherClasses.dao.BaseTeacherClassesMapper.queryBaseTeacherClassesById",id);
	}

	/**
	 * 根据条件查询所有教师班级信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseTeacherClassesVo>  queryBaseTeacherClassesBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.teacherClasses.dao.BaseTeacherClassesMapper.queryBaseTeacherClassesBySearch",map);
	}
	
	/**
	 * 根据条件查询教师班级信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseTeacherClassesTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.teacherClasses.dao.BaseTeacherClassesMapper.queryBaseTeacherClassesTotalCount",map);
	}
	
	/**
	 * 分页查询教师班级信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseTeacherClassesPage(Map<String, Object> map){
		return this.selectList("com.sjq.teacherClasses.dao.BaseTeacherClassesMapper.queryBaseTeacherClassesPage",map);
	}
	
	/**
	 * (删除)根据ID删除教师班级信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseTeacherClassesById(BaseTeacherClassesBean bean){
		return this.delete("com.sjq.teacherClasses.dao.BaseTeacherClassesMapper.deleteBaseTeacherClassesById",bean);
	}
	
	/**
	 * (增加)增加教师班级信息信息
	 * @param bean 教师班级信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseTeacherClasses(BaseTeacherClassesBean bean){
		return this.insert("com.sjq.teacherClasses.dao.BaseTeacherClassesMapper.insertBaseTeacherClasses", bean);
	}

	@Override
	public List<BaseTeacherClassesVo> queryDistinctBaseTeacherClassesBySearch(Map<String, Object> map) {
		return this.selectList("com.sjq.teacherClasses.dao.BaseTeacherClassesMapper.queryDistinctBaseTeacherClassesBySearch",map);
	}
	
	

}