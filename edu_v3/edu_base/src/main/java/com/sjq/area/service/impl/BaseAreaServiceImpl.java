package com.sjq.area.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.area.dao.BaseAreaMapper;
import com.sjq.area.service.BaseAreaService;
import com.sjq.area.bean.BaseAreaBean;
import com.sjq.area.search.BaseAreaSearch;
import com.sjq.area.vo.BaseAreaVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现基础模块-区域信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 16:25:00
 * @version 1.0
 */
 
@Service("BaseAreaService")
public class BaseAreaServiceImpl implements BaseAreaService {
	

	@Autowired
	private BaseAreaMapper baseAreaMapper;
	
	
	/**
	 * (增加)增加基础模块-区域信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseArea(BaseAreaBean bean){
	
		
		return this.baseAreaMapper.insertBaseArea(bean);
		
	}
	
	/**
	 * 查询所有的基础模块-区域信息信息
	 * @return
	 */
	public List<BaseAreaVo> queryAllBaseArea(){
		
		return this.baseAreaMapper.queryAllBaseArea();
	
	}
				
				
	
	/**
	 * 根据ID查询基础模块-区域信息信息
	 * @return
	 */
	public BaseAreaVo queryBaseAreaById(Long id){
		
		return this.baseAreaMapper.queryBaseAreaById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有基础模块-区域信息信息
	 * @param map
	 * @return
	 */
	public List<BaseAreaVo> queryBaseAreaByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.baseAreaMapper.queryBaseAreaByIds(map);
	}
	

	/**
	 * 根据条件查询所有基础模块-区域信息信息
	 * @param map
	 * @return
	 */
	public List<BaseAreaVo> queryBaseAreaBySearch(BaseAreaSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("parentId",search.getParentId());
		
		return this.baseAreaMapper.queryBaseAreaBySearch(map);
	}
	
	
	/**
	 * 根据条件查询基础模块-区域信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseAreaTotalCount(BaseAreaSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("parentId",search.getParentId());
  		
		return this.baseAreaMapper.queryBaseAreaTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseAreaPage(PageBean pb,BaseAreaSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("parentId",search.getParentId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseAreaMapper.queryBaseAreaTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseAreaMapper.queryBaseAreaPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除基础模块-区域信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseAreaById(BaseAreaBean bean){
		return this.baseAreaMapper.deleteBaseAreaById(bean);
	}
	
				
	
	/**
	 * (删除)根据IDS删除基础模块-区域信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseAreaByIds(BaseAreaBean bean,Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseAreaMapper.deleteBaseAreaByIds(map);
	}
	
				
	/**
	 * (更新)根据ID更新所有基础模块-区域信息信息
	 * @param bean
	 * @return
	 */
	public int updateBaseAreaById(BaseAreaBean bean){
		
		return this.baseAreaMapper.updateBaseAreaById(bean);
		
	}
	
	/**
	 * 根据父类id获取区域列表
	 * */
	public List<BaseAreaVo> queryBaseAreaByParentId(Long parentId){
		return this.baseAreaMapper.queryBaseAreaByParentId(parentId);
	}
}
