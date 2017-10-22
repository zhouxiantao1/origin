package com.sjq.security.service;

import java.util.List;
import java.util.Map;

import com.sjq.security.bean.SecurityRole;
import com.sjq.security.search.SecurityRoleSearch;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象角色管理service层
 * @author Zheng.ZeJie
 * @since  
 * @version 1.0
 */
public interface SecurityRoleService {

	/**
	 * (查询)查询所有的信息
	 * @return 查询到的结果列表
	 */
	List<SecurityRole> selectAll();
	
	/**
	 * (查询)根据ID查询所有信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	SecurityRole queryRoleById(Long id);
	
	/**
	 * (查询)根据IDS查询所有信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<SecurityRole> queryRoleByIds(Long[] ids);

	/**
	 * (查询)根据条件查询所有信息 
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<SecurityRole> queryRoleBySearch(SecurityRoleSearch search);
	
	/**
	 * (查询)根据条件查询count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryTotalCount(SecurityRoleSearch search);
	
	
	/**
	 * （查询）分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryPage(PageBean pb,SecurityRoleSearch search);
	
	/**
	 * (删除)删除所有的 信息
	 * @return
	 */
	int deleteAll();
	
	/**
	 * (删除)根据ID删除信息
	 * @param id
	 * @return
	 */
	int deleteRoleById(Long id);
	
	/**
	 * (删除)根据IDS删除信息
	 * @param map
	 * @return
	 */
	int deleteRoleByIds(Long[] ids);
	
	/**
	 * (删除)根据条件删除信息
	 * @param map
	 * @return
	 */
	int deleteRoleBySearch(SecurityRoleSearch search);
	
	/**
	 * (更新)更新所有信息 (慎用)
	 * @param vo 
	 * @return
	 */
	int updateRole(SecurityRole vo);
	
	/**
	 * (更新)根据ID更新所有信息
	 * @param bean
	 * @return
	 */
	int updateRoleById(SecurityRole vo);
	
	/**
	 * (更新)根据IDS更新有信息
	 * @param map
	 * @return
	 */
	int updateRoleByIds(Long[] ids,SecurityRole vo);
	
	/**
	 * (更新)根据条件更新所有信息 
	 * @param map
	 * @return
	 */
	int updateRoleBySearch(SecurityRole vo,SecurityRoleSearch search);
	
	/**
	 * (增加)增加信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertRole(SecurityRole vo);
	
	
}