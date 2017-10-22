package com.sjq.answer.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.answer.dao.WorkAnswerMapper;
import com.sjq.answer.service.WorkAnswerService;
import com.sjq.answer.bean.WorkAnswerBean;
import com.sjq.answer.search.WorkAnswerSearch;
import com.sjq.answer.vo.WorkAnswerVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现作答信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:27:33
 * @version 1.0
 */
 
@Service("WorkAnswerService")
public class WorkAnswerServiceImpl implements WorkAnswerService {
	

	@Autowired
	private WorkAnswerMapper workAnswerMapper;
	
	/**
	 * 查询各个段的得分率人数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryWorkAnswerBycorrect(double start,double end,Long homeworkId){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start",start);
		map.put("end",end);
		map.put("homeworkId",homeworkId);
		
		return this.workAnswerMapper.queryWorkAnswerBycorrect(map);
	}
	
	/**
	* (更新)根据ID更新所有作答信息信息
	* @param bean
	* @return
	*/
	public int updateWorkAnswerById(WorkAnswerBean bean){
	
	return this.workAnswerMapper.updateWorkAnswerById(bean);
	
	}
			
	
	/**
	 * 根据ID查询作答信息信息
	 * @return
	 */
	public WorkAnswerVo queryWorkAnswerById(Long id){
		
		return this.workAnswerMapper.queryWorkAnswerById(id);

	}
	

	/**
	 * 根据条件查询所有作答信息信息
	 * @param map
	 * @return
	 */
	public List<WorkAnswerVo> queryWorkAnswerBySearch(WorkAnswerSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("homeworkId",search.getHomeworkId());
  		map.put("studentId",search.getStudentId());
  		
		return this.workAnswerMapper.queryWorkAnswerBySearch(map);
	}
	
	
	/**
	 * 根据条件查询作答信息count总数
	 * @param map
	 * @return
	 */
	public int queryWorkAnswerTotalCount(WorkAnswerSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("homeworkId",search.getHomeworkId());
  		map.put("studentId",search.getStudentId());
  		map.put("start",search.getStart());
		map.put("end",search.getEnd());
		map.put("createName",search.getCreateName());
		map.put("status",search.getStatus());
		return this.workAnswerMapper.queryWorkAnswerTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryWorkAnswerPage(PageBean pb,WorkAnswerSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("homeworkId",search.getHomeworkId());
  		map.put("studentId",search.getStudentId());
  		map.put("start",search.getStart());
		map.put("end",search.getEnd());
		map.put("createName",search.getCreateName());
		map.put("status",search.getStatus());
        // 设置PageBean的行数参数
        pb.setRows(this.workAnswerMapper.queryWorkAnswerTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.workAnswerMapper.queryWorkAnswerPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据条件删除作答信息信息
	 * @param map
	 * @return
	 */
	public int deleteWorkAnswerBySearch(WorkAnswerBean bean,WorkAnswerSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.workAnswerMapper.deleteWorkAnswerBySearch(map);
		
	}
	
				
	
	/**
	 * (增加)增加作答信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertWorkAnswer(WorkAnswerBean bean){
	
		
		return this.workAnswerMapper.insertWorkAnswer(bean);
		
	}
	
	
	
}
