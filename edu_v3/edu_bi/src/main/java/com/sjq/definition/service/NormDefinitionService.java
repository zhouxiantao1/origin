package com.sjq.definition.service;

import java.util.List;
import java.util.Map;

import com.sjq.definition.bean.NormDefinitionBean;
import com.sjq.definition.search.NormDefinitionSearch;
import com.sjq.definition.vo.NormDefinitionVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象常模管理-常模定义service层
 * @author  ShuiJingQiu
 * @since   2017-07-06 16:04:08
 * @version 1.0
 */
 
public interface NormDefinitionService {

				
	/**
	 * 根据ID查询常模管理-常模定义信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	NormDefinitionVo queryNormDefinitionById(Long id);
				
				
	/**
	 * 根据条件查询所有常模管理-常模定义信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<NormDefinitionVo> queryNormDefinitionBySearch(NormDefinitionSearch search);
				
					
	/**
	 * 根据条件查询常模管理-常模定义count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryNormDefinitionTotalCount(NormDefinitionSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryNormDefinitionPage(PageBean pb,NormDefinitionSearch search);
				
				
	/**
	 * (删除)根据ID删除常模管理-常模定义信息
	 * @param id
	 * @return
	 */
	int deleteNormDefinitionById(NormDefinitionBean bean);
				
								
	/**
	 * (删除)根据条件删除常模管理-常模定义信息
	 * @param map
	 * @return
	 */
	int deleteNormDefinitionBySearch(NormDefinitionBean bean,NormDefinitionSearch search);
				
				
	/**
	 * (增加)增加常模管理-常模定义信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertNormDefinition(NormDefinitionBean bean);
				
	PageBean queryNormDefinitionPageBySearch(PageBean pb,NormDefinitionSearch search);
}