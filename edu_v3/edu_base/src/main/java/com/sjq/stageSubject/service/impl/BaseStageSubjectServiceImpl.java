package com.sjq.stageSubject.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.stageSubject.dao.BaseStageSubjectMapper;
import com.sjq.stageSubject.service.BaseStageSubjectService;
import com.sjq.stageSubject.bean.BaseStageSubjectBean;
import com.sjq.stageSubject.search.BaseStageSubjectSearch;
import com.sjq.stageSubject.vo.BaseStageSubjectVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现学段学科信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-03 01:20:27
 * @version 1.0
 */
 
@Service("BaseStageSubjectService")
public class BaseStageSubjectServiceImpl implements BaseStageSubjectService {
	

	@Autowired
	private BaseStageSubjectMapper baseStageSubjectMapper;
	

	/**
	 * 根据条件查询所有学段学科信息信息
	 * @param map
	 * @return
	 */
	public List<BaseStageSubjectVo> queryBaseStageSubjectBySearch(BaseStageSubjectSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.baseStageSubjectMapper.queryBaseStageSubjectBySearch(map);
	}
	
	
	/**
	 * 根据条件查询学段学科信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseStageSubjectTotalCount(BaseStageSubjectSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.baseStageSubjectMapper.queryBaseStageSubjectTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseStageSubjectPage(PageBean pb,BaseStageSubjectSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseStageSubjectMapper.queryBaseStageSubjectTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseStageSubjectMapper.queryBaseStageSubjectPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (增加)增加学段学科信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseStageSubject(BaseStageSubjectBean bean){
	
		
		return this.baseStageSubjectMapper.insertBaseStageSubject(bean);
		
	}
	
	
	
}
