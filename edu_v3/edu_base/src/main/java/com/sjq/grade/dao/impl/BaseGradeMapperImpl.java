package com.sjq.grade.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.grade.bean.BaseGradeBean;
import com.sjq.grade.dao.BaseGradeMapper;

/**
 * [自动生成]基础模块-学段信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:26:54
 * @version 1.0
 */
@Repository("BaseGradeMapper")
public class BaseGradeMapperImpl extends BasicSqlSupport implements BaseGradeMapper {
	
	/**
	 * (增加)增加基础模块-学段信息信息
	 * @param bean 基础模块-学段信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseGrade(BaseGradeBean bean){
		return this.insert("com.sjq.grade.dao.BaseGradeMapper.insertBaseGrade", bean);
	}
	
	/**
	 * 根据学段ID查询基础模块-学段信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public List<BaseGradeVo> queryBaseGradeByStageId(Long stageId){
	    return this.selectList("com.sjq.grade.dao.BaseGradeMapper.queryBaseGradeByStageId",stageId);
	}

	
	/**
	 * 查询所有的基础模块-学段信息信息
	 * @return 查询到的列表
	 */
	public List<BaseGradeVo> queryAllBaseGrade(){
	     return this.selectList("com.sjq.grade.dao.BaseGradeMapper.queryAllBaseGrade");
	}
				
	/**
	 * 根据ID查询基础模块-学段信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseGradeVo queryBaseGradeById(Long id){
	    return this.selectOne("com.sjq.grade.dao.BaseGradeMapper.queryBaseGradeById",id);
	}

	/**
	 * 根据IDS查询所有基础模块-学段信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseGradeVo>  queryBaseGradeByIds(Map<String, Object> map){
		return this.selectList("com.sjq.grade.dao.BaseGradeMapper.queryBaseGradeByIds",map);
	}

	/**
	 * 根据条件查询所有基础模块-学段信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseGradeVo>  queryBaseGradeBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.grade.dao.BaseGradeMapper.queryBaseGradeBySearch",map);
	}
	
	/**
	 * 分页查询基础模块-学段信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseGradePage(Map<String, Object> map){
		return this.selectList("com.sjq.grade.dao.BaseGradeMapper.queryBaseGradePage",map);
	}
	
	/**
	 * (删除)根据ID删除基础模块-学段信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseGradeById(BaseGradeBean bean){
		return this.delete("com.sjq.grade.dao.BaseGradeMapper.deleteBaseGradeById",bean);
	}
	
	/**
	 * (删除)根据IDS删除基础模块-学段信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseGradeByIds(Map<String, Object> map){
		return this.delete("com.sjq.grade.dao.BaseGradeMapper.deleteBaseGradeByIds",map);
	}
	
	/**
	 * (更新)根据ID更新所有基础模块-学段信息信息
	 * @param bean 基础模块-学段信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateBaseGradeById(BaseGradeBean bean){
	    return this.update("com.sjq.grade.dao.BaseGradeMapper.updateBaseGradeById", bean);
	}
	
	/**
	 * 根据条件查询基础模块-学段信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseGradeTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.grade.dao.BaseGradeMapper.queryBaseGradeTotalCount",map);
	}
	
	

}