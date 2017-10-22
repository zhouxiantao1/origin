package com.sjq.report.service;

import java.util.List;
import java.util.Map;

import com.sjq.report.bean.InterlocutionReportBean;
import com.sjq.report.search.InterlocutionReportSearch;
import com.sjq.report.vo.InterlocutionReportVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象举报信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-16 17:57:11
 * @version 1.0
 */
 
public interface InterlocutionReportService {

				
	/**
	 * 根据ID查询举报信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	InterlocutionReportVo queryInterlocutionReportById(Long id);
				
				
	/**
	 * 根据IDS查询所有举报信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<InterlocutionReportVo> queryInterlocutionReportByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有举报信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<InterlocutionReportVo> queryInterlocutionReportBySearch(InterlocutionReportSearch search);
				
					
	/**
	 * 根据条件查询举报信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryInterlocutionReportTotalCount(InterlocutionReportSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryInterlocutionReportPage(PageBean pb,InterlocutionReportSearch search);
				
				
	/**
	 * (更新)根据ID更新所有举报信息信息
	 * @param bean
	 * @return
	 */
	int updateInterlocutionReportById(InterlocutionReportBean bean);
				
				
	/**
	 * (更新)根据条件更新所有举报信息信息
	 * @param map
	 * @return
	 */
	int updateInterlocutionReportBySearch(InterlocutionReportBean bean,InterlocutionReportSearch search);
				
				
	/**
	 * (增加)增加举报信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertInterlocutionReport(InterlocutionReportBean bean);
				
	
}