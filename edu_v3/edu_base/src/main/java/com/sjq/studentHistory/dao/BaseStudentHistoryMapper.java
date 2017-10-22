package com.sjq.studentHistory.dao;

import java.util.List;
import java.util.Map;
import com.sjq.studentHistory.vo.BaseStudentHistoryVo;
import com.sjq.studentHistory.bean.BaseStudentHistoryBean;

/**
 * [自动生成]抽象学生历史信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-06-07 14:53:46
 * @version 1.0
 */
public interface BaseStudentHistoryMapper {


	/**
	 * 根据条件查询所有学生历史信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseStudentHistoryVo> queryBaseStudentHistoryBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询学生历史信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseStudentHistoryTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询学生历史信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseStudentHistoryPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除学生历史信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseStudentHistoryById(BaseStudentHistoryBean bean);
	
	/**
	 * (更新)根据ID更新所有学生历史信息信息
	 * @param bean 学生历史信息实体
	 * @return     受更新影响的行数
	 */
	int updateBaseStudentHistoryById(BaseStudentHistoryBean bean);
	
	/**
	 * (增加)增加学生历史信息信息
	 * @param bean 学生历史信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseStudentHistory(BaseStudentHistoryBean bean);

	
}