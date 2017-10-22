package com.sjq.adaptation.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.adaptation.bean.ExamAdaptationUserAnswerBean;
import com.sjq.adaptation.dao.ExamAdaptationUserAnswerMapper;
import com.sjq.adaptation.search.ExamAdaptationUserAnswerSearch;
import com.sjq.adaptation.vo.ExamAdaptationUserAnswerVo;
import com.sjq.manager.base.BasicSqlSupport;

/**
 * [自动生成]考试模块-自适应测试用户答题记录表DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-22 17:34:42
 * @version 1.0
 */
@Repository("ExamAdaptationUserAnswerMapper")
public class ExamAdaptationUserAnswerMapperImpl extends BasicSqlSupport implements ExamAdaptationUserAnswerMapper {

	/**
	 * 根据条件查询所有考试模块-自适应测试用户答题记录表信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<ExamAdaptationUserAnswerVo>  queryExamAdaptationUserAnswerBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.adaptation.dao.ExamAdaptationUserAnswerMapper.queryExamAdaptationUserAnswerBySearch",map);
	}
	
	/**
	 * 根据条件查询考试模块-自适应测试用户答题记录表count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryExamAdaptationUserAnswerTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.adaptation.dao.ExamAdaptationUserAnswerMapper.queryExamAdaptationUserAnswerTotalCount",map);
	}
	
	/**
	 * (更新)根据ID更新所有考试模块-自适应测试用户答题记录表信息
	 * @param bean 考试模块-自适应测试用户答题记录表实体
	 * @return     受更新影响的行数
	 */
	public int  updateExamAdaptationUserAnswerById(ExamAdaptationUserAnswerBean bean){
	    return this.update("com.sjq.adaptation.dao.ExamAdaptationUserAnswerMapper.updateExamAdaptationUserAnswerById", bean);
	}
	
	/**
	 * (更新)根据条件更新所有考试模块-自适应测试用户答题记录表信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateExamAdaptationUserAnswerBySearch(Map<String, Object> map){
	    return this.update("com.sjq.adaptation.dao.ExamAdaptationUserAnswerMapper.updateExamAdaptationUserAnswerBySearch", map);
	}
	
	/**
	 * (增加)增加考试模块-自适应测试用户答题记录表信息
	 * @param bean 考试模块-自适应测试用户答题记录表实体
	 * @return     受增加影响的行数
	 */
	public int  insertExamAdaptationUserAnswer(ExamAdaptationUserAnswerBean bean){
		return this.insert("com.sjq.adaptation.dao.ExamAdaptationUserAnswerMapper.insertExamAdaptationUserAnswer", bean);
	}

	@Override
	public ExamAdaptationUserAnswerVo queryRecentExamAdaptationUserAnswerLimit1BySearch(Map<String, Object> map) {
		return this.selectOne("com.sjq.adaptation.dao.ExamAdaptationUserAnswerMapper.queryRecentExamAdaptationUserAnswerLimit1BySearch",map);
	}

	@Override
	public int getExamAdaptationUserAnswerSecond(Map<String, Object> map) {
		 return this.selectOne("com.sjq.adaptation.dao.ExamAdaptationUserAnswerMapper.getExamAdaptationUserAnswerSecond",map);
	}
	
	

}