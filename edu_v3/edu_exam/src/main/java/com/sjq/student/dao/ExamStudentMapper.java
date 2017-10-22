package com.sjq.student.dao;

import java.util.List;
import java.util.Map;
import com.sjq.student.vo.ExamStudentVo;
import com.sjq.student.bean.ExamStudentBean;

/**
 * [自动生成]抽象线上考试-考生信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-12 18:27:49
 * @version 1.0
 */
public interface ExamStudentMapper {


	/**
	 * 根据ID查询线上考试-考生信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	ExamStudentVo queryExamStudentById(Long id);
	
	/**
	 * 根据条件查询所有线上考试-考生信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<ExamStudentVo> queryExamStudentBySearch(Map<String, Object> map);
	
	/**
	 * (删除)根据条件删除线上考试-考生信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteExamStudentBySearch(Map<String, Object> map);
	
	/**
	 * (更新)根据ID更新所有线上考试-考生信息信息
	 * @param bean 线上考试-考生信息实体
	 * @return     受更新影响的行数
	 */
	int updateExamStudentById(ExamStudentBean bean);
	
	/**
	 * (更新)根据条件更新所有线上考试-考生信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateExamStudentBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加线上考试-考生信息信息
	 * @param bean 线上考试-考生信息实体
	 * @return     受增加影响的行数
	 */
	int insertExamStudent(ExamStudentBean bean);

	
	int queryDistinctExamStudentTotalCount(Map<String, Object> map);
	
	
	List<Object> queryDistinctExamStudentPage(Map<String, Object> map);
	
	
	int queryExamStudentByPageTotalCount(Map<String, Object> map);
	
	
	List<Object> queryExamStudentByPage(Map<String, Object> map);
}