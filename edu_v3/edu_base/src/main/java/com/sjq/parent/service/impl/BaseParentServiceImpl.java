package com.sjq.parent.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.parent.dao.BaseParentMapper;
import com.sjq.parent.service.BaseParentService;
import com.sjq.parent.bean.BaseParentBean;
import com.sjq.parent.search.BaseParentSearch;
import com.sjq.parent.vo.BaseParentVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现基础模块-家长信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-29 01:02:00
 * @version 1.0
 */
 
@Service("BaseParentService")
public class BaseParentServiceImpl implements BaseParentService {
	

	@Autowired
	private BaseParentMapper baseParentMapper;
	
	
	/**
	 * 查询所有的基础模块-家长信息信息
	 * @return
	 */
	public List<BaseParentVo> queryAllBaseParent(){
		
		return this.baseParentMapper.queryAllBaseParent();
	
	}
				
	/**
	 * 根据userId查询基础模块-家长信息信息
	 * @return
	 */
	public BaseParentVo queryBaseParentByUserId(Long userId){
		
		return this.baseParentMapper.queryBaseParentByUserId(userId);

	}			
	
	/**
	 * 根据ID查询基础模块-家长信息信息
	 * @return
	 */
	public BaseParentVo queryBaseParentById(Long id){
		
		return this.baseParentMapper.queryBaseParentById(id);

	}
	

	/**
	 * 根据条件查询所有基础模块-家长信息信息
	 * @param map
	 * @return
	 */
	public List<BaseParentVo> queryBaseParentBySearch(BaseParentSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("userId",search.getUserId());
  		
		return this.baseParentMapper.queryBaseParentBySearch(map);
	}
	
	
	/**
	 * 根据条件查询基础模块-家长信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseParentTotalCount(BaseParentSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
		
		return this.baseParentMapper.queryBaseParentTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseParentPage(PageBean pb,BaseParentSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseParentMapper.queryBaseParentTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseParentMapper.queryBaseParentPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除基础模块-家长信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseParentById(BaseParentBean bean){
		return this.baseParentMapper.deleteBaseParentById(bean);
	}
	
				
	
	/**
	 * (增加)增加基础模块-家长信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseParent(BaseParentBean bean){
	
		
		return this.baseParentMapper.insertBaseParent(bean);
		
	}
	
	
	
}
