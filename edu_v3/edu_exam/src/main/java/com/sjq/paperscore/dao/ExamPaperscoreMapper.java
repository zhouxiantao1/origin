package com.sjq.paperscore.dao;

import java.util.List;
import java.util.Map;
import com.sjq.paperscore.vo.ExamPaperscoreVo;
import com.sjq.paperscore.bean.ExamPaperscoreBean;

/**
 * [自动生成]抽象考生考试卷面得分Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:20
 * @version 1.0
 */
public interface ExamPaperscoreMapper {


	/**
	 * 根据ID查询考生考试卷面得分信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	ExamPaperscoreVo queryExamPaperscoreById(Long id);
	
	/**
	 * 根据条件查询所有考生考试卷面得分信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<ExamPaperscoreVo> queryExamPaperscoreBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加考生考试卷面得分信息
	 * @param bean 考生考试卷面得分实体
	 * @return     受增加影响的行数
	 */
	int insertExamPaperscore(ExamPaperscoreBean bean);

	
}