package com.sjq.adaptation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.adaptation.bean.ExamAdaptationKnowledgeBean;
import com.sjq.adaptation.dao.ExamAdaptationKnowledgeMapper;
import com.sjq.adaptation.service.ExamAdaptationKnowledgeService;
import com.sjq.adaptation.vo.ExamAdaptationKnowledgeVo;

/**
 * [自动生成]实现考试模块-自适应与知识点关联service层
 * @author  ShuiJingQiu
 * @since   2017-05-17 22:26:50
 * @version 1.0
 */
 
@Service("ExamAdaptationKnowledgeService")
public class ExamAdaptationKnowledgeServiceImpl implements ExamAdaptationKnowledgeService {
	

	@Autowired
	private ExamAdaptationKnowledgeMapper examAdaptationKnowledgeMapper;
	
				
	
	/**
	 * 根据ID查询考试模块-自适应与知识点关联信息
	 * @return
	 */
	public ExamAdaptationKnowledgeVo queryExamAdaptationKnowledgeById(Long id){
		
		return this.examAdaptationKnowledgeMapper.queryExamAdaptationKnowledgeById(id);

	}
	
				
	
	/**
	 * (增加)增加考试模块-自适应与知识点关联信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertExamAdaptationKnowledge(ExamAdaptationKnowledgeBean bean){
	
		
		return this.examAdaptationKnowledgeMapper.insertExamAdaptationKnowledge(bean);
		
	}



	@Override
	public List<ExamAdaptationKnowledgeVo> queryExamAdaptationKnowledgeByAdaptationId(Long adaptationId) {
		
		return this.examAdaptationKnowledgeMapper.queryExamAdaptationKnowledgeByAdaptationId(adaptationId);
		
	}
	
	
	
}
