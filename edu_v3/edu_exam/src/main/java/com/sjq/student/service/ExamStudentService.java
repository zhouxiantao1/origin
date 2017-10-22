package com.sjq.student.service;

import java.util.List;

import com.sjq.student.bean.ExamStudentBean;
import com.sjq.student.search.ExamStudentSearch;
import com.sjq.student.vo.ExamStudentVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象线上考试-考生信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-12 18:27:49
 * @version 1.0
 */
 
public interface ExamStudentService {

				
	/**
	 * 根据ID查询线上考试-考生信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	ExamStudentVo queryExamStudentById(Long id);
				
				
	/**
	 * 根据条件查询所有线上考试-考生信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<ExamStudentVo> queryExamStudentBySearch(ExamStudentSearch search);
	
	/**
	 * 根据条件查询所有线上考试
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	PageBean queryExamStudentByPage(PageBean pb,ExamStudentSearch search);
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryDistinctExamStudentPage(PageBean pb,ExamStudentSearch search);
				
								
	/**
	 * (删除)根据条件删除线上考试-考生信息信息
	 * @param map
	 * @return
	 */
	int deleteExamStudentBySearch(ExamStudentBean bean,ExamStudentSearch search);
				
				
	/**
	 * (更新)根据ID更新所有线上考试-考生信息信息
	 * @param bean
	 * @return
	 */
	int updateExamStudentById(ExamStudentBean bean);
				
				
	/**
	 * (更新)根据条件更新所有线上考试-考生信息信息
	 * @param map
	 * @return
	 */
	int updateExamStudentBySearch(ExamStudentBean bean,ExamStudentSearch search);
				
				
	/**
	 * (增加)增加线上考试-考生信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertExamStudent(ExamStudentBean bean);
				
	
}