package com.sjq.selection.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.selection.dao.EvaluateSelectionMapper;
import com.sjq.selection.service.EvaluateSelectionService;
import com.sjq.selection.bean.EvaluateSelectionBean;
import com.sjq.selection.search.EvaluateSelectionSearch;
import com.sjq.selection.vo.EvaluateSelectionVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现选项信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-19 01:56:22
 * @version 1.0
 */
 
@Service("EvaluateSelectionService")
public class EvaluateSelectionServiceImpl implements EvaluateSelectionService {
	

	@Autowired
	private EvaluateSelectionMapper evaluateSelectionMapper;
	
	/**
	 * 查询所有的选项信息信息
	 * @return
	 */
	public List<EvaluateSelectionVo> queryAllEvaluateSelection(){
		
		return this.evaluateSelectionMapper.queryAllEvaluateSelection();
	
	}
				
				
	
	/**
	 * 根据ID查询选项信息信息
	 * @return
	 */
	public EvaluateSelectionVo queryEvaluateSelectionById(Long id){
		
		return this.evaluateSelectionMapper.queryEvaluateSelectionById(id);

	}
	

	/**
	 * 根据条件查询所有选项信息信息
	 * @param map
	 * @return
	 */
	public List<EvaluateSelectionVo> queryEvaluateSelectionBySearch(EvaluateSelectionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("questionId",search.getQuestionId());
  		
		
		return this.evaluateSelectionMapper.queryEvaluateSelectionBySearch(map);
	}
	
	
	/**
	 * 根据条件查询选项信息count总数
	 * @param map
	 * @return
	 */
	public int queryEvaluateSelectionTotalCount(EvaluateSelectionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.evaluateSelectionMapper.queryEvaluateSelectionTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryEvaluateSelectionPage(PageBean pb,EvaluateSelectionSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.evaluateSelectionMapper.queryEvaluateSelectionTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.evaluateSelectionMapper.queryEvaluateSelectionPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据条件删除选项信息信息
	 * @param map
	 * @return
	 */
	public int deleteEvaluateSelectionBySearch(EvaluateSelectionBean bean,EvaluateSelectionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.evaluateSelectionMapper.deleteEvaluateSelectionBySearch(map);
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有选项信息信息
	 * @param map
	 * @return
	 */
	public int updateEvaluateSelectionBySearch(EvaluateSelectionBean bean,EvaluateSelectionSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.evaluateSelectionMapper.updateEvaluateSelectionBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加选项信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertEvaluateSelection(EvaluateSelectionBean bean){
	
		
		return this.evaluateSelectionMapper.insertEvaluateSelection(bean);
		
	}
	
	
	
}
