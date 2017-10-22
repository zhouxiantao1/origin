package com.sjq.info.service;

import java.util.List;
import java.util.Map;

import com.sjq.info.bean.ExamInfoBean;
import com.sjq.info.search.ExamInfoSearch;
import com.sjq.info.vo.ExamInfoVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象线上考试-考试信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-12 18:27:14
 * @version 1.0
 */
 
public interface ExamInfoService {

	/**
	 * 查询所有的线上考试-考试信息信息
	 * @return 查询到的结果列表
	 */
	List<ExamInfoVo> queryAllExamInfo();
				
				
	/**
	 * 根据ID查询线上考试-考试信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	ExamInfoVo queryExamInfoById(Long id);
				
				
	/**
	 * 根据条件查询所有线上考试-考试信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<ExamInfoVo> queryExamInfoBySearch(ExamInfoSearch search);
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryExamInfoPage(PageBean pb,ExamInfoSearch search);
				
				
	/**
	 * (删除)根据ID删除线上考试-考试信息信息
	 * @param id
	 * @return
	 */
	int deleteExamInfoById(ExamInfoBean bean);
				
				
	/**
	 * (更新)根据条件更新所有线上考试-考试信息信息
	 * @param map
	 * @return
	 */
	int updateExamInfoBySearch(ExamInfoBean bean,ExamInfoSearch search);
				
				
	/**
	 * (增加)增加线上考试-考试信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertExamInfo(ExamInfoBean bean);
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryStuedntExamInfoPage(PageBean pb,ExamInfoSearch search);
				
	
	PageBean queryHomeExamStudentByNumber(String studentId);
	
}