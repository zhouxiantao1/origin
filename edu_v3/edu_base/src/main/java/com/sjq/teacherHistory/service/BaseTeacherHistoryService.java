package com.sjq.teacherHistory.service;

import java.util.List;
import java.util.Map;

import com.sjq.teacherHistory.bean.BaseTeacherHistoryBean;
import com.sjq.teacherHistory.search.BaseTeacherHistorySearch;
import com.sjq.teacherHistory.vo.BaseTeacherHistoryVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象教师任教历史信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-27 15:42:52
 * @version 1.0
 */
 
public interface BaseTeacherHistoryService {
	
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
	 * @return   查询到的结果列表
	 */
	BaseTeacherHistoryVo queryBaseTeacherHistoryById(Long id);
				
				
	/**
	 * 根据条件查询所有教师任教历史信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseTeacherHistoryVo> queryBaseTeacherHistoryBySearch(BaseTeacherHistorySearch search);
				
					
	/**
	 * 根据条件查询教师任教历史信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseTeacherHistoryTotalCount(BaseTeacherHistorySearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseTeacherHistoryPage(PageBean pb,BaseTeacherHistorySearch search);
				
				
	/**
	 * (删除)根据ID删除教师任教历史信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseTeacherHistoryById(BaseTeacherHistoryBean bean);
				
				
	/**
	 * (增加)增加教师任教历史信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseTeacherHistory(BaseTeacherHistoryBean bean);
				
	
}