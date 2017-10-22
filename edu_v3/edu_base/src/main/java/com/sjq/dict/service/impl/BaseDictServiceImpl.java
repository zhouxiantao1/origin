package com.sjq.dict.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.dict.dao.BaseDictMapper;
import com.sjq.dict.service.BaseDictService;
import com.sjq.dict.bean.BaseDictBean;
import com.sjq.dict.search.BaseDictSearch;
import com.sjq.dict.vo.BaseDictVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现字典工具信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-27 18:11:47
 * @version 1.0
 */
 
@Service("BaseDictService")
public class BaseDictServiceImpl implements BaseDictService {
	

	@Autowired
	private BaseDictMapper baseDictMapper;
	
	/**
	 * 查询所有的字典工具信息信息
	 * @return
	 */
	public List<BaseDictVo> queryAllBaseDict(){
		
		return this.baseDictMapper.queryAllBaseDict();
	
	}
				
				
	
	/**
	 * 根据ID查询字典工具信息信息
	 * @return
	 */
	public BaseDictVo queryBaseDictById(Long id){
		
		return this.baseDictMapper.queryBaseDictById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有字典工具信息信息
	 * @param map
	 * @return
	 */
	public List<BaseDictVo> queryBaseDictByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.baseDictMapper.queryBaseDictByIds(map);
	}
	

	/**
	 * 根据条件查询所有字典工具信息信息
	 * @param map
	 * @return
	 */
	public List<BaseDictVo> queryBaseDictBySearch(BaseDictSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("type",search.getType());
		return this.baseDictMapper.queryBaseDictBySearch(map);
	}
	
	
	/**
	 * 根据条件查询字典工具信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseDictTotalCount(BaseDictSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.baseDictMapper.queryBaseDictTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseDictPage(PageBean pb,BaseDictSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseDictMapper.queryBaseDictTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseDictMapper.queryBaseDictPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除字典工具信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseDictById(BaseDictBean bean){
		return this.baseDictMapper.deleteBaseDictById(bean);
	}
	
				
	
	/**
	 * (增加)增加字典工具信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseDict(BaseDictBean bean){
	
		
		return this.baseDictMapper.insertBaseDict(bean);
		
	}
	
	
	
}
