package com.sjq.detail.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.detail.dao.PapersDetailMapper;
import com.sjq.detail.service.PapersDetailService;
import com.sjq.detail.bean.PapersDetailBean;
import com.sjq.detail.search.PapersDetailSearch;
import com.sjq.detail.vo.PapersDetailVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现试卷模块-试卷明细信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-10 23:58:11
 * @version 1.0
 */
 
@Service("PapersDetailService")
public class PapersDetailServiceImpl implements PapersDetailService {
	

	@Autowired
	private PapersDetailMapper papersDetailMapper;
	

	/**
	 * 根据条件查询所有试卷模块-试卷明细信息信息
	 * @param map
	 * @return
	 */
	public List<PapersDetailVo> queryPapersDetailBySearch(PapersDetailSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("paperId",search.getPaperId());
		
		return this.papersDetailMapper.queryPapersDetailBySearch(map);
	}
	
				
	
	/**
	 * (删除)根据条件删除试卷模块-试卷明细信息信息
	 * @param map
	 * @return
	 */
	public int deletePapersDetailBySearch(PapersDetailBean bean,PapersDetailSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.papersDetailMapper.deletePapersDetailBySearch(map);
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有试卷模块-试卷明细信息信息
	 * @param map
	 * @return
	 */
	public int updatePapersDetailBySearch(PapersDetailBean bean,PapersDetailSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.papersDetailMapper.updatePapersDetailBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加试卷模块-试卷明细信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertPapersDetail(PapersDetailBean bean){
	
		
		return this.papersDetailMapper.insertPapersDetail(bean);
		
	}



	@Override
	public PapersDetailVo queryPapersDetailById(Long id) {
		return this.papersDetailMapper.queryPapersDetailById(id);
	}
	
	
	
}
