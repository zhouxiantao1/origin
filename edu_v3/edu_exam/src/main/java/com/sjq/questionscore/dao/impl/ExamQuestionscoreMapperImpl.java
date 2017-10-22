package com.sjq.questionscore.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.questionscore.vo.ExamQuestionscoreVo;
import com.sjq.questionscore.bean.ExamQuestionscoreBean;
import com.sjq.questionscore.dao.ExamQuestionscoreMapper;

/**
 * [自动生成]试管理-考生考试试题得分DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:05
 * @version 1.0
 */
@Repository("ExamQuestionscoreMapper")
public class ExamQuestionscoreMapperImpl extends BasicSqlSupport implements ExamQuestionscoreMapper {

	/**
	 * 根据ID查询试管理-考生考试试题得分信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public ExamQuestionscoreVo queryExamQuestionscoreById(Long id){
	    return this.selectOne("com.sjq.questionscore.dao.ExamQuestionscoreMapper.queryExamQuestionscoreById",id);
	}

	/**
	 * 根据条件查询所有试管理-考生考试试题得分信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<ExamQuestionscoreVo>  queryExamQuestionscoreBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.questionscore.dao.ExamQuestionscoreMapper.queryExamQuestionscoreBySearch",map);
	}
	
	/**
	 * (增加)增加试管理-考生考试试题得分信息
	 * @param bean 试管理-考生考试试题得分实体
	 * @return     受增加影响的行数
	 */
	public int  insertExamQuestionscore(ExamQuestionscoreBean bean){
		return this.insert("com.sjq.questionscore.dao.ExamQuestionscoreMapper.insertExamQuestionscore", bean);
	}
	
	

}