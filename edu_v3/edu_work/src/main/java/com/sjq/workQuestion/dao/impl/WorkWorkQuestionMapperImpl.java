package com.sjq.workQuestion.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.workQuestion.vo.WorkWorkQuestionVo;
import com.sjq.workQuestion.bean.WorkWorkQuestionBean;
import com.sjq.workQuestion.dao.WorkWorkQuestionMapper;

/**
 * [自动生成]作业题目信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-05 23:19:47
 * @version 1.0
 */
@Repository("WorkWorkQuestionMapper")
public class WorkWorkQuestionMapperImpl extends BasicSqlSupport implements WorkWorkQuestionMapper {
	
	/**
	 * (删除)根据条件删除作业题目信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteWorkWorkQuestionBySearch(Map map){
		return this.delete("com.sjq.workQuestion.dao.WorkWorkQuestionMapper.deleteWorkWorkQuestionBySearch",map);
	}
	
	/**
	 * 查询所有的作业题目信息信息
	 * @return 查询到的列表
	 */
	public List<WorkWorkQuestionVo> queryAllWorkWorkQuestion(){
	     return this.selectList("com.sjq.workQuestion.dao.WorkWorkQuestionMapper.queryAllWorkWorkQuestion");
	}
				
	/**
	 * 根据ID查询作业题目信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public WorkWorkQuestionVo queryWorkWorkQuestionById(Long id){
	    return this.selectOne("com.sjq.workQuestion.dao.WorkWorkQuestionMapper.queryWorkWorkQuestionById",id);
	}

	/**
	 * 根据条件查询所有作业题目信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<WorkWorkQuestionVo>  queryWorkWorkQuestionBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.workQuestion.dao.WorkWorkQuestionMapper.queryWorkWorkQuestionBySearch",map);
	}
	
	/**
	 * 根据条件查询作业题目信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryWorkWorkQuestionTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.workQuestion.dao.WorkWorkQuestionMapper.queryWorkWorkQuestionTotalCount",map);
	}
	
	/**
	 * 分页查询作业题目信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryWorkWorkQuestionPage(Map<String, Object> map){
		return this.selectList("com.sjq.workQuestion.dao.WorkWorkQuestionMapper.queryWorkWorkQuestionPage",map);
	}
	
	/**
	 * (更新)根据条件更新所有作业题目信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateWorkWorkQuestionBySearch(Map<String, Object> map){
	    return this.update("com.sjq.workQuestion.dao.WorkWorkQuestionMapper.updateWorkWorkQuestionBySearch", map);
	}
	
	/**
	 * (增加)增加作业题目信息信息
	 * @param bean 作业题目信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertWorkWorkQuestion(WorkWorkQuestionBean bean){
		return this.insert("com.sjq.workQuestion.dao.WorkWorkQuestionMapper.insertWorkWorkQuestion", bean);
	}
	
	

}