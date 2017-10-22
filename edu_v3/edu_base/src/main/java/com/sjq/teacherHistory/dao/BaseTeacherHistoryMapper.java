package com.sjq.teacherHistory.dao;

import java.util.List;
import java.util.Map;
import com.sjq.teacherHistory.vo.BaseTeacherHistoryVo;
import com.sjq.teacherHistory.bean.BaseTeacherHistoryBean;

/**
 * [自动生成]抽象教师任教历史信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-27 15:42:52
 * @version 1.0
 */
public interface BaseTeacherHistoryMapper {

	/**
	 * 根据老师ID查询教获取不重复学科
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	 List<BaseTeacherHistoryVo> querySubjectByTeacherId(Long teacherId);
	
	/**
	 * 根据老师ID查询教获取不重复年级
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	 List<BaseTeacherHistoryVo> queryGreadeByTeacherId(Long teacherId);
	
	/**
	 * 根据老师ID查询教获取班级
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	 List<BaseTeacherHistoryVo> queryClassesByTeacherId(Long teacherId);
	/**
	 * 根据ID查询教师任教历史信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseTeacherHistoryVo queryBaseTeacherHistoryById(Long id);
	
	/**
	 * 根据条件查询所有教师任教历史信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseTeacherHistoryVo> queryBaseTeacherHistoryBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询教师任教历史信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseTeacherHistoryTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询教师任教历史信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseTeacherHistoryPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除教师任教历史信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseTeacherHistoryById(BaseTeacherHistoryBean bean);
	
	/**
	 * (增加)增加教师任教历史信息信息
	 * @param bean 教师任教历史信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseTeacherHistory(BaseTeacherHistoryBean bean);

	
}