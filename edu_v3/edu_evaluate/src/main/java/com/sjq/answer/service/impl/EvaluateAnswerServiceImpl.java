package com.sjq.answer.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.answer.dao.EvaluateAnswerMapper;
import com.sjq.answer.service.EvaluateAnswerService;
import com.sjq.answer.bean.EvaluateAnswerBean;
import com.sjq.answer.search.EvaluateAnswerSearch;
import com.sjq.answer.vo.EvaluateAnswerVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现作答信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:38:02
 * @version 1.0
 */
 
@Service("EvaluateAnswerService")
public class EvaluateAnswerServiceImpl implements EvaluateAnswerService {
	

	@Autowired
	private EvaluateAnswerMapper evaluateAnswerMapper;
	
	/**
	 * 查询所有的作答信息信息
	 * @return
	 */
	public List<EvaluateAnswerVo> queryAllEvaluateAnswer(){
		
		return this.evaluateAnswerMapper.queryAllEvaluateAnswer();
	
	}
				
				
	
	/**
	 * 根据ID查询作答信息信息
	 * @return
	 */
	public EvaluateAnswerVo queryEvaluateAnswerById(Long id){
		
		return this.evaluateAnswerMapper.queryEvaluateAnswerById(id);

	}
	

	/**
	 * 根据条件查询所有作答信息信息
	 * @param map
	 * @return
	 */
	public List<EvaluateAnswerVo> queryEvaluateAnswerBySearch(EvaluateAnswerSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("userId",search.getUserId());
		
		return this.evaluateAnswerMapper.queryEvaluateAnswerBySearch(map);
	}
	
	
	/**
	 * 根据条件查询作答信息count总数
	 * @param map
	 * @return
	 */
	public int queryEvaluateAnswerTotalCount(EvaluateAnswerSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.evaluateAnswerMapper.queryEvaluateAnswerTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryEvaluateAnswerPage(PageBean pb,EvaluateAnswerSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.evaluateAnswerMapper.queryEvaluateAnswerTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.evaluateAnswerMapper.queryEvaluateAnswerPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有作答信息信息
	 * @param map
	 * @return
	 */
	public int updateEvaluateAnswerBySearch(EvaluateAnswerBean bean,EvaluateAnswerSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.evaluateAnswerMapper.updateEvaluateAnswerBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加作答信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertEvaluateAnswer(EvaluateAnswerBean bean){
	
		
		return this.evaluateAnswerMapper.insertEvaluateAnswer(bean);
		
	}
	
	
	
}
