package com.sjq.wrong.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.wrong.vo.WorkWrongVo;
import com.sjq.wrong.bean.WorkWrongBean;
import com.sjq.wrong.dao.WorkWrongMapper;

/**
 * [自动生成]错题信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-06-27 16:47:56
 * @version 1.0
 */
@Repository("WorkWrongMapper")
public class WorkWrongMapperImpl extends BasicSqlSupport implements WorkWrongMapper {

	/**
	 * 根据ID查询错题信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public WorkWrongVo queryWorkWrongById(Long id){
	    return this.selectOne("com.sjq.wrong.dao.WorkWrongMapper.queryWorkWrongById",id);
	}

	/**
	 * 根据条件查询所有错题信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<WorkWrongVo>  queryWorkWrongBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.wrong.dao.WorkWrongMapper.queryWorkWrongBySearch",map);
	}
	
	/**
	 * 根据条件查询错题信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryWorkWrongTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.wrong.dao.WorkWrongMapper.queryWorkWrongTotalCount",map);
	}
	
	/**
	 * 分页查询错题信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryWorkWrongPage(Map<String, Object> map){
		return this.selectList("com.sjq.wrong.dao.WorkWrongMapper.queryWorkWrongPage",map);
	}
	
	/**
	 * (删除)根据ID删除错题信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteWorkWrongById(WorkWrongBean bean){
		return this.delete("com.sjq.wrong.dao.WorkWrongMapper.deleteWorkWrongById",bean);
	}
	
	/**
	 * (更新)根据ID更新所有错题信息信息
	 * @param bean 错题信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateWorkWrongById(WorkWrongBean bean){
	    return this.update("com.sjq.wrong.dao.WorkWrongMapper.updateWorkWrongById", bean);
	}
	
	/**
	 * (更新)根据条件更新所有错题信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateWorkWrongBySearch(Map<String, Object> map){
	    return this.update("com.sjq.wrong.dao.WorkWrongMapper.updateWorkWrongBySearch", map);
	}
	
	/**
	 * (增加)增加错题信息信息
	 * @param bean 错题信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertWorkWrong(WorkWrongBean bean){
		return this.insert("com.sjq.wrong.dao.WorkWrongMapper.insertWorkWrong", bean);
	}
	
	

}