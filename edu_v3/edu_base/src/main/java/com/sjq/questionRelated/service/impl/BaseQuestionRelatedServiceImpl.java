package com.sjq.questionRelated.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.questionRelated.dao.BaseQuestionRelatedMapper;
import com.sjq.questionRelated.service.BaseQuestionRelatedService;
import com.sjq.questionRelated.bean.BaseQuestionRelatedBean;
import com.sjq.questionRelated.search.BaseQuestionRelatedSearch;
import com.sjq.questionRelated.vo.BaseQuestionRelatedVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现题目知识点目录信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-06 00:47:45
 * @version 1.0
 */
 
@Service("BaseQuestionRelatedService")
public class BaseQuestionRelatedServiceImpl implements BaseQuestionRelatedService {
	

	@Autowired
	private BaseQuestionRelatedMapper baseQuestionRelatedMapper;
	
				
	
	/**
	 * 根据ID查询题目知识点目录信息信息
	 * @return
	 */
	public BaseQuestionRelatedVo queryBaseQuestionRelatedById(Long id){
		
		return this.baseQuestionRelatedMapper.queryBaseQuestionRelatedById(id);

	}
	
	/**
	 * 根据IDS查询所有题目知识点目录信息信息
	 * @param map
	 * @return
	 */
	public List queryBaseQuestionRelatedByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map map = new HashMap();
		map.put("ids", ids);
		
		return this.baseQuestionRelatedMapper.queryBaseQuestionRelatedByIds(map);
	}

	/**
	 * 根据条件查询所有题目知识点目录信息信息
	 * @param map
	 * @return
	 */
	public List<BaseQuestionRelatedVo> queryBaseQuestionRelatedBySearch(BaseQuestionRelatedSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("relatedId",search.getRelatedId());
  		map.put("relatedType",search.getRelatedType());
  		map.put("questionId",search.getQuestionId());
  		map.put("relatedIds",search.getRelatedIds());
  		
		
		return this.baseQuestionRelatedMapper.queryBaseQuestionRelatedBySearch(map);
	}
	
	/**
	 * 根据条件查询题目知识点目录信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseQuestionRelatedTotalCount(BaseQuestionRelatedSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.baseQuestionRelatedMapper.queryBaseQuestionRelatedTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseQuestionRelatedPage(PageBean pb,BaseQuestionRelatedSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("relatedId",search.getRelatedId());
  		map.put("relatedType",search.getRelatedType());
  		map.put("questionId",search.getQuestionId());
  		map.put("relatedIds",search.getRelatedIds());

        // 设置PageBean的行数参数
        pb.setRows(this.baseQuestionRelatedMapper.queryBaseQuestionRelatedTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseQuestionRelatedMapper.queryBaseQuestionRelatedPage(map));
           
        // 返回pageBean
        return pb;
		
	}	
	
	/**
	 * (联合题目查询)根据条件查询题目知识点目录信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseQuestionRelatedTotalCount1(BaseQuestionRelatedSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.baseQuestionRelatedMapper.queryBaseQuestionRelatedTotalCount(map);
	}
	
				
	
	/**
	 * (联合题目查询)分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseQuestionRelatedPage1(PageBean pb,BaseQuestionRelatedSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("relatedId",search.getRelatedId());
  		map.put("relatedType",search.getRelatedType());
  		map.put("questionId",search.getQuestionId());
  		map.put("relatedIds",search.getRelatedIds());

        // 设置PageBean的行数参数
        pb.setRows(this.baseQuestionRelatedMapper.queryBaseQuestionRelatedTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseQuestionRelatedMapper.queryBaseQuestionRelatedPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
	/**
	 * (删除)根据ID删除题目知识点目录信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseQuestionRelatedById(BaseQuestionRelatedBean bean){
		return this.baseQuestionRelatedMapper.deleteBaseQuestionRelatedById(bean);
	}
	
				
	
	/**
	 * (更新)根据条件更新所有题目知识点目录信息信息
	 * @param map
	 * @return
	 */
	public int updateBaseQuestionRelatedBySearch(BaseQuestionRelatedBean bean,BaseQuestionRelatedSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.baseQuestionRelatedMapper.updateBaseQuestionRelatedBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加题目知识点目录信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseQuestionRelated(BaseQuestionRelatedBean bean){
	
		
		return this.baseQuestionRelatedMapper.insertBaseQuestionRelated(bean);
		
	}
	
	
	
}
