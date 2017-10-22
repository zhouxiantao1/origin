package com.sjq.knowledge.service;

import java.util.List;
import java.util.Map;

import com.sjq.knowledge.bean.BaseKnowledgeBean;
import com.sjq.knowledge.search.BaseKnowledgeSearch;
import com.sjq.knowledge.vo.BaseKnowledgeVo;
import com.sjq.util.PageBean;
import com.sjq.ware.dto.ZTreeNodesDto;

/**
 * [自动生成]抽象基础模块-知识点信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:33:27
 * @version 1.0
 */
 
public interface BaseKnowledgeService {
	
	/**
	 * (增加)增加基础模块-知识点信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseKnowledge(BaseKnowledgeBean bean);
	
	/**
	 * 查询所有的基础模块-知识点信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseKnowledgeVo> queryAllBaseKnowledge();
				
				
	/**
	 * 根据ID查询基础模块-知识点信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseKnowledgeVo queryBaseKnowledgeById(Long id);
				
				
	/**
	 * 根据IDS查询所有基础模块-知识点信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseKnowledgeVo> queryBaseKnowledgeByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有基础模块-知识点信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseKnowledgeVo> queryBaseKnowledgeBySearch(BaseKnowledgeSearch search);
				
					
	/**
	 * 根据条件查询基础模块-知识点信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseKnowledgeTotalCount(BaseKnowledgeSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseKnowledgePage(PageBean pb,BaseKnowledgeSearch search);
				
				
	/**
	 * (删除)根据ID删除基础模块-知识点信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseKnowledgeById(BaseKnowledgeBean bean);
				
				
	/**
	 * (删除)根据IDS删除基础模块-知识点信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseKnowledgeByIds(BaseKnowledgeBean bean,Long[] ids);
				
								
	/**
	 * (删除)根据条件删除基础模块-知识点信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseKnowledgeBySearch(BaseKnowledgeBean bean,BaseKnowledgeSearch search);
				
				
	/**
	 * (更新)根据ID更新所有基础模块-知识点信息信息
	 * @param bean
	 * @return
	 */
	int updateBaseKnowledgeById(BaseKnowledgeBean bean);
				
				
	/**
	 * (更新)根据IDS更新基础模块-知识点信息信息
	 * @param map
	 * @return
	 */
	int updateBaseKnowledgeByIds(Long[] ids,BaseKnowledgeBean bean);
	
	
	/** 
	 * 根据条件查询所有基础模块-知识点信息信息(树型）
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<ZTreeNodesDto> queryTreeNodesBaseKnowledgeBySearch(BaseKnowledgeSearch search);
	
	/**
	 * 根据父类ID获取子集
	 * */
	List<ZTreeNodesDto> queryBaseKnowledgeByParentId(Long parentId);			
	
}