package com.sjq.security.service;

import java.util.List;
import java.util.Map;

import com.sjq.security.bean.SecurityUser;
import com.sjq.security.search.SecurityUserSearch;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象角色管理service层
 * @author Zheng.ZeJie
 * @since  
 * @version 1.0
 */
public interface SecurityUserService {

	/**
	 * (查询)查询所有的信息
	 * @return 查询到的结果列表
	 */
	List<SecurityUser> selectAll();
	
	/**
	 * (查询)根据ID查询所有信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	SecurityUser queryUserById(Long id);
	
	/**
	 * (查询)根据code帐户查询所有信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	SecurityUser queryUserByCode(String code);
	
	/**
	 * (查询)根据IDS查询所有信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<SecurityUser> queryUserByIds(Long[] ids);

	/**
	 * (查询)根据条件查询所有信息 
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<SecurityUser> queryUserBySearch(SecurityUserSearch search);
	
	/**
	 * (查询)根据条件查询count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryTotalCount(SecurityUserSearch search);
	
	
	/**
	 * （查询）分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryPage(PageBean pb,SecurityUserSearch search);
	
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
	int deleteUserById(Long id);
	
	/**
	 * (删除)根据IDS删除信息
	 * @param map
	 * @return
	 */
	int deleteUserByIds(Long[] ids);
	
	/**
	 * (删除)根据条件删除信息
	 * @param map
	 * @return
	 */
	int deleteUserBySearch(SecurityUserSearch search);
	
	/**
	 * (更新)更新所有信息 (慎用)
	 * @param vo 
	 * @return
	 */
	int updateUser(SecurityUser vo);
	
	/**
	 * (更新)根据ID更新所有信息
	 * @param bean
	 * @return
	 */
	int updateUserById(SecurityUser vo);
	
	/**
	 * (更新)根据IDS更新有信息
	 * @param map
	 * @return
	 */
	int updateUserByIds(Long[] ids,SecurityUser vo);
	
	/**
	 * (更新)根据条件更新所有信息 
	 * @param map
	 * @return
	 */
	int updateUserBySearch(SecurityUser vo,SecurityUserSearch search);
	
	/**
	 * (增加)增加信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertUser(SecurityUser vo);
	
	
}