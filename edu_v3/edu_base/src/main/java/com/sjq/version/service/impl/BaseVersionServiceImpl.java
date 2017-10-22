package com.sjq.version.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.version.dao.BaseVersionMapper;
import com.sjq.version.service.BaseVersionService;
import com.sjq.version.bean.BaseVersionBean;
import com.sjq.version.search.BaseVersionSearch;
import com.sjq.version.vo.BaseVersionVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现基础模块-版本信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:30:32
 * @version 1.0
 */
 
@Service("BaseVersionService")
public class BaseVersionServiceImpl implements BaseVersionService {
	

	@Autowired
	private BaseVersionMapper baseVersionMapper;
	
	/**
	 * 查询所有的基础模块-版本信息信息
	 * @return
	 */
	public List<BaseVersionVo> queryAllBaseVersion(){
		
		return this.baseVersionMapper.queryAllBaseVersion();
	
	}
				
				
	
	/**
	 * 根据ID查询基础模块-版本信息信息
	 * @return
	 */
	public BaseVersionVo queryBaseVersionById(Long id){
		
		return this.baseVersionMapper.queryBaseVersionById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有基础模块-版本信息信息
	 * @param map
	 * @return
	 */
	public List<BaseVersionVo> queryBaseVersionByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.baseVersionMapper.queryBaseVersionByIds(map);
	}
	

	/**
	 * 根据条件查询所有基础模块-版本信息信息
	 * @param map
	 * @return
	 */
	public List<BaseVersionVo> queryBaseVersionBySearch(BaseVersionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
		
		return this.baseVersionMapper.queryBaseVersionBySearch(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseVersionPage(PageBean pb,BaseVersionSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseVersionMapper.queryBaseVersionTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseVersionMapper.queryBaseVersionPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除基础模块-版本信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseVersionById(BaseVersionBean bean){
		return this.baseVersionMapper.deleteBaseVersionById(bean);
	}
	
				
	
	/**
	 * (删除)根据IDS删除基础模块-版本信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseVersionByIds(BaseVersionBean bean,Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseVersionMapper.deleteBaseVersionByIds(map);
	}
	
				
	/**
	 * (更新)根据ID更新所有基础模块-版本信息信息
	 * @param bean
	 * @return
	 */
	public int updateBaseVersionById(BaseVersionBean bean){
		
		return this.baseVersionMapper.updateBaseVersionById(bean);
		
	}
	
	
	/**
	 * 根据条件查询基础模块-版本信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseVersionTotalCount(BaseVersionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
		
		return this.baseVersionMapper.queryBaseVersionTotalCount(map);
	}
	
	
	
}
