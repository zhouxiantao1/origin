package com.sjq.staff.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.staff.vo.BaseStaffVo;
import com.sjq.staff.bean.BaseStaffBean;
import com.sjq.staff.dao.BaseStaffMapper;

/**
 * [自动生成]管理者信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-27 16:33:46
 * @version 1.0
 */
@Repository("BaseStaffMapper")
public class BaseStaffMapperImpl extends BasicSqlSupport implements BaseStaffMapper {
	
	
	/**
	 * 根据userId查询管理者信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseStaffVo queryBaseStaffByUserId(Long userId){
	    return this.selectOne("com.sjq.staff.dao.BaseStaffMapper.queryBaseStaffByUserId",userId);
	}
	
	/**
	 * 根据ID查询管理者信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseStaffVo queryBaseStaffById(Long id){
	    return this.selectOne("com.sjq.staff.dao.BaseStaffMapper.queryBaseStaffById",id);
	}

	/**
	 * 根据条件查询所有管理者信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseStaffVo>  queryBaseStaffBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.staff.dao.BaseStaffMapper.queryBaseStaffBySearch",map);
	}
	
	/**
	 * 根据条件查询管理者信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseStaffTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.staff.dao.BaseStaffMapper.queryBaseStaffTotalCount",map);
	}
	
	/**
	 * 分页查询管理者信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseStaffPage(Map<String, Object> map){
		return this.selectList("com.sjq.staff.dao.BaseStaffMapper.queryBaseStaffPage",map);
	}
	
	/**
	 * (增加)增加管理者信息信息
	 * @param bean 管理者信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseStaff(BaseStaffBean bean){
		return this.insert("com.sjq.staff.dao.BaseStaffMapper.insertBaseStaff", bean);
	}
	
	

}