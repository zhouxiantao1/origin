package com.sjq.homeworkClasses.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.homeworkClasses.vo.WorkHomeworkClassesVo;
import com.sjq.homeworkClasses.bean.WorkHomeworkClassesBean;
import com.sjq.homeworkClasses.dao.WorkHomeworkClassesMapper;

/**
 * [自动生成]作业班级信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-12 10:00:42
 * @version 1.0
 */
@Repository("WorkHomeworkClassesMapper")
public class WorkHomeworkClassesMapperImpl extends BasicSqlSupport implements WorkHomeworkClassesMapper {
	
	/**
	 * 根据条件查询所有作业班级待完成或已完成列表
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<WorkHomeworkClassesVo>  queryWorkClassesPending(Map<String, Object> map){
		return this.selectList("com.sjq.homeworkClasses.dao.WorkHomeworkClassesMapper.queryWorkClassesPending",map);
	}
	
	
	/**
	 * 根据ID查询作业班级信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public WorkHomeworkClassesVo queryWorkHomeworkClassesById(Long id){
	    return this.selectOne("com.sjq.homeworkClasses.dao.WorkHomeworkClassesMapper.queryWorkHomeworkClassesById",id);
	}

	/**
	 * 根据IDS查询所有作业班级信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<WorkHomeworkClassesVo>  queryWorkHomeworkClassesByIds(Map<String, Object> map){
		return this.selectList("com.sjq.homeworkClasses.dao.WorkHomeworkClassesMapper.queryWorkHomeworkClassesByIds",map);
	}

	/**
	 * 根据条件查询所有作业班级信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<WorkHomeworkClassesVo>  queryWorkHomeworkClassesBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.homeworkClasses.dao.WorkHomeworkClassesMapper.queryWorkHomeworkClassesBySearch",map);
	}
	
	/**
	 * 根据条件查询作业班级信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryWorkHomeworkClassesTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.homeworkClasses.dao.WorkHomeworkClassesMapper.queryWorkHomeworkClassesTotalCount",map);
	}
	
	/**
	 * 分页查询作业班级信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryWorkHomeworkClassesPage(Map<String, Object> map){
		return this.selectList("com.sjq.homeworkClasses.dao.WorkHomeworkClassesMapper.queryWorkHomeworkClassesPage",map);
	}
	
	/**
	 * (删除)根据ID删除作业班级信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteWorkHomeworkClassesById(WorkHomeworkClassesBean bean){
		return this.delete("com.sjq.homeworkClasses.dao.WorkHomeworkClassesMapper.deleteWorkHomeworkClassesById",bean);
	}
	
	/**
	 * (更新)根据条件更新所有作业班级信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateWorkHomeworkClassesBySearch(Map<String, Object> map){
	    return this.update("com.sjq.homeworkClasses.dao.WorkHomeworkClassesMapper.updateWorkHomeworkClassesBySearch", map);
	}
	
	/**
	 * (增加)增加作业班级信息信息
	 * @param bean 作业班级信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertWorkHomeworkClasses(WorkHomeworkClassesBean bean){
		return this.insert("com.sjq.homeworkClasses.dao.WorkHomeworkClassesMapper.insertWorkHomeworkClasses", bean);
	}
	
	

}