package com.sjq.answerDetail.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.answerDetail.dao.WorkAnswerDetailMapper;
import com.sjq.answerDetail.service.WorkAnswerDetailService;
import com.sjq.answerDetail.bean.WorkAnswerDetailBean;
import com.sjq.answerDetail.search.WorkAnswerDetailSearch;
import com.sjq.answerDetail.vo.WorkAnswerDetailVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现作答详细信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:28:06
 * @version 1.0
 */
 
@Service("WorkAnswerDetailService")
public class WorkAnswerDetailServiceImpl implements WorkAnswerDetailService {
	

	@Autowired
	private WorkAnswerDetailMapper workAnswerDetailMapper;
	
				
	
	/**
	 * 根据ID查询作答详细信息信息
	 * @return
	 */
	public WorkAnswerDetailVo queryWorkAnswerDetailById(Long id){
		
		return this.workAnswerDetailMapper.queryWorkAnswerDetailById(id);

	}
	

	/**
	 * 根据条件查询所有作答详细信息信息
	 * @param map
	 * @return
	 */
	public List<WorkAnswerDetailVo> queryWorkAnswerDetailBySearch(WorkAnswerDetailSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("answerId",search.getAnswerId());
  		map.put("questionId",search.getQuestionId());
  		map.put("answerContent",search.getAnswerContent());
  		map.put("questionType",search.getQuestionType());
  		map.put("score",search.getScore());
  		map.put("homeworkId",search.getHomeworkId());
  		map.put("selectNum",search.getSelectNum());
  		map.put("userId",search.getUserId());
  		map.put("delflag",search.getDelflag());
  		
		
		return this.workAnswerDetailMapper.queryWorkAnswerDetailBySearch(map);
	}
	
	
	/**
	 * 根据条件查询作答详细信息count总数
	 * @param map
	 * @return
	 */
	public int queryWorkAnswerDetailTotalCount(WorkAnswerDetailSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("homeworkId",search.getHomeworkId());
  		map.put("userId",search.getUserId());
  		map.put("isRight",search.getIsRight());
  		map.put("questionId",search.getQuestionId());
  		
		return this.workAnswerDetailMapper.queryWorkAnswerDetailTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryWorkAnswerDetailPage(PageBean pb,WorkAnswerDetailSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.workAnswerDetailMapper.queryWorkAnswerDetailTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.workAnswerDetailMapper.queryWorkAnswerDetailPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据条件删除作答详细信息信息
	 * @param map
	 * @return
	 */
	public int deleteWorkAnswerDetailBySearch(WorkAnswerDetailBean bean,WorkAnswerDetailSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.workAnswerDetailMapper.deleteWorkAnswerDetailBySearch(map);
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有作答详细信息信息
	 * @param map
	 * @return
	 */
	public int updateWorkAnswerDetailBySearch(WorkAnswerDetailBean bean,WorkAnswerDetailSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.workAnswerDetailMapper.updateWorkAnswerDetailBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加作答详细信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertWorkAnswerDetail(WorkAnswerDetailBean bean){
	
		
		return this.workAnswerDetailMapper.insertWorkAnswerDetail(bean);
		
	}
	
	
	
}
