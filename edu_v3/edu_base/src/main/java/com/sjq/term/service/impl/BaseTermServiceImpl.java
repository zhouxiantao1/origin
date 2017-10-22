package com.sjq.term.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.term.dao.BaseTermMapper;
import com.sjq.term.service.BaseTermService;
import com.sjq.term.bean.BaseTermBean;
import com.sjq.term.search.BaseTermSearch;
import com.sjq.term.vo.BaseTermVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现基础模块-学期信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:30:58
 * @version 1.0
 */
 
@Service("BaseTermService")
public class BaseTermServiceImpl implements BaseTermService {
	

	@Autowired
	private BaseTermMapper baseTermMapper;
	
	/**
	 * 查询所有的基础模块-学期信息信息
	 * @return
	 */
	public List<BaseTermVo> queryAllBaseTerm(){
		
		return this.baseTermMapper.queryAllBaseTerm();
	
	}
				
				
	
	/**
	 * 根据ID查询基础模块-学期信息信息
	 * @return
	 */
	public BaseTermVo queryBaseTermById(Long id){
		
		return this.baseTermMapper.queryBaseTermById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有基础模块-学期信息信息
	 * @param map
	 * @return
	 */
	public List<BaseTermVo> queryBaseTermByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.baseTermMapper.queryBaseTermByIds(map);
	}
	

	/**
	 * 根据条件查询所有基础模块-学期信息信息
	 * @param map
	 * @return
	 */
	public List<BaseTermVo> queryBaseTermBySearch(BaseTermSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
		
		return this.baseTermMapper.queryBaseTermBySearch(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseTermPage(PageBean pb,BaseTermSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseTermMapper.queryBaseTermTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseTermMapper.queryBaseTermPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除基础模块-学期信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseTermById(BaseTermBean bean){
		return this.baseTermMapper.deleteBaseTermById(bean);
	}
	
				
	
	/**
	 * (删除)根据IDS删除基础模块-学期信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseTermByIds(BaseTermBean bean,Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseTermMapper.deleteBaseTermByIds(map);
	}
	
				
	/**
	 * (更新)根据ID更新所有基础模块-学期信息信息
	 * @param bean
	 * @return
	 */
	public int updateBaseTermById(BaseTermBean bean){
		
		return this.baseTermMapper.updateBaseTermById(bean);
		
	}
	
	
	/**
	 * 根据条件查询基础模块-学期信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseTermTotalCount(BaseTermSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
		
		return this.baseTermMapper.queryBaseTermTotalCount(map);
	}
	
	
	
}
