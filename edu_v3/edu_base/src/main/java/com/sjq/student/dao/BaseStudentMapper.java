package com.sjq.student.dao;

import java.util.List;
import java.util.Map;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.student.bean.BaseStudentBean;

/**
 * [自动生成]抽象基础模块-学生信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-16 15:50:40
 * @version 1.0
 */
public interface BaseStudentMapper {


	/**
	 * 查询所有的基础模块-学生信息信息
	 * @return 查询到的列表
	 */
	List<BaseStudentVo> queryAllBaseStudent();
	
	/**
	 * 根据ID查询基础模块-学生信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseStudentVo queryBaseStudentById(Long id);
	
	
	/**
	 * 根据ID查询基础模块-学生信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseStudentVo queryBaseStudentByUserId(Long userId);
	
	/**
	 * 根据IDS查询所有基础模块-学生信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseStudentVo> queryBaseStudentByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有基础模块-学生信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseStudentVo> queryBaseStudentBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询基础模块-学生信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseStudentTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询基础模块-学生信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseStudentPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除基础模块-学生信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseStudentById(BaseStudentBean bean);
	
	/**
	 * (更新)根据ID更新所有基础模块-学生信息信息
	 * @param bean 基础模块-学生信息实体
	 * @return     受更新影响的行数
	 */
	int updateBaseStudentById(BaseStudentBean bean);
	
	/**
	 * (增加)增加基础模块-学生信息信息
	 * @param bean 基础模块-学生信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseStudent(BaseStudentBean bean);

	
}