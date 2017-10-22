package com.sjq.teacherClasses.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.teacherClasses.dao.BaseTeacherClassesMapper;
import com.sjq.teacherClasses.service.BaseTeacherClassesService;
import com.sjq.teacherClasses.bean.BaseTeacherClassesBean;
import com.sjq.teacherClasses.search.BaseTeacherClassesSearch;
import com.sjq.teacherClasses.vo.BaseTeacherClassesVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现教师班级信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-27 15:29:16
 * @version 1.0
 */
 
@Service("BaseTeacherClassesService")
public class BaseTeacherClassesServiceImpl implements BaseTeacherClassesService {
	

	@Autowired
	private BaseTeacherClassesMapper baseTeacherClassesMapper;
	
	/**
	 * 根据老师ID查询教师班级信息获取不重复学科
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	public List<BaseTeacherClassesVo> querySubjectByteacherId(Long teacherId){
		return this.baseTeacherClassesMapper.querySubjectByteacherId(teacherId);
	}
	
	/**
	 * 根据老师ID查询教师班级信息获取不重复班级
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	public List<BaseTeacherClassesVo> queryClassesByteacherId(Long teacherId){
		return this.baseTeacherClassesMapper.queryClassesByteacherId(teacherId);
	}
	
	/**
	 * 根据老师ID查询教师班级信息获取不重复年级
	 * @param teacherId 标识
	 * @return   查询到的列表
	 */
	public List<BaseTeacherClassesVo> queryBaseTeacherClassesByteacherId(Long teacherId){
		return this.baseTeacherClassesMapper.queryBaseTeacherClassesByteacherId(teacherId);
	}			
	
	/**
	 * 根据ID查询教师班级信息信息
	 * @return
	 */
	public BaseTeacherClassesVo queryBaseTeacherClassesById(Long id){
		
		return this.baseTeacherClassesMapper.queryBaseTeacherClassesById(id);

	}
	

	/**
	 * 根据条件查询所有教师班级信息信息
	 * @param map
	 * @return
	 */
	public List<BaseTeacherClassesVo> queryBaseTeacherClassesBySearch(BaseTeacherClassesSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("teacherId",search.getTeacherId());
  		map.put("gradeId",search.getGradeId());
  		map.put("classesId",search.getClassesId());
  		map.put("subjectId",search.getSubjectId());
  		map.put("group",search.getGroup());
		
		return this.baseTeacherClassesMapper.queryBaseTeacherClassesBySearch(map);
	}
	
	
	/**
	 * 根据条件查询教师班级信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseTeacherClassesTotalCount(BaseTeacherClassesSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.baseTeacherClassesMapper.queryBaseTeacherClassesTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseTeacherClassesPage(PageBean pb,BaseTeacherClassesSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseTeacherClassesMapper.queryBaseTeacherClassesTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseTeacherClassesMapper.queryBaseTeacherClassesPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除教师班级信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseTeacherClassesById(BaseTeacherClassesBean bean){
		return this.baseTeacherClassesMapper.deleteBaseTeacherClassesById(bean);
	}
	
				
	
	/**
	 * (增加)增加教师班级信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseTeacherClasses(BaseTeacherClassesBean bean){
	
		
		return this.baseTeacherClassesMapper.insertBaseTeacherClasses(bean);
		
	}

	@Override
	public List<BaseTeacherClassesVo> queryDistinctBaseTeacherClassesBySearch(BaseTeacherClassesSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("teacherId",search.getTeacherId());
  		map.put("gradeId",search.getGradeId());
  		map.put("classesId",search.getClassesId());
  		map.put("subjectId",search.getSubjectId());
		
		return this.baseTeacherClassesMapper.queryDistinctBaseTeacherClassesBySearch(map);
	}
	
	
	
}
