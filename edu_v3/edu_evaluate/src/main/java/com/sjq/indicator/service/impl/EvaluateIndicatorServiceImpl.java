package com.sjq.indicator.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.indicator.dao.EvaluateIndicatorMapper;
import com.sjq.indicator.service.EvaluateIndicatorService;
import com.sjq.indicator.bean.EvaluateIndicatorBean;
import com.sjq.indicator.search.EvaluateIndicatorSearch;
import com.sjq.indicator.vo.EvaluateIndicatorVo;
import com.sjq.util.PageBean;
import com.sjq.ware.dto.ZTreeNodesDto;

/**
 * [自动生成]实现指标信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:55:02
 * @version 1.0
 */
 
@Service("EvaluateIndicatorService")
public class EvaluateIndicatorServiceImpl implements EvaluateIndicatorService {
	

	@Autowired
	private EvaluateIndicatorMapper evaluateIndicatorMapper;
	
	/**
	 * 根据ID删除指标 物理删除
	 * @param bean 指标信息实体
	 * @return     受更新影响的行数
	 */
	public int  deleteEvaluateIndicatorById(Long id){
		return this.evaluateIndicatorMapper.deleteEvaluateIndicatorById(id);
	}
	
	/**
	 * 根据条件查询所有指标信息信息
	 * @param map
	 * @return
	 */
	public List<EvaluateIndicatorVo> queryEvaluateIndicatorBySearch1(EvaluateIndicatorSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("parentId",search.getParentId());
  		map.put("delflag",search.getDelflag());
  		map.put("type",search.getType());
  		map.put("userId",search.getUserId());
		
		return this.evaluateIndicatorMapper.queryEvaluateIndicatorBySearch1(map);
	}
	
	/**
	 * 查询所有的指标信息信息
	 * @return
	 */
	public List<EvaluateIndicatorVo> queryAllEvaluateIndicator(){
		
		return this.evaluateIndicatorMapper.queryAllEvaluateIndicator();
	
	}
				
	
	/**
	 * 根据ID查询指标信息信息
	 * @return
	 */
	public EvaluateIndicatorVo queryEvaluateIndicatorById1(Long id){
		
		return this.evaluateIndicatorMapper.queryEvaluateIndicatorById1(id);

	}
	
	/**
	 * 根据ID查询指标信息信息
	 * @return
	 */
	public EvaluateIndicatorVo queryEvaluateIndicatorById(Long id){
		
		return this.evaluateIndicatorMapper.queryEvaluateIndicatorById(id);

	}
	

	/**
	 * 根据条件查询所有指标信息信息-树
	 * @param map
	 * @return
	 */
	public List<ZTreeNodesDto> queryEvaluateIndicatorBySearch(EvaluateIndicatorSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("parentId",search.getParentId());
  		map.put("delflag",search.getDelflag());
  		map.put("type",search.getType());
  		map.put("userId",search.getUserId());
  		
		return this.evaluateIndicatorMapper.queryEvaluateIndicatorBySearch(map);
	}
	
	
	/**
	 * 根据条件查询指标信息count总数
	 * @param map
	 * @return
	 */
	public int queryEvaluateIndicatorTotalCount(EvaluateIndicatorSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("parentId",search.getParentId());
  		map.put("type",search.getType());
  		map.put("userId",search.getUserId());
		
		return this.evaluateIndicatorMapper.queryEvaluateIndicatorTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryEvaluateIndicatorPage(PageBean pb,EvaluateIndicatorSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("parentId",search.getParentId());
  		map.put("type",search.getType());
  		map.put("userId",search.getUserId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.evaluateIndicatorMapper.queryEvaluateIndicatorTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.evaluateIndicatorMapper.queryEvaluateIndicatorPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	/**
	 * (更新)根据ID更新所有指标信息信息
	 * @param bean
	 * @return
	 */
	public int updateEvaluateIndicatorById(EvaluateIndicatorBean bean){
		
		return this.evaluateIndicatorMapper.updateEvaluateIndicatorById(bean);
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有指标信息信息
	 * @param map
	 * @return
	 */
	public int updateEvaluateIndicatorBySearch(EvaluateIndicatorBean bean,EvaluateIndicatorSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.evaluateIndicatorMapper.updateEvaluateIndicatorBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加指标信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertEvaluateIndicator(EvaluateIndicatorBean bean){
	
		
		return this.evaluateIndicatorMapper.insertEvaluateIndicator(bean);
		
	}
	
	
	
}
