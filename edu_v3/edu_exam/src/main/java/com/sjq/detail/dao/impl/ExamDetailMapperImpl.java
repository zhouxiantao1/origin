package com.sjq.detail.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.detail.vo.ExamDetailVo;
import com.sjq.detail.bean.ExamDetailBean;
import com.sjq.detail.dao.ExamDetailMapper;

/**
 * [自动生成]线上考试-考试明细信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-12 19:18:17
 * @version 1.0
 */
@Repository("ExamDetailMapper")
public class ExamDetailMapperImpl extends BasicSqlSupport implements ExamDetailMapper {

	/**
	 * 查询所有的线上考试-考试明细信息信息
	 * @return 查询到的列表
	 */
	public List<ExamDetailVo> queryAllExamDetail(){
	     return this.selectList("com.sjq.detail.dao.ExamDetailMapper.queryAllExamDetail");
	}
				
	/**
	 * 根据ID查询线上考试-考试明细信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public ExamDetailVo queryExamDetailById(Long id){
	    return this.selectOne("com.sjq.detail.dao.ExamDetailMapper.queryExamDetailById",id);
	}

	/**
	 * 根据条件查询所有线上考试-考试明细信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<ExamDetailVo>  queryExamDetailBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.detail.dao.ExamDetailMapper.queryExamDetailBySearch",map);
	}
	
	/**
	 * 根据条件查询线上考试-考试明细信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryExamDetailTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.detail.dao.ExamDetailMapper.queryExamDetailTotalCount",map);
	}
	
	/**
	 * 分页查询线上考试-考试明细信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryExamDetailPage(Map<String, Object> map){
		return this.selectList("com.sjq.detail.dao.ExamDetailMapper.queryExamDetailPage",map);
	}
	
	/**
	 * (删除)根据ID删除线上考试-考试明细信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteExamDetailById(ExamDetailBean bean){
		return this.delete("com.sjq.detail.dao.ExamDetailMapper.deleteExamDetailById",bean);
	}
	
	/**
	 * (更新)根据ID更新所有线上考试-考试明细信息信息
	 * @param bean 线上考试-考试明细信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateExamDetailById(ExamDetailBean bean){
	    return this.update("com.sjq.detail.dao.ExamDetailMapper.updateExamDetailById", bean);
	}
	
	/**
	 * (更新)根据条件更新所有线上考试-考试明细信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateExamDetailBySearch(Map<String, Object> map){
	    return this.update("com.sjq.detail.dao.ExamDetailMapper.updateExamDetailBySearch", map);
	}
	
	/**
	 * (增加)增加线上考试-考试明细信息信息
	 * @param bean 线上考试-考试明细信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertExamDetail(ExamDetailBean bean){
		return this.insert("com.sjq.detail.dao.ExamDetailMapper.insertExamDetail", bean);
	}
	
	

}