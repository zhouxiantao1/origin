package com.sjq.check.service;

import java.util.List;
import com.sjq.check.bean.QuestionCheckBean;
import com.sjq.check.vo.QuestionCheckVo;

/**
 * [自动生成]抽象题库模块-题库审核service层
 * @author  ShuiJingQiu
 * @since   2017-05-10 22:52:37
 * @version 1.0
 */
 
public interface QuestionCheckService {

				
	/**
	 * 根据ID查询题库模块-题库审核信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	QuestionCheckVo queryQuestionCheckById(Long id);
				
				
	/**
	 * (更新)根据ID更新所有题库模块-题库审核信息
	 * @param bean
	 * @return
	 */
	int updateQuestionCheckById(QuestionCheckBean bean);
				
				
	/**
	 * (增加)增加题库模块-题库审核信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertQuestionCheck(List<QuestionCheckBean> beans);
				
	

		
	
}