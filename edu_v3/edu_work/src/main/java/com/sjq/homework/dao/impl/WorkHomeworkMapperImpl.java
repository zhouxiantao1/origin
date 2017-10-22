package com.sjq.homework.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.homework.vo.WorkHomeworkVo;
import com.sjq.homework.bean.WorkHomeworkBean;
import com.sjq.homework.dao.WorkHomeworkMapper;

/**
 * [自动生成]作业信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-11 23:11:48
 * @version 1.0
 */
@Repository("WorkHomeworkMapper")
public class WorkHomeworkMapperImpl extends BasicSqlSupport implements WorkHomeworkMapper {

	/**
	 * 查询所有的作业信息信息
	 * @return 查询到的列表
	 */
	public List<WorkHomeworkVo> queryAllWorkHomework(){
	     return this.selectList("com.sjq.homework.dao.WorkHomeworkMapper.queryAllWorkHomework");
	}
				
	/**
	 * 根据ID查询作业信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public WorkHomeworkVo queryWorkHomeworkById(Long id){
	    return this.selectOne("com.sjq.homework.dao.WorkHomeworkMapper.queryWorkHomeworkById",id);
	}

	/**
	 * 根据条件查询所有作业信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<WorkHomeworkVo>  queryWorkHomeworkBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.homework.dao.WorkHomeworkMapper.queryWorkHomeworkBySearch",map);
	}
	
	/**
	 * 根据条件查询作业信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryWorkHomeworkTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.homework.dao.WorkHomeworkMapper.queryWorkHomeworkTotalCount",map);
	}
	
	/**
	 * 分页查询作业信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryWorkHomeworkPage(Map<String, Object> map){
		return this.selectList("com.sjq.homework.dao.WorkHomeworkMapper.queryWorkHomeworkPage",map);
	}
	
	/**
	 * (删除)根据条件删除作业信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteWorkHomeworkBySearch(Map<String, Object> map){
		return this.delete("com.sjq.homework.dao.WorkHomeworkMapper.deleteWorkHomeworkBySearch",map);
	}
	
	/**
	 * (更新)根据ID更新所有作业信息信息
	 * @param bean 作业信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateWorkHomeworkById(WorkHomeworkBean bean){
	    return this.update("com.sjq.homework.dao.WorkHomeworkMapper.updateWorkHomeworkById", bean);
	}
	
	/**
	 * (增加)增加作业信息信息
	 * @param bean 作业信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertWorkHomework(WorkHomeworkBean bean){
		return this.insert("com.sjq.homework.dao.WorkHomeworkMapper.insertWorkHomework", bean);
	}
	
	

}