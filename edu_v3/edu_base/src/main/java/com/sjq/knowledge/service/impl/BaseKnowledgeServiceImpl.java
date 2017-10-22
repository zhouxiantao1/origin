package com.sjq.knowledge.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.knowledge.dao.BaseKnowledgeMapper;
import com.sjq.knowledge.service.BaseKnowledgeService;
import com.sjq.knowledge.bean.BaseKnowledgeBean;
import com.sjq.knowledge.search.BaseKnowledgeSearch;
import com.sjq.knowledge.vo.BaseKnowledgeVo;
import com.sjq.util.PageBean;
import com.sjq.ware.dto.ZTreeNodesDto;

/**
 * [自动生成]实现基础模块-知识点信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:33:27
 * @version 1.0
 */
 
@Service("BaseKnowledgeService")
public class BaseKnowledgeServiceImpl implements BaseKnowledgeService {
	

	@Autowired
	private BaseKnowledgeMapper baseKnowledgeMapper;
	
	/**
	 * (增加)增加基础模块-知识点信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseKnowledge(BaseKnowledgeBean bean){
	
		
		return this.baseKnowledgeMapper.insertBaseKnowledge(bean);
		
	}
	
	/**
	 * 查询所有的基础模块-知识点信息信息
	 * @return
	 */
	public List<BaseKnowledgeVo> queryAllBaseKnowledge(){
		
		return this.baseKnowledgeMapper.queryAllBaseKnowledge();
	
	}
				
				
	
	/**
	 * 根据ID查询基础模块-知识点信息信息
	 * @return
	 */
	public BaseKnowledgeVo queryBaseKnowledgeById(Long id){
		
		return this.baseKnowledgeMapper.queryBaseKnowledgeById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有基础模块-知识点信息信息
	 * @param map
	 * @return
	 */
	public List<BaseKnowledgeVo> queryBaseKnowledgeByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.baseKnowledgeMapper.queryBaseKnowledgeByIds(map);
	}
	

	/**
	 * 根据条件查询所有基础模块-知识点信息信息
	 * @param map
	 * @return
	 */
	public List<BaseKnowledgeVo> queryBaseKnowledgeBySearch(BaseKnowledgeSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("parentId",search.getParentId());
  		map.put("subjectId", search.getSubjectId());
  		map.put("stageId", search.getStageId());
  		map.put("gradeId", search.getGradeId());
		
		return this.baseKnowledgeMapper.queryBaseKnowledgeBySearch(map);
	}
	
	
	/**
	 * 根据条件查询基础模块-知识点信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseKnowledgeTotalCount(BaseKnowledgeSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("parentId",search.getParentId());
  		map.put("subjectId", search.getSubjectId());
  		map.put("stageId", search.getStageId());
		
		return this.baseKnowledgeMapper.queryBaseKnowledgeTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseKnowledgePage(PageBean pb,BaseKnowledgeSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("parentId",search.getParentId());
  		map.put("subjectId", search.getSubjectId());
  		map.put("stageId", search.getStageId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseKnowledgeMapper.queryBaseKnowledgeTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseKnowledgeMapper.queryBaseKnowledgePage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除基础模块-知识点信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseKnowledgeById(BaseKnowledgeBean bean){
		return this.baseKnowledgeMapper.deleteBaseKnowledgeById(bean);
	}
	
				
	
	/**
	 * (删除)根据IDS删除基础模块-知识点信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseKnowledgeByIds(BaseKnowledgeBean bean,Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseKnowledgeMapper.deleteBaseKnowledgeByIds(map);
	}
	
				
	
	/**
	 * (删除)根据条件删除基础模块-知识点信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseKnowledgeBySearch(BaseKnowledgeBean bean,BaseKnowledgeSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.baseKnowledgeMapper.deleteBaseKnowledgeBySearch(map);
		
	}
	
				
	/**
	 * (更新)根据ID更新所有基础模块-知识点信息信息
	 * @param bean
	 * @return
	 */
	public int updateBaseKnowledgeById(BaseKnowledgeBean bean){
		
		return this.baseKnowledgeMapper.updateBaseKnowledgeById(bean);
		
	}
	
				
	
	/**
	 * (更新)根据IDS更新基础模块-知识点信息信息
	 * @param map
	 * @return
	 */
	public int updateBaseKnowledgeByIds(Long[] ids,BaseKnowledgeBean bean){
		
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseKnowledgeMapper.updateBaseKnowledgeByIds(map);
	}



	@Override
	public List<ZTreeNodesDto> queryTreeNodesBaseKnowledgeBySearch(BaseKnowledgeSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("subjectId", search.getSubjectId());
  		map.put("stageId", search.getStageId());
  		map.put("gradeId", search.getGradeId());
  		map.put("searchId", search.getId()==null?0L:search.getId());
  		map.put("parentId", 0L);
		
		return this.baseKnowledgeMapper.queryTreeNodesBaseKnowledgeBySearch(map);
	
	}
	
	/**
	 * 根据父类ID获取子集
	 * */
	public List<ZTreeNodesDto> queryBaseKnowledgeByParentId(Long parentId){
		return this.baseKnowledgeMapper.queryBaseKnowledgeByParentId(parentId);
	}
}
