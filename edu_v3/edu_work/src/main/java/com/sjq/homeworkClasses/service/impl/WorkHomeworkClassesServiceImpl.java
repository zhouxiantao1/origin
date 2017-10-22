package com.sjq.homeworkClasses.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.homeworkClasses.dao.WorkHomeworkClassesMapper;
import com.sjq.homeworkClasses.service.WorkHomeworkClassesService;
import com.sjq.homeworkClasses.bean.WorkHomeworkClassesBean;
import com.sjq.homeworkClasses.search.WorkHomeworkClassesSearch;
import com.sjq.homeworkClasses.vo.WorkHomeworkClassesVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现作业班级信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-12 10:00:42
 * @version 1.0
 */
 
@Service("WorkHomeworkClassesService")
public class WorkHomeworkClassesServiceImpl implements WorkHomeworkClassesService {
	

	@Autowired
	private WorkHomeworkClassesMapper workHomeworkClassesMapper;
	
	/**
	 * 根据条件查询所有作业班级待完成或已完成列表
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<WorkHomeworkClassesVo>  queryWorkClassesPending(WorkHomeworkClassesSearch search){
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("homeworkId",search.getHomeworkId());
  		map.put("status",search.getStatus());
  		map.put("classesId",search.getClassesId());
  		map.put("studentId",search.getStudentId());
		return this.workHomeworkClassesMapper.queryWorkClassesPending(map);
	}			
	
	/**
	 * 根据ID查询作业班级信息信息
	 * @return
	 */
	public WorkHomeworkClassesVo queryWorkHomeworkClassesById(Long id){
		
		return this.workHomeworkClassesMapper.queryWorkHomeworkClassesById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有作业班级信息信息
	 * @param map
	 * @return
	 */
	public List<WorkHomeworkClassesVo> queryWorkHomeworkClassesByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.workHomeworkClassesMapper.queryWorkHomeworkClassesByIds(map);
	}
	

	/**
	 * 根据条件查询所有作业班级信息信息
	 * @param map
	 * @return
	 */
	public List<WorkHomeworkClassesVo> queryWorkHomeworkClassesBySearch(WorkHomeworkClassesSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("homeworkId",search.getHomeworkId());
		
		return this.workHomeworkClassesMapper.queryWorkHomeworkClassesBySearch(map);
	}
	
	
	/**
	 * 根据条件查询作业班级信息count总数
	 * @param map
	 * @return
	 */
	public int queryWorkHomeworkClassesTotalCount(WorkHomeworkClassesSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("homeworkId",search.getHomeworkId());
  		map.put("status",search.getStatus());
  		map.put("classesId",search.getClassesId());
  		map.put("studentId",search.getStudentId());
  		map.put("title",search.getTitle());
  		map.put("ansStatus",search.getAnsStatus());
  		
		return this.workHomeworkClassesMapper.queryWorkHomeworkClassesTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryWorkHomeworkClassesPage(PageBean pb,WorkHomeworkClassesSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("homeworkId",search.getHomeworkId());
  		map.put("status",search.getStatus());
  		map.put("classesId",search.getClassesId());
  		map.put("studentId",search.getStudentId());
  		map.put("title",search.getTitle());
  		map.put("ansStatus",search.getAnsStatus());
	
        // 设置PageBean的行数参数
        pb.setRows(this.workHomeworkClassesMapper.queryWorkHomeworkClassesTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.workHomeworkClassesMapper.queryWorkHomeworkClassesPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除作业班级信息信息
	 * @param id
	 * @return
	 */
	public int deleteWorkHomeworkClassesById(WorkHomeworkClassesBean bean){
		return this.workHomeworkClassesMapper.deleteWorkHomeworkClassesById(bean);
	}
	
				
	
	/**
	 * (更新)根据条件更新所有作业班级信息信息
	 * @param map
	 * @return
	 */
	public int updateWorkHomeworkClassesBySearch(WorkHomeworkClassesBean bean,WorkHomeworkClassesSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.workHomeworkClassesMapper.updateWorkHomeworkClassesBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加作业班级信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertWorkHomeworkClasses(WorkHomeworkClassesBean bean){
	
		
		return this.workHomeworkClassesMapper.insertWorkHomeworkClasses(bean);
		
	}
	
	
	
}
