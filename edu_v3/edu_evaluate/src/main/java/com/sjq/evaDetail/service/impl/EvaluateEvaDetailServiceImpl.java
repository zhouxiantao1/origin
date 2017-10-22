package com.sjq.evaDetail.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.evaDetail.dao.EvaluateEvaDetailMapper;
import com.sjq.evaDetail.service.EvaluateEvaDetailService;
import com.sjq.evaDetail.bean.EvaluateEvaDetailBean;
import com.sjq.evaDetail.search.EvaluateEvaDetailSearch;
import com.sjq.evaDetail.vo.EvaluateEvaDetailVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现测评明细信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:17
 * @version 1.0
 */
 
@Service("EvaluateEvaDetailService")
public class EvaluateEvaDetailServiceImpl implements EvaluateEvaDetailService {
	

	@Autowired
	private EvaluateEvaDetailMapper evaluateEvaDetailMapper;
	
	/**
	 * (更新)根据ID更新所有测评明细信息信息
	 * @param bean
	 * @return
	 */
	public int updateEvaluateEvaDetailById(EvaluateEvaDetailBean bean){
		
		return this.evaluateEvaDetailMapper.updateEvaluateEvaDetailById(bean);
		
	}
	
	/**
	 * 查询所有的测评明细信息信息
	 * @return
	 */
	public List<EvaluateEvaDetailVo> queryAllEvaluateEvaDetail(){
		
		return this.evaluateEvaDetailMapper.queryAllEvaluateEvaDetail();
	
	}
				
				
	
	/**
	 * 根据ID查询测评明细信息信息
	 * @return
	 */
	public EvaluateEvaDetailVo queryEvaluateEvaDetailById(Long id){
		
		return this.evaluateEvaDetailMapper.queryEvaluateEvaDetailById(id);

	}
	

	/**
	 * 根据条件查询所有测评明细信息信息
	 * @param map
	 * @return
	 */
	public List<EvaluateEvaDetailVo> queryEvaluateEvaDetailBySearch(EvaluateEvaDetailSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.evaluateEvaDetailMapper.queryEvaluateEvaDetailBySearch(map);
	}
	
	
	/**
	 * 根据条件查询测评明细信息count总数
	 * @param map
	 * @return
	 */
	public int queryEvaluateEvaDetailTotalCount(EvaluateEvaDetailSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.evaluateEvaDetailMapper.queryEvaluateEvaDetailTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryEvaluateEvaDetailPage(PageBean pb,EvaluateEvaDetailSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.evaluateEvaDetailMapper.queryEvaluateEvaDetailTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.evaluateEvaDetailMapper.queryEvaluateEvaDetailPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有测评明细信息信息
	 * @param map
	 * @return
	 */
	public int updateEvaluateEvaDetailBySearch(EvaluateEvaDetailBean bean,EvaluateEvaDetailSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.evaluateEvaDetailMapper.updateEvaluateEvaDetailBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加测评明细信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertEvaluateEvaDetail(EvaluateEvaDetailBean bean){
	
		
		return this.evaluateEvaDetailMapper.insertEvaluateEvaDetail(bean);
		
	}
	
	
	
}
