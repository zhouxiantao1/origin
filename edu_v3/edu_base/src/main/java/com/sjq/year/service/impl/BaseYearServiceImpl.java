package com.sjq.year.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.year.dao.BaseYearMapper;
import com.sjq.year.service.BaseYearService;
import com.sjq.year.bean.BaseYearBean;
import com.sjq.year.search.BaseYearSearch;
import com.sjq.year.vo.BaseYearVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现基础模块-年份信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:29:37
 * @version 1.0
 */
 
@Service("BaseYearService")
public class BaseYearServiceImpl implements BaseYearService {
	

	@Autowired
	private BaseYearMapper baseYearMapper;
	
	/**
	 * 查询所有的基础模块-年份信息信息
	 * @return
	 */
	public List<BaseYearVo> queryAllBaseYear(){
		
		return this.baseYearMapper.queryAllBaseYear();
	
	}
				
				
	
	/**
	 * 根据ID查询基础模块-年份信息信息
	 * @return
	 */
	public BaseYearVo queryBaseYearById(Long id){
		
		return this.baseYearMapper.queryBaseYearById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有基础模块-年份信息信息
	 * @param map
	 * @return
	 */
	public List<BaseYearVo> queryBaseYearByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.baseYearMapper.queryBaseYearByIds(map);
	}
	

	/**
	 * 根据条件查询所有基础模块-年份信息信息
	 * @param map
	 * @return
	 */
	public List<BaseYearVo> queryBaseYearBySearch(BaseYearSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
		
		return this.baseYearMapper.queryBaseYearBySearch(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseYearPage(PageBean pb,BaseYearSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseYearMapper.queryBaseYearTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseYearMapper.queryBaseYearPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除基础模块-年份信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseYearById(BaseYearBean bean){
		return this.baseYearMapper.deleteBaseYearById(bean);
	}
	
				
	
	/**
	 * (删除)根据IDS删除基础模块-年份信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseYearByIds(BaseYearBean bean,Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseYearMapper.deleteBaseYearByIds(map);
	}
	
				
	/**
	 * (更新)根据ID更新所有基础模块-年份信息信息
	 * @param bean
	 * @return
	 */
	public int updateBaseYearById(BaseYearBean bean){
		
		return this.baseYearMapper.updateBaseYearById(bean);
		
	}
	
	
	/**
	 * 根据条件查询基础模块-年份信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseYearTotalCount(BaseYearSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
		
		return this.baseYearMapper.queryBaseYearTotalCount(map);
	}
	
	
	
}
