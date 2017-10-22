package com.sjq.collect.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.collect.vo.QuestionCollectVo;
import com.sjq.collect.bean.QuestionCollectBean;
import com.sjq.collect.dao.QuestionCollectMapper;

/**
 * [自动生成]题库模块-题库收藏DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-09 01:36:25
 * @version 1.0
 */
@Repository("QuestionCollectMapper")
public class QuestionCollectMapperImpl extends BasicSqlSupport implements QuestionCollectMapper {

	/**
	 * 根据条件查询题库模块-题库收藏count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryQuestionCollectTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.collect.dao.QuestionCollectMapper.queryQuestionCollectTotalCount",map);
	}
	
	/**
	 * 分页查询题库模块-题库收藏
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryQuestionCollectPage(Map<String, Object> map){
		return this.selectList("com.sjq.collect.dao.QuestionCollectMapper.queryQuestionCollectPage",map);
	}
	
	/**
	 * (删除)根据ID删除题库模块-题库收藏信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteQuestionCollectById(QuestionCollectBean bean){
		return this.delete("com.sjq.collect.dao.QuestionCollectMapper.deleteQuestionCollectById",bean);
	}
	
	/**
	 * (增加)增加题库模块-题库收藏信息
	 * @param bean 题库模块-题库收藏实体
	 * @return     受增加影响的行数
	 */
	public int  insertQuestionCollect(QuestionCollectBean bean){
		return this.insert("com.sjq.collect.dao.QuestionCollectMapper.insertQuestionCollect", bean);
	}
	
	/**
	 * 根据条件查询所有题库模块-题库收藏信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<QuestionCollectVo>  queryQuestionCollectBySearch(Map<String,Object> map){
		return this.selectList("com.sjq.collect.dao.QuestionCollectMapper.queryQuestionCollectBySearch",map);
	}
	
	

}