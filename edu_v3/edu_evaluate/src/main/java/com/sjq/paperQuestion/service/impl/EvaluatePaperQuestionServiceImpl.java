package com.sjq.paperQuestion.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.paperQuestion.dao.EvaluatePaperQuestionMapper;
import com.sjq.paperQuestion.service.EvaluatePaperQuestionService;
import com.sjq.paperQuestion.bean.EvaluatePaperQuestionBean;
import com.sjq.paperQuestion.search.EvaluatePaperQuestionSearch;
import com.sjq.paperQuestion.vo.EvaluatePaperQuestionVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现题目信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-23 00:00:21
 * @version 1.0
 */
 
@Service("EvaluatePaperQuestionService")
public class EvaluatePaperQuestionServiceImpl implements EvaluatePaperQuestionService {
	

	@Autowired
	private EvaluatePaperQuestionMapper evaluatePaperQuestionMapper;
	
	
	/**
	 * 根据PaperID查询题目排序最大值
	 * @param PaperID 标识
	 * @return   查询到的列表
	 */
	public Long queryPaperQuestionMaxByPaperId(Long paperId){
		
		return this.evaluatePaperQuestionMapper.queryPaperQuestionMaxByPaperId(paperId);
	}
	
	
	/**
	 * 查询所有的题目信息信息
	 * @return
	 */
	public List<EvaluatePaperQuestionVo> queryAllEvaluatePaperQuestion(){
		
		return this.evaluatePaperQuestionMapper.queryAllEvaluatePaperQuestion();
	
	}
				
				
	
	/**
	 * 根据ID查询题目信息信息
	 * @return
	 */
	public EvaluatePaperQuestionVo queryEvaluatePaperQuestionById(Long id){
		
		return this.evaluatePaperQuestionMapper.queryEvaluatePaperQuestionById(id);

	}
	

	/**
	 * 根据条件查询所有题目信息信息
	 * @param map
	 * @return
	 */
	public List<EvaluatePaperQuestionVo> queryEvaluatePaperQuestionBySearch(EvaluatePaperQuestionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("paperId",search.getPaperId());
  		map.put("delflag",search.getDelflag());
  		
		return this.evaluatePaperQuestionMapper.queryEvaluatePaperQuestionBySearch(map);
	}
	
	
	/**
	 * 根据条件查询题目信息count总数
	 * @param map
	 * @return
	 */
	public int queryEvaluatePaperQuestionTotalCount(EvaluatePaperQuestionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.evaluatePaperQuestionMapper.queryEvaluatePaperQuestionTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryEvaluatePaperQuestionPage(PageBean pb,EvaluatePaperQuestionSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.evaluatePaperQuestionMapper.queryEvaluatePaperQuestionTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.evaluatePaperQuestionMapper.queryEvaluatePaperQuestionPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据条件删除题目信息信息
	 * @param map
	 * @return
	 */
	public int deleteEvaluatePaperQuestionBySearch(EvaluatePaperQuestionBean bean,EvaluatePaperQuestionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.evaluatePaperQuestionMapper.deleteEvaluatePaperQuestionBySearch(map);
		
	}
	
				
	/**
	 * (更新)根据ID更新所有题目信息信息
	 * @param bean
	 * @return
	 */
	public int updateEvaluatePaperQuestionById(EvaluatePaperQuestionBean bean){
		
		return this.evaluatePaperQuestionMapper.updateEvaluatePaperQuestionById(bean);
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有题目信息信息
	 * @param map
	 * @return
	 */
	public int updateEvaluatePaperQuestionBySearch(EvaluatePaperQuestionBean bean,EvaluatePaperQuestionSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.evaluatePaperQuestionMapper.updateEvaluatePaperQuestionBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加题目信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertEvaluatePaperQuestion(EvaluatePaperQuestionBean bean){
	
		
		return this.evaluatePaperQuestionMapper.insertEvaluatePaperQuestion(bean);
		
	}
	
	
	
}
