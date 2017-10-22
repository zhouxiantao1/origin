package com.sjq.workQuestion.service;

import java.util.List;
import java.util.Map;

import com.sjq.workQuestion.bean.WorkWorkQuestionBean;
import com.sjq.workQuestion.search.WorkWorkQuestionSearch;
import com.sjq.workQuestion.vo.WorkWorkQuestionVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象作业题目信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-05 23:19:47
 * @version 1.0
 */
 
public interface WorkWorkQuestionService {
	
	/**
	 * (删除)根据条件删除作业题目信息信息
	 * @param map
	 * @return
	 */
	int deleteWorkWorkQuestionBySearch(WorkWorkQuestionBean bean,WorkWorkQuestionSearch search);
	
	/**
	 * 查询所有的作业题目信息信息
	 * @return 查询到的结果列表
	 */
	List<WorkWorkQuestionVo> queryAllWorkWorkQuestion();
				
				
	/**
	 * 根据ID查询作业题目信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	WorkWorkQuestionVo queryWorkWorkQuestionById(Long id);
				
				
	/**
	 * 根据条件查询所有作业题目信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<WorkWorkQuestionVo> queryWorkWorkQuestionBySearch(WorkWorkQuestionSearch search);
				
					
	/**
	 * 根据条件查询作业题目信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryWorkWorkQuestionTotalCount(WorkWorkQuestionSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryWorkWorkQuestionPage(PageBean pb,WorkWorkQuestionSearch search);
				
				
	/**
	 * (更新)根据条件更新所有作业题目信息信息
	 * @param map
	 * @return
	 */
	int updateWorkWorkQuestionBySearch(WorkWorkQuestionBean bean,WorkWorkQuestionSearch search);
				
				
	/**
	 * (增加)增加作业题目信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertWorkWorkQuestion(WorkWorkQuestionBean bean);
				
	
}