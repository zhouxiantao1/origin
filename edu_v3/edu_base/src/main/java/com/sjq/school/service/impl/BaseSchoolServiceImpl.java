package com.sjq.school.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.school.dao.BaseSchoolMapper;
import com.sjq.school.service.BaseSchoolService;
import com.sjq.school.bean.BaseSchoolBean;
import com.sjq.school.search.BaseSchoolSearch;
import com.sjq.school.vo.BaseSchoolVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现基础模块-学校信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 16:53:37
 * @version 1.0
 */
 
@Service("BaseSchoolService")
public class BaseSchoolServiceImpl implements BaseSchoolService {
	

	@Autowired
	private BaseSchoolMapper baseSchoolMapper;
	
	/**
	 * 查询所有的基础模块-学校信息信息
	 * @return
	 */
	public List<BaseSchoolVo> queryAllBaseSchool(){
		
		return this.baseSchoolMapper.queryAllBaseSchool();
	
	}
				
				
	
	/**
	 * 根据ID查询基础模块-学校信息信息
	 * @return
	 */
	public BaseSchoolVo queryBaseSchoolById(Long id){
		
		return this.baseSchoolMapper.queryBaseSchoolById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有基础模块-学校信息信息
	 * @param map
	 * @return
	 */
	public List<BaseSchoolVo> queryBaseSchoolByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.baseSchoolMapper.queryBaseSchoolByIds(map);
	}
	

	/**
	 * 根据条件查询所有基础模块-学校信息信息
	 * @param map
	 * @return
	 */
	public List<BaseSchoolVo> queryBaseSchoolBySearch(BaseSchoolSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("areaId",search.getAreaId());
		
		return this.baseSchoolMapper.queryBaseSchoolBySearch(map);
	}
	
	
	/**
	 * 根据条件查询基础模块-学校信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseSchoolTotalCount(BaseSchoolSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("areaId",search.getAreaId());
		
		return this.baseSchoolMapper.queryBaseSchoolTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseSchoolPage(PageBean pb,BaseSchoolSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("areaId",search.getAreaId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseSchoolMapper.queryBaseSchoolTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseSchoolMapper.queryBaseSchoolPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除基础模块-学校信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseSchoolById(BaseSchoolBean bean){
		return this.baseSchoolMapper.deleteBaseSchoolById(bean);
	}
	
				
	
	/**
	 * (删除)根据IDS删除基础模块-学校信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseSchoolByIds(BaseSchoolBean bean,Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseSchoolMapper.deleteBaseSchoolByIds(map);
	}
	
				
	
	/**
	 * (删除)根据条件删除基础模块-学校信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseSchoolBySearch(BaseSchoolBean bean,BaseSchoolSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.baseSchoolMapper.deleteBaseSchoolBySearch(map);
		
	}
	
				
	/**
	 * (更新)根据ID更新所有基础模块-学校信息信息
	 * @param bean
	 * @return
	 */
	public int updateBaseSchoolById(BaseSchoolBean bean){
		
		return this.baseSchoolMapper.updateBaseSchoolById(bean);
		
	}
	
				
	
	/**
	 * (更新)根据IDS更新基础模块-学校信息信息
	 * @param map
	 * @return
	 */
	public int updateBaseSchoolByIds(Long[] ids,BaseSchoolBean bean){
		
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseSchoolMapper.updateBaseSchoolByIds(map);
	}
	
				
	
	/**
	 * (更新)根据条件更新所有基础模块-学校信息信息
	 * @param map
	 * @return
	 */
	public int updateBaseSchoolBySearch(BaseSchoolBean bean,BaseSchoolSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.baseSchoolMapper.updateBaseSchoolBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加基础模块-学校信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseSchool(BaseSchoolBean bean){
	
		
		return this.baseSchoolMapper.insertBaseSchool(bean);
		
	}
	
	/**
	 * 根据区域id给学校列表
	 * */
	public List<BaseSchoolVo> queryBaseSchoolByAreaId(Long areaId){
		return this.baseSchoolMapper.queryBaseSchoolByAreaId(areaId);
	}
	
}
