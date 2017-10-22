package com.sjq.ask.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.ask.dao.InterlocutionAskMapper;
import com.sjq.ask.service.InterlocutionAskService;
import com.sjq.answerAsk.dao.InterlocutionAnswerAskMapper;
import com.sjq.ask.bean.InterlocutionAskBean;
import com.sjq.ask.search.InterlocutionAskSearch;
import com.sjq.ask.vo.InterlocutionAskVo;
import com.sjq.concern.dao.InterlocutionConcernMapper;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现提问信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-15 15:18:01
 * @version 1.0
 */
 
@Service("InterlocutionAskService")
public class InterlocutionAskServiceImpl implements InterlocutionAskService {
	

	@Autowired
	private InterlocutionAskMapper interlocutionAskMapper;
	@Autowired
	private InterlocutionConcernMapper interlocutionConcernMapper;
	
	/**
	 * (更新)根据ID更新所有提问信息信息
	 * @param bean
	 * @return
	 */
	public int updateInterlocutionAskById(InterlocutionAskBean bean){
		
		return this.interlocutionAskMapper.updateInterlocutionAskById(bean);
		
	}
	
	/**
	 * 查询所有的提问信息信息
	 * @return
	 */
	public List<InterlocutionAskVo> queryAllInterlocutionAsk(){
		
		return this.interlocutionAskMapper.queryAllInterlocutionAsk();
	
	}
				
				
	
	/**
	 * 根据ID查询提问信息信息
	 * @return
	 */
	public InterlocutionAskVo queryInterlocutionAskById(Long id){
		
		return this.interlocutionAskMapper.queryInterlocutionAskById(id);

	}
	

	/**
	 * 根据条件查询所有提问信息信息
	 * @param map
	 * @return
	 */
	public List<InterlocutionAskVo> queryInterlocutionAskBySearch(InterlocutionAskSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.interlocutionAskMapper.queryInterlocutionAskBySearch(map);
	}
	
	
	/**
	 * 根据条件查询提问信息count总数
	 * @param map
	 * @return
	 */
	public int queryInterlocutionAskTotalCount(InterlocutionAskSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("type",search.getType());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		if("2".equals(search.getIsAsk())){
  			map.put("userId",search.getUserId());
  		}
		return this.interlocutionAskMapper.queryInterlocutionAskTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryInterlocutionAskPage(PageBean pb,InterlocutionAskSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        ArrayList list = new ArrayList();
  		map.put("id",search.getId());
  		map.put("type",search.getType());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		if("2".equals(search.getIsAsk())){
  			map.put("userId",search.getUserId());
  		}
	
        // 设置PageBean的行数参数
        pb.setRows(this.interlocutionAskMapper.queryInterlocutionAskTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());
        List<Object> interlocutionAskVoList = this.interlocutionAskMapper.queryInterlocutionAskPage(map);
        for(Object object : interlocutionAskVoList){
        	InterlocutionAskVo interlocutionAskVo = (InterlocutionAskVo)object;
        	 Map<String, Object> map1 = new HashMap<String, Object>();
        	 map1.put("askId",interlocutionAskVo.getId());
        	 map1.put("userId",search.getUserId());
        	 for(int i =1; i<3; i++){
        		 if(i==1){
        			 map1.put("type","1");
        			 int j = interlocutionConcernMapper.queryInterlocutionConcernTotalCount(map1);
        			 interlocutionAskVo.setIsConcren(j);
        		 }else if(i==2){
        			 map1.put("type","3");
        			 int j = interlocutionConcernMapper.queryInterlocutionConcernTotalCount(map1);
        			 interlocutionAskVo.setIsReport(j);
        		 }
        	 }
  
        	 list.add(interlocutionAskVo); 
        }

        // 设置列表
//        pb.setList(this.interlocutionAskMapper.queryInterlocutionAskPage(map));
        pb.setList(list);
        // 返回pageBean
        return pb;
		
	}
	
	/**
	 *( 更新)根据问题ID更新浏览次数
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateReadeNumByAskId(InterlocutionAskSearch search){
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", search.getId());
        map.put("readNum", search.getReadNum());
		
		return this.interlocutionAskMapper.updateInterlocutionAskBySearch(map);
	}			
	
	/**
	 * (更新)根据条件更新所有提问信息信息
	 * @param map
	 * @return
	 */
	public int updateInterlocutionAskBySearch(InterlocutionAskBean bean,InterlocutionAskSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.interlocutionAskMapper.updateInterlocutionAskBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加提问信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertInterlocutionAsk(InterlocutionAskBean bean){
	
		
		return this.interlocutionAskMapper.insertInterlocutionAsk(bean);
		
	}
	
	
	
}
