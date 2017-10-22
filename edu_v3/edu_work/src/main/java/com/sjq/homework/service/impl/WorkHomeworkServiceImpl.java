package com.sjq.homework.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.homework.dao.WorkHomeworkMapper;
import com.sjq.homework.service.WorkHomeworkService;
import com.sjq.homework.bean.WorkHomeworkBean;
import com.sjq.homework.search.WorkHomeworkSearch;
import com.sjq.homework.vo.WorkHomeworkVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现作业信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-11 23:11:48
 * @version 1.0
 */
 
@Service("WorkHomeworkService")
public class WorkHomeworkServiceImpl implements WorkHomeworkService {
	

	@Autowired
	private WorkHomeworkMapper workHomeworkMapper;
	
	/**
	 * 查询所有的作业信息信息
	 * @return
	 */
	public List<WorkHomeworkVo> queryAllWorkHomework(){
		
		return this.workHomeworkMapper.queryAllWorkHomework();
	
	}
				
				
	
	/**
	 * 根据ID查询作业信息信息
	 * @return
	 */
	public WorkHomeworkVo queryWorkHomeworkById(Long id){
		
		return this.workHomeworkMapper.queryWorkHomeworkById(id);

	}
	

	/**
	 * 根据条件查询所有作业信息信息
	 * @param map
	 * @return
	 */
	public List<WorkHomeworkVo> queryWorkHomeworkBySearch(WorkHomeworkSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("title",search.getTitle());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("classesId",search.getClassesId());
  		map.put("status",search.getType());
  		map.put("type",search.getWorkType());
		
		return this.workHomeworkMapper.queryWorkHomeworkBySearch(map);
	}
	
	
	/**
	 * 根据条件查询作业信息count总数
	 * @param map
	 * @return
	 */
	public int queryWorkHomeworkTotalCount(WorkHomeworkSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("title",search.getTitle());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("classesId",search.getClassesId());
  		map.put("createName",search.getCreateName());
  		map.put("type",search.getWorkType());
  		
		return this.workHomeworkMapper.queryWorkHomeworkTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryWorkHomeworkPage(PageBean pb,WorkHomeworkSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("title",search.getTitle());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("classesId",search.getClassesId());
  		map.put("createName",search.getCreateName());
  		map.put("type",search.getWorkType());
  		
        // 设置PageBean的行数参数
        pb.setRows(this.workHomeworkMapper.queryWorkHomeworkTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.workHomeworkMapper.queryWorkHomeworkPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据条件删除作业信息信息
	 * @param map
	 * @return
	 */
	public int deleteWorkHomeworkBySearch(WorkHomeworkBean bean,WorkHomeworkSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.workHomeworkMapper.deleteWorkHomeworkBySearch(map);
		
	}
	
				
	/**
	 * (更新)根据ID更新所有作业信息信息
	 * @param bean
	 * @return
	 */
	public int updateWorkHomeworkById(WorkHomeworkBean bean){
		
		return this.workHomeworkMapper.updateWorkHomeworkById(bean);
		
	}
	
				
	
	/**
	 * (增加)增加作业信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertWorkHomework(WorkHomeworkBean bean){
	
		
		return this.workHomeworkMapper.insertWorkHomework(bean);
		
	}
	
	
	
}
