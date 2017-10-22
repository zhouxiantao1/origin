package com.sjq.adaptation.dao;

import java.util.List;
import java.util.Map;
import com.sjq.adaptation.vo.ExamAdaptationVo;
import com.sjq.adaptation.bean.ExamAdaptationBean;

/**
 * [自动生成]抽象考试模块-自适应测试Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-12 23:31:54
 * @version 1.0
 */
public interface ExamAdaptationMapper {


	/**
	 * 根据ID查询考试模块-自适应测试信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	ExamAdaptationVo queryExamAdaptationById(Long id);
	
	/**
	 * 根据条件查询所有考试模块-自适应测试信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<ExamAdaptationVo> queryExamAdaptationBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询考试模块-自适应测试count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryExamAdaptationTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询考试模块-自适应测试
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryExamAdaptationPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除考试模块-自适应测试信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteExamAdaptationById(ExamAdaptationBean bean);
	
	/**
	 * (更新)根据ID更新所有考试模块-自适应测试信息
	 * @param bean 考试模块-自适应测试实体
	 * @return     受更新影响的行数
	 */
	int updateExamAdaptationById(ExamAdaptationBean bean);
	
	/**
	 * (增加)增加考试模块-自适应测试信息
	 * @param bean 考试模块-自适应测试实体
	 * @return     受增加影响的行数
	 */
	int insertExamAdaptation(ExamAdaptationBean bean);

	/**
	 * 获取自适应有多少个知识模点（例如：创建时选择10个知识点，但其中2个知识点并未扫描到符合要求的试题，故只剩下 8个有效的知识点
	 * @param adapatationId
	 * @return
	 */
	int getExamAdaptationKnowledge(Long adapatationId);
	
	/**
	 * 获取自适应所有的有效知识点信息
	 * @param adapatationId
	 * @return
	 */
	List<Map<String,Object>> getExamAdaptationKnowledgeIdList(Long adapatationId);
	
	
	/**
	 * 扫描符合自适应测试的试题并创建自适应题库
	 * @param adapatationId
	 */
	void setExamAdaptationQuestion(Long adapatationId);
	
	
	/**
	 * 扫描符合自适应测试的试题并创建自适应题库
	 * @param adapatationId
	 */
	List<Map<String,Object>> getExamAdaptationKnowledgeAnswerCount(Map<String,Object> map);
	
	
	/**
	 * 根据条件查询考试模块-"我的自适应测试"count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryMyExamAdaptationTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询考试模块-"我的自适应测试"
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Map<String,Object>> queryMyExamAdaptationPage(Map<String, Object> map);
	
	/**
	 * 获取该知识点下有多少题试题 
	 * @param map
	 * @return
	 */
	int queryExamAdaptationQuestionNum(Map<String, Object> map);
	
	
}