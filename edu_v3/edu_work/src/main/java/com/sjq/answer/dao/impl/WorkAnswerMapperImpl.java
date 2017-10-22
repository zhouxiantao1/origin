package com.sjq.answer.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.answer.vo.WorkAnswerVo;
import com.sjq.answer.bean.WorkAnswerBean;
import com.sjq.answer.dao.WorkAnswerMapper;

/**
 * [自动生成]作答信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:27:33
 * @version 1.0
 */
@Repository("WorkAnswerMapper")
public class WorkAnswerMapperImpl extends BasicSqlSupport implements WorkAnswerMapper {
	
	/**
	 * 查询各个段的得分率人数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryWorkAnswerBycorrect(Map<String, Object> map){
	    return this.selectOne("com.sjq.answer.dao.WorkAnswerMapper.queryWorkAnswerBycorrect",map);
	}
	
	/**
	 * (更新)根据ID更新所有作答信息信息
	 * @param bean 作答信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateWorkAnswerById(WorkAnswerBean bean){
	    return this.update("com.sjq.answer.dao.WorkAnswerMapper.updateWorkAnswerById", bean);
	}
	
	/**
	 * 根据ID查询作答信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public WorkAnswerVo queryWorkAnswerById(Long id){
	    return this.selectOne("com.sjq.answer.dao.WorkAnswerMapper.queryWorkAnswerById",id);
	}

	/**
	 * 根据条件查询所有作答信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<WorkAnswerVo>  queryWorkAnswerBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.answer.dao.WorkAnswerMapper.queryWorkAnswerBySearch",map);
	}
	
	/**
	 * 根据条件查询作答信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryWorkAnswerTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.answer.dao.WorkAnswerMapper.queryWorkAnswerTotalCount",map);
	}
	
	/**
	 * 分页查询作答信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryWorkAnswerPage(Map<String, Object> map){
		return this.selectList("com.sjq.answer.dao.WorkAnswerMapper.queryWorkAnswerPage",map);
	}
	
	/**
	 * (删除)根据条件删除作答信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteWorkAnswerBySearch(Map<String, Object> map){
		return this.delete("com.sjq.answer.dao.WorkAnswerMapper.deleteWorkAnswerBySearch",map);
	}
	
	/**
	 * (增加)增加作答信息信息
	 * @param bean 作答信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertWorkAnswer(WorkAnswerBean bean){
		return this.insert("com.sjq.answer.dao.WorkAnswerMapper.insertWorkAnswer", bean);
	}
	
	

}