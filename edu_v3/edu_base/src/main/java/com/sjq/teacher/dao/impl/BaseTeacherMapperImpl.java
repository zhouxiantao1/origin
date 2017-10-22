package com.sjq.teacher.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.teacher.bean.BaseTeacherBean;
import com.sjq.teacher.dao.BaseTeacherMapper;

/**
 * [自动生成]教师信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-27 16:06:01
 * @version 1.0
 */
@Repository("BaseTeacherMapper")
public class BaseTeacherMapperImpl extends BasicSqlSupport implements BaseTeacherMapper {
	
	
	/**
	 * 根据ID查询教师信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseTeacherVo queryBaseTeacherByUserId(Long userId){
	    return this.selectOne("com.sjq.teacher.dao.BaseTeacherMapper.queryBaseTeacherByUserId",userId);
	}
	
	/**
	 * 根据ID查询教师信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseTeacherVo queryBaseTeacherById(Long id){
	    return this.selectOne("com.sjq.teacher.dao.BaseTeacherMapper.queryBaseTeacherById",id);
	}

	/**
	 * 根据条件查询所有教师信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseTeacherVo>  queryBaseTeacherBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.teacher.dao.BaseTeacherMapper.queryBaseTeacherBySearch",map);
	}
	
	/**
	 * 根据条件查询教师信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseTeacherTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.teacher.dao.BaseTeacherMapper.queryBaseTeacherTotalCount",map);
	}
	
	/**
	 * 分页查询教师信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseTeacherPage(Map<String, Object> map){
		return this.selectList("com.sjq.teacher.dao.BaseTeacherMapper.queryBaseTeacherPage",map);
	}
	
	/**
	 * (删除)根据ID删除教师信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseTeacherById(BaseTeacherBean bean){
		return this.delete("com.sjq.teacher.dao.BaseTeacherMapper.deleteBaseTeacherById",bean);
	}
	
	/**
	 * (增加)增加教师信息信息
	 * @param bean 教师信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseTeacher(BaseTeacherBean bean){
		return this.insert("com.sjq.teacher.dao.BaseTeacherMapper.insertBaseTeacher", bean);
	}
	
	

}