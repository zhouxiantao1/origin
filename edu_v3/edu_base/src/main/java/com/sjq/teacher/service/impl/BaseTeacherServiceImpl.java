package com.sjq.teacher.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.teacher.dao.BaseTeacherMapper;
import com.sjq.teacher.service.BaseTeacherService;
import com.sjq.teacher.bean.BaseTeacherBean;
import com.sjq.teacher.search.BaseTeacherSearch;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现教师信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-27 16:06:01
 * @version 1.0
 */
 
@Service("BaseTeacherService")
public class BaseTeacherServiceImpl implements BaseTeacherService {
	

	@Autowired
	private BaseTeacherMapper baseTeacherMapper;
	
	/**
	 * 根据ID查询教师信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseTeacherVo queryBaseTeacherByUserId(Long userId){
		return this.baseTeacherMapper.queryBaseTeacherByUserId(userId);
	}			
	
	/**
	 * 根据ID查询教师信息信息
	 * @return
	 */
	public BaseTeacherVo queryBaseTeacherById(Long id){
		
		return this.baseTeacherMapper.queryBaseTeacherById(id);

	}
	

	/**
	 * 根据条件查询所有教师信息信息
	 * @param map
	 * @return
	 */
	public List<BaseTeacherVo> queryBaseTeacherBySearch(BaseTeacherSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("schoolId",search.getSchoolId());
  		map.put("degree",search.getDegree());
  		map.put("name",search.getName());
  		map.put("delflag",search.getDelflag());
  		
		
		return this.baseTeacherMapper.queryBaseTeacherBySearch(map);
	}
	
	
	/**
	 * 根据条件查询教师信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseTeacherTotalCount(BaseTeacherSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
		
		return this.baseTeacherMapper.queryBaseTeacherTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseTeacherPage(PageBean pb,BaseTeacherSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseTeacherMapper.queryBaseTeacherTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseTeacherMapper.queryBaseTeacherPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除教师信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseTeacherById(BaseTeacherBean bean){
		return this.baseTeacherMapper.deleteBaseTeacherById(bean);
	}
	
				
	
	/**
	 * (增加)增加教师信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseTeacher(BaseTeacherBean bean){
	
		
		return this.baseTeacherMapper.insertBaseTeacher(bean);
		
	}
	
	
	
}
