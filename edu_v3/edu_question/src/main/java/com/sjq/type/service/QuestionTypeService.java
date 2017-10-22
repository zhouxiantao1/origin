package com.sjq.type.service;

import java.util.List;
import java.util.Map;

import com.sjq.type.bean.QuestionTypeBean;
import com.sjq.type.search.QuestionTypeSearch;
import com.sjq.type.vo.QuestionTypeVo;
import com.sjq.util.PageBean;
import com.sjq.ware.bean.QuestionWareBean;

/**
 * [自动生成]抽象题库模块-题型信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-28 19:53:48
 * @version 1.0
 */
 
public interface QuestionTypeService {
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryQuestionTypePage(PageBean pb,QuestionTypeSearch search);
	
	/**
	 * 根据条件查询题库模块-题型信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryQuestionTypeTotalCount(QuestionTypeSearch search);
	
	/**
	 * (增加)增加题库模块-题型信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertQuestionType(QuestionTypeBean bean);
	
	/**
	 * 查询所有的题库模块-题型信息信息
	 * @return 查询到的结果列表
	 */
	List<QuestionTypeVo> queryAllQuestionType();
				
				
	/**
	 * 根据ID查询题库模块-题型信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	QuestionTypeVo queryQuestionTypeById(Long id);
		
	
	
	/**
	* 根据ID查询题库模块-题型信息信息
	* @param id 标识
	* @return   查询到的结果列表
	*/
	List<QuestionTypeVo>  queryQuestionTypeBySubjectId(Long subjectId);
	
	List<QuestionTypeVo> queryQuestionTypeBySearch(QuestionTypeSearch search);
	

	
}