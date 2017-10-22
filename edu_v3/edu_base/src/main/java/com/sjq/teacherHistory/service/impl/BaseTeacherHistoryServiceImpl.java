package com.sjq.teacherHistory.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.teacherHistory.dao.BaseTeacherHistoryMapper;
import com.sjq.teacherHistory.service.BaseTeacherHistoryService;
import com.sjq.teacherHistory.bean.BaseTeacherHistoryBean;
import com.sjq.teacherHistory.search.BaseTeacherHistorySearch;
import com.sjq.teacherHistory.vo.BaseTeacherHistoryVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现教师任教历史信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-27 15:42:52
 * @version 1.0
 */
 
@Service("BaseTeacherHistoryService")
public class BaseTeacherHistoryServiceImpl implements BaseTeacherHistoryService {
	

	@Autowired
	private BaseTeacherHistoryMapper baseTeacherHistoryMapper;
	
	/**
	 * 根据老师ID查询教获取不重复学科
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	public List<BaseTeacherHistoryVo> querySubjectByTeacherId(Long teacherId){
		return this.baseTeacherHistoryMapper.querySubjectByTeacherId(teacherId);
	}
	
	/**
	 * 根据老师ID查询教获取不重复年级
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	public List<BaseTeacherHistoryVo> queryGreadeByTeacherId(Long teacherId){
		return this.baseTeacherHistoryMapper.queryGreadeByTeacherId(teacherId);
	}
	
	/**
	 * 根据老师ID查询教获取班级
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	public List<BaseTeacherHistoryVo> queryClassesByTeacherId(Long teacherId){
		return this.baseTeacherHistoryMapper.queryClassesByTeacherId(teacherId);
	}			
	
	/**
	 * 根据ID查询教师任教历史信息信息
	 * @return
	 */
	public BaseTeacherHistoryVo queryBaseTeacherHistoryById(Long id){
		
		return this.baseTeacherHistoryMapper.queryBaseTeacherHistoryById(id);

	}
	

	/**
	 * 根据条件查询所有教师任教历史信息信息
	 * @param map
	 * @return
	 */
	public List<BaseTeacherHistoryVo> queryBaseTeacherHistoryBySearch(BaseTeacherHistorySearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("gradeId",search.getGradeId());
  		map.put("teacherId",search.getTeacherId());
		
		return this.baseTeacherHistoryMapper.queryBaseTeacherHistoryBySearch(map);
	}
	
	
	/**
	 * 根据条件查询教师任教历史信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseTeacherHistoryTotalCount(BaseTeacherHistorySearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.baseTeacherHistoryMapper.queryBaseTeacherHistoryTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseTeacherHistoryPage(PageBean pb,BaseTeacherHistorySearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseTeacherHistoryMapper.queryBaseTeacherHistoryTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseTeacherHistoryMapper.queryBaseTeacherHistoryPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除教师任教历史信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseTeacherHistoryById(BaseTeacherHistoryBean bean){
		return this.baseTeacherHistoryMapper.deleteBaseTeacherHistoryById(bean);
	}
	
				
	
	/**
	 * (增加)增加教师任教历史信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseTeacherHistory(BaseTeacherHistoryBean bean){
	
		
		return this.baseTeacherHistoryMapper.insertBaseTeacherHistory(bean);
		
	}
	
	
	
}
