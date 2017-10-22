package com.sjq.staff.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.staff.dao.BaseStaffMapper;
import com.sjq.staff.service.BaseStaffService;
import com.sjq.staff.bean.BaseStaffBean;
import com.sjq.staff.search.BaseStaffSearch;
import com.sjq.staff.vo.BaseStaffVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现管理者信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-27 16:33:46
 * @version 1.0
 */
 
@Service("BaseStaffService")
public class BaseStaffServiceImpl implements BaseStaffService {
	

	@Autowired
	private BaseStaffMapper baseStaffMapper;
	
				
	/**
	 * 根据userId查询管理者信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseStaffVo queryBaseStaffByUserId(Long userId){
		return this.baseStaffMapper.queryBaseStaffByUserId(userId);
	}
	
	/**
	 * 根据ID查询管理者信息信息
	 * @return
	 */
	public BaseStaffVo queryBaseStaffById(Long id){
		
		return this.baseStaffMapper.queryBaseStaffById(id);

	}
	

	/**
	 * 根据条件查询所有管理者信息信息
	 * @param map
	 * @return
	 */
	public List<BaseStaffVo> queryBaseStaffBySearch(BaseStaffSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.baseStaffMapper.queryBaseStaffBySearch(map);
	}
	
	
	/**
	 * 根据条件查询管理者信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseStaffTotalCount(BaseStaffSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("areaId",search.getAreaId());
  		map.put("type",search.getType());
  		map.put("name",search.getName());
		
		return this.baseStaffMapper.queryBaseStaffTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseStaffPage(PageBean pb,BaseStaffSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("areaId",search.getAreaId());
  		map.put("type",search.getType());
  		map.put("name",search.getName());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseStaffMapper.queryBaseStaffTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseStaffMapper.queryBaseStaffPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (增加)增加管理者信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseStaff(BaseStaffBean bean){
	
		
		return this.baseStaffMapper.insertBaseStaff(bean);
		
	}
	
	
	
}
