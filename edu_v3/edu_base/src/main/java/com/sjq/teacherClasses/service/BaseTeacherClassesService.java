package com.sjq.teacherClasses.service;

import java.util.List;
import java.util.Map;

import com.sjq.teacherClasses.bean.BaseTeacherClassesBean;
import com.sjq.teacherClasses.search.BaseTeacherClassesSearch;
import com.sjq.teacherClasses.vo.BaseTeacherClassesVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象教师班级信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-27 15:29:16
 * @version 1.0
 */
 
public interface BaseTeacherClassesService {
	
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
	 * @return   查询到的结果列表
	 */
	BaseTeacherClassesVo queryBaseTeacherClassesById(Long id);
				
				
	/**
	 * 根据条件查询所有教师班级信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseTeacherClassesVo> queryBaseTeacherClassesBySearch(BaseTeacherClassesSearch search);
				
					
	/**
	 * 根据条件查询教师班级信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseTeacherClassesTotalCount(BaseTeacherClassesSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseTeacherClassesPage(PageBean pb,BaseTeacherClassesSearch search);
				
				
	/**
	 * (删除)根据ID删除教师班级信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseTeacherClassesById(BaseTeacherClassesBean bean);
				
				
	/**
	 * (增加)增加教师班级信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseTeacherClasses(BaseTeacherClassesBean bean);
	
	List<BaseTeacherClassesVo> queryDistinctBaseTeacherClassesBySearch(BaseTeacherClassesSearch search);
	
}