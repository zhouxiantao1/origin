package com.sjq.adaptation.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.adaptation.dao.ExamAdaptationQuestionMapper;
import com.sjq.adaptation.vo.ExamAdaptationQuestionVo;
import com.sjq.manager.base.BasicSqlSupport;

/**
 * [自动生成]考试模块-自适应试题库DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-22 19:19:03
 * @version 1.0
 */
@Repository("ExamAdaptationQuestionMapper")
public class ExamAdaptationQuestionMapperImpl extends BasicSqlSupport implements ExamAdaptationQuestionMapper {

	/**
	 * 根据条件查询所有考试模块-自适应试题库信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public ExamAdaptationQuestionVo  queryExamAdaptationQuestionBySearch(Map<String, Object> map){
		return this.selectOne("com.sjq.adaptation.dao.ExamAdaptationQuestionMapper.queryExamAdaptationQuestionBySearch",map);
	}
	
	/**
	 * 根据条件查询考试模块-自适应试题库count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryExamAdaptationQuestionTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.adaptation.dao.ExamAdaptationQuestionMapper.queryExamAdaptationQuestionTotalCount",map);
	}

	@Override
	public ExamAdaptationQuestionVo queryAccurateExamAdaptationQuestionBySearch(Map<String, Object> map) {
		return this.selectOne("com.sjq.adaptation.dao.ExamAdaptationQuestionMapper.queryAccurateExamAdaptationQuestionBySearch",map);
	}
	
	

}