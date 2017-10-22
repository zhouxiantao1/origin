package com.sjq.homeworkClasses.service;

import java.util.List;
import java.util.Map;

import com.sjq.homeworkClasses.bean.WorkHomeworkClassesBean;
import com.sjq.homeworkClasses.search.WorkHomeworkClassesSearch;
import com.sjq.homeworkClasses.vo.WorkHomeworkClassesVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象作业班级信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-12 10:00:42
 * @version 1.0
 */
 
public interface WorkHomeworkClassesService {

	/**
	 * 根据条件查询所有作业班级待完成或已完成列表
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<WorkHomeworkClassesVo>  queryWorkClassesPending(WorkHomeworkClassesSearch search);
	
	/**
	 * 根据ID查询作业班级信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	WorkHomeworkClassesVo queryWorkHomeworkClassesById(Long id);
				
				
	/**
	 * 根据IDS查询所有作业班级信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<WorkHomeworkClassesVo> queryWorkHomeworkClassesByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有作业班级信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<WorkHomeworkClassesVo> queryWorkHomeworkClassesBySearch(WorkHomeworkClassesSearch search);
				
					
	/**
	 * 根据条件查询作业班级信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryWorkHomeworkClassesTotalCount(WorkHomeworkClassesSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryWorkHomeworkClassesPage(PageBean pb,WorkHomeworkClassesSearch search);
				
				
	/**
	 * (删除)根据ID删除作业班级信息信息
	 * @param id
	 * @return
	 */
	int deleteWorkHomeworkClassesById(WorkHomeworkClassesBean bean);
				
				
	/**
	 * (更新)根据条件更新所有作业班级信息信息
	 * @param map
	 * @return
	 */
	int updateWorkHomeworkClassesBySearch(WorkHomeworkClassesBean bean,WorkHomeworkClassesSearch search);
				
				
	/**
	 * (增加)增加作业班级信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertWorkHomeworkClasses(WorkHomeworkClassesBean bean);
				
	
}