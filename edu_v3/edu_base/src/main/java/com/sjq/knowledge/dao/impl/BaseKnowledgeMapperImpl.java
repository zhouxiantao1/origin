package com.sjq.knowledge.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.ware.dto.ZTreeNodesDto;
import com.sjq.knowledge.vo.BaseKnowledgeVo;
import com.sjq.knowledge.bean.BaseKnowledgeBean;
import com.sjq.knowledge.dao.BaseKnowledgeMapper;

/**
 * [自动生成]基础模块-知识点信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:33:27
 * @version 1.0
 */
@Repository("BaseKnowledgeMapper")
public class BaseKnowledgeMapperImpl extends BasicSqlSupport implements BaseKnowledgeMapper {
	
	/**
	 * (增加)增加基础模块-知识点信息信息
	 * @param bean 基础模块-知识点信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseKnowledge(BaseKnowledgeBean bean){
		return this.insert("com.sjq.knowledge.dao.BaseKnowledgeMapper.insertBaseKnowledge", bean);
	}
	
	/**
	 * 查询所有的基础模块-知识点信息信息
	 * @return 查询到的列表
	 */
	public List<BaseKnowledgeVo> queryAllBaseKnowledge(){
	     return this.selectList("com.sjq.knowledge.dao.BaseKnowledgeMapper.queryAllBaseKnowledge");
	}
				
	/**
	 * 根据ID查询基础模块-知识点信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseKnowledgeVo queryBaseKnowledgeById(Long id){
	    return this.selectOne("com.sjq.knowledge.dao.BaseKnowledgeMapper.queryBaseKnowledgeById",id);
	}

	/**
	 * 根据IDS查询所有基础模块-知识点信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseKnowledgeVo>  queryBaseKnowledgeByIds(Map<String, Object> map){
		return this.selectList("com.sjq.knowledge.dao.BaseKnowledgeMapper.queryBaseKnowledgeByIds",map);
	}

	/**
	 * 根据条件查询所有基础模块-知识点信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseKnowledgeVo>  queryBaseKnowledgeBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.knowledge.dao.BaseKnowledgeMapper.queryBaseKnowledgeBySearch",map);
	}
	
	/**
	 * 根据条件查询基础模块-知识点信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseKnowledgeTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.knowledge.dao.BaseKnowledgeMapper.queryBaseKnowledgeTotalCount",map);
	}
	
	/**
	 * 分页查询基础模块-知识点信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseKnowledgePage(Map<String, Object> map){
		return this.selectList("com.sjq.knowledge.dao.BaseKnowledgeMapper.queryBaseKnowledgePage",map);
	}
	
	/**
	 * (删除)根据ID删除基础模块-知识点信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseKnowledgeById(BaseKnowledgeBean bean){
		return this.delete("com.sjq.knowledge.dao.BaseKnowledgeMapper.deleteBaseKnowledgeById",bean);
	}
	
	/**
	 * (删除)根据IDS删除基础模块-知识点信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseKnowledgeByIds(Map<String, Object> map){
		return this.delete("com.sjq.knowledge.dao.BaseKnowledgeMapper.deleteBaseKnowledgeByIds",map);
	}
	
	/**
	 * (删除)根据条件删除基础模块-知识点信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseKnowledgeBySearch(Map<String, Object> map){
		return this.delete("com.sjq.knowledge.dao.BaseKnowledgeMapper.deleteBaseKnowledgeBySearch",map);
	}
	
	/**
	 * (更新)根据ID更新所有基础模块-知识点信息信息
	 * @param bean 基础模块-知识点信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateBaseKnowledgeById(BaseKnowledgeBean bean){
	    return this.update("com.sjq.knowledge.dao.BaseKnowledgeMapper.updateBaseKnowledgeById", bean);
	}
	
	/**
	 * (更新)根据IDS更新所有基础模块-知识点信息信息
	 * @param map 封装更新参数(ids) 
	 * @return    受更新影响的行数
	 */
	public int  updateBaseKnowledgeByIds(Map<String, Object> map){
	    return this.update("com.sjq.knowledge.dao.BaseKnowledgeMapper.updateBaseKnowledgeByIds", map);
	}

	@Override
	public List<ZTreeNodesDto> queryTreeNodesBaseKnowledgeBySearch(Map<String, Object> map) {
		return this.selectList("com.sjq.knowledge.dao.BaseKnowledgeMapper.queryTreeNodesBaseKnowledgeBySearch",map);
	}
	
	/**
	 * 根据父类ID获取子集
	 * */
	public List<ZTreeNodesDto> queryBaseKnowledgeByParentId(Long parentId) {
		return this.selectList("com.sjq.knowledge.dao.BaseKnowledgeMapper.queryBaseKnowledgeByParentId1",parentId);
	}
	

}