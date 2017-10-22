package com.sjq.compare.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.compare.dao.NormCompareMapper;
import com.sjq.compare.service.NormCompareService;
import com.sjq.compare.bean.NormCompareBean;
import com.sjq.compare.search.NormCompareSearch;
import com.sjq.compare.vo.NormCompareVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现常模管理-常模对照service层
 * @author  ShuiJingQiu
 * @since   2017-07-06 15:06:34
 * @version 1.0
 */
 
@Service("NormCompareService")
public class NormCompareServiceImpl implements NormCompareService {
	

	@Autowired
	private NormCompareMapper normCompareMapper;
	
				
	
	/**
	 * 根据ID查询常模管理-常模对照信息
	 * @return
	 */
	public NormCompareVo queryNormCompareById(Long id){
		
		return this.normCompareMapper.queryNormCompareById(id);

	}
	

	/**
	 * 根据条件查询所有常模管理-常模对照信息
	 * @param map
	 * @return
	 */
	public List<NormCompareVo> queryNormCompareBySearch(NormCompareSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("delflag",search.getDelflag());
  		map.put("defId",search.getDefId());
		
		return this.normCompareMapper.queryNormCompareBySearch(map);
	}
	
	
	/**
	 * 根据条件查询常模管理-常模对照count总数
	 * @param map
	 * @return
	 */
	public int queryNormCompareTotalCount(NormCompareSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("delflag",search.getDelflag());
  		map.put("defId",search.getDefId());
		
		return this.normCompareMapper.queryNormCompareTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryNormComparePage(PageBean pb,NormCompareSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("delflag",search.getDelflag());
  		map.put("defId",search.getDefId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.normCompareMapper.queryNormCompareTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.normCompareMapper.queryNormComparePage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除常模管理-常模对照信息
	 * @param id
	 * @return
	 */
	public int deleteNormCompareById(NormCompareBean bean){
		return this.normCompareMapper.deleteNormCompareById(bean);
	}
	
				
	
	/**
	 * (增加)增加常模管理-常模对照信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertNormCompare(NormCompareBean bean){
	
		
		return this.normCompareMapper.insertNormCompare(bean);
		
	}


	public List<NormCompareBean> queryNormCompareByExamId(NormCompareSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
		
		return this.normCompareMapper.queryNormCompareByExamId(map);
	}


	@Override
	public int insertNormCompareBatch(List<NormCompareBean> beanList) {
		return this.normCompareMapper.insertNormCompareBatch(beanList);
	}
	
	public int deleteNormCompareBySerach(Map<String, Object> map){
		return this.normCompareMapper.deleteNormCompareBySerach(map);
	}


	@Override
	public List<NormCompareBean> queryNormCompareByExam(NormCompareSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",search.getExamId());
		
		return this.normCompareMapper.queryNormCompareByExam(map);
	}
	
}
