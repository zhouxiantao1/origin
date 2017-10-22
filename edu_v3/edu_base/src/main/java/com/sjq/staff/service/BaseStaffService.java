package com.sjq.staff.service;

import java.util.List;
import java.util.Map;

import com.sjq.staff.bean.BaseStaffBean;
import com.sjq.staff.search.BaseStaffSearch;
import com.sjq.staff.vo.BaseStaffVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象管理者信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-27 16:33:46
 * @version 1.0
 */
 
public interface BaseStaffService {

	
	/**
	* 根据userId查询管理者信息信息
	* @param id 标识
	* @return   查询到的列表
	*/
	BaseStaffVo queryBaseStaffByUserId(Long userId);

	/**
	 * 根据ID查询管理者信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseStaffVo queryBaseStaffById(Long id);
				
				
	/**
	 * 根据条件查询所有管理者信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseStaffVo> queryBaseStaffBySearch(BaseStaffSearch search);
				
					
	/**
	 * 根据条件查询管理者信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseStaffTotalCount(BaseStaffSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseStaffPage(PageBean pb,BaseStaffSearch search);
				
				
	/**
	 * (增加)增加管理者信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseStaff(BaseStaffBean bean);
				
	
}