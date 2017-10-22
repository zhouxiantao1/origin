package com.sjq.concern.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.concern.dao.InterlocutionConcernMapper;
import com.sjq.concern.service.InterlocutionConcernService;
import com.sjq.answerAsk.vo.InterlocutionAnswerAskVo;
import com.sjq.concern.bean.InterlocutionConcernBean;
import com.sjq.concern.search.InterlocutionConcernSearch;
import com.sjq.concern.vo.InterlocutionConcernVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现关注信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-17 11:29:41
 * @version 1.0
 */
 
@Service("InterlocutionConcernService")
public class InterlocutionConcernServiceImpl implements InterlocutionConcernService {
	

	@Autowired
	private InterlocutionConcernMapper interlocutionConcernMapper;
	
	/**
	 * (删除)根据条件删除关注信息信息
	 * @param map
	 * @return
	 */
	public int deleteInterlocutionConcernBySearch(InterlocutionConcernBean bean,InterlocutionConcernSearch search){
		
		Map map = new HashMap();
		map.put("bean",bean);
		map.put("search", search);
		return this.interlocutionConcernMapper.deleteInterlocutionConcernBySearch(map);
		
	}
	
	/**
	 * (删除)根据ID删除关注信息信息
	 * @param id
	 * @return
	 */
	public int deleteInterlocutionConcernById(InterlocutionConcernBean bean){
		return this.interlocutionConcernMapper.deleteInterlocutionConcernById(bean);
	}
	
	/**
	 * 查询所有的关注信息信息
	 * @return
	 */
	public List<InterlocutionConcernVo> queryAllInterlocutionConcern(){
		
		return this.interlocutionConcernMapper.queryAllInterlocutionConcern();
	
	}
				
				
	
	/**
	 * 根据ID查询关注信息信息
	 * @return
	 */
	public InterlocutionConcernVo queryInterlocutionConcernById(Long id){
		
		return this.interlocutionConcernMapper.queryInterlocutionConcernById(id);

	}
	

	/**
	 * 根据条件查询所有关注信息信息
	 * @param map
	 * @return
	 */
	public List<InterlocutionConcernVo> queryInterlocutionConcernBySearch(InterlocutionConcernSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("userId",search.getUserId());
  		map.put("type",search.getType());
  		
		
		return this.interlocutionConcernMapper.queryInterlocutionConcernBySearch(map);
	}
	
	
	/**
	 * 根据条件查询关注信息count总数
	 * @param map
	 * @return
	 */
	public int queryInterlocutionConcernTotalCount(InterlocutionConcernSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("askId",search.getAskId());
  		map.put("answerAskId",search.getAnswerAskId());
  		map.put("userId",search.getUserId());
  		map.put("type",search.getType());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
		
		return this.interlocutionConcernMapper.queryInterlocutionConcernTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryInterlocutionConcernPage(PageBean pb,InterlocutionConcernSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        ArrayList list = new ArrayList();
  		map.put("id",search.getId());
  		map.put("userId",search.getUserId());
  		map.put("type",search.getType());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.interlocutionConcernMapper.queryInterlocutionConcernTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());
        
        List<Object> interlocutionConcernVoList = this.interlocutionConcernMapper.queryInterlocutionConcernPage(map);
        for(Object object : interlocutionConcernVoList){
        	InterlocutionConcernVo interlocutionAnswerAskVo = (InterlocutionConcernVo)object;
        	 Map<String, Object> map1 = new HashMap<String, Object>();
        	 map1.put("askId",interlocutionAnswerAskVo.getAskId());
        	 map1.put("userId",search.getUserId());
        	 map1.put("type","1");
        	 int n = interlocutionConcernMapper.queryInterlocutionConcernTotalCount(map1);
			 interlocutionAnswerAskVo.setIsConcren(n);
        	 list.add(interlocutionAnswerAskVo); 
        }

        // 设置列表
        pb.setList(list);
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有关注信息信息
	 * @param map
	 * @return
	 */
	public int updateInterlocutionConcernBySearch(InterlocutionConcernBean bean,InterlocutionConcernSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.interlocutionConcernMapper.updateInterlocutionConcernBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加关注信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertInterlocutionConcern(InterlocutionConcernBean bean){
	
		
		return this.interlocutionConcernMapper.insertInterlocutionConcern(bean);
		
	}
	
	
	
}
