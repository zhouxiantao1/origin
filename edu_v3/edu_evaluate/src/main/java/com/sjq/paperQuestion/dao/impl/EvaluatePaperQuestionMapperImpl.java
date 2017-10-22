package com.sjq.paperQuestion.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.paperQuestion.vo.EvaluatePaperQuestionVo;
import com.sjq.paperQuestion.bean.EvaluatePaperQuestionBean;
import com.sjq.paperQuestion.dao.EvaluatePaperQuestionMapper;

/**
 * [自动生成]题目信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-23 00:00:21
 * @version 1.0
 */
@Repository("EvaluatePaperQuestionMapper")
public class EvaluatePaperQuestionMapperImpl extends BasicSqlSupport implements EvaluatePaperQuestionMapper {
	
	/**
	 * 根据PaperID查询题目排序最大值
	 * @param PaperID 标识
	 * @return   查询到的列表
	 */
	public Long queryPaperQuestionMaxByPaperId(Long paperId){
	    return this.selectOne("com.sjq.paperQuestion.dao.EvaluatePaperQuestionMapper.queryPaperQuestionMaxByPaperId",paperId);
	}
	
	/**
	 * 查询所有的题目信息信息
	 * @return 查询到的列表
	 */
	public List<EvaluatePaperQuestionVo> queryAllEvaluatePaperQuestion(){
	     return this.selectList("com.sjq.paperQuestion.dao.EvaluatePaperQuestionMapper.queryAllEvaluatePaperQuestion");
	}
				
	/**
	 * 根据ID查询题目信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public EvaluatePaperQuestionVo queryEvaluatePaperQuestionById(Long id){
	    return this.selectOne("com.sjq.paperQuestion.dao.EvaluatePaperQuestionMapper.queryEvaluatePaperQuestionById",id);
	}

	/**
	 * 根据条件查询所有题目信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<EvaluatePaperQuestionVo>  queryEvaluatePaperQuestionBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.paperQuestion.dao.EvaluatePaperQuestionMapper.queryEvaluatePaperQuestionBySearch",map);
	}
	
	/**
	 * 根据条件查询题目信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryEvaluatePaperQuestionTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.paperQuestion.dao.EvaluatePaperQuestionMapper.queryEvaluatePaperQuestionTotalCount",map);
	}
	
	/**
	 * 分页查询题目信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryEvaluatePaperQuestionPage(Map<String, Object> map){
		return this.selectList("com.sjq.paperQuestion.dao.EvaluatePaperQuestionMapper.queryEvaluatePaperQuestionPage",map);
	}
	
	/**
	 * (删除)根据条件删除题目信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteEvaluatePaperQuestionBySearch(Map<String, Object> map){
		return this.delete("com.sjq.paperQuestion.dao.EvaluatePaperQuestionMapper.deleteEvaluatePaperQuestionBySearch",map);
	}
	
	/**
	 * (更新)根据ID更新所有题目信息信息
	 * @param bean 题目信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateEvaluatePaperQuestionById(EvaluatePaperQuestionBean bean){
	    return this.update("com.sjq.paperQuestion.dao.EvaluatePaperQuestionMapper.updateEvaluatePaperQuestionById", bean);
	}
	
	/**
	 * (更新)根据条件更新所有题目信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateEvaluatePaperQuestionBySearch(Map<String, Object> map){
	    return this.update("com.sjq.paperQuestion.dao.EvaluatePaperQuestionMapper.updateEvaluatePaperQuestionBySearch", map);
	}
	
	/**
	 * (增加)增加题目信息信息
	 * @param bean 题目信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertEvaluatePaperQuestion(EvaluatePaperQuestionBean bean){
		return this.insert("com.sjq.paperQuestion.dao.EvaluatePaperQuestionMapper.insertEvaluatePaperQuestion", bean);
	}
	
	

}