package com.sjq.teacherHistory.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.teacherHistory.vo.BaseTeacherHistoryVo;
import com.sjq.teacherHistory.bean.BaseTeacherHistoryBean;
import com.sjq.teacherHistory.dao.BaseTeacherHistoryMapper;

/**
 * [自动生成]教师任教历史信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-27 15:42:52
 * @version 1.0
 */
@Repository("BaseTeacherHistoryMapper")
public class BaseTeacherHistoryMapperImpl extends BasicSqlSupport implements BaseTeacherHistoryMapper {
	
	/**
	 * 根据老师ID查询教获取不重复学科
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	public List<BaseTeacherHistoryVo> querySubjectByTeacherId(Long teacherId){
	    return this.selectList("com.sjq.teacherHistory.dao.BaseTeacherHistoryMapper.querySubjectByTeacherId",teacherId);
	}
	
	/**
	 * 根据老师ID查询教获取不重复年级
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	public List<BaseTeacherHistoryVo> queryGreadeByTeacherId(Long teacherId){
	    return this.selectList("com.sjq.teacherHistory.dao.BaseTeacherHistoryMapper.queryGreadeByTeacherId",teacherId);
	}
	
	/**
	 * 根据老师ID查询教获取班级
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	public List<BaseTeacherHistoryVo> queryClassesByTeacherId(Long teacherId){
	    return this.selectList("com.sjq.teacherHistory.dao.BaseTeacherHistoryMapper.queryClassesByTeacherId",teacherId);
	}
	
	/**
	 * 根据ID查询教师任教历史信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseTeacherHistoryVo queryBaseTeacherHistoryById(Long id){
	    return this.selectOne("com.sjq.teacherHistory.dao.BaseTeacherHistoryMapper.queryBaseTeacherHistoryById",id);
	}

	/**
	 * 根据条件查询所有教师任教历史信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseTeacherHistoryVo>  queryBaseTeacherHistoryBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.teacherHistory.dao.BaseTeacherHistoryMapper.queryBaseTeacherHistoryBySearch",map);
	}
	
	/**
	 * 根据条件查询教师任教历史信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseTeacherHistoryTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.teacherHistory.dao.BaseTeacherHistoryMapper.queryBaseTeacherHistoryTotalCount",map);
	}
	
	/**
	 * 分页查询教师任教历史信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseTeacherHistoryPage(Map<String, Object> map){
		return this.selectList("com.sjq.teacherHistory.dao.BaseTeacherHistoryMapper.queryBaseTeacherHistoryPage",map);
	}
	
	/**
	 * (删除)根据ID删除教师任教历史信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseTeacherHistoryById(BaseTeacherHistoryBean bean){
		return this.delete("com.sjq.teacherHistory.dao.BaseTeacherHistoryMapper.deleteBaseTeacherHistoryById",bean);
	}
	
	/**
	 * (增加)增加教师任教历史信息信息
	 * @param bean 教师任教历史信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseTeacherHistory(BaseTeacherHistoryBean bean){
		return this.insert("com.sjq.teacherHistory.dao.BaseTeacherHistoryMapper.insertBaseTeacherHistory", bean);
	}
	
	

}