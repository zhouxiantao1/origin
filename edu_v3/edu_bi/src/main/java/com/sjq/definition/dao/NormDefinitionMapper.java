package com.sjq.definition.dao;

import java.util.List;
import java.util.Map;
import com.sjq.definition.vo.NormDefinitionVo;
import com.sjq.util.PageBean;
import com.sjq.definition.bean.NormDefinitionBean;
import com.sjq.definition.search.NormDefinitionSearch;

/**
 * [自动生成]抽象常模管理-常模定义Dao层
 * @author  ShuiJingQiu
 * @since   2017-07-06 16:04:08
 * @version 1.0
 */
public interface NormDefinitionMapper {


	/**
	 * 根据ID查询常模管理-常模定义信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	NormDefinitionVo queryNormDefinitionById(Long id);
	
	/**
	 * 根据条件查询所有常模管理-常模定义信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<NormDefinitionVo> queryNormDefinitionBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询常模管理-常模定义count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryNormDefinitionTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询常模管理-常模定义
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryNormDefinitionPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除常模管理-常模定义信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteNormDefinitionById(NormDefinitionBean bean);
	
	/**
	 * (删除)根据条件删除常模管理-常模定义信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteNormDefinitionBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加常模管理-常模定义信息
	 * @param bean 常模管理-常模定义实体
	 * @return     受增加影响的行数
	 */
	int insertNormDefinition(NormDefinitionBean bean);

	List<Object> queryNormDefinitionPageBySearch(Map<String, Object> map);
	
	int queryNormBySearchTotalCount(Map<String, Object> map);
}