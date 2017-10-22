package com.sjq.report.dao;

import java.util.List;
import java.util.Map;
import com.sjq.report.vo.InterlocutionReportVo;
import com.sjq.report.bean.InterlocutionReportBean;

/**
 * [自动生成]抽象举报信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-16 17:57:11
 * @version 1.0
 */
public interface InterlocutionReportMapper {


	/**
	 * 根据ID查询举报信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	InterlocutionReportVo queryInterlocutionReportById(Long id);
	
	/**
	 * 根据IDS查询所有举报信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<InterlocutionReportVo> queryInterlocutionReportByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有举报信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<InterlocutionReportVo> queryInterlocutionReportBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询举报信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryInterlocutionReportTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询举报信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryInterlocutionReportPage(Map<String, Object> map);
	
	/**
	 * (更新)根据ID更新所有举报信息信息
	 * @param bean 举报信息实体
	 * @return     受更新影响的行数
	 */
	int updateInterlocutionReportById(InterlocutionReportBean bean);
	
	/**
	 * (更新)根据条件更新所有举报信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateInterlocutionReportBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加举报信息信息
	 * @param bean 举报信息实体
	 * @return     受增加影响的行数
	 */
	int insertInterlocutionReport(InterlocutionReportBean bean);

	
}