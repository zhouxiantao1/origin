package com.sjq.teacher.dao;

import java.util.List;
import java.util.Map;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.teacher.bean.BaseTeacherBean;

/**
 * [自动生成]抽象教师信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-27 16:06:01
 * @version 1.0
 */
public interface BaseTeacherMapper {

	/**
	 * 根据ID查询教师信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseTeacherVo queryBaseTeacherByUserId(Long userId);
	
	/**
	 * 根据ID查询教师信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseTeacherVo queryBaseTeacherById(Long id);
	
	/**
	 * 根据条件查询所有教师信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseTeacherVo> queryBaseTeacherBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询教师信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseTeacherTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询教师信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseTeacherPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除教师信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseTeacherById(BaseTeacherBean bean);
	
	/**
	 * (增加)增加教师信息信息
	 * @param bean 教师信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseTeacher(BaseTeacherBean bean);

	
}