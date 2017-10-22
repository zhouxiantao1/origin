package com.sjq.adaptation.service;

import java.util.List;

import com.sjq.adaptation.bean.ExamAdaptationUserKnowledgeBean;
import com.sjq.adaptation.search.ExamAdaptationUserKnowledgeSearch;
import com.sjq.adaptation.vo.ExamAdaptationUserKnowledgeVo;

/**
 * [自动生成]抽象考试模块-自适应测试用户知识点难度历史记录表service层
 * @author  ShuiJingQiu
 * @since   2017-05-22 18:07:22
 * @version 1.0
 */
 
public interface ExamAdaptationUserKnowledgeService {

				
	/**
	 * 根据条件查询所有考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<ExamAdaptationUserKnowledgeVo> queryExamAdaptationUserKnowledgeBySearch(ExamAdaptationUserKnowledgeSearch search);
				
				
	/**
	 * (更新)根据ID更新所有考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param bean
	 * @return
	 */
	int updateExamAdaptationUserKnowledgeById(ExamAdaptationUserKnowledgeBean bean);
				
				
	/**
	 * (增加)增加考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertExamAdaptationUserKnowledge(ExamAdaptationUserKnowledgeBean bean);
			
	
	
	/**
	 * (更新)根据条件更新所有考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param map
	 * @return
	 */
	int updateExamAdaptationUserKnowledgeBySearch(ExamAdaptationUserKnowledgeBean bean,ExamAdaptationUserKnowledgeSearch search);
				
	
	
}