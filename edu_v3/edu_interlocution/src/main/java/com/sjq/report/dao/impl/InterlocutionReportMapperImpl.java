package com.sjq.report.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.report.vo.InterlocutionReportVo;
import com.sjq.report.bean.InterlocutionReportBean;
import com.sjq.report.dao.InterlocutionReportMapper;

/**
 * [自动生成]举报信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-16 17:57:11
 * @version 1.0
 */
@Repository("InterlocutionReportMapper")
public class InterlocutionReportMapperImpl extends BasicSqlSupport implements InterlocutionReportMapper {

	/**
	 * 根据ID查询举报信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public InterlocutionReportVo queryInterlocutionReportById(Long id){
	    return this.selectOne("com.sjq.report.dao.InterlocutionReportMapper.queryInterlocutionReportById",id);
	}

	/**
	 * 根据IDS查询所有举报信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<InterlocutionReportVo>  queryInterlocutionReportByIds(Map<String, Object> map){
		return this.selectList("com.sjq.report.dao.InterlocutionReportMapper.queryInterlocutionReportByIds",map);
	}

	/**
	 * 根据条件查询所有举报信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<InterlocutionReportVo>  queryInterlocutionReportBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.report.dao.InterlocutionReportMapper.queryInterlocutionReportBySearch",map);
	}
	
	/**
	 * 根据条件查询举报信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryInterlocutionReportTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.report.dao.InterlocutionReportMapper.queryInterlocutionReportTotalCount",map);
	}
	
	/**
	 * 分页查询举报信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryInterlocutionReportPage(Map<String, Object> map){
		return this.selectList("com.sjq.report.dao.InterlocutionReportMapper.queryInterlocutionReportPage",map);
	}
	
	/**
	 * (更新)根据ID更新所有举报信息信息
	 * @param bean 举报信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateInterlocutionReportById(InterlocutionReportBean bean){
	    return this.update("com.sjq.report.dao.InterlocutionReportMapper.updateInterlocutionReportById", bean);
	}
	
	/**
	 * (更新)根据条件更新所有举报信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateInterlocutionReportBySearch(Map<String, Object> map){
	    return this.update("com.sjq.report.dao.InterlocutionReportMapper.updateInterlocutionReportBySearch", map);
	}
	
	/**
	 * (增加)增加举报信息信息
	 * @param bean 举报信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertInterlocutionReport(InterlocutionReportBean bean){
		return this.insert("com.sjq.report.dao.InterlocutionReportMapper.insertInterlocutionReport", bean);
	}
	
	

}