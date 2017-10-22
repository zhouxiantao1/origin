package com.sjq.adaptation.dao;

import java.util.List;
import java.util.Map;

import com.sjq.adaptation.bean.ExamAdaptationKnowledgeBean;
import com.sjq.adaptation.vo.ExamAdaptationKnowledgeVo;

/**
 * [自动生成]抽象考试模块-自适应与知识点关联Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-17 22:26:50
 * @version 1.0
 */
public interface ExamAdaptationKnowledgeMapper {


	/**
	 * 根据ID查询考试模块-自适应与知识点关联信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	ExamAdaptationKnowledgeVo queryExamAdaptationKnowledgeById(Long id);
	
	/**
	 * (增加)增加考试模块-自适应与知识点关联信息
	 * @param bean 考试模块-自适应与知识点关联实体
	 * @return     受增加影响的行数
	 */
	int insertExamAdaptationKnowledge(ExamAdaptationKnowledgeBean bean);


	/**
	 * (更新)根据条件更新所有考试模块-自适应与知识点关联信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateExamAdaptationKnowledgeBySearch(Map<String,Object> map);
	
	
	List<ExamAdaptationKnowledgeVo> queryExamAdaptationKnowledgeByAdaptationId(Long adaptationId);
	
}