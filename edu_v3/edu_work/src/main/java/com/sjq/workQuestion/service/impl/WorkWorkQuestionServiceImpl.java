package com.sjq.workQuestion.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.workQuestion.dao.WorkWorkQuestionMapper;
import com.sjq.workQuestion.service.WorkWorkQuestionService;
import com.sjq.workQuestion.bean.WorkWorkQuestionBean;
import com.sjq.workQuestion.search.WorkWorkQuestionSearch;
import com.sjq.workQuestion.vo.WorkWorkQuestionVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现作业题目信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-05 23:19:47
 * @version 1.0
 */
 
@Service("WorkWorkQuestionService")
public class WorkWorkQuestionServiceImpl implements WorkWorkQuestionService {
	

	@Autowired
	private WorkWorkQuestionMapper workWorkQuestionMapper;
	
	/**
	 * (删除)根据条件删除作业题目信息信息
	 * @param map
	 * @return
	 */
	public int deleteWorkWorkQuestionBySearch(WorkWorkQuestionBean bean,WorkWorkQuestionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.workWorkQuestionMapper.deleteWorkWorkQuestionBySearch(map);
		
	}
	
	/**
	 * 查询所有的作业题目信息信息
	 * @return
	 */
	public List<WorkWorkQuestionVo> queryAllWorkWorkQuestion(){
		
		return this.workWorkQuestionMapper.queryAllWorkWorkQuestion();
	
	}
				
				
	
	/**
	 * 根据ID查询作业题目信息信息
	 * @return
	 */
	public WorkWorkQuestionVo queryWorkWorkQuestionById(Long id){
		
		return this.workWorkQuestionMapper.queryWorkWorkQuestionById(id);

	}
	

	/**
	 * 根据条件查询所有作业题目信息信息
	 * @param map
	 * @return
	 */
	public List<WorkWorkQuestionVo> queryWorkWorkQuestionBySearch(WorkWorkQuestionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("homeworkId",search.getHomeworkId());
  		map.put("delflag",search.getDelflag());
		
		return this.workWorkQuestionMapper.queryWorkWorkQuestionBySearch(map);
	}
	
	
	/**
	 * 根据条件查询作业题目信息count总数
	 * @param map
	 * @return
	 */
	public int queryWorkWorkQuestionTotalCount(WorkWorkQuestionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.workWorkQuestionMapper.queryWorkWorkQuestionTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryWorkWorkQuestionPage(PageBean pb,WorkWorkQuestionSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.workWorkQuestionMapper.queryWorkWorkQuestionTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.workWorkQuestionMapper.queryWorkWorkQuestionPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有作业题目信息信息
	 * @param map
	 * @return
	 */
	public int updateWorkWorkQuestionBySearch(WorkWorkQuestionBean bean,WorkWorkQuestionSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.workWorkQuestionMapper.updateWorkWorkQuestionBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加作业题目信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertWorkWorkQuestion(WorkWorkQuestionBean bean){
	
		
		return this.workWorkQuestionMapper.insertWorkWorkQuestion(bean);
		
	}
	
	
	
}
