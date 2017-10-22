package com.sjq.student.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.student.bean.BaseStudentBean;
import com.sjq.student.dao.BaseStudentMapper;

/**
 * [自动生成]基础模块-学生信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-16 15:50:40
 * @version 1.0
 */
@Repository("BaseStudentMapper")
public class BaseStudentMapperImpl extends BasicSqlSupport implements BaseStudentMapper {

	/**
	 * 查询所有的基础模块-学生信息信息
	 * @return 查询到的列表
	 */
	public List<BaseStudentVo> queryAllBaseStudent(){
	     return this.selectList("com.sjq.student.dao.BaseStudentMapper.queryAllBaseStudent");
	}
				
	/**
	 * 根据ID查询基础模块-学生信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseStudentVo queryBaseStudentById(Long id){
	    return this.selectOne("com.sjq.student.dao.BaseStudentMapper.queryBaseStudentById",id);
	}

	/**
	 * 根据IDS查询所有基础模块-学生信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseStudentVo>  queryBaseStudentByIds(Map<String, Object> map){
		return this.selectList("com.sjq.student.dao.BaseStudentMapper.queryBaseStudentByIds",map);
	}

	/**
	 * 根据条件查询所有基础模块-学生信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseStudentVo>  queryBaseStudentBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.student.dao.BaseStudentMapper.queryBaseStudentBySearch",map);
	}
	
	/**
	 * 根据条件查询基础模块-学生信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseStudentTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.student.dao.BaseStudentMapper.queryBaseStudentTotalCount",map);
	}
	
	/**
	 * 分页查询基础模块-学生信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseStudentPage(Map<String, Object> map){
		return this.selectList("com.sjq.student.dao.BaseStudentMapper.queryBaseStudentPage",map);
	}
	
	/**
	 * (删除)根据ID删除基础模块-学生信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseStudentById(BaseStudentBean bean){
		return this.delete("com.sjq.student.dao.BaseStudentMapper.deleteBaseStudentById",bean);
	}
	
	/**
	 * (更新)根据ID更新所有基础模块-学生信息信息
	 * @param bean 基础模块-学生信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateBaseStudentById(BaseStudentBean bean){
	    return this.update("com.sjq.student.dao.BaseStudentMapper.updateBaseStudentById", bean);
	}
	
	/**
	 * (增加)增加基础模块-学生信息信息
	 * @param bean 基础模块-学生信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseStudent(BaseStudentBean bean){
		return this.insert("com.sjq.student.dao.BaseStudentMapper.insertBaseStudent", bean);
	}

	@Override
	public BaseStudentVo queryBaseStudentByUserId(Long userId) {
	    return this.selectOne("com.sjq.student.dao.BaseStudentMapper.queryBaseStudentByUserId",userId);
	}
	
	

}