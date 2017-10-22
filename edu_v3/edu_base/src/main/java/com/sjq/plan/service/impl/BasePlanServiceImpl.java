package com.sjq.plan.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.plan.dao.BasePlanMapper;
import com.sjq.plan.service.BasePlanService;
import com.sjq.plan.bean.BasePlanBean;
import com.sjq.plan.search.BasePlanSearch;
import com.sjq.plan.vo.BasePlanVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现基础模块-学制信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 15:02:21
 * @version 1.0
 */
 
@Service("BasePlanService")
public class BasePlanServiceImpl implements BasePlanService {
	

	@Autowired
	private BasePlanMapper basePlanMapper;
	
	/**
	 * 查询所有的基础模块-学制信息信息
	 * @return
	 */
	public List<BasePlanVo> queryAllBasePlan(){
		
		return this.basePlanMapper.queryAllBasePlan();
	
	}
				
				
	
	/**
	 * 根据ID查询基础模块-学制信息信息
	 * @return
	 */
	public BasePlanVo queryBasePlanById(Long id){
		
		return this.basePlanMapper.queryBasePlanById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有基础模块-学制信息信息
	 * @param map
	 * @return
	 */
	public List<BasePlanVo> queryBasePlanByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.basePlanMapper.queryBasePlanByIds(map);
	}
	

	/**
	 * 根据条件查询所有基础模块-学制信息信息
	 * @param map
	 * @return
	 */
	public List<BasePlanVo> queryBasePlanBySearch(BasePlanSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
		
		return this.basePlanMapper.queryBasePlanBySearch(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBasePlanPage(PageBean pb,BasePlanSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
	
        // 设置PageBean的行数参数
        pb.setRows(this.basePlanMapper.queryBasePlanTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.basePlanMapper.queryBasePlanPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除基础模块-学制信息信息
	 * @param id
	 * @return
	 */
	public int deleteBasePlanById(BasePlanBean bean){
		return this.basePlanMapper.deleteBasePlanById(bean);
	}
	
				
	
	/**
	 * (删除)根据IDS删除基础模块-学制信息信息
	 * @param map
	 * @return
	 */
	public int deleteBasePlanByIds(BasePlanBean bean,Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.basePlanMapper.deleteBasePlanByIds(map);
	}
	
				
	/**
	 * (更新)根据ID更新所有基础模块-学制信息信息
	 * @param bean
	 * @return
	 */
	public int updateBasePlanById(BasePlanBean bean){
		
		return this.basePlanMapper.updateBasePlanById(bean);
		
	}
	
	
	/**
	 * 根据条件查询基础模块-学制信息count总数
	 * @param map
	 * @return
	 */
	public int queryBasePlanTotalCount(BasePlanSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
		
		return this.basePlanMapper.queryBasePlanTotalCount(map);
	}
	
	
	
}
