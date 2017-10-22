package com.sjq.issueList.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.issueList.dao.EvaluateIssueListMapper;
import com.sjq.issueList.service.EvaluateIssueListService;
import com.sjq.evaDetailPaper.dao.EvaluateEvaDetailPaperMapper;
import com.sjq.evaDetailPaper.vo.EvaluateEvaDetailPaperVo;
import com.sjq.issueList.bean.EvaluateIssueListBean;
import com.sjq.issueList.search.EvaluateIssueListSearch;
import com.sjq.issueList.vo.EvaluateIssueListVo;
import com.sjq.paper.dao.EvaluatePaperMapper;
import com.sjq.paper.vo.EvaluatePaperVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现发布列表service层
 * @author  ShuiJingQiu
 * @since   2017-05-27 17:12:25
 * @version 1.0
 */
 
@Service("EvaluateIssueListService")
public class EvaluateIssueListServiceImpl implements EvaluateIssueListService {
	

	@Autowired
	private EvaluateIssueListMapper evaluateIssueListMapper;
	@Autowired
	private EvaluateEvaDetailPaperMapper evaluateEvaDetailPaperMapper;
	@Autowired
	private EvaluatePaperMapper evaluatePaperMapper;
	
	/**
	 * 查询所有的发布列表信息
	 * @return
	 */
	public List<EvaluateIssueListVo> queryAllEvaluateIssueList(){
		
		return this.evaluateIssueListMapper.queryAllEvaluateIssueList();
	
	}
				
				
	
	/**
	 * 根据ID查询发布列表信息
	 * @return
	 */
	public EvaluateIssueListVo queryEvaluateIssueListById(Long id){
		
		return this.evaluateIssueListMapper.queryEvaluateIssueListById(id);

	}
	

	/**
	 * 根据条件查询所有发布列表信息
	 * @param map
	 * @return
	 */
	public List<EvaluateIssueListVo> queryEvaluateIssueListBySearch(EvaluateIssueListSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("classesId",search.getClassesId());
  		map.put("userId",search.getUserId());
  		map.put("evaObject",search.getEvaObject());
  		map.put("type",search.getType());
  		map.put("schoolId", search.getSchoolId());
  		
		return this.evaluateIssueListMapper.queryEvaluateIssueListBySearch(map);
	}
	
	
	/**
	 * 根据条件查询发布列表count总数
	 * @param map
	 * @return
	 */
	public int queryEvaluateIssueListTotalCount(EvaluateIssueListSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("classesId",search.getClassesId());
  		map.put("userId",search.getUserId());
  		map.put("evaObject",search.getEvaObject());
  		map.put("type",search.getType());
  		map.put("name", search.getIssueListName());
  		map.put("schoolId", search.getSchoolId());
  		
		
		return this.evaluateIssueListMapper.queryEvaluateIssueListTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryEvaluateIssueListPage(PageBean pb,EvaluateIssueListSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("classesId",search.getClassesId());
  		map.put("userId",search.getUserId());
  		map.put("evaObject",search.getEvaObject());
  		map.put("type",search.getType());
  		map.put("name", search.getIssueListName());
  		map.put("schoolId", search.getSchoolId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.evaluateIssueListMapper.queryEvaluateIssueListTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());
        List<Object> objectList =  evaluateIssueListMapper.queryEvaluateIssueListPage(map);
        ArrayList<Object> list = new ArrayList<Object>();
        for(Object object : objectList){
        	EvaluateIssueListVo evaluateIssueListVo = (EvaluateIssueListVo)object;
        	Long evaDetailId = evaluateIssueListVo.getEvaluateEvaDetailVo().getId();
        	EvaluateEvaDetailPaperVo evaluateEvaDetailPaperVo = evaluateEvaDetailPaperMapper.queryEvaluateEvaDetailPaperByEvaDetailId(evaDetailId);
        	EvaluatePaperVo evaluatePaperVo = evaluatePaperMapper.queryEvaluatePaperById(evaluateEvaDetailPaperVo.getPaperId());
        	evaluateIssueListVo.setQuestionNum(evaluatePaperVo.getQuestionNum());
        	list.add(evaluateIssueListVo);
        }
        // 设置列表
        pb.setList(list);
           
        // 返回pageBean
        return pb;
		
	}
	
				
	/**
	 * (更新)根据ID更新所有发布列表信息
	 * @param bean
	 * @return
	 */
	public int updateEvaluateIssueListById(EvaluateIssueListBean bean){
		
		return this.evaluateIssueListMapper.updateEvaluateIssueListById(bean);
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有发布列表信息
	 * @param map
	 * @return
	 */
	public int updateEvaluateIssueListBySearch(EvaluateIssueListBean bean,EvaluateIssueListSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.evaluateIssueListMapper.updateEvaluateIssueListBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加发布列表信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertEvaluateIssueList(EvaluateIssueListBean bean){
	
		
		return this.evaluateIssueListMapper.insertEvaluateIssueList(bean);
		
	}
	
	
	
}
