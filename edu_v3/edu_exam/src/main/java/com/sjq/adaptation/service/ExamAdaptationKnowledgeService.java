package com.sjq.adaptation.service;

import java.util.List;

import com.sjq.adaptation.bean.ExamAdaptationKnowledgeBean;
import com.sjq.adaptation.vo.ExamAdaptationKnowledgeVo;

/**
 * [自动生成]抽象考试模块-自适应与知识点关联service层
 * @author  ShuiJingQiu
 * @since   2017-05-17 22:26:50
 * @version 1.0
 */
 
public interface ExamAdaptationKnowledgeService {

				
	/**
	 * 根据ID查询考试模块-自适应与知识点关联信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	ExamAdaptationKnowledgeVo queryExamAdaptationKnowledgeById(Long id);
				
				
	/**
	 * (增加)增加考试模块-自适应与知识点关联信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertExamAdaptationKnowledge(ExamAdaptationKnowledgeBean bean);
	
	

	List<ExamAdaptationKnowledgeVo> queryExamAdaptationKnowledgeByAdaptationId(Long adaptationId);
				
	
}