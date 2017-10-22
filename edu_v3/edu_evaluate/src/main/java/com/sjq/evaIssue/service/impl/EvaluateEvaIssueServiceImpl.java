package com.sjq.evaIssue.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.evaIssue.dao.EvaluateEvaIssueMapper;
import com.sjq.evaIssue.service.EvaluateEvaIssueService;
import com.sjq.evaIssue.bean.EvaluateEvaIssueBean;
import com.sjq.evaIssue.search.EvaluateEvaIssueSearch;
import com.sjq.evaIssue.vo.EvaluateEvaIssueVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现测评发布信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:28
 * @version 1.0
 */
 
@Service("EvaluateEvaIssueService")
public class EvaluateEvaIssueServiceImpl implements EvaluateEvaIssueService {
	

	@Autowired
	private EvaluateEvaIssueMapper evaluateEvaIssueMapper;
	
	/**
	 * (更新)根据ID更新所有测评发布信息信息
	 * @param bean
	 * @return
	 */
	public int updateEvaluateEvaIssueById(EvaluateEvaIssueBean bean){
		
		return this.evaluateEvaIssueMapper.updateEvaluateEvaIssueById(bean);
		
	}
	
	/**
	 * 查询所有的测评发布信息信息
	 * @return
	 */
	public List<EvaluateEvaIssueVo> queryAllEvaluateEvaIssue(){
		
		return this.evaluateEvaIssueMapper.queryAllEvaluateEvaIssue();
	
	}
				
				
	
	/**
	 * 根据ID查询测评发布信息信息
	 * @return
	 */
	public EvaluateEvaIssueVo queryEvaluateEvaIssueById(Long id){
		
		return this.evaluateEvaIssueMapper.queryEvaluateEvaIssueById(id);

	}
	

	/**
	 * 根据条件查询所有测评发布信息信息
	 * @param map
	 * @return
	 */
	public List<EvaluateEvaIssueVo> queryEvaluateEvaIssueBySearch(EvaluateEvaIssueSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("areaId",search.getAreaId());
  		map.put("type",search.getType());
  		map.put("schoolId",search.getSchoolId());
  		map.put("evaDetailId",search.getEvaDetailId());
  		map.put("delflag",search.getDelflag());
  		map.put("status",search.getStatus());
		
		return this.evaluateEvaIssueMapper.queryEvaluateEvaIssueBySearch(map);
	}
	
	
	/**
	 * 根据条件查询测评发布信息count总数
	 * @param map
	 * @return
	 */
	public int queryEvaluateEvaIssueTotalCount(EvaluateEvaIssueSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("areaId",search.getAreaId());
  		map.put("type",search.getType());
  		map.put("schoolId",search.getSchoolId());
  		map.put("status",search.getStatus());
  		
		return this.evaluateEvaIssueMapper.queryEvaluateEvaIssueTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryEvaluateEvaIssuePage(PageBean pb,EvaluateEvaIssueSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("areaId",search.getAreaId());
  		map.put("type",search.getType());
  		map.put("schoolId",search.getSchoolId());
  		map.put("status",search.getStatus());
	
        // 设置PageBean的行数参数
        pb.setRows(this.evaluateEvaIssueMapper.queryEvaluateEvaIssueTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.evaluateEvaIssueMapper.queryEvaluateEvaIssuePage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有测评发布信息信息
	 * @param map
	 * @return
	 */
	public int updateEvaluateEvaIssueBySearch(EvaluateEvaIssueBean bean,EvaluateEvaIssueSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
        map.put("type",search.getType());
		
		return this.evaluateEvaIssueMapper.updateEvaluateEvaIssueBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加测评发布信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertEvaluateEvaIssue(EvaluateEvaIssueBean bean){
	
		
		return this.evaluateEvaIssueMapper.insertEvaluateEvaIssue(bean);
		
	}
	
	
	
}
