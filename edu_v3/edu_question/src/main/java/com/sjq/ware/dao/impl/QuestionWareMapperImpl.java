package com.sjq.ware.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.ware.vo.QuestionWareVo;
import com.sjq.ware.bean.QuestionRelatedBean;
import com.sjq.ware.bean.QuestionWareBean;
import com.sjq.ware.dao.QuestionWareMapper;
import com.sjq.ware.search.QuestionWareSearch;

/**
 * [自动生成]题库模块-题库中心DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-25 11:53:57
 * @version 1.0
 */
@Repository("QuestionWareMapper")
public class QuestionWareMapperImpl extends BasicSqlSupport implements QuestionWareMapper {

	/**
	 * 根据条件查询题库模块-题库中心count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryQuestionWareTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.ware.dao.QuestionWareMapper.queryQuestionWareTotalCount",map);
	}
	
	/**
	 * 分页查询题库模块-题库中心
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryQuestionWarePage(Map<String, Object> map){
		return this.selectList("com.sjq.ware.dao.QuestionWareMapper.queryQuestionWarePage",map);
	}
	
	
	/**
	 * (增加)增加题库模块-题库中心信息
	 * @param bean 题库模块-题库中心实体
	 * @return     受增加影响的行数
	 */
	public int  insertQuestionWare(QuestionWareBean bean){
		return this.insert("com.sjq.ware.dao.QuestionWareMapper.insertQuestionWare", bean);
	}
	
	/**
	 * (删除)根据ID删除题库模块-题库中心信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteQuestionWareById(QuestionWareBean bean){
		return this.delete("com.sjq.ware.dao.QuestionWareMapper.deleteQuestionWareById",bean);
	}
	
	/**
	 * 根据条件查询所有题库模块-题库中心信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<QuestionWareVo> queryQuestionWareBySearch(Map<String,Object> map){
		return this.selectList("com.sjq.ware.dao.QuestionWareMapper.queryQuestionWareBySearch",map);
	}

	/**
	 * (更新)根据ID更新所有题库模块-题库中心信息
	 * @param bean 题库模块-题库中心实体
	 * @return     受更新影响的行数
	 */
	public int  updateQuestionWareById(QuestionWareBean bean){
	    return this.update("com.sjq.ware.dao.QuestionWareMapper.updateQuestionWareById", bean);
	}
	
	/**
	 * 根据ID查询题库模块-题库中心信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public QuestionWareVo queryQuestionWareById(Long id){
	    return this.selectOne("com.sjq.ware.dao.QuestionWareMapper.queryQuestionWareById",id);
	}

	@Override
	public List<Map<String, Object>> queryQuestionIdsBySearch(Map<String,Object> map) {
		return this.selectList("com.sjq.ware.dao.QuestionWareMapper.queryQuestionIdsBySearch",map);
	}
	

	/**
	 * (更新)根据条件更新所有题库模块-题库中心信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateQuestionWareBySearch(Map<String,Object> map){
	    return this.update("com.sjq.ware.dao.QuestionWareMapper.updateQuestionWareBySearch", map);
	}

	@Override
	public int insertQuestionRelated(QuestionRelatedBean bean) {
		return this.insert("com.sjq.ware.dao.QuestionWareMapper.insertQuestionRelated", bean);
	}

	@Override
	public int updateQuestionWareByIds(Map<String, Object> map) {
		return this.update("com.sjq.ware.dao.QuestionWareMapper.updateQuestionWareByIds", map);
	}

	@Override
	public int updateQuestionRelatedByQuestionId(Long questionId) {
		return this.update("com.sjq.ware.dao.QuestionWareMapper.updateQuestionRelatedByQuestionId", questionId);
	}
	
	

}