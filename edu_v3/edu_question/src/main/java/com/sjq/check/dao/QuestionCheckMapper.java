package com.sjq.check.dao;

import java.util.List;
import java.util.Map;
import com.sjq.check.vo.QuestionCheckVo;
import com.sjq.check.bean.QuestionCheckBean;

/**
 * [自动生成]抽象题库模块-题库审核Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-10 22:52:36
 * @version 1.0
 */
public interface QuestionCheckMapper {


	/**
	 * 根据ID查询题库模块-题库审核信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	QuestionCheckVo queryQuestionCheckById(Long id);
	
	/**
	 * (更新)根据ID更新所有题库模块-题库审核信息
	 * @param bean 题库模块-题库审核实体
	 * @return     受更新影响的行数
	 */
	int updateQuestionCheckById(QuestionCheckBean bean);
	
	/**
	 * (增加)增加题库模块-题库审核信息
	 * @param bean 题库模块-题库审核实体
	 * @return     受增加影响的行数
	 */
	int insertQuestionCheck(QuestionCheckBean bean);

	
}