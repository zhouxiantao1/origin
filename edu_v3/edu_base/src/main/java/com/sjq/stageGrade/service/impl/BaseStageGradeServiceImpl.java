package com.sjq.stageGrade.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.stageGrade.dao.BaseStageGradeMapper;
import com.sjq.stageGrade.service.BaseStageGradeService;
import com.sjq.stageGrade.bean.BaseStageGradeBean;
import com.sjq.stageGrade.search.BaseStageGradeSearch;
import com.sjq.stageGrade.vo.BaseStageGradeVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现学段年级信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-03 22:00:49
 * @version 1.0
 */
 
@Service("BaseStageGradeService")
public class BaseStageGradeServiceImpl implements BaseStageGradeService {
	

	@Autowired
	private BaseStageGradeMapper baseStageGradeMapper;
	
	/**
	 * 根据条件查询所有学段年级信息信息
	 * @param map
	 * @return
	 */
	public List<BaseStageGradeVo> queryBaseStageGradeBySearch(BaseStageGradeSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("stageId",search.getStageId());
  		map.put("gradeId",search.getGradeId());
		
		return this.baseStageGradeMapper.queryBaseStageGradeBySearch(map);
	}			
	
	/**
	 * (删除)根据条件删除学段年级信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseStageGradeBySearch(BaseStageGradeBean bean,BaseStageGradeSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.baseStageGradeMapper.deleteBaseStageGradeBySearch(map);
		
	}
	
				
	
	/**
	 * (增加)增加学段年级信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseStageGrade(BaseStageGradeBean bean){
	
		
		return this.baseStageGradeMapper.insertBaseStageGrade(bean);
		
	}
	
	
	
}
