package com.sjq.adaptation.dao;

import java.util.List;
import java.util.Map;

import com.sjq.adaptation.bean.ExamAdaptationUserAnswerBean;
import com.sjq.adaptation.search.ExamAdaptationUserAnswerSearch;
import com.sjq.adaptation.vo.ExamAdaptationUserAnswerVo;

/**
 * [自动生成]抽象考试模块-自适应测试用户答题记录表Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-22 17:34:42
 * @version 1.0
 */
public interface ExamAdaptationUserAnswerMapper {


	/**
	 * 根据条件查询所有考试模块-自适应测试用户答题记录表信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<ExamAdaptationUserAnswerVo> queryExamAdaptationUserAnswerBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件获取最新的考试模块-自适应测试用户答题记录表信息
	 * @param map
	 * @return
	 */
	ExamAdaptationUserAnswerVo queryRecentExamAdaptationUserAnswerLimit1BySearch(Map<String, Object> map);
	
	
	/**
	 * 根据条件查询考试模块-自适应测试用户答题记录表count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryExamAdaptationUserAnswerTotalCount(Map<String, Object> map);
	
	/**
	 * (更新)根据ID更新所有考试模块-自适应测试用户答题记录表信息
	 * @param bean 考试模块-自适应测试用户答题记录表实体
	 * @return     受更新影响的行数
	 */
	int updateExamAdaptationUserAnswerById(ExamAdaptationUserAnswerBean bean);
	
	/**
	 * (更新)根据条件更新所有考试模块-自适应测试用户答题记录表信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateExamAdaptationUserAnswerBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加考试模块-自适应测试用户答题记录表信息
	 * @param bean 考试模块-自适应测试用户答题记录表实体
	 * @return     受增加影响的行数
	 */
	int insertExamAdaptationUserAnswer(ExamAdaptationUserAnswerBean bean);
	
	/**
	 * 根据自适应id与用户id查询总共所花时间
	 * @param map
	 * @return
	 */
	int getExamAdaptationUserAnswerSecond(Map<String,Object> map);

	
}