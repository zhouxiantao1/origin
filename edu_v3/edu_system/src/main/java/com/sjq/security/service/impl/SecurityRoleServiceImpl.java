package com.sjq.security.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.security.bean.SecurityRole;
import com.sjq.security.dao.SecurityRoleMapper;
import com.sjq.security.search.SecurityRoleSearch;
import com.sjq.security.service.SecurityRoleService;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现角色管理service层
 * @author Zheng.ZeJie
 * @since  
 * @version 1.0
 */

@Service("SecurityRoleService")
public class SecurityRoleServiceImpl implements SecurityRoleService {

	@Autowired
	private SecurityRoleMapper securityRoleMapper;
	
	/**
	 * (查询)查询所有的信息
	 * @return
	 */
	
	public List<SecurityRole> selectAll(){
		
		return this.securityRoleMapper.selectAll();
	
	}
	
	/**
	 * (查询)根据ID查询所有信息
	 * @return
	 */
	
	public SecurityRole queryRoleById(Long id){
		
		return securityRoleMapper.queryRoleById(id);

	}
	
	/**
	 * (查询)根据IDS查询所有信息
	 * @param map
	 * @return
	 */
	
	public List<SecurityRole> queryRoleByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		List<SecurityRole> beanList =securityRoleMapper.queryRoleByIds(map);
		
		return beanList;
	}

	/**
	 * (查询)根据条件查询所有信息 
	 * @param map
	 * @return
	 */
	
	public List<SecurityRole> queryRoleBySearch(SecurityRoleSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", search.getId());
		map.put("createTime", search.getCreateTime());
		map.put("createName", search.getCreateUser());
		map.put("modTime", search.getUpdateTime());
		map.put("modName", search.getUpdateUser());
		map.put("id",search.getId());
		map.put("createTime",search.getCreateTime());
		map.put("createUser",search.getCreateUser());
		map.put("updateTime",search.getUpdateTime());
		map.put("updateUser",search.getUpdateUser());
		map.put("code",search.getCode());
		map.put("name",search.getName());
		map.put("isVisible",search.getIsVisible());
		
		List<SecurityRole> beanList = this.securityRoleMapper.queryRoleBySearch(map);
		
		return beanList;
	}
	
	/**
	 * (查询)根据条件查询count总数
	 * @param map
	 * @return
	 */
	
	public int queryTotalCount(SecurityRoleSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", search.getId());
		map.put("createTime", search.getCreateTime());
		map.put("createName", search.getCreateUser());
		map.put("modTime", search.getUpdateTime());
		map.put("modName", search.getUpdateUser());
		map.put("id",search.getId());
		map.put("createTime",search.getCreateTime());
		map.put("createUser",search.getCreateUser());
		map.put("updateTime",search.getUpdateTime());
		map.put("updateUser",search.getUpdateUser());
		map.put("code",search.getCode());
		map.put("name",search.getName());
		map.put("isVisible",search.getIsVisible());
		
		return this.securityRoleMapper.queryTotalCount(map);
	}
	
	
	/**
	 * （查询）分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	
	public PageBean queryPage(PageBean pb,SecurityRoleSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", search.getId());
		map.put("createTime", search.getCreateTime());
		map.put("createName", search.getCreateUser());
		map.put("modTime", search.getUpdateTime());
		map.put("modName", search.getUpdateUser());
		map.put("id",search.getId());
		map.put("createTime",search.getCreateTime());
		map.put("createUser",search.getCreateUser());
		map.put("updateTime",search.getUpdateTime());
		map.put("updateUser",search.getUpdateUser());
		map.put("code",search.getCode());
		map.put("name",search.getName());
		map.put("isVisible",search.getIsVisible());
	
        // 设置PageBean的行数参数
        pb.setRows(this.securityRoleMapper.queryTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.securityRoleMapper.queryByPageBean(map));
           
        // 返回pageBean
        return pb;
		
	}
	
	/**
	 * (删除)删除所有的 信息
	 * @return
	 */
	
	public int deleteAll(){
		return this.securityRoleMapper.deleteAll();
	}
	
	/**
	 * (删除)根据ID删除信息
	 * @param id
	 * @return
	 */
	
	public int deleteRoleById(Long id){
		return this.securityRoleMapper.deleteRoleById(id);
	}
	
	/**
	 * (删除)根据IDS删除信息
	 * @param map
	 * @return
	 */
	
	public int deleteRoleByIds(Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.securityRoleMapper.deleteRoleByIds(map);
	}
	
	/**
	 * (删除)根据条件删除信息
	 * @param map
	 * @return
	 */
	
	public int deleteRoleBySearch(SecurityRoleSearch search){
		return 0;
	}
	
	/**
	 * (更新)更新所有信息 (慎用)
	 * @param bean
	 * @return
	 */
	
	public int updateRole(SecurityRole bean){
		return securityRoleMapper.updateRole(bean);
	}
	
	/**
	 * (更新)根据ID更新所有信息
	 * @param bean
	 * @return
	 */
	
	public int updateRoleById(SecurityRole bean){
		
		return this.securityRoleMapper.updateRoleById(bean);
		
	}
	
	/**
	 * (更新)根据IDS更新有信息
	 * @param map
	 * @return
	 */
	
	public int updateRoleByIds(Long[] ids,SecurityRole bean){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		map.put("createTime", bean.getCreateTime());
		map.put("createName", bean.getCreateUser());
		map.put("modTime", bean.getUpdateTime());
		map.put("modName", bean.getUpdateUser());
		
		return this.securityRoleMapper.updateRoleByIds(map);
	}
	
	/**
	 * (更新)根据条件更新所有信息 
	 * @param map
	 * @return
	 */
	
	public int updateRoleBySearch(SecurityRole bean,SecurityRoleSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.securityRoleMapper.updateRoleBySearch(map);
	}
	
	/**
	 * (增加)增加信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	
	public int insertRole(SecurityRole bean){
		
		return this.securityRoleMapper.insertRole(bean);
		
	}
	
	
}
