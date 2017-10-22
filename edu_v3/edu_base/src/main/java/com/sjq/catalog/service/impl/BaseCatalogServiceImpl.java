package com.sjq.catalog.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.catalog.dao.BaseCatalogMapper;
import com.sjq.catalog.service.BaseCatalogService;
import com.sjq.catalog.bean.BaseCatalogBean;
import com.sjq.catalog.search.BaseCatalogSearch;
import com.sjq.catalog.vo.BaseCatalogVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现基础模块-目录信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 15:01:36
 * @version 1.0
 */
 
@Service("BaseCatalogService")
public class BaseCatalogServiceImpl implements BaseCatalogService {
	

	@Autowired
	private BaseCatalogMapper baseCatalogMapper;
	
	/**
	 * (增加)增加基础模块-目录信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseCatalog(BaseCatalogBean bean){
	
		
		return this.baseCatalogMapper.insertBaseCatalog(bean);
		
	}
	
	/**
	 * 查询所有的基础模块-目录信息信息
	 * @return
	 */
	public List<BaseCatalogVo> queryAllBaseCatalog(){
		
		return this.baseCatalogMapper.queryAllBaseCatalog();
	
	}
				
				
	
	/**
	 * 根据ID查询基础模块-目录信息信息
	 * @return
	 */
	public BaseCatalogVo queryBaseCatalogById(Long id){
		
		return this.baseCatalogMapper.queryBaseCatalogById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有基础模块-目录信息信息
	 * @param map
	 * @return
	 */
	public List<BaseCatalogVo> queryBaseCatalogByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.baseCatalogMapper.queryBaseCatalogByIds(map);
	}
	

	/**
	 * 根据条件查询所有基础模块-目录信息信息
	 * @param map
	 * @return
	 */
	public List<BaseCatalogVo> queryBaseCatalogBySearch(BaseCatalogSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("yearId",search.getYearId());
  		map.put("stageId",search.getStageId());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("termId",search.getTermId());
  		map.put("versionId",search.getVersionId());
		
		return this.baseCatalogMapper.queryBaseCatalogBySearch(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseCatalogPage(PageBean pb,BaseCatalogSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("yearId",search.getYearId());
  		map.put("stageId",search.getStageId());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("termId",search.getTermId());
  		map.put("versionId",search.getVersionId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseCatalogMapper.queryBaseCatalogTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseCatalogMapper.queryBaseCatalogPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除基础模块-目录信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseCatalogById(BaseCatalogBean bean){
		return this.baseCatalogMapper.deleteBaseCatalogById(bean);
	}
	
				
	
	/**
	 * (删除)根据IDS删除基础模块-目录信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseCatalogByIds(BaseCatalogBean bean,Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseCatalogMapper.deleteBaseCatalogByIds(map);
	}
	
				
	/**
	 * (更新)根据ID更新所有基础模块-目录信息信息
	 * @param bean
	 * @return
	 */
	public int updateBaseCatalogById(BaseCatalogBean bean){
		
		return this.baseCatalogMapper.updateBaseCatalogById(bean);
		
	}
	
	
	/**
	 * 根据条件查询基础模块-目录信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseCatalogTotalCount(BaseCatalogSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
  		map.put("yearId",search.getYearId());
  		map.put("stageId",search.getStageId());
  		map.put("subjectId",search.getSubjectId());
  		map.put("gradeId",search.getGradeId());
  		map.put("termId",search.getTermId());
  		map.put("versionId",search.getVersionId());
		
		return this.baseCatalogMapper.queryBaseCatalogTotalCount(map);
	}
	
	
	
}
