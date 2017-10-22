package com.sjq.corrects.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.corrects.vo.WorkCorrectsVo;
import com.sjq.corrects.bean.WorkCorrectsBean;
import com.sjq.corrects.dao.WorkCorrectsMapper;

/**
 * [自动生成]批改信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-05 19:19:02
 * @version 1.0
 */
@Repository("WorkCorrectsMapper")
public class WorkCorrectsMapperImpl extends BasicSqlSupport implements WorkCorrectsMapper {

	/**
	 * 查询所有的批改信息信息
	 * @return 查询到的列表
	 */
	public List<WorkCorrectsVo> queryAllWorkCorrects(){
	     return this.selectList("com.sjq.corrects.dao.WorkCorrectsMapper.queryAllWorkCorrects");
	}
				
	/**
	 * 根据ID查询批改信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public WorkCorrectsVo queryWorkCorrectsById(Long id){
	    return this.selectOne("com.sjq.corrects.dao.WorkCorrectsMapper.queryWorkCorrectsById",id);
	}

	/**
	 * 根据条件查询所有批改信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<WorkCorrectsVo>  queryWorkCorrectsBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.corrects.dao.WorkCorrectsMapper.queryWorkCorrectsBySearch",map);
	}
	
	/**
	 * 根据条件查询批改信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryWorkCorrectsTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.corrects.dao.WorkCorrectsMapper.queryWorkCorrectsTotalCount",map);
	}
	
	/**
	 * 分页查询批改信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryWorkCorrectsPage(Map<String, Object> map){
		return this.selectList("com.sjq.corrects.dao.WorkCorrectsMapper.queryWorkCorrectsPage",map);
	}
	
	/**
	 * (删除)根据ID删除批改信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteWorkCorrectsById(WorkCorrectsBean bean){
		return this.delete("com.sjq.corrects.dao.WorkCorrectsMapper.deleteWorkCorrectsById",bean);
	}
	
	/**
	 * (更新)根据条件更新所有批改信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateWorkCorrectsBySearch(Map<String, Object> map){
	    return this.update("com.sjq.corrects.dao.WorkCorrectsMapper.updateWorkCorrectsBySearch", map);
	}
	
	/**
	 * (增加)增加批改信息信息
	 * @param bean 批改信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertWorkCorrects(WorkCorrectsBean bean){
		return this.insert("com.sjq.corrects.dao.WorkCorrectsMapper.insertWorkCorrects", bean);
	}
	
	

}