package com.sjq.parent.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.parent.vo.BaseParentVo;
import com.sjq.parent.bean.BaseParentBean;
import com.sjq.parent.dao.BaseParentMapper;

/**
 * [自动生成]基础模块-家长信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-29 01:02:00
 * @version 1.0
 */
@Repository("BaseParentMapper")
public class BaseParentMapperImpl extends BasicSqlSupport implements BaseParentMapper {
	
	
	/**
	 * 查询所有的基础模块-家长信息信息
	 * @return 查询到的列表
	 */
	public List<BaseParentVo> queryAllBaseParent(){
	     return this.selectList("com.sjq.parent.dao.BaseParentMapper.queryAllBaseParent");
	}
	
	/**
	 * 根据userId查询基础模块-家长信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseParentVo queryBaseParentByUserId(Long userId){
	    return this.selectOne("com.sjq.parent.dao.BaseParentMapper.queryBaseParentByUserId",userId);
	}
				
	/**
	 * 根据ID查询基础模块-家长信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseParentVo queryBaseParentById(Long id){
	    return this.selectOne("com.sjq.parent.dao.BaseParentMapper.queryBaseParentById",id);
	}

	/**
	 * 根据条件查询所有基础模块-家长信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseParentVo>  queryBaseParentBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.parent.dao.BaseParentMapper.queryBaseParentBySearch",map);
	}
	
	/**
	 * 根据条件查询基础模块-家长信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseParentTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.parent.dao.BaseParentMapper.queryBaseParentTotalCount",map);
	}
	
	/**
	 * 分页查询基础模块-家长信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseParentPage(Map<String, Object> map){
		return this.selectList("com.sjq.parent.dao.BaseParentMapper.queryBaseParentPage",map);
	}
	
	/**
	 * (删除)根据ID删除基础模块-家长信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseParentById(BaseParentBean bean){
		return this.delete("com.sjq.parent.dao.BaseParentMapper.deleteBaseParentById",bean);
	}
	
	/**
	 * (增加)增加基础模块-家长信息信息
	 * @param bean 基础模块-家长信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseParent(BaseParentBean bean){
		return this.insert("com.sjq.parent.dao.BaseParentMapper.insertBaseParent", bean);
	}
	
	

}