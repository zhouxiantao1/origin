package com.sjq.adaptation.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.adaptation.vo.ExamAdaptationVo;
import com.sjq.adaptation.bean.ExamAdaptationBean;
import com.sjq.adaptation.dao.ExamAdaptationMapper;

/**
 * [自动生成]考试模块-自适应测试DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-12 23:31:54
 * @version 1.0
 */
@Repository("ExamAdaptationMapper")
public class ExamAdaptationMapperImpl extends BasicSqlSupport implements ExamAdaptationMapper {

	/**
	 * 根据ID查询考试模块-自适应测试信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public ExamAdaptationVo queryExamAdaptationById(Long id){
		
	    return this.selectOne("com.sjq.adaptation.dao.ExamAdaptationMapper.queryExamAdaptationById",id);
	}

	/**
	 * 根据条件查询所有考试模块-自适应测试信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<ExamAdaptationVo>  queryExamAdaptationBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.adaptation.dao.ExamAdaptationMapper.queryExamAdaptationBySearch",map);
	}
	
	/**
	 * 根据条件查询考试模块-自适应测试count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryExamAdaptationTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.adaptation.dao.ExamAdaptationMapper.queryExamAdaptationTotalCount",map);
	}
	
	/**
	 * 分页查询考试模块-自适应测试
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryExamAdaptationPage(Map<String, Object> map){
		return this.selectList("com.sjq.adaptation.dao.ExamAdaptationMapper.queryExamAdaptationPage",map);
	}
	
	/**
	 * (删除)根据ID删除考试模块-自适应测试信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteExamAdaptationById(ExamAdaptationBean bean){
		return this.delete("com.sjq.adaptation.dao.ExamAdaptationMapper.deleteExamAdaptationById",bean);
	}
	
	/**
	 * (更新)根据ID更新所有考试模块-自适应测试信息
	 * @param bean 考试模块-自适应测试实体
	 * @return     受更新影响的行数
	 */
	public int  updateExamAdaptationById(ExamAdaptationBean bean){
	    return this.update("com.sjq.adaptation.dao.ExamAdaptationMapper.updateExamAdaptationById", bean);
	}
	
	/**
	 * (增加)增加考试模块-自适应测试信息
	 * @param bean 考试模块-自适应测试实体
	 * @return     受增加影响的行数
	 */
	public int  insertExamAdaptation(ExamAdaptationBean bean){
		return this.insert("com.sjq.adaptation.dao.ExamAdaptationMapper.insertExamAdaptation", bean);
	}

	@Override
	public int getExamAdaptationKnowledge(Long adapatationId) {
		 return this.selectOne("com.sjq.adaptation.dao.ExamAdaptationMapper.getExamAdaptationKnowledge",adapatationId);
	}

	@Override
	public List<Map<String, Object>> getExamAdaptationKnowledgeIdList(Long adapatationId) {
		return this.selectList("com.sjq.adaptation.dao.ExamAdaptationMapper.getExamAdaptationKnowledgeIdList",adapatationId);
	}

	@Override
	public void setExamAdaptationQuestion(Long adapatationId) {
		this.insert("com.sjq.adaptation.dao.ExamAdaptationMapper.setExamAdaptationQuestion", adapatationId);
	}

	@Override
	public List<Map<String, Object>> getExamAdaptationKnowledgeAnswerCount(Map<String, Object> map) {
		return this.selectList("com.sjq.adaptation.dao.ExamAdaptationMapper.getExamAdaptationKnowledgeAnswerCount",map);
	}

	@Override
	public int queryMyExamAdaptationTotalCount(Map<String, Object> map) {
		return this.selectOne("com.sjq.adaptation.dao.ExamAdaptationMapper.queryMyExamAdaptationTotalCount",map);
	}

	@Override
	public List<Map<String, Object>> queryMyExamAdaptationPage(Map<String, Object> map) {
		return this.selectList("com.sjq.adaptation.dao.ExamAdaptationMapper.queryMyExamAdaptationPage",map);
	}

	@Override
	public int queryExamAdaptationQuestionNum(Map<String, Object> map) {
		return this.selectOne("com.sjq.adaptation.dao.ExamAdaptationMapper.queryExamAdaptationQuestionNum",map);
	}
	
	

}