package com.sjq.evaDetailPaper.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.evaDetailPaper.dao.EvaluateEvaDetailPaperMapper;
import com.sjq.evaDetailPaper.service.EvaluateEvaDetailPaperService;
import com.sjq.evaDetailPaper.bean.EvaluateEvaDetailPaperBean;
import com.sjq.evaDetailPaper.search.EvaluateEvaDetailPaperSearch;
import com.sjq.evaDetailPaper.vo.EvaluateEvaDetailPaperVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现测评明细问卷信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:17:14
 * @version 1.0
 */
 
@Service("EvaluateEvaDetailPaperService")
public class EvaluateEvaDetailPaperServiceImpl implements EvaluateEvaDetailPaperService {
	

	@Autowired
	private EvaluateEvaDetailPaperMapper evaluateEvaDetailPaperMapper;
	
	/**
	 * 查询所有的测评明细问卷信息信息
	 * @return
	 */
	public List<EvaluateEvaDetailPaperVo> queryAllEvaluateEvaDetailPaper(){
		
		return this.evaluateEvaDetailPaperMapper.queryAllEvaluateEvaDetailPaper();
	
	}
				
	/**
	 * 根据ID查询测评明细问卷信息信息
	 * @return
	 */
	public EvaluateEvaDetailPaperVo queryEvaluateEvaDetailPaperByEvaDetailId(Long evaDetailId){
		
		return this.evaluateEvaDetailPaperMapper.queryEvaluateEvaDetailPaperByEvaDetailId(evaDetailId);

	}			
	
	/**
	 * 根据ID查询测评明细问卷信息信息
	 * @return
	 */
	public EvaluateEvaDetailPaperVo queryEvaluateEvaDetailPaperById(Long id){
		
		return this.evaluateEvaDetailPaperMapper.queryEvaluateEvaDetailPaperById(id);

	}
	

	/**
	 * 根据条件查询所有测评明细问卷信息信息
	 * @param map
	 * @return
	 */
	public List<EvaluateEvaDetailPaperVo> queryEvaluateEvaDetailPaperBySearch(EvaluateEvaDetailPaperSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.evaluateEvaDetailPaperMapper.queryEvaluateEvaDetailPaperBySearch(map);
	}
	
	
	/**
	 * 根据条件查询测评明细问卷信息count总数
	 * @param map
	 * @return
	 */
	public int queryEvaluateEvaDetailPaperTotalCount(EvaluateEvaDetailPaperSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.evaluateEvaDetailPaperMapper.queryEvaluateEvaDetailPaperTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryEvaluateEvaDetailPaperPage(PageBean pb,EvaluateEvaDetailPaperSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.evaluateEvaDetailPaperMapper.queryEvaluateEvaDetailPaperTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.evaluateEvaDetailPaperMapper.queryEvaluateEvaDetailPaperPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有测评明细问卷信息信息
	 * @param map
	 * @return
	 */
	public int updateEvaluateEvaDetailPaperBySearch(EvaluateEvaDetailPaperBean bean,EvaluateEvaDetailPaperSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.evaluateEvaDetailPaperMapper.updateEvaluateEvaDetailPaperBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加测评明细问卷信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertEvaluateEvaDetailPaper(EvaluateEvaDetailPaperBean bean){
	
		
		return this.evaluateEvaDetailPaperMapper.insertEvaluateEvaDetailPaper(bean);
		
	}
	
	
	
}
