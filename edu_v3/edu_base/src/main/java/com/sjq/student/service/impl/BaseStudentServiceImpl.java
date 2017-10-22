package com.sjq.student.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.student.dao.BaseStudentMapper;
import com.sjq.student.service.BaseStudentService;
import com.sjq.student.bean.BaseStudentBean;
import com.sjq.student.search.BaseStudentSearch;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现基础模块-学生信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-16 15:50:40
 * @version 1.0
 */
 
@Service("BaseStudentService")
public class BaseStudentServiceImpl implements BaseStudentService {
	

	@Autowired
	private BaseStudentMapper baseStudentMapper;
	
	/**
	 * 查询所有的基础模块-学生信息信息
	 * @return
	 */
	public List<BaseStudentVo> queryAllBaseStudent(){
		
		return this.baseStudentMapper.queryAllBaseStudent();
	
	}
				
				
	
	/**
	 * 根据ID查询基础模块-学生信息信息
	 * @return
	 */
	public BaseStudentVo queryBaseStudentById(Long id){
		
		return this.baseStudentMapper.queryBaseStudentById(id);

	}
	
	/**
	 * 根据ID查询基础模块-学生信息信息
	 * @return
	 */
	public BaseStudentVo queryBaseStudentByUserId(Long userId){
		
		return this.baseStudentMapper.queryBaseStudentByUserId(userId);

	}
	
	
				
	
	/**
	 * 根据IDS查询所有基础模块-学生信息信息
	 * @param map
	 * @return
	 */
	public List<BaseStudentVo> queryBaseStudentByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.baseStudentMapper.queryBaseStudentByIds(map);
	}
	

	/**
	 * 根据条件查询所有基础模块-学生信息信息
	 * @param map
	 * @return
	 */
	public List<BaseStudentVo> queryBaseStudentBySearch(BaseStudentSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("userId",search.getUserId());
  		map.put("classesId",search.getClassesId());
  		map.put("areaId",search.getAreaId());
  		map.put("schoolId",search.getSchoolId());
  		map.put("gradeId",search.getGradeId());

		return this.baseStudentMapper.queryBaseStudentBySearch(map);
	}
	
	
	/**
	 * 根据条件查询基础模块-学生信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseStudentTotalCount(BaseStudentSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("schoolId",search.getSchoolId());
  		map.put("gradeId",search.getGradeId());
  		map.put("classesId",search.getClassesId());
  		map.put("teacherId",search.getTeacherId());
		
		return this.baseStudentMapper.queryBaseStudentTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseStudentPage(PageBean pb,BaseStudentSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("schoolId",search.getSchoolId());
  		map.put("gradeId",search.getGradeId());
  		map.put("classesId",search.getClassesId());
  		map.put("teacherId",search.getTeacherId());
  		
        // 设置PageBean的行数参数
        pb.setRows(this.baseStudentMapper.queryBaseStudentTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseStudentMapper.queryBaseStudentPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除基础模块-学生信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseStudentById(BaseStudentBean bean){
		return this.baseStudentMapper.deleteBaseStudentById(bean);
	}
	
				
	/**
	 * (更新)根据ID更新所有基础模块-学生信息信息
	 * @param bean
	 * @return
	 */
	public int updateBaseStudentById(BaseStudentBean bean){
		
		return this.baseStudentMapper.updateBaseStudentById(bean);
		
	}
	
				
	
	/**
	 * (增加)增加基础模块-学生信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseStudent(BaseStudentBean bean){
	
		
		return this.baseStudentMapper.insertBaseStudent(bean);
		
	}
	
	
	
}
