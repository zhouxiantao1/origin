package com.sjq.report.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.report.dao.InterlocutionReportMapper;
import com.sjq.report.service.InterlocutionReportService;
import com.sjq.report.bean.InterlocutionReportBean;
import com.sjq.report.search.InterlocutionReportSearch;
import com.sjq.report.vo.InterlocutionReportVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现举报信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-16 17:57:11
 * @version 1.0
 */
 
@Service("InterlocutionReportService")
public class InterlocutionReportServiceImpl implements InterlocutionReportService {
	

	@Autowired
	private InterlocutionReportMapper interlocutionReportMapper;
	
				
	
	/**
	 * 根据ID查询举报信息信息
	 * @return
	 */
	public InterlocutionReportVo queryInterlocutionReportById(Long id){
		
		return this.interlocutionReportMapper.queryInterlocutionReportById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有举报信息信息
	 * @param map
	 * @return
	 */
	public List<InterlocutionReportVo> queryInterlocutionReportByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.interlocutionReportMapper.queryInterlocutionReportByIds(map);
	}
	

	/**
	 * 根据条件查询所有举报信息信息
	 * @param map
	 * @return
	 */
	public List<InterlocutionReportVo> queryInterlocutionReportBySearch(InterlocutionReportSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.interlocutionReportMapper.queryInterlocutionReportBySearch(map);
	}
	
	
	/**
	 * 根据条件查询举报信息count总数
	 * @param map
	 * @return
	 */
	public int queryInterlocutionReportTotalCount(InterlocutionReportSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("askId",search.getAskId());
  		map.put("answerId",search.getAnswerId());
  		map.put("status",search.getStatus());
  		
		
		return this.interlocutionReportMapper.queryInterlocutionReportTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryInterlocutionReportPage(PageBean pb,InterlocutionReportSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("askId",search.getAskId());
  		map.put("answerId",search.getAnswerId());
  		map.put("status",search.getStatus());
	
        // 设置PageBean的行数参数
        pb.setRows(this.interlocutionReportMapper.queryInterlocutionReportTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.interlocutionReportMapper.queryInterlocutionReportPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	/**
	 * (更新)根据ID更新所有举报信息信息
	 * @param bean
	 * @return
	 */
	public int updateInterlocutionReportById(InterlocutionReportBean bean){
		
		return this.interlocutionReportMapper.updateInterlocutionReportById(bean);
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有举报信息信息
	 * @param map
	 * @return
	 */
	public int updateInterlocutionReportBySearch(InterlocutionReportBean bean,InterlocutionReportSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("modName", bean.getModName());
        map.put("modTime", bean.getModTime());
        
        map.put("askId", search.getAskId());
        map.put("answerId", search.getAnswerId());
        map.put("type", search.getType());
        map.put("reportNum", search.getReportNum());
		
		return this.interlocutionReportMapper.updateInterlocutionReportBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加举报信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertInterlocutionReport(InterlocutionReportBean bean){
	
		
		return this.interlocutionReportMapper.insertInterlocutionReport(bean);
		
	}
	
	
	
}
