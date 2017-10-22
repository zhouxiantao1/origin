package com.sjq.adaptation.service;

import java.util.List;
import java.util.Map;

import com.sjq.adaptation.bean.ExamAdaptationBean;
import com.sjq.adaptation.bean.ExamAdaptationKnowledgeBean;
import com.sjq.adaptation.search.ExamAdaptationSearch;
import com.sjq.adaptation.vo.ExamAdaptationVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象考试模块-自适应测试service层
 * @author  ShuiJingQiu
 * @since   2017-05-12 23:31:54
 * @version 1.0
 */
 
public interface ExamAdaptationService {

				
	/**
	 * 根据ID查询考试模块-自适应测试信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	ExamAdaptationVo queryExamAdaptationById(Long id);
				
				
	/**
	 * 根据条件查询所有考试模块-自适应测试信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<ExamAdaptationVo> queryExamAdaptationBySearch(ExamAdaptationSearch search);
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryExamAdaptationPage(PageBean pb,ExamAdaptationSearch search);
	
	
	
				
				
	/**
	 * (删除)根据ID删除考试模块-自适应测试信息
	 * @param id
	 * @return
	 */
	int deleteExamAdaptationById(ExamAdaptationBean bean);
				
				
	/**
	 * (更新)根据ID更新所有考试模块-自适应测试信息
	 * @param bean
	 * @return
	 */
	int updateExamAdaptationById(ExamAdaptationBean bean);
				
				
	/**
	 * (增加)增加考试模块-自适应测试信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertExamAdaptation(ExamAdaptationBean bean,Long[] knowIds);
	
	

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
	 * 查询”我的“自适应测试信息
	 * @param pb
	 * @param search
	 * @return
	 */
	PageBean queryMyExamAdaptationPage(PageBean pb,ExamAdaptationSearch search);
	
	
	/**
	 * 获取该知识点下有多少题试题 
	 * @param map
	 * @return
	 */
	int queryExamAdaptationQuestionNum(Long[] ids);
	
	/**
	 * 根据条件查询总数
	 * @param search
	 * @return
	 */
	int queryExamAdaptationTotalCount(ExamAdaptationSearch search);
	
	
}