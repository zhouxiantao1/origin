package com.sjq.security.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.security.bean.SecurityUser;
import com.sjq.security.dao.SecurityUserMapper;

/**
 * [自动生成]角色管理DAO实现
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */
@Repository("SecurityUserMapper")
public class SecurityUserMapperImpl extends BasicSqlSupport implements SecurityUserMapper {

	/**
	 * (查询)查询所有的信息
	 * @return 查询到的列表
	 */
	public List<SecurityUser> selectAll(){
	     return this.selectList("com.sjq.security.dao.securityUserMapper.selectAll");
	}
	
	/**
	 * (查询)根据ID查询所有信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public SecurityUser queryUserById(Long id){
	    return this.selectOne("com.sjq.security.dao.securityUserMapper.queryUserById",id);
	}

	/**
	 * (查询)根据IDS查询所有信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<SecurityUser> queryUserByIds(Map<String, Object> map){
		return this.selectList("com.sjq.security.dao.securityUserMapper.queryUserByIds",map);
	}

	/**
	 * (查询)根据条件查询所有信息 
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	
	public List<SecurityUser> queryUserBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.security.dao.securityUserMapper.queryUserBySearch",map);
	}
	
	/**
	 * (查询)分页根据条件查询count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	
	public int queryTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.security.dao.securityUserMapper.queryTotalCount",map);
	}
	
	/**
	 * (查询)分布根据条件查询信息 
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	
	public List<Object> queryByPageBean(Map<String, Object> map){
		return this.selectList("com.sjq.security.dao.securityUserMapper.queryByPageBean",map);
	}
	
	/**
	 * (删除)删除所有的 信息
	 * @return  受删除影响的行数
	 */
	
	public int deleteAll(){
	    return this.delete("com.sjq.security.dao.securityUserMapper.deleteAll");
	}
	
	/**
	 * (删除)根据ID删除信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	
	public int deleteUserById(Long id){
		return this.delete("com.sjq.security.dao.securityUserMapper.deleteUserById",id);
	}
	
	/**
	 * (删除)根据IDS删除信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	
	public int deleteUserByIds(Map<String, Object> map){
		return this.delete("com.sjq.security.dao.securityUserMapper.deleteUserByIds",map);
	}
	
	/**
	 * (删除)根据条件删除信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	
	public int deleteUserBySearch(Map<String, Object> map){
		return this.delete("com.sjq.security.dao.securityUserMapper.deleteUserBySearch",map);
	}
	
	/**
	 * (更新)更新所有信息 (慎用)
	 * @param bean 角色管理实体
	 * @return     受更新影响的行数
	 */
	
	public int updateUser(SecurityUser bean){
	    return this.update("com.sjq.security.dao.securityUserMapper.updateUser", bean);
	}
	
	/**
	 * (更新)根据ID更新所有信息
	 * @param bean 角色管理实体
	 * @return     受更新影响的行数
	 */
	
	public int updateUserById(SecurityUser bean){
	    return this.update("com.sjq.security.dao.securityUserMapper.updateUserById", bean);
	}
	
	/**
	 * (更新)根据IDS更新有信息
	 * @param map 封装更新参数(ids) 
	 * @return    受更新影响的行数
	 */
	
	public int updateUserByIds(Map<String, Object> map){
	    return this.update("com.sjq.security.dao.securityUserMapper.updateUserByIds", map);
	}
	
	/**
	 * (更新)根据条件更新所有信息 
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	
	public int updateUserBySearch(Map<String, Object> map){
	    return this.update("com.sjq.security.dao.securityUserMapper.updateUserBySearch", map);
	}
	
	/**
	 * (增加)增加信息
	 * @param bean 角色管理实体
	 * @return     受增加影响的行数
	 */
	
	public int insertUser(SecurityUser bean){
		return this.insert("com.sjq.security.dao.securityUserMapper.insertUser", bean);
	}

	public SecurityUser queryUserByCode(String code) {
		 return this.selectOne("com.sjq.security.dao.securityUserMapper.queryUserByCode",code);
	}

}