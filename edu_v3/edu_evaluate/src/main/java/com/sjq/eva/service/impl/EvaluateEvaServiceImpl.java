package com.sjq.eva.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.eva.dao.EvaluateEvaMapper;
import com.sjq.eva.service.EvaluateEvaService;
import com.sjq.eva.bean.EvaluateEvaBean;
import com.sjq.eva.search.EvaluateEvaSearch;
import com.sjq.eva.vo.EvaluateEvaVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现测评信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:15:58
 * @version 1.0
 */
 
@Service("EvaluateEvaService")
public class EvaluateEvaServiceImpl implements EvaluateEvaService {
	

	@Autowired
	private EvaluateEvaMapper evaluateEvaMapper;
	
	/**
	 * (更新)根据ID更新所有测评信息信息
	 * @param bean
	 * @return
	 */
	public int updateEvaluateEvaById(EvaluateEvaBean bean){
		
		return this.evaluateEvaMapper.updateEvaluateEvaById(bean);
		
	}
	
	/**
	 * 查询所有的测评信息信息
	 * @return
	 */
	public List<EvaluateEvaVo> queryAllEvaluateEva(){
		
		return this.evaluateEvaMapper.queryAllEvaluateEva();
	
	}
				
				
	
	/**
	 * 根据ID查询测评信息信息
	 * @return
	 */
	public EvaluateEvaVo queryEvaluateEvaById(Long id){
		
		return this.evaluateEvaMapper.queryEvaluateEvaById(id);

	}
	

	/**
	 * 根据条件查询所有测评信息信息
	 * @param map
	 * @return
	 */
	public List<EvaluateEvaVo> queryEvaluateEvaBySearch(EvaluateEvaSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("delflag",search.getDelflag());
  		map.put("userId",search.getUserId());
		
		return this.evaluateEvaMapper.queryEvaluateEvaBySearch(map);
	}
	
	
	/**
	 * 根据条件查询测评信息count总数
	 * @param map
	 * @return
	 */
	public int queryEvaluateEvaTotalCount(EvaluateEvaSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("status",search.getStatus());
  		map.put("userId",search.getUserId());
  		
		return this.evaluateEvaMapper.queryEvaluateEvaTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryEvaluateEvaPage(PageBean pb,EvaluateEvaSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("status",search.getStatus());
  		map.put("userId",search.getUserId());
  		
        // 设置PageBean的行数参数
        pb.setRows(this.evaluateEvaMapper.queryEvaluateEvaTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());
        
       
        // 设置列表
        pb.setList(this.evaluateEvaMapper.queryEvaluateEvaPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有测评信息信息
	 * @param map
	 * @return
	 */
	public int updateEvaluateEvaBySearch(EvaluateEvaBean bean,EvaluateEvaSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.evaluateEvaMapper.updateEvaluateEvaBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加测评信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertEvaluateEva(EvaluateEvaBean bean){
	
		
		return this.evaluateEvaMapper.insertEvaluateEva(bean);
		
	}
	
	
	
}
