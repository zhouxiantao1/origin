package com.sjq.adaptation.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.adaptation.bean.ExamAdaptationUserKnowledgeBean;
import com.sjq.adaptation.dao.ExamAdaptationUserKnowledgeMapper;
import com.sjq.adaptation.search.ExamAdaptationUserKnowledgeSearch;
import com.sjq.adaptation.vo.ExamAdaptationUserKnowledgeVo;
import com.sjq.manager.base.BasicSqlSupport;

/**
 * [自动生成]考试模块-自适应测试用户知识点难度历史记录表DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-22 18:07:22
 * @version 1.0
 */
@Repository("ExamAdaptationUserKnowledgeMapper")
public class ExamAdaptationUserKnowledgeMapperImpl extends BasicSqlSupport implements ExamAdaptationUserKnowledgeMapper {

	/**
	 * 根据条件查询所有考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<ExamAdaptationUserKnowledgeVo>  queryExamAdaptationUserKnowledgeBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.adaptation.dao.ExamAdaptationUserKnowledgeMapper.queryExamAdaptationUserKnowledgeBySearch",map);
	}
	
	/**
	 * (更新)根据ID更新所有考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param bean 考试模块-自适应测试用户知识点难度历史记录表实体
	 * @return     受更新影响的行数
	 */
	public int  updateExamAdaptationUserKnowledgeById(ExamAdaptationUserKnowledgeBean bean){
	    return this.update("com.sjq.adaptation.dao.ExamAdaptationUserKnowledgeMapper.updateExamAdaptationUserKnowledgeById", bean);
	}
	
	/**
	 * (增加)增加考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param bean 考试模块-自适应测试用户知识点难度历史记录表实体
	 * @return     受增加影响的行数
	 */
	public int  insertExamAdaptationUserKnowledge(ExamAdaptationUserKnowledgeBean bean){
		return this.insert("com.sjq.adaptation.dao.ExamAdaptationUserKnowledgeMapper.insertExamAdaptationUserKnowledge", bean);
	}
	
	
	/**
	 * (更新)根据条件更新所有考试模块-自适应测试用户知识点难度历史记录表信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateExamAdaptationUserKnowledgeBySearch(Map<String,Object> map){
	    return this.update("com.sjq.adaptation.dao.ExamAdaptationUserKnowledgeMapper.updateExamAdaptationUserKnowledgeBySearch", map);
	}
	

}