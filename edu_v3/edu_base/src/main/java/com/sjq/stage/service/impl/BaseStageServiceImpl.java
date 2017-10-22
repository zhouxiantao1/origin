package com.sjq.stage.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.stage.dao.BaseStageMapper;
import com.sjq.stage.service.BaseStageService;
import com.sjq.stage.bean.BaseStageBean;
import com.sjq.stage.search.BaseStageSearch;
import com.sjq.stage.vo.BaseStageVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现基础模块-学段信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:27:20
 * @version 1.0
 */
 
@Service("BaseStageService")
public class BaseStageServiceImpl implements BaseStageService {
	

	@Autowired
	private BaseStageMapper baseStageMapper;
	
	/**
	 * 查询所有的基础模块-学段信息信息
	 * @return
	 */
	public List<BaseStageVo> queryAllBaseStage(){
		
		return this.baseStageMapper.queryAllBaseStage();
	
	}
				
				
	
	/**
	 * 根据ID查询基础模块-学段信息信息
	 * @return
	 */
	public BaseStageVo queryBaseStageById(Long id){
		
		return this.baseStageMapper.queryBaseStageById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有基础模块-学段信息信息
	 * @param map
	 * @return
	 */
	public List<BaseStageVo> queryBaseStageByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.baseStageMapper.queryBaseStageByIds(map);
	}
	

	/**
	 * 根据条件查询所有基础模块-学段信息信息
	 * @param map
	 * @return
	 */
	public List<BaseStageVo> queryBaseStageBySearch(BaseStageSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
		
		return this.baseStageMapper.queryBaseStageBySearch(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseStagePage(PageBean pb,BaseStageSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseStageMapper.queryBaseStageTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseStageMapper.queryBaseStagePage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除基础模块-学段信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseStageById(BaseStageBean bean){
		return this.baseStageMapper.deleteBaseStageById(bean);
	}
	
				
	
	/**
	 * (删除)根据IDS删除基础模块-学段信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseStageByIds(BaseStageBean bean,Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseStageMapper.deleteBaseStageByIds(map);
	}
	
				
	/**
	 * (更新)根据ID更新所有基础模块-学段信息信息
	 * @param bean
	 * @return
	 */
	public int updateBaseStageById(BaseStageBean bean){
		
		return this.baseStageMapper.updateBaseStageById(bean);
		
	}
	
	
	/**
	 * 根据条件查询基础模块-学段信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseStageTotalCount(BaseStageSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
		
		return this.baseStageMapper.queryBaseStageTotalCount(map);
	}
	
	
	
}
