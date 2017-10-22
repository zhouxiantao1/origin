package com.sjq.studentHistory.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.studentHistory.vo.BaseStudentHistoryVo;
import com.sjq.studentHistory.bean.BaseStudentHistoryBean;
import com.sjq.studentHistory.dao.BaseStudentHistoryMapper;

/**
 * [自动生成]学生历史信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-06-07 14:53:46
 * @version 1.0
 */
@Repository("BaseStudentHistoryMapper")
public class BaseStudentHistoryMapperImpl extends BasicSqlSupport implements BaseStudentHistoryMapper {

	/**
	 * 根据条件查询所有学生历史信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseStudentHistoryVo>  queryBaseStudentHistoryBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.studentHistory.dao.BaseStudentHistoryMapper.queryBaseStudentHistoryBySearch",map);
	}
	
	/**
	 * 根据条件查询学生历史信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseStudentHistoryTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.studentHistory.dao.BaseStudentHistoryMapper.queryBaseStudentHistoryTotalCount",map);
	}
	
	/**
	 * 分页查询学生历史信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseStudentHistoryPage(Map<String, Object> map){
		return this.selectList("com.sjq.studentHistory.dao.BaseStudentHistoryMapper.queryBaseStudentHistoryPage",map);
	}
	
	/**
	 * (删除)根据ID删除学生历史信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseStudentHistoryById(BaseStudentHistoryBean bean){
		return this.delete("com.sjq.studentHistory.dao.BaseStudentHistoryMapper.deleteBaseStudentHistoryById",bean);
	}
	
	/**
	 * (更新)根据ID更新所有学生历史信息信息
	 * @param bean 学生历史信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateBaseStudentHistoryById(BaseStudentHistoryBean bean){
	    return this.update("com.sjq.studentHistory.dao.BaseStudentHistoryMapper.updateBaseStudentHistoryById", bean);
	}
	
	/**
	 * (增加)增加学生历史信息信息
	 * @param bean 学生历史信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseStudentHistory(BaseStudentHistoryBean bean){
		return this.insert("com.sjq.studentHistory.dao.BaseStudentHistoryMapper.insertBaseStudentHistory", bean);
	}
	
	

}