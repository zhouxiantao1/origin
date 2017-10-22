package com.sjq.detail.dao;

import java.util.List;
import java.util.Map;
import com.sjq.detail.vo.ExamDetailVo;
import com.sjq.detail.bean.ExamDetailBean;

/**
 * [自动生成]抽象线上考试-考试明细信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-12 19:18:17
 * @version 1.0
 */
public interface ExamDetailMapper {


	/**
	 * 查询所有的线上考试-考试明细信息信息
	 * @return 查询到的列表
	 */
	List<ExamDetailVo> queryAllExamDetail();
	
	/**
	 * 根据ID查询线上考试-考试明细信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	ExamDetailVo queryExamDetailById(Long id);
	
	/**
	 * 根据条件查询所有线上考试-考试明细信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<ExamDetailVo> queryExamDetailBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询线上考试-考试明细信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryExamDetailTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询线上考试-考试明细信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryExamDetailPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除线上考试-考试明细信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteExamDetailById(ExamDetailBean bean);
	
	/**
	 * (更新)根据ID更新所有线上考试-考试明细信息信息
	 * @param bean 线上考试-考试明细信息实体
	 * @return     受更新影响的行数
	 */
	int updateExamDetailById(ExamDetailBean bean);
	
	/**
	 * (更新)根据条件更新所有线上考试-考试明细信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateExamDetailBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加线上考试-考试明细信息信息
	 * @param bean 线上考试-考试明细信息实体
	 * @return     受增加影响的行数
	 */
	int insertExamDetail(ExamDetailBean bean);

	
}