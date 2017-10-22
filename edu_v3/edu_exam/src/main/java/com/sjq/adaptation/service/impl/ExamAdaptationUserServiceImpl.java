package com.sjq.adaptation.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.adaptation.bean.ExamAdaptationUserBean;
import com.sjq.adaptation.dao.ExamAdaptationUserMapper;
import com.sjq.adaptation.search.ExamAdaptationUserSearch;
import com.sjq.adaptation.service.ExamAdaptationUserService;
import com.sjq.adaptation.vo.ExamAdaptationUserVo;

/**
 * [自动生成]实现考试模块-自适应测试用户记录表service层
 * @author  ShuiJingQiu
 * @since   2017-05-19 23:16:26
 * @version 1.0
 */
 
@Service("ExamAdaptationUserService")
public class ExamAdaptationUserServiceImpl implements ExamAdaptationUserService {
	

	@Autowired
	private ExamAdaptationUserMapper examAdaptationUserMapper;
	
				
	
	/**
	 * 根据ID查询考试模块-自适应测试用户记录表信息
	 * @return
	 */
	public ExamAdaptationUserVo queryExamAdaptationUserById(Long id){
		
		return this.examAdaptationUserMapper.queryExamAdaptationUserById(id);

	}
	

	/**
	 * 根据条件查询所有考试模块-自适应测试用户记录表信息
	 * @param map
	 * @return
	 */
	public List<ExamAdaptationUserVo> queryExamAdaptationUserBySearch(ExamAdaptationUserSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("adaptationId", search.getAdaptationId());
  		map.put("userId", search.getUserId());
		
		return this.examAdaptationUserMapper.queryExamAdaptationUserBySearch(map);
	}
	
				
	
	/**
	 * (删除)根据ID删除考试模块-自适应测试用户记录表信息
	 * @param id
	 * @return
	 */
	public int deleteExamAdaptationUserById(ExamAdaptationUserBean bean){
		return this.examAdaptationUserMapper.deleteExamAdaptationUserById(bean);
	}
	
				
	
	/**
	 * (增加)增加考试模块-自适应测试用户记录表信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertExamAdaptationUser(ExamAdaptationUserBean bean){
	
		
		return this.examAdaptationUserMapper.insertExamAdaptationUser(bean);
		
	}
	
	
	/**
	 * (更新)根据条件更新所有考试模块-自适应测试用户记录表信息
	 * @param map
	 * @return
	 */
	public int updateExamAdaptationUserBySearch(ExamAdaptationUserBean bean,ExamAdaptationUserSearch search){
		
		
		// 定义一个HashMap集合
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.examAdaptationUserMapper.updateExamAdaptationUserBySearch(map);
	}
	
	
	
	
}
