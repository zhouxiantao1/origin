package com.sjq.info.dao;

import java.util.List;
import java.util.Map;
import com.sjq.info.vo.ExamInfoVo;
import com.sjq.info.bean.ExamInfoBean;

/**
 * [自动生成]抽象线上考试-考试信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-12 18:27:14
 * @version 1.0
 */
public interface ExamInfoMapper {


	/**
	 * 查询所有的线上考试-考试信息信息
	 * @return 查询到的列表
	 */
	List<ExamInfoVo> queryAllExamInfo();
	
	/**
	 * 根据ID查询线上考试-考试信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	ExamInfoVo queryExamInfoById(Long id);
	
	/**
	 * 根据条件查询所有线上考试-考试信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<ExamInfoVo> queryExamInfoBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询线上考试-考试信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryExamInfoTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询线上考试-考试信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryExamInfoPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除线上考试-考试信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteExamInfoById(ExamInfoBean bean);
	
	/**
	 * (更新)根据条件更新所有线上考试-考试信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateExamInfoBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加线上考试-考试信息信息
	 * @param bean 线上考试-考试信息实体
	 * @return     受增加影响的行数
	 */
	int insertExamInfo(ExamInfoBean bean);
	
	/**
	 * 根据条件查询线上考试-考试信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryStudentExamInfoTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询线上考试-考试信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryStudentExamInfoPage(Map<String, Object> map);
	
	/**
	 * 首页展示（根据学生信息查询考试总数)
	 * @param studentId
	 * @return
	 */
	int queryHomeExamStudentTotalCountByNumber(String studentId);
	
	/**
	 * 首页展示（根据学生信息查询考试信息）
	 * @param studentId
	 * @return
	 */
	List<Map<String,Object>> queryHomeExamStudentByNumber(String studentId);

	
}