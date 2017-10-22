package com.sjq.classes.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.classes.dao.BaseClassesMapper;
import com.sjq.classes.service.BaseClassesService;
import com.sjq.classes.bean.BaseClassesBean;
import com.sjq.classes.search.BaseClassesSearch;
import com.sjq.classes.vo.BaseClassesVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现基础模块-班级信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 17:17:25
 * @version 1.0
 */
 
@Service("BaseClassesService")
public class BaseClassesServiceImpl implements BaseClassesService {
	

	@Autowired
	private BaseClassesMapper baseClassesMapper;
	
	/**
	 * 根据学校ID查询基础模块-班级信息信息
	 * @return 查询到的列表
	 */
	public List<BaseClassesVo> queryBaseClassesBySchoolId(){
		return this.baseClassesMapper.queryBaseClassesBySchoolId();
	}
	
	/**
	 * 查询所有的基础模块-班级信息信息
	 * @return
	 */
	public List<BaseClassesVo> queryAllBaseClasses(){
		
		return this.baseClassesMapper.queryAllBaseClasses();
	
	}
				
				
	
	/**
	 * 根据ID查询基础模块-班级信息信息
	 * @return
	 */
	public BaseClassesVo queryBaseClassesById(Long id){
		
		return this.baseClassesMapper.queryBaseClassesById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有基础模块-班级信息信息
	 * @param map
	 * @return
	 */
	public List<BaseClassesVo> queryBaseClassesByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.baseClassesMapper.queryBaseClassesByIds(map);
	}
	

	/**
	 * 根据条件查询所有基础模块-班级信息信息
	 * @param map
	 * @return
	 */
	public List<BaseClassesVo> queryBaseClassesBySearch(BaseClassesSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("gradeId",search.getGradeId());
  		map.put("schoolId",search.getSchoolId());
		
		return this.baseClassesMapper.queryBaseClassesBySearch(map);
	}
	
	
	/**
	 * 根据条件查询基础模块-班级信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseClassesTotalCount(BaseClassesSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("gradeId",search.getGradeId());
  		map.put("schoolId",search.getSchoolId());
  		map.put("areaId",search.getAreaId());
		
		return this.baseClassesMapper.queryBaseClassesTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseClassesPage(PageBean pb,BaseClassesSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("gradeId",search.getGradeId());
  		map.put("schoolId",search.getSchoolId());
  		map.put("areaId",search.getAreaId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseClassesMapper.queryBaseClassesTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseClassesMapper.queryBaseClassesPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除基础模块-班级信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseClassesById(BaseClassesBean bean){
		return this.baseClassesMapper.deleteBaseClassesById(bean);
	}
	
				
	
	/**
	 * (删除)根据IDS删除基础模块-班级信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseClassesByIds(BaseClassesBean bean,Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseClassesMapper.deleteBaseClassesByIds(map);
	}
	
				
	
	/**
	 * (删除)根据条件删除基础模块-班级信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseClassesBySearch(BaseClassesBean bean,BaseClassesSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.baseClassesMapper.deleteBaseClassesBySearch(map);
		
	}
	
				
	/**
	 * (更新)根据ID更新所有基础模块-班级信息信息
	 * @param bean
	 * @return
	 */
	public int updateBaseClassesById(BaseClassesBean bean){
		
		return this.baseClassesMapper.updateBaseClassesById(bean);
		
	}
	
				
	
	/**
	 * (更新)根据IDS更新基础模块-班级信息信息
	 * @param map
	 * @return
	 */
	public int updateBaseClassesByIds(Long[] ids,BaseClassesBean bean){
		
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseClassesMapper.updateBaseClassesByIds(map);
	}
	
				
	
	/**
	 * (更新)根据条件更新所有基础模块-班级信息信息
	 * @param map
	 * @return
	 */
	public int updateBaseClassesBySearch(BaseClassesBean bean,BaseClassesSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.baseClassesMapper.updateBaseClassesBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加基础模块-班级信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseClasses(BaseClassesBean bean){
	
		
		return this.baseClassesMapper.insertBaseClasses(bean);
		
	}

	@Override
	public List<BaseClassesVo> queryBaseClassesByAreaId(BaseClassesSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("gradeId",search.getGradeId());
		map.put("areaId", search.getAreaId());
		return this.baseClassesMapper.queryBaseClassesByAreaId(map);
	}
	
	
	
}
