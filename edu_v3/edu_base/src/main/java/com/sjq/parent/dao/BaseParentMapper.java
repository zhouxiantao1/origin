package com.sjq.parent.dao;

import java.util.List;
import java.util.Map;
import com.sjq.parent.vo.BaseParentVo;
import com.sjq.parent.bean.BaseParentBean;

/**
 * [自动生成]抽象基础模块-家长信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-29 01:02:00
 * @version 1.0
 */
public interface BaseParentMapper {

	/**
	 * 查询所有的基础模块-家长信息信息
	 * @return 查询到的列表
	 */
	List<BaseParentVo> queryAllBaseParent();
	
	/**
	 * 根据userId查询基础模块-家长信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseParentVo queryBaseParentByUserId(Long userId);
	
	/**
	 * 根据ID查询基础模块-家长信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseParentVo queryBaseParentById(Long id);
	
	/**
	 * 根据条件查询所有基础模块-家长信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseParentVo> queryBaseParentBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询基础模块-家长信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseParentTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询基础模块-家长信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseParentPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除基础模块-家长信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseParentById(BaseParentBean bean);
	
	/**
	 * (增加)增加基础模块-家长信息信息
	 * @param bean 基础模块-家长信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseParent(BaseParentBean bean);

	
}