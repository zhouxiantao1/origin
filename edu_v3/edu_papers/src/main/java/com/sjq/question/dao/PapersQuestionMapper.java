package com.sjq.question.dao;

import java.util.List;
import java.util.Map;
import com.sjq.question.vo.PapersQuestionVo;
import com.sjq.ware.vo.QuestionWareVo;
import com.sjq.question.bean.PapersQuestionBean;

/**
 * [自动生成]抽象试卷模块-试卷试题信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-10 18:27:38
 * @version 1.0
 */
public interface PapersQuestionMapper {


	/**
	 * 根据条件查询所有试卷模块-试卷试题信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<PapersQuestionVo> queryPapersQuestionBySearch(Map<String, Object> map);
	
	/**
	 * (删除)根据条件删除试卷模块-试卷试题信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deletePapersQuestionBySearch(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有试卷模块-试卷试题信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updatePapersQuestionBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加试卷模块-试卷试题信息信息
	 * @param bean 试卷模块-试卷试题信息实体
	 * @return     受增加影响的行数
	 */
	int insertPapersQuestion(PapersQuestionBean bean);
	

	/**
	 * 根据条件查询题目集合
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<QuestionWareVo> queryQuestionWareVoList(Map map);
	
}