package com.sjq.mute.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.mute.dao.InterlocutionMuteMapper;
import com.sjq.mute.service.InterlocutionMuteService;
import com.sjq.mute.bean.InterlocutionMuteBean;
import com.sjq.mute.search.InterlocutionMuteSearch;
import com.sjq.mute.vo.InterlocutionMuteVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现禁言信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 18:30:37
 * @version 1.0
 */
 
@Service("InterlocutionMuteService")
public class InterlocutionMuteServiceImpl implements InterlocutionMuteService {
	

	@Autowired
	private InterlocutionMuteMapper interlocutionMuteMapper;
	
	/**
	 * 查询所有的禁言信息信息
	 * @return
	 */
	public List<InterlocutionMuteVo> queryAllInterlocutionMute(){
		
		return this.interlocutionMuteMapper.queryAllInterlocutionMute();
	
	}
				
				
	
	/**
	 * 根据ID查询禁言信息信息
	 * @return
	 */
	public InterlocutionMuteVo queryInterlocutionMuteById(Long id){
		
		return this.interlocutionMuteMapper.queryInterlocutionMuteById(id);

	}
	

	/**
	 * 根据条件查询所有禁言信息信息
	 * @param map
	 * @return
	 */
	public List<InterlocutionMuteVo> queryInterlocutionMuteBySearch(InterlocutionMuteSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.interlocutionMuteMapper.queryInterlocutionMuteBySearch(map);
	}
	
	
	/**
	 * 根据条件查询禁言信息count总数
	 * @param map
	 * @return
	 */
	public int queryInterlocutionMuteTotalCount(InterlocutionMuteSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.interlocutionMuteMapper.queryInterlocutionMuteTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryInterlocutionMutePage(PageBean pb,InterlocutionMuteSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.interlocutionMuteMapper.queryInterlocutionMuteTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.interlocutionMuteMapper.queryInterlocutionMutePage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有禁言信息信息
	 * @param map
	 * @return
	 */
	public int updateInterlocutionMuteBySearch(InterlocutionMuteBean bean,InterlocutionMuteSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.interlocutionMuteMapper.updateInterlocutionMuteBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加禁言信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertInterlocutionMute(InterlocutionMuteBean bean){
	
		
		return this.interlocutionMuteMapper.insertInterlocutionMute(bean);
		
	}
	
	
	
}
