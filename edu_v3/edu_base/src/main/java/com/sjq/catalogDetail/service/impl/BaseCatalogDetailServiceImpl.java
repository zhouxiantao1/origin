package com.sjq.catalogDetail.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.catalogDetail.dao.BaseCatalogDetailMapper;
import com.sjq.catalogDetail.service.BaseCatalogDetailService;
import com.sjq.catalogDetail.bean.BaseCatalogDetailBean;
import com.sjq.catalogDetail.search.BaseCatalogDetailSearch;
import com.sjq.catalogDetail.vo.BaseCatalogDetailVo;
import com.sjq.util.PageBean;
import com.sjq.ware.dto.ZTreeNodesDto;

/**
 * [自动生成]实现基础模块-目录详情信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:34:19
 * @version 1.0
 */
 
@Service("BaseCatalogDetailService")
public class BaseCatalogDetailServiceImpl implements BaseCatalogDetailService {
	

	@Autowired
	private BaseCatalogDetailMapper baseCatalogDetailMapper;
	
	/**
	 * (增加)增加基础模块-目录详情信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseCatalogDetail(BaseCatalogDetailBean bean){
	
		
		return this.baseCatalogDetailMapper.insertBaseCatalogDetail(bean);
		
	}
	
	/**
	 * 查询所有的基础模块-目录详情信息信息
	 * @return
	 */
	public List<BaseCatalogDetailVo> queryAllBaseCatalogDetail(){
		
		return this.baseCatalogDetailMapper.queryAllBaseCatalogDetail();
	
	}
				
				
	
	/**
	 * 根据ID查询基础模块-目录详情信息信息
	 * @return
	 */
	public BaseCatalogDetailVo queryBaseCatalogDetailById(Long id){
		
		return this.baseCatalogDetailMapper.queryBaseCatalogDetailById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有基础模块-目录详情信息信息
	 * @param map
	 * @return
	 */
	public List<BaseCatalogDetailVo> queryBaseCatalogDetailByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.baseCatalogDetailMapper.queryBaseCatalogDetailByIds(map);
	}
	

	/**
	 * 根据条件查询所有基础模块-目录详情信息信息
	 * @param map
	 * @return
	 */
	public List<BaseCatalogDetailVo> queryBaseCatalogDetailBySearch(BaseCatalogDetailSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("termId", search.getTermId());
  		map.put("level", search.getLevel());
  		map.put("subjectId", search.getSubjectId());
  		map.put("yearId", search.getYearId());
  		map.put("stageId", search.getStageId());
  		map.put("gradeId", search.getGradeId());
  		map.put("versionId", search.getVersionId());
  		map.put("catalogId", search.getCatalogId());
  		map.put("parentId", search.getParentId());
  		
		return this.baseCatalogDetailMapper.queryBaseCatalogDetailBySearch(map);
	}
	
	
	/**
	 * 根据条件查询基础模块-目录详情信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseCatalogDetailTotalCount(BaseCatalogDetailSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.baseCatalogDetailMapper.queryBaseCatalogDetailTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseCatalogDetailPage(PageBean pb,BaseCatalogDetailSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseCatalogDetailMapper.queryBaseCatalogDetailTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseCatalogDetailMapper.queryBaseCatalogDetailPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除基础模块-目录详情信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseCatalogDetailById(BaseCatalogDetailBean bean){
		return this.baseCatalogDetailMapper.deleteBaseCatalogDetailById(bean);
	}
	
				
	
	/**
	 * (删除)根据IDS删除基础模块-目录详情信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseCatalogDetailByIds(BaseCatalogDetailBean bean,Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseCatalogDetailMapper.deleteBaseCatalogDetailByIds(map);
	}
	
				
	
	/**
	 * (删除)根据条件删除基础模块-目录详情信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseCatalogDetailBySearch(BaseCatalogDetailBean bean,BaseCatalogDetailSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.baseCatalogDetailMapper.deleteBaseCatalogDetailBySearch(map);
		
	}
	
				
	/**
	 * (更新)根据ID更新所有基础模块-目录详情信息信息
	 * @param bean
	 * @return
	 */
	public int updateBaseCatalogDetailById(BaseCatalogDetailBean bean){
		
		return this.baseCatalogDetailMapper.updateBaseCatalogDetailById(bean);
		
	}
	
				
	
	/**
	 * (更新)根据IDS更新基础模块-目录详情信息信息
	 * @param map
	 * @return
	 */
	public int updateBaseCatalogDetailByIds(Long[] ids,BaseCatalogDetailBean bean){
		
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseCatalogDetailMapper.updateBaseCatalogDetailByIds(map);
	}



	@Override
	public List<ZTreeNodesDto> queryTreeNodesBaseCatalogDetailBySearch(BaseCatalogDetailSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("subjectId", search.getSubjectId());
  		map.put("stageId", search.getStageId());
  		map.put("gradeId", search.getGradeId());
  		map.put("catalogId", search.getCatalogId());
  		map.put("versionId", search.getVersionId());
		return this.baseCatalogDetailMapper.queryTreeNodesBaseCatalogDetailBySearch(map);
	}
	
	
	
}
