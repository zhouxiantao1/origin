package com.sjq.security.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.security.bean.SecurityUser;
import com.sjq.security.dao.SecurityUserMapper;
import com.sjq.security.search.SecurityUserSearch;
import com.sjq.security.service.SecurityUserService;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现角色管理service层
 * @author Zheng.ZeJie
 * @since  
 * @version 1.0
 */

@Service("SecurityUserService")
public class SecurityUserServiceImpl implements SecurityUserService {

	@Autowired
	private SecurityUserMapper securityUserMapper;
	
	/**
	 * (查询)查询所有的信息
	 * @return
	 */
	
	public List<SecurityUser> selectAll(){
		
		return this.securityUserMapper.selectAll();
	
	}
	
	/**
	 * (查询)根据ID查询所有信息
	 * @return
	 */
	
	public SecurityUser queryUserById(Long id){
		
		return securityUserMapper.queryUserById(id);

	}
	
	/**
	 * (查询)根据IDS查询所有信息
	 * @param map
	 * @return
	 */
	
	public List<SecurityUser> queryUserByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		List<SecurityUser> beanList =securityUserMapper.queryUserByIds(map);
		
		return beanList;
	}

	/**
	 * (查询)根据条件查询所有信息 
	 * @param map
	 * @return
	 */
	
	public List<SecurityUser> queryUserBySearch(SecurityUserSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code",search.getCode());
		map.put("name",search.getName());
		map.put("roleId", search.getRoleId());
		List<SecurityUser> beanList = this.securityUserMapper.queryUserBySearch(map);
		
		return beanList;
	}
	
	/**
	 * (查询)根据条件查询count总数
	 * @param map
	 * @return
	 */
	
	public int queryTotalCount(SecurityUserSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", search.getId());
		map.put("code",search.getCode());
		map.put("name",search.getName());
		
		return this.securityUserMapper.queryTotalCount(map);
	}
	
	
	/**
	 * （查询）分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	
	public PageBean queryPage(PageBean pb,SecurityUserSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
		map.put("code",search.getCode());
		map.put("name",search.getName());
		map.put("roleId", search.getRoleId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.securityUserMapper.queryTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.securityUserMapper.queryByPageBean(map));
           
        // 返回pageBean
        return pb;
		
	}
	
	/**
	 * (删除)删除所有的 信息
	 * @return
	 */
	
	public int deleteAll(){
		return this.securityUserMapper.deleteAll();
	}
	
	/**
	 * (删除)根据ID删除信息
	 * @param id
	 * @return
	 */
	
	public int deleteUserById(Long id){
		return this.securityUserMapper.deleteUserById(id);
	}
	
	/**
	 * (删除)根据IDS删除信息
	 * @param map
	 * @return
	 */
	
	public int deleteUserByIds(Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.securityUserMapper.deleteUserByIds(map);
	}
	
	/**
	 * (删除)根据条件删除信息
	 * @param map
	 * @return
	 */
	
	public int deleteUserBySearch(SecurityUserSearch search){
		return 0;
	}
	
	/**
	 * (更新)更新所有信息 (慎用)
	 * @param bean
	 * @return
	 */
	
	public int updateUser(SecurityUser bean){
		return securityUserMapper.updateUser(bean);
	}
	
	/**
	 * (更新)根据ID更新所有信息
	 * @param bean
	 * @return
	 */
	
	public int updateUserById(SecurityUser bean){
		
		return this.securityUserMapper.updateUserById(bean);
		
	}
	
	/**
	 * (更新)根据IDS更新有信息
	 * @param map
	 * @return
	 */
	
	public int updateUserByIds(Long[] ids,SecurityUser bean){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		map.put("createTime", bean.getCreateTime());
		map.put("createName", bean.getCreateUser());
		map.put("modTime", bean.getUpdateTime());
		map.put("modName", bean.getUpdateUser());
		
		return this.securityUserMapper.updateUserByIds(map);
	}
	
	/**
	 * (更新)根据条件更新所有信息 
	 * @param map
	 * @return
	 */
	
	public int updateUserBySearch(SecurityUser bean,SecurityUserSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.securityUserMapper.updateUserBySearch(map);
	}
	
	/**
	 * (增加)增加信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	
	public int insertUser(SecurityUser bean){
		
		return this.securityUserMapper.insertUser(bean);
		
	}

	public SecurityUser queryUserByCode(String code) {
		return securityUserMapper.queryUserByCode(code);
	}
	
	
}
