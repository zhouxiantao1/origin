package com.sjq.answerAsk.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.answerAsk.dao.InterlocutionAnswerAskMapper;
import com.sjq.answerAsk.service.InterlocutionAnswerAskService;
import com.sjq.answerAsk.bean.InterlocutionAnswerAskBean;
import com.sjq.answerAsk.search.InterlocutionAnswerAskSearch;
import com.sjq.answerAsk.vo.InterlocutionAnswerAskVo;
import com.sjq.ask.vo.InterlocutionAskVo;
import com.sjq.concern.dao.InterlocutionConcernMapper;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现回答提问信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 18:30:14
 * @version 1.0
 */
 
@Service("InterlocutionAnswerAskService")
public class InterlocutionAnswerAskServiceImpl implements InterlocutionAnswerAskService {
	

	@Autowired
	private InterlocutionAnswerAskMapper interlocutionAnswerAskMapper;
	@Autowired
	private InterlocutionConcernMapper interlocutionConcernMapper;
	
	/**
	 * (更新)根据ID更新所有回答提问信息信息
	 * @param bean
	 * @return
	 */
	public int updateInterlocutionAnswerAskById(InterlocutionAnswerAskBean bean){
		
		return this.interlocutionAnswerAskMapper.updateInterlocutionAnswerAskById(bean);
		
	}
	
	/**
	 * 查询所有的回答提问信息信息
	 * @return
	 */
	public List<InterlocutionAnswerAskVo> queryAllInterlocutionAnswerAsk(){
		
		return this.interlocutionAnswerAskMapper.queryAllInterlocutionAnswerAsk();
	
	}
				
				
	
	/**
	 * 根据ID查询回答提问信息信息
	 * @return
	 */
	public InterlocutionAnswerAskVo queryInterlocutionAnswerAskById(Long id){
		
		return this.interlocutionAnswerAskMapper.queryInterlocutionAnswerAskById(id);

	}
	

	/**
	 * 根据条件查询所有回答提问信息信息
	 * @param map
	 * @return
	 */
	public List<InterlocutionAnswerAskVo> queryInterlocutionAnswerAskBySearch(InterlocutionAnswerAskSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		
  		map.put("id",search.getId());
  		map.put("askId",search.getAskId());
  		map.put("delflag",search.getDelflag());
  		
  		List<InterlocutionAnswerAskVo> interlocutionAnswerAskVoList = this.interlocutionAnswerAskMapper.queryInterlocutionAnswerAskBySearch(map);
        
  		for(InterlocutionAnswerAskVo interlocutionAnswerAskVo : interlocutionAnswerAskVoList){
        	 Map<String, Object> map1 = new HashMap<String, Object>();
        	 map1.put("answerAskId",interlocutionAnswerAskVo.getId());
        	 map1.put("userId",search.getUserId());
        	 map1.put("type","4");
			 int j = interlocutionConcernMapper.queryInterlocutionAnswerCount(map1);
			 interlocutionAnswerAskVo.setIsReport(j);
        }
		return interlocutionAnswerAskVoList;
	}
	
	
	/**
	 * 根据条件查询回答提问信息count总数
	 * @param map
	 * @return
	 */
	public int queryInterlocutionAnswerAskTotalCount(InterlocutionAnswerAskSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("askId",search.getAskId());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("userId", search.getUserId());
		
		return this.interlocutionAnswerAskMapper.queryInterlocutionAnswerAskTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryInterlocutionAnswerAskPage(PageBean pb,InterlocutionAnswerAskSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        ArrayList list = new ArrayList();
  		map.put("id",search.getId());
  		map.put("askId",search.getAskId());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("userId", search.getUserId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.interlocutionAnswerAskMapper.queryInterlocutionAnswerAskTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());
        
        List<Object> interlocutionAnswerAskVoList = this.interlocutionAnswerAskMapper.queryInterlocutionAnswerAskPage(map);
        for(Object object : interlocutionAnswerAskVoList){
        	InterlocutionAnswerAskVo interlocutionAnswerAskVo = (InterlocutionAnswerAskVo)object;
        	 Map<String, Object> map1 = new HashMap<String, Object>();
        	 Map<String, Object> map2 = new HashMap<String, Object>();
        	 map1.put("answerAskId",interlocutionAnswerAskVo.getId());
        	 map1.put("userId",search.getUserId());
        	 map1.put("type","4");
			 int j = interlocutionConcernMapper.queryInterlocutionConcernTotalCount(map1);
			 map2.put("askId",interlocutionAnswerAskVo.getAskId());
        	 map2.put("userId",search.getUserId());
        	 map2.put("type","1");
        	 int n = interlocutionConcernMapper.queryInterlocutionConcernTotalCount(map2);
			 interlocutionAnswerAskVo.setIsReport(j);
			 interlocutionAnswerAskVo.setIsConcren(n);
        	 list.add(interlocutionAnswerAskVo); 
        }
        
        // 设置列表
        pb.setList(list);
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有回答提问信息信息
	 * @param map
	 * @return
	 */
	public int updateInterlocutionAnswerAskBySearch(InterlocutionAnswerAskBean bean,InterlocutionAnswerAskSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.interlocutionAnswerAskMapper.updateInterlocutionAnswerAskBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加回答提问信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertInterlocutionAnswerAsk(InterlocutionAnswerAskBean bean){
	
		
		return this.interlocutionAnswerAskMapper.insertInterlocutionAnswerAsk(bean);
		
	}
	
	
	
}
