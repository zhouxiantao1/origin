package com.sjq.teacherClasses.dao;

import java.util.List;
import java.util.Map;
import com.sjq.teacherClasses.vo.BaseTeacherClassesVo;
import com.sjq.teacherClasses.bean.BaseTeacherClassesBean;
import com.sjq.teacherClasses.search.BaseTeacherClassesSearch;

/**
 * [自动生成]抽象教师班级信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-27 15:29:16
 * @version 1.0
 */
public interface BaseTeacherClassesMapper {
	
	/**
	 * 根据老师ID查询教师班级信息获取不重复学科
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	List<BaseTeacherClassesVo> querySubjectByteacherId(Long teacherId);
	
	/**
	 * 根据老师ID查询教师班级信息获取不重复班级
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	List<BaseTeacherClassesVo> queryClassesByteacherId(Long teacherId);
	
	/**
	 * 根据老师ID查询教师班级信息获取不重复年级
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	List<BaseTeacherClassesVo> queryBaseTeacherClassesByteacherId(Long teacherId);
	
	/**
	 * 根据ID查询教师班级信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseTeacherClassesVo queryBaseTeacherClassesById(Long id);
	
	/**
	 * 根据条件查询所有教师班级信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseTeacherClassesVo> queryBaseTeacherClassesBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询教师班级信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseTeacherClassesTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询教师班级信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseTeacherClassesPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除教师班级信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseTeacherClassesById(BaseTeacherClassesBean bean);
	
	/**
	 * (增加)增加教师班级信息信息
	 * @param bean 教师班级信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseTeacherClasses(BaseTeacherClassesBean bean);

	List<BaseTeacherClassesVo> queryDistinctBaseTeacherClassesBySearch(Map<String, Object> map);
}