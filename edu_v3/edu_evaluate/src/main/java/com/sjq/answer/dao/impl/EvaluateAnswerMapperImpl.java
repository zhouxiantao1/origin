package com.sjq.answer.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.answer.vo.EvaluateAnswerVo;
import com.sjq.answer.bean.EvaluateAnswerBean;
import com.sjq.answer.dao.EvaluateAnswerMapper;

/**
 * [自动生成]作答信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:38:02
 * @version 1.0
 */
@Repository("EvaluateAnswerMapper")
public class EvaluateAnswerMapperImpl extends BasicSqlSupport implements EvaluateAnswerMapper {

	/**
	 * 查询所有的作答信息信息
	 * @return 查询到的列表
	 */
	public List<EvaluateAnswerVo> queryAllEvaluateAnswer(){
	     return this.selectList("com.sjq.answer.dao.EvaluateAnswerMapper.queryAllEvaluateAnswer");
	}
				
	/**
	 * 根据ID查询作答信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public EvaluateAnswerVo queryEvaluateAnswerById(Long id){
	    return this.selectOne("com.sjq.answer.dao.EvaluateAnswerMapper.queryEvaluateAnswerById",id);
	}

	/**
	 * 根据条件查询所有作答信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<EvaluateAnswerVo>  queryEvaluateAnswerBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.answer.dao.EvaluateAnswerMapper.queryEvaluateAnswerBySearch",map);
	}
	
	/**
	 * 根据条件查询作答信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryEvaluateAnswerTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.answer.dao.EvaluateAnswerMapper.queryEvaluateAnswerTotalCount",map);
	}
	
	/**
	 * 分页查询作答信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryEvaluateAnswerPage(Map<String, Object> map){
		return this.selectList("com.sjq.answer.dao.EvaluateAnswerMapper.queryEvaluateAnswerPage",map);
	}
	
	/**
	 * (更新)根据条件更新所有作答信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateEvaluateAnswerBySearch(Map<String, Object> map){
	    return this.update("com.sjq.answer.dao.EvaluateAnswerMapper.updateEvaluateAnswerBySearch", map);
	}
	
	/**
	 * (增加)增加作答信息信息
	 * @param bean 作答信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertEvaluateAnswer(EvaluateAnswerBean bean){
		return this.insert("com.sjq.answer.dao.EvaluateAnswerMapper.insertEvaluateAnswer", bean);
	}
	
	

}