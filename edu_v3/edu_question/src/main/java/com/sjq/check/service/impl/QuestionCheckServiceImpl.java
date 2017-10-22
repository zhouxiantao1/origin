package com.sjq.check.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjq.check.dao.QuestionCheckMapper;
import com.sjq.check.service.QuestionCheckService;
import com.sjq.check.bean.QuestionCheckBean;
import com.sjq.check.search.QuestionCheckSearch;
import com.sjq.check.vo.QuestionCheckVo;
import com.sjq.util.PageBean;
import com.sjq.ware.bean.QuestionWareBean;
import com.sjq.ware.dao.QuestionWareMapper;

/**
 * [自动生成]实现题库模块-题库审核service层
 * @author  ShuiJingQiu
 * @since   2017-05-10 22:52:37
 * @version 1.0
 */
 
@Service("QuestionCheckService")
public class QuestionCheckServiceImpl implements QuestionCheckService {
	

	@Autowired
	private QuestionCheckMapper questionCheckMapper;
	
	@Autowired
	private QuestionWareMapper questionWareMapper;
				
	
	/**
	 * 根据ID查询题库模块-题库审核信息
	 * @return
	 */
	public QuestionCheckVo queryQuestionCheckById(Long id){
		
		return this.questionCheckMapper.queryQuestionCheckById(id);

	}
	
				
	/**
	 * (更新)根据ID更新所有题库模块-题库审核信息
	 * @param bean
	 * @return
	 */
	public int updateQuestionCheckById(QuestionCheckBean bean){
		
		return this.questionCheckMapper.updateQuestionCheckById(bean);
		
	}
	
				
	
	/**
	 * (增加)增加题库模块-题库审核信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	@Transactional
	public int insertQuestionCheck(List<QuestionCheckBean> beans){
		
		for(QuestionCheckBean bean:beans){
			
			this.questionCheckMapper.insertQuestionCheck(bean); // 增加审核记录
			
			QuestionWareBean qwb = new QuestionWareBean();
			qwb.setCheckId(bean.getUserId());
			qwb.setId(bean.getQuerstionId());
			qwb.setCheckStatus("1");   // 更新题库的审核状态（未分配审核0 修改为 待审核 1)
			this.questionWareMapper.updateQuestionWareById(qwb);
			
		}
		
		return 1;
	}
	
}
