package com.sjq.questionRelated.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.questionRelated.vo.BaseQuestionRelatedVo;
import com.sjq.questionRelated.bean.BaseQuestionRelatedBean;
import com.sjq.questionRelated.dao.BaseQuestionRelatedMapper;

/**
 * [自动生成]题目知识点目录信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-06 00:47:45
 * @version 1.0
 */
@Repository("BaseQuestionRelatedMapper")
public class BaseQuestionRelatedMapperImpl extends BasicSqlSupport implements BaseQuestionRelatedMapper {

	/**
	 * 根据ID查询题目知识点目录信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseQuestionRelatedVo queryBaseQuestionRelatedById(Long id){
	    return this.selectOne("com.sjq.questionRelated.dao.BaseQuestionRelatedMapper.queryBaseQuestionRelatedById",id);
	}
	
	/**
	 * 根据IDS查询所有题目知识点目录信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List  queryBaseQuestionRelatedByIds(Map map){
		return this.selectList("com.sjq.questionRelated.dao.BaseQuestionRelatedMapper.queryBaseQuestionRelatedByIds",map);
	}

	/**
	 * 根据条件查询所有题目知识点目录信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseQuestionRelatedVo>  queryBaseQuestionRelatedBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.questionRelated.dao.BaseQuestionRelatedMapper.queryBaseQuestionRelatedBySearch",map);
	}
	
	/**
	 * 根据条件查询题目知识点目录信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseQuestionRelatedTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.questionRelated.dao.BaseQuestionRelatedMapper.queryBaseQuestionRelatedTotalCount",map);
	}
	
	/**
	 * (联合题目表查询)分页查询题目知识点目录信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseQuestionRelatedPage1(Map<String, Object> map){
		return this.selectList("com.sjq.questionRelated.dao.BaseQuestionRelatedMapper.queryBaseQuestionRelatedPage1",map);
	}
	
	/**
	 * (联合题目表查询)根据条件查询题目知识点目录信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseQuestionRelatedTotalCount1(Map<String, Object> map){
	    return this.selectOne("com.sjq.questionRelated.dao.BaseQuestionRelatedMapper.queryBaseQuestionRelatedTotalCount1",map);
	}
	
	/**
	 * 分页查询题目知识点目录信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseQuestionRelatedPage(Map<String, Object> map){
		return this.selectList("com.sjq.questionRelated.dao.BaseQuestionRelatedMapper.queryBaseQuestionRelatedPage",map);
	}
	
	/**
	 * (删除)根据ID删除题目知识点目录信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseQuestionRelatedById(BaseQuestionRelatedBean bean){
		return this.delete("com.sjq.questionRelated.dao.BaseQuestionRelatedMapper.deleteBaseQuestionRelatedById",bean);
	}
	
	/**
	 * (更新)根据条件更新所有题目知识点目录信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateBaseQuestionRelatedBySearch(Map<String, Object> map){
	    return this.update("com.sjq.questionRelated.dao.BaseQuestionRelatedMapper.updateBaseQuestionRelatedBySearch", map);
	}
	
	/**
	 * (增加)增加题目知识点目录信息信息
	 * @param bean 题目知识点目录信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseQuestionRelated(BaseQuestionRelatedBean bean){
		return this.insert("com.sjq.questionRelated.dao.BaseQuestionRelatedMapper.insertBaseQuestionRelated", bean);
	}
	
	

}