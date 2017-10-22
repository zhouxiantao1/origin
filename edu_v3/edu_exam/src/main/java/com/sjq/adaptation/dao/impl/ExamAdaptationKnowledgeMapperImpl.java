package com.sjq.adaptation.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.adaptation.bean.ExamAdaptationKnowledgeBean;
import com.sjq.adaptation.dao.ExamAdaptationKnowledgeMapper;
import com.sjq.adaptation.vo.ExamAdaptationKnowledgeVo;
import com.sjq.manager.base.BasicSqlSupport;

/**
 * [自动生成]考试模块-自适应与知识点关联DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-17 22:26:50
 * @version 1.0
 */
@Repository("ExamAdaptationKnowledgeMapper")
public class ExamAdaptationKnowledgeMapperImpl extends BasicSqlSupport implements ExamAdaptationKnowledgeMapper {

	/**
	 * 根据ID查询考试模块-自适应与知识点关联信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public ExamAdaptationKnowledgeVo queryExamAdaptationKnowledgeById(Long id){
	    return this.selectOne("com.sjq.adaptationKnowledge.dao.ExamAdaptationKnowledgeMapper.queryExamAdaptationKnowledgeById",id);
	}

	/**
	 * (增加)增加考试模块-自适应与知识点关联信息
	 * @param bean 考试模块-自适应与知识点关联实体
	 * @return     受增加影响的行数
	 */
	public int  insertExamAdaptationKnowledge(ExamAdaptationKnowledgeBean bean){
		return this.insert("com.sjq.adaptationKnowledge.dao.ExamAdaptationKnowledgeMapper.insertExamAdaptationKnowledge", bean);
	}
	
	/**
	 * (更新)根据条件更新所有考试模块-自适应与知识点关联信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateExamAdaptationKnowledgeBySearch(Map<String,Object> map){
	    return this.update("com.sjq.adaptationKnowledge.dao.ExamAdaptationKnowledgeMapper.updateExamAdaptationKnowledgeBySearch", map);
	}
	
	public List<ExamAdaptationKnowledgeVo> queryExamAdaptationKnowledgeByAdaptationId(Long adaptationId){
		 return this.selectList("com.sjq.adaptationKnowledge.dao.ExamAdaptationKnowledgeMapper.queryExamAdaptationKnowledgeByAdaptationId",adaptationId);
	}
	

}