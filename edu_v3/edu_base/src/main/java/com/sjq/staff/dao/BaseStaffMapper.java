package com.sjq.staff.dao;

import java.util.List;
import java.util.Map;
import com.sjq.staff.vo.BaseStaffVo;
import com.sjq.staff.bean.BaseStaffBean;

/**
 * [自动生成]抽象管理者信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-27 16:33:46
 * @version 1.0
 */
public interface BaseStaffMapper {

	/**
	 * 根据userId查询管理者信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseStaffVo queryBaseStaffByUserId(Long userId);
	
	/**
	 * 根据ID查询管理者信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseStaffVo queryBaseStaffById(Long id);
	
	/**
	 * 根据条件查询所有管理者信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseStaffVo> queryBaseStaffBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询管理者信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseStaffTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询管理者信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseStaffPage(Map<String, Object> map);
	
	/**
	 * (增加)增加管理者信息信息
	 * @param bean 管理者信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseStaff(BaseStaffBean bean);

	
}