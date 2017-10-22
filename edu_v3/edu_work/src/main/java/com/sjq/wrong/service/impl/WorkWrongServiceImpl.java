package com.sjq.wrong.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.wrong.dao.WorkWrongMapper;
import com.sjq.wrong.service.WorkWrongService;
import com.sjq.wrong.bean.WorkWrongBean;
import com.sjq.wrong.search.WorkWrongSearch;
import com.sjq.wrong.vo.WorkWrongVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现错题信息service层
 * @author  ShuiJingQiu
 * @since   2017-06-27 16:47:56
 * @version 1.0
 */
 
@Service("WorkWrongService")
public class WorkWrongServiceImpl implements WorkWrongService {
	

	@Autowired
	private WorkWrongMapper workWrongMapper;
	
				
	
	/**
	 * 根据ID查询错题信息信息
	 * @return
	 */
	public WorkWrongVo queryWorkWrongById(Long id){
		
		return this.workWrongMapper.queryWorkWrongById(id);

	}
	

	/**
	 * 根据条件查询所有错题信息信息
	 * @param map
	 * @return
	 */
	public List<WorkWrongVo> queryWorkWrongBySearch(WorkWrongSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("questionId",search.getQuestionId());
  		map.put("stageId",search.getStageId());
  		map.put("gradeId",search.getGradeId());
  		map.put("subjectId",search.getSubjectId());
  		map.put("questionType",search.getQuestionType());
  		map.put("userId",search.getUserId());
  		map.put("status",search.getStatus());
  		map.put("type",search.getType());
  		map.put("delflag",search.getDelflag());
		
		return this.workWrongMapper.queryWorkWrongBySearch(map);
	}
	
	
	/**
	 * 根据条件查询错题信息count总数
	 * @param map
	 * @return
	 */
	public int queryWorkWrongTotalCount(WorkWrongSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.workWrongMapper.queryWorkWrongTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryWorkWrongPage(PageBean pb,WorkWrongSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.workWrongMapper.queryWorkWrongTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.workWrongMapper.queryWorkWrongPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除错题信息信息
	 * @param id
	 * @return
	 */
	public int deleteWorkWrongById(WorkWrongBean bean){
		return this.workWrongMapper.deleteWorkWrongById(bean);
	}
	
				
	/**
	 * (更新)根据ID更新所有错题信息信息
	 * @param bean
	 * @return
	 */
	public int updateWorkWrongById(WorkWrongBean bean){
		
		return this.workWrongMapper.updateWorkWrongById(bean);
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有错题信息信息
	 * @param map
	 * @return
	 */
	public int updateWorkWrongBySearch(WorkWrongBean bean,WorkWrongSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.workWrongMapper.updateWorkWrongBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加错题信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertWorkWrong(WorkWrongBean bean){
	
		
		return this.workWrongMapper.insertWorkWrong(bean);
		
	}
	
	
	
}
