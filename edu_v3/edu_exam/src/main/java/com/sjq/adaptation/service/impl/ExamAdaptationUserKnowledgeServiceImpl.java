package com.sjq.adaptation.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.adaptation.bean.ExamAdaptationUserKnowledgeBean;
import com.sjq.adaptation.dao.ExamAdaptationUserKnowledgeMapper;
import com.sjq.adaptation.search.ExamAdaptationUserKnowledgeSearch;
import com.sjq.adaptation.service.ExamAdaptationUserKnowledgeService;
import com.sjq.adaptation.vo.ExamAdaptationUserKnowledgeVo;

/**
 * [自动生成]实现考试模块-自适应测试用户知识点难度历史记录表service层
 * @author  ShuiJingQiu
 * @since   2017-05-22 18:07:22
 * @version 1.0
 */
 
@Service("ExamAdaptationUserKnowledgeService")
public class ExamAdaptationUserKnowledgeServiceImpl implements ExamAdaptationUserKnowledgeService {
	

	@Autowired
	private ExamAdaptationUserKnowledgeMapper examAdaptationUserKnowledgeMapper;
	

	/**
	 * 根据条件查询所有考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param map
	 * @return
	 */
	public List<ExamAdaptationUserKnowledgeVo> queryExamAdaptationUserKnowledgeBySearch(ExamAdaptationUserKnowledgeSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("knowledgeId",search.getKnowledgeId());
  		map.put("userId",search.getUserId());
  		map.put("difficulty",search.getDifficulty());
		
		return this.examAdaptationUserKnowledgeMapper.queryExamAdaptationUserKnowledgeBySearch(map);
	}
	
				
	/**
	 * (更新)根据ID更新所有考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param bean
	 * @return
	 */
	public int updateExamAdaptationUserKnowledgeById(ExamAdaptationUserKnowledgeBean bean){
		
		return this.examAdaptationUserKnowledgeMapper.updateExamAdaptationUserKnowledgeById(bean);
		
	}
	
	
	/**
	 * (增加)增加考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertExamAdaptationUserKnowledge(ExamAdaptationUserKnowledgeBean bean){
	
		
		return this.examAdaptationUserKnowledgeMapper.insertExamAdaptationUserKnowledge(bean);
		
	}
	

	/**
	 * (更新)根据条件更新所有考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param map
	 * @return
	 */
	public int updateExamAdaptationUserKnowledgeBySearch(ExamAdaptationUserKnowledgeBean bean,ExamAdaptationUserKnowledgeSearch search){
		
		// 定义一个HashMap集合
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.examAdaptationUserKnowledgeMapper.updateExamAdaptationUserKnowledgeBySearch(map);
	}
	
	
	
}
