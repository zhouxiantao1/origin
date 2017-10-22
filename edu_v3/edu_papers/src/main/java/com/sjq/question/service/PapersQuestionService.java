package com.sjq.question.service;

import java.util.List;
import java.util.Map;

import com.sjq.question.bean.PapersQuestionBean;
import com.sjq.question.search.PapersQuestionSearch;
import com.sjq.question.vo.PapersQuestionVo;
import com.sjq.ware.vo.QuestionWareVo;

/**
 * [自动生成]抽象试卷模块-试卷试题信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-10 18:27:38
 * @version 1.0
 */
 
public interface PapersQuestionService {

				
	/**
	 * 根据条件查询所有试卷模块-试卷试题信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<PapersQuestionVo> queryPapersQuestionBySearch(PapersQuestionSearch search);
				
								
	/**
	 * (删除)根据条件删除试卷模块-试卷试题信息信息
	 * @param map
	 * @return
	 */
	int deletePapersQuestionBySearch(PapersQuestionBean bean,PapersQuestionSearch search);
				
				
	/**
	 * (更新)根据条件更新所有试卷模块-试卷试题信息信息
	 * @param map
	 * @return
	 */
	int updatePapersQuestionBySearch(PapersQuestionBean bean,PapersQuestionSearch search);
				
				
	/**
	 * (增加)增加试卷模块-试卷试题信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertPapersQuestion(PapersQuestionBean bean);
	
	/**
	 * 根据条件查询题目集合
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<QuestionWareVo> queryQuestionWareVoList(Map map);
				
}