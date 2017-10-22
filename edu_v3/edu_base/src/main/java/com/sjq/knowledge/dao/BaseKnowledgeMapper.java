package com.sjq.knowledge.dao;

import java.util.List;
import java.util.Map;
import com.sjq.knowledge.vo.BaseKnowledgeVo;
import com.sjq.ware.dto.ZTreeNodesDto;
import com.sjq.knowledge.bean.BaseKnowledgeBean;

/**
 * [自动生成]抽象基础模块-知识点信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:33:27
 * @version 1.0
 */
public interface BaseKnowledgeMapper {
	
	/**
	 * (增加)增加基础模块-知识点信息信息
	 * @param bean 基础模块-知识点信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseKnowledge(BaseKnowledgeBean bean);

	/**
	 * 查询所有的基础模块-知识点信息信息
	 * @return 查询到的列表
	 */
	List<BaseKnowledgeVo> queryAllBaseKnowledge();
	
	/**
	 * 根据ID查询基础模块-知识点信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseKnowledgeVo queryBaseKnowledgeById(Long id);
	
	/**
	 * 根据IDS查询所有基础模块-知识点信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseKnowledgeVo> queryBaseKnowledgeByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有基础模块-知识点信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseKnowledgeVo> queryBaseKnowledgeBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询所有基础模块-知识点信息信息(树型）
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<ZTreeNodesDto> queryTreeNodesBaseKnowledgeBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询基础模块-知识点信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseKnowledgeTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询基础模块-知识点信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseKnowledgePage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除基础模块-知识点信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseKnowledgeById(BaseKnowledgeBean bean);
	
	/**
	 * (删除)根据IDS删除基础模块-知识点信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseKnowledgeByIds(Map<String, Object> map);
		
	/**
	 * (删除)根据条件删除基础模块-知识点信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseKnowledgeBySearch(Map<String, Object> map);
	
	/**
	 * (更新)根据ID更新所有基础模块-知识点信息信息
	 * @param bean 基础模块-知识点信息实体
	 * @return     受更新影响的行数
	 */
	int updateBaseKnowledgeById(BaseKnowledgeBean bean);
	
	/**
	 * (更新)根据IDS更新所有基础模块-知识点信息信息
	 * @param map 封装更新参数(ids) 
	 * @return    受更新影响的行数
	 */
	int updateBaseKnowledgeByIds(Map<String, Object> map);
	
	/**
	 * 根据父类ID获取子集
	 * */
	List<ZTreeNodesDto> queryBaseKnowledgeByParentId(Long parentId);
	
	
}