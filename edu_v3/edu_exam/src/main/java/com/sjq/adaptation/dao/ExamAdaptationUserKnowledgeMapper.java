package com.sjq.adaptation.dao;

import java.util.List;
import java.util.Map;

import com.sjq.adaptation.bean.ExamAdaptationUserKnowledgeBean;
import com.sjq.adaptation.search.ExamAdaptationUserKnowledgeSearch;
import com.sjq.adaptation.vo.ExamAdaptationUserKnowledgeVo;

/**
 * [自动生成]抽象考试模块-自适应测试用户知识点难度历史记录表Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-22 18:07:22
 * @version 1.0
 */
public interface ExamAdaptationUserKnowledgeMapper {


	/**
	 * 根据条件查询所有考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<ExamAdaptationUserKnowledgeVo> queryExamAdaptationUserKnowledgeBySearch(Map<String, Object> map);
	
	/**
	 * (更新)根据ID更新所有考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param bean 考试模块-自适应测试用户知识点难度历史记录表实体
	 * @return     受更新影响的行数
	 */
	int updateExamAdaptationUserKnowledgeById(ExamAdaptationUserKnowledgeBean bean);
	
	/**
	 * (增加)增加考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param bean 考试模块-自适应测试用户知识点难度历史记录表实体
	 * @return     受增加影响的行数
	 */
	int insertExamAdaptationUserKnowledge(ExamAdaptationUserKnowledgeBean bean);

	/**
	 * (更新)根据条件更新所有考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateExamAdaptationUserKnowledgeBySearch(Map<String,Object> map);
	

}