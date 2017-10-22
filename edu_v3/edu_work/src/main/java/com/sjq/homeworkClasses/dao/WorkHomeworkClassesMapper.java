package com.sjq.homeworkClasses.dao;

import java.util.List;
import java.util.Map;
import com.sjq.homeworkClasses.vo.WorkHomeworkClassesVo;
import com.sjq.homeworkClasses.bean.WorkHomeworkClassesBean;

/**
 * [自动生成]抽象作业班级信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-12 10:00:42
 * @version 1.0
 */
public interface WorkHomeworkClassesMapper {
	
	/**
	 * 根据条件查询所有作业班级待完成或已完成列表
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<WorkHomeworkClassesVo>  queryWorkClassesPending(Map<String, Object> map);

	/**
	 * 根据ID查询作业班级信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	WorkHomeworkClassesVo queryWorkHomeworkClassesById(Long id);
	
	/**
	 * 根据IDS查询所有作业班级信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<WorkHomeworkClassesVo> queryWorkHomeworkClassesByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有作业班级信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<WorkHomeworkClassesVo> queryWorkHomeworkClassesBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询作业班级信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryWorkHomeworkClassesTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询作业班级信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryWorkHomeworkClassesPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除作业班级信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteWorkHomeworkClassesById(WorkHomeworkClassesBean bean);
	
	/**
	 * (更新)根据条件更新所有作业班级信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateWorkHomeworkClassesBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加作业班级信息信息
	 * @param bean 作业班级信息实体
	 * @return     受增加影响的行数
	 */
	int insertWorkHomeworkClasses(WorkHomeworkClassesBean bean);

	
}