package com.sjq.check.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.check.vo.QuestionCheckVo;
import com.sjq.check.bean.QuestionCheckBean;
import com.sjq.check.dao.QuestionCheckMapper;

/**
 * [自动生成]题库模块-题库审核DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-10 22:52:36
 * @version 1.0
 */
@Repository("QuestionCheckMapper")
public class QuestionCheckMapperImpl extends BasicSqlSupport implements QuestionCheckMapper {

	/**
	 * 根据ID查询题库模块-题库审核信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public QuestionCheckVo queryQuestionCheckById(Long id){
	    return this.selectOne("com.sjq.check.dao.QuestionCheckMapper.queryQuestionCheckById",id);
	}

	/**
	 * (更新)根据ID更新所有题库模块-题库审核信息
	 * @param bean 题库模块-题库审核实体
	 * @return     受更新影响的行数
	 */
	public int  updateQuestionCheckById(QuestionCheckBean bean){
	    return this.update("com.sjq.check.dao.QuestionCheckMapper.updateQuestionCheckById", bean);
	}
	
	/**
	 * (增加)增加题库模块-题库审核信息
	 * @param bean 题库模块-题库审核实体
	 * @return     受增加影响的行数
	 */
	public int  insertQuestionCheck(QuestionCheckBean bean){
		return this.insert("com.sjq.check.dao.QuestionCheckMapper.insertQuestionCheck", bean);
	}
	
	

}