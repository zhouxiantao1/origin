package com.sjq.type.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.type.vo.QuestionTypeVo;
import com.sjq.ware.bean.QuestionWareBean;
import com.sjq.type.bean.QuestionTypeBean;
import com.sjq.type.dao.QuestionTypeMapper;

/**
 * [自动生成]题库模块-题型信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-28 19:53:48
 * @version 1.0
 */
@Repository("QuestionTypeMapper")
public class QuestionTypeMapperImpl extends BasicSqlSupport implements QuestionTypeMapper {
	
	/**
	 * 分页查询题库模块-题型信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List  queryQuestionTypePage(Map map){
		return this.selectList("com.sjq.type.dao.QuestionTypeMapper.queryQuestionTypePage",map);
	}
	
	/**
	 * 根据条件查询题库模块-题型信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryQuestionTypeTotalCount(Map map){
	    return this.selectOne("com.sjq.type.dao.QuestionTypeMapper.queryQuestionTypeTotalCount",map);
	}
	/**
	 * (增加)增加题库模块-题型信息信息
	 * @param bean 题库模块-题型信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertQuestionType(QuestionTypeBean bean){
		return this.insert("com.sjq.type.dao.QuestionTypeMapper.insertQuestionType", bean);
	}
	
	/**
	 * 查询所有的题库模块-题型信息信息
	 * @return 查询到的列表
	 */
	public List<QuestionTypeVo> queryAllQuestionType(){
	     return this.selectList("com.sjq.type.dao.QuestionTypeMapper.queryAllQuestionType");
	}
				
	/**
	 * 根据ID查询题库模块-题型信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public QuestionTypeVo queryQuestionTypeById(Long id){
	    return this.selectOne("com.sjq.type.dao.QuestionTypeMapper.queryQuestionTypeById",id);
	}

	
	/**
	 * 根据学科id查询题库模块-题型信息信息
	 * @return
	 */
	@Override
	public List<QuestionTypeVo> queryQuestionTypeBySubjectId(Long subjectId) {
		  return this.selectList("com.sjq.type.dao.QuestionTypeMapper.queryQuestionTypeBySubjectId",subjectId);
	}

	@Override
	public List<QuestionTypeVo> queryQuestionTypeBySearch(Map<String, Object> map) {
		return this.selectList("com.sjq.type.dao.QuestionTypeMapper.queryQuestionTypeBySearch",map);
	}



}