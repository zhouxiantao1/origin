package com.sjq.questionscore.dao;

import java.util.List;
import java.util.Map;
import com.sjq.questionscore.vo.ExamQuestionscoreVo;
import com.sjq.questionscore.bean.ExamQuestionscoreBean;

/**
 * [自动生成]抽象试管理-考生考试试题得分Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:05
 * @version 1.0
 */
public interface ExamQuestionscoreMapper {


	/**
	 * 根据ID查询试管理-考生考试试题得分信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	ExamQuestionscoreVo queryExamQuestionscoreById(Long id);
	
	/**
	 * 根据条件查询所有试管理-考生考试试题得分信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<ExamQuestionscoreVo> queryExamQuestionscoreBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加试管理-考生考试试题得分信息
	 * @param bean 试管理-考生考试试题得分实体
	 * @return     受增加影响的行数
	 */
	int insertExamQuestionscore(ExamQuestionscoreBean bean);

	
}