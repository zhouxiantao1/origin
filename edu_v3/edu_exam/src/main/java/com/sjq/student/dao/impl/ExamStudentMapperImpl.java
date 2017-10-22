package com.sjq.student.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.student.vo.ExamStudentVo;
import com.sjq.student.bean.ExamStudentBean;
import com.sjq.student.dao.ExamStudentMapper;

/**
 * [自动生成]线上考试-考生信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-12 18:27:49
 * @version 1.0
 */
@Repository("ExamStudentMapper")
public class ExamStudentMapperImpl extends BasicSqlSupport implements ExamStudentMapper {

	/**
	 * 根据ID查询线上考试-考生信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public ExamStudentVo queryExamStudentById(Long id){
	    return this.selectOne("com.sjq.student.dao.ExamStudentMapper.queryExamStudentById",id);
	}

	/**
	 * 根据条件查询所有线上考试-考生信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<ExamStudentVo>  queryExamStudentBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.student.dao.ExamStudentMapper.queryExamStudentBySearch",map);
	}
	
	/**
	 * (删除)根据条件删除线上考试-考生信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteExamStudentBySearch(Map<String, Object> map){
		return this.delete("com.sjq.student.dao.ExamStudentMapper.deleteExamStudentBySearch",map);
	}
	
	/**
	 * (更新)根据ID更新所有线上考试-考生信息信息
	 * @param bean 线上考试-考生信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateExamStudentById(ExamStudentBean bean){
	    return this.update("com.sjq.student.dao.ExamStudentMapper.updateExamStudentById", bean);
	}
	
	/**
	 * (更新)根据条件更新所有线上考试-考生信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateExamStudentBySearch(Map<String, Object> map){
	    return this.update("com.sjq.student.dao.ExamStudentMapper.updateExamStudentBySearch", map);
	}
	
	/**
	 * (增加)增加线上考试-考生信息信息
	 * @param bean 线上考试-考生信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertExamStudent(ExamStudentBean bean){
		return this.insert("com.sjq.student.dao.ExamStudentMapper.insertExamStudent", bean);
	}

	@Override
	public int queryDistinctExamStudentTotalCount(Map<String, Object> map) {
		return this.selectOne("com.sjq.student.dao.ExamStudentMapper.queryDistinctExamStudentTotalCount",map);
	}

	@Override
	public List<Object> queryDistinctExamStudentPage(Map<String, Object> map) {
		return this.selectList("com.sjq.student.dao.ExamStudentMapper.queryDistinctExamStudentPage",map);
	}

	@Override
	public int queryExamStudentByPageTotalCount(Map<String, Object> map) {
		return this.selectOne("com.sjq.student.dao.ExamStudentMapper.queryExamStudentByPageTotalCount",map);
	}

	@Override
	public List<Object> queryExamStudentByPage(Map<String, Object> map) {
		return this.selectList("com.sjq.student.dao.ExamStudentMapper.queryExamStudentByPage",map);
	}
	
}