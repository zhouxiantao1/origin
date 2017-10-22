package com.sjq.knowledgeCatalogDetail.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.knowledgeCatalogDetail.dao.BaseKnowledgeCatalogDetailMapper;
import com.sjq.knowledgeCatalogDetail.service.BaseKnowledgeCatalogDetailService;
import com.sjq.knowledgeCatalogDetail.bean.BaseKnowledgeCatalogDetailBean;
import com.sjq.knowledgeCatalogDetail.search.BaseKnowledgeCatalogDetailSearch;
import com.sjq.knowledgeCatalogDetail.vo.BaseKnowledgeCatalogDetailVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现知识点目录详情信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-01 11:35:00
 * @version 1.0
 */
 
@Service("BaseKnowledgeCatalogDetailService")
public class BaseKnowledgeCatalogDetailServiceImpl implements BaseKnowledgeCatalogDetailService {
	

	@Autowired
	private BaseKnowledgeCatalogDetailMapper baseKnowledgeCatalogDetailMapper;
	
	/**
	 * 查询所有的知识点目录详情信息信息
	 * @return
	 */
	public List<BaseKnowledgeCatalogDetailVo> queryAllBaseKnowledgeCatalogDetail(){
		
		return this.baseKnowledgeCatalogDetailMapper.queryAllBaseKnowledgeCatalogDetail();
	
	}
				
				
	
	/**
	 * 根据ID查询知识点目录详情信息信息
	 * @return
	 */
	public BaseKnowledgeCatalogDetailVo queryBaseKnowledgeCatalogDetailById(Long id){
		
		return this.baseKnowledgeCatalogDetailMapper.queryBaseKnowledgeCatalogDetailById(id);

	}
	

	/**
	 * 根据条件查询所有知识点目录详情信息信息
	 * @param map
	 * @return
	 */
	public List<BaseKnowledgeCatalogDetailVo> queryBaseKnowledgeCatalogDetailBySearch(BaseKnowledgeCatalogDetailSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("catalogdetailId", search.getCatalogdetailId());
  		map.put("knowledgeId", search.getKnowledgeId());
		
		return this.baseKnowledgeCatalogDetailMapper.queryBaseKnowledgeCatalogDetailBySearch(map);
	}
	
	
	/**
	 * 根据条件查询知识点目录详情信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseKnowledgeCatalogDetailTotalCount(BaseKnowledgeCatalogDetailSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.baseKnowledgeCatalogDetailMapper.queryBaseKnowledgeCatalogDetailTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseKnowledgeCatalogDetailPage(PageBean pb,BaseKnowledgeCatalogDetailSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseKnowledgeCatalogDetailMapper.queryBaseKnowledgeCatalogDetailTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseKnowledgeCatalogDetailMapper.queryBaseKnowledgeCatalogDetailPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (增加)增加知识点目录详情信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseKnowledgeCatalogDetail(BaseKnowledgeCatalogDetailBean bean){
	
		
		return this.baseKnowledgeCatalogDetailMapper.insertBaseKnowledgeCatalogDetail(bean);
		
	}
	
	
	
}
