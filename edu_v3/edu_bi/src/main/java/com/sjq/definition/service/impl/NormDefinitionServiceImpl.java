package com.sjq.definition.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.definition.dao.NormDefinitionMapper;
import com.sjq.definition.service.NormDefinitionService;
import com.sjq.definition.bean.NormDefinitionBean;
import com.sjq.definition.search.NormDefinitionSearch;
import com.sjq.definition.vo.NormDefinitionVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现常模管理-常模定义service层
 * @author  ShuiJingQiu
 * @since   2017-07-06 16:04:08
 * @version 1.0
 */
 
@Service("NormDefinitionService")
public class NormDefinitionServiceImpl implements NormDefinitionService {
	

	@Autowired
	private NormDefinitionMapper normDefinitionMapper;
	
				
	
	/**
	 * 根据ID查询常模管理-常模定义信息
	 * @return
	 */
	public NormDefinitionVo queryNormDefinitionById(Long id){
		
		return this.normDefinitionMapper.queryNormDefinitionById(id);

	}
	

	/**
	 * 根据条件查询所有常模管理-常模定义信息
	 * @param map
	 * @return
	 */
	public List<NormDefinitionVo> queryNormDefinitionBySearch(NormDefinitionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("delflag",search.getDelflag());
  		map.put("normName",search.getNormName());
  		map.put("examId",search.getExamId());
		
		return this.normDefinitionMapper.queryNormDefinitionBySearch(map);
	}
	
	
	/**
	 * 根据条件查询常模管理-常模定义count总数
	 * @param map
	 * @return
	 */
	public int queryNormDefinitionTotalCount(NormDefinitionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("delflag",search.getDelflag());
  		map.put("normName",search.getNormName());
  		map.put("examId",search.getExamId());
		
		return this.normDefinitionMapper.queryNormDefinitionTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryNormDefinitionPage(PageBean pb,NormDefinitionSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("delflag",search.getDelflag());
  		map.put("normName",search.getNormName());
  		map.put("examId",search.getExamId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.normDefinitionMapper.queryNormDefinitionTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.normDefinitionMapper.queryNormDefinitionPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除常模管理-常模定义信息
	 * @param id
	 * @return
	 */
	public int deleteNormDefinitionById(NormDefinitionBean bean){
		return this.normDefinitionMapper.deleteNormDefinitionById(bean);
	}
	
				
	
	/**
	 * (删除)根据条件删除常模管理-常模定义信息
	 * @param map
	 * @return
	 */
	public int deleteNormDefinitionBySearch(NormDefinitionBean bean,NormDefinitionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.normDefinitionMapper.deleteNormDefinitionBySearch(map);
		
	}
	
				
	
	/**
	 * (增加)增加常模管理-常模定义信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertNormDefinition(NormDefinitionBean bean){
	
		
		return this.normDefinitionMapper.insertNormDefinition(bean);
		
	}


	@Override
	public PageBean queryNormDefinitionPageBySearch(PageBean pb, NormDefinitionSearch search) {
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("gradeId",search.getGradeId());
  		map.put("startTime",search.getStartTime());
  		map.put("endTime",search.getEndTime());
  		if(search.getNormName() != null && !search.getNormName().trim().equals("")){
  			map.put("normName",search.getNormName());
  		}
	
        // 设置PageBean的行数参数
        pb.setRows(this.normDefinitionMapper.queryNormBySearchTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.normDefinitionMapper.queryNormDefinitionPageBySearch(map));
           
        // 返回pageBean
        return pb;
	}
	
	
	
}
