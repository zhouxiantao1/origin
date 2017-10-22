package com.sjq.studentHistory.service;

import java.util.List;
import java.util.Map;

import com.sjq.studentHistory.bean.BaseStudentHistoryBean;
import com.sjq.studentHistory.search.BaseStudentHistorySearch;
import com.sjq.studentHistory.vo.BaseStudentHistoryVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象学生历史信息service层
 * @author  ShuiJingQiu
 * @since   2017-06-07 14:53:46
 * @version 1.0
 */
 
public interface BaseStudentHistoryService {

				
	/**
	 * 根据条件查询所有学生历史信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseStudentHistoryVo> queryBaseStudentHistoryBySearch(BaseStudentHistorySearch search);
				
					
	/**
	 * 根据条件查询学生历史信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseStudentHistoryTotalCount(BaseStudentHistorySearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseStudentHistoryPage(PageBean pb,BaseStudentHistorySearch search);
				
				
	/**
	 * (删除)根据ID删除学生历史信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseStudentHistoryById(BaseStudentHistoryBean bean);
				
				
	/**
	 * (更新)根据ID更新所有学生历史信息信息
	 * @param bean
	 * @return
	 */
	int updateBaseStudentHistoryById(BaseStudentHistoryBean bean);
				
				
	/**
	 * (增加)增加学生历史信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseStudentHistory(BaseStudentHistoryBean bean);
				
	
}