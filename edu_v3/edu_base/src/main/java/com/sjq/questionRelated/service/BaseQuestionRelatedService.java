package com.sjq.questionRelated.service;

import java.util.List;
import java.util.Map;

import com.sjq.questionRelated.bean.BaseQuestionRelatedBean;
import com.sjq.questionRelated.search.BaseQuestionRelatedSearch;
import com.sjq.questionRelated.vo.BaseQuestionRelatedVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象题目知识点目录信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-06 00:47:45
 * @version 1.0
 */
 
public interface BaseQuestionRelatedService {

				
	/**
	 * 根据ID查询题目知识点目录信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseQuestionRelatedVo queryBaseQuestionRelatedById(Long id);
				
	/**
	 * 根据IDS查询所有题目知识点目录信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List queryBaseQuestionRelatedByIds(Long[] ids);
	
	/**
	 * 根据条件查询所有题目知识点目录信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseQuestionRelatedVo> queryBaseQuestionRelatedBySearch(BaseQuestionRelatedSearch search);
				
	
	/**
	 * 根据条件查询题目知识点目录信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseQuestionRelatedTotalCount(BaseQuestionRelatedSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseQuestionRelatedPage(PageBean pb,BaseQuestionRelatedSearch search);
	
	/**
	 * (删除)根据ID删除题目知识点目录信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseQuestionRelatedById(BaseQuestionRelatedBean bean);
				
				
	/**
	 * (更新)根据条件更新所有题目知识点目录信息信息
	 * @param map
	 * @return
	 */
	int updateBaseQuestionRelatedBySearch(BaseQuestionRelatedBean bean,BaseQuestionRelatedSearch search);
				
				
	/**
	 * (增加)增加题目知识点目录信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseQuestionRelated(BaseQuestionRelatedBean bean);
				
	
}