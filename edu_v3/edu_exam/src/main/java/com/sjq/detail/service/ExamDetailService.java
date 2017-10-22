package com.sjq.detail.service;

import java.util.List;
import java.util.Map;

import com.sjq.detail.bean.ExamDetailBean;
import com.sjq.detail.search.ExamDetailSearch;
import com.sjq.detail.vo.ExamDetailVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象线上考试-考试明细信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-12 19:18:17
 * @version 1.0
 */
 
public interface ExamDetailService {

	/**
	 * 查询所有的线上考试-考试明细信息信息
	 * @return 查询到的结果列表
	 */
	List<ExamDetailVo> queryAllExamDetail();
				
				
	/**
	 * 根据ID查询线上考试-考试明细信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	ExamDetailVo queryExamDetailById(Long id);
				
				
	/**
	 * 根据条件查询所有线上考试-考试明细信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<ExamDetailVo> queryExamDetailBySearch(ExamDetailSearch search);
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryExamDetailPage(PageBean pb,ExamDetailSearch search);
				
				
	/**
	 * (删除)根据ID删除线上考试-考试明细信息信息
	 * @param id
	 * @return
	 */
	int deleteExamDetailById(ExamDetailBean bean);
				
				
	/**
	 * (更新)根据ID更新所有线上考试-考试明细信息信息
	 * @param bean
	 * @return
	 */
	int updateExamDetailById(ExamDetailBean bean);
				
				
	/**
	 * (更新)根据条件更新所有线上考试-考试明细信息信息
	 * @param map
	 * @return
	 */
	int updateExamDetailBySearch(ExamDetailBean bean,ExamDetailSearch search);
				
				
	/**
	 * (增加)增加线上考试-考试明细信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertExamDetail(ExamDetailBean bean);
				
	
}