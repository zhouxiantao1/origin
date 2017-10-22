package com.sjq.adaptation.service;

import java.util.List;

import com.sjq.adaptation.bean.ExamAdaptationUserBean;
import com.sjq.adaptation.search.ExamAdaptationUserSearch;
import com.sjq.adaptation.vo.ExamAdaptationUserVo;

/**
 * [自动生成]抽象考试模块-自适应测试用户记录表service层
 * @author  ShuiJingQiu
 * @since   2017-05-19 23:16:26
 * @version 1.0
 */
 
public interface ExamAdaptationUserService {

				
	/**
	 * 根据ID查询考试模块-自适应测试用户记录表信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	ExamAdaptationUserVo queryExamAdaptationUserById(Long id);
				
				
	/**
	 * 根据条件查询所有考试模块-自适应测试用户记录表信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<ExamAdaptationUserVo> queryExamAdaptationUserBySearch(ExamAdaptationUserSearch search);
				
				
	/**
	 * (删除)根据ID删除考试模块-自适应测试用户记录表信息
	 * @param id
	 * @return
	 */
	int deleteExamAdaptationUserById(ExamAdaptationUserBean bean);
				
				
	/**
	 * (增加)增加考试模块-自适应测试用户记录表信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertExamAdaptationUser(ExamAdaptationUserBean bean);
	
	
	/**
	 * (更新)根据条件更新所有考试模块-自适应测试用户记录表信息
	 * @param map
	 * @return
	 */
	int updateExamAdaptationUserBySearch(ExamAdaptationUserBean bean,ExamAdaptationUserSearch search);
				
				
	
}