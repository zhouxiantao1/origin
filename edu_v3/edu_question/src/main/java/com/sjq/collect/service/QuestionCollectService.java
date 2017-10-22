package com.sjq.collect.service;

import java.util.List;
import java.util.Map;

import com.sjq.collect.bean.QuestionCollectBean;
import com.sjq.collect.search.QuestionCollectSearch;
import com.sjq.collect.vo.QuestionCollectVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象题库模块-题库收藏service层
 * @author  ShuiJingQiu
 * @since   2017-05-09 01:36:25
 * @version 1.0
 */
 
public interface QuestionCollectService {

	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryQuestionCollectPage(PageBean pb,QuestionCollectSearch search);
				
				
	/**
	 * (增加)增加题库模块-题库收藏信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertQuestionCollect(QuestionCollectBean bean);
	
	/**
	 * 根据条件查询所有题库模块-题库收藏信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<QuestionCollectVo> queryQuestionCollectBySearch(QuestionCollectSearch search);
				
	
}