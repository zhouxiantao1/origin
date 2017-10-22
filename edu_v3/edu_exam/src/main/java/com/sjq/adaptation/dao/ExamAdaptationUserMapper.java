package com.sjq.adaptation.dao;

import java.util.List;
import java.util.Map;

import com.sjq.adaptation.bean.ExamAdaptationUserBean;
import com.sjq.adaptation.vo.ExamAdaptationUserVo;

/**
 * [自动生成]抽象考试模块-自适应测试用户记录表Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-19 23:16:26
 * @version 1.0
 */
public interface ExamAdaptationUserMapper {


	/**
	 * 根据ID查询考试模块-自适应测试用户记录表信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	ExamAdaptationUserVo queryExamAdaptationUserById(Long id);
	
	/**
	 * 根据条件查询所有考试模块-自适应测试用户记录表信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<ExamAdaptationUserVo> queryExamAdaptationUserBySearch(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除考试模块-自适应测试用户记录表信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteExamAdaptationUserById(ExamAdaptationUserBean bean);
	
	/**
	 * (增加)增加考试模块-自适应测试用户记录表信息
	 * @param bean 考试模块-自适应测试用户记录表实体
	 * @return     受增加影响的行数
	 */
	int insertExamAdaptationUser(ExamAdaptationUserBean bean);
	

	/**
	 * (更新)根据条件更新所有考试模块-自适应测试用户记录表信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateExamAdaptationUserBySearch(Map<String, Object> map);

	
}