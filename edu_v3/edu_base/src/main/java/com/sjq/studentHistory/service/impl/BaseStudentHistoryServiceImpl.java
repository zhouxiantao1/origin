package com.sjq.studentHistory.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.studentHistory.dao.BaseStudentHistoryMapper;
import com.sjq.studentHistory.service.BaseStudentHistoryService;
import com.sjq.studentHistory.bean.BaseStudentHistoryBean;
import com.sjq.studentHistory.search.BaseStudentHistorySearch;
import com.sjq.studentHistory.vo.BaseStudentHistoryVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现学生历史信息service层
 * @author  ShuiJingQiu
 * @since   2017-06-07 14:53:46
 * @version 1.0
 */
 
@Service("BaseStudentHistoryService")
public class BaseStudentHistoryServiceImpl implements BaseStudentHistoryService {
	

	@Autowired
	private BaseStudentHistoryMapper baseStudentHistoryMapper;
	

	/**
	 * 根据条件查询所有学生历史信息信息
	 * @param map
	 * @return
	 */
	public List<BaseStudentHistoryVo> queryBaseStudentHistoryBySearch(BaseStudentHistorySearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.baseStudentHistoryMapper.queryBaseStudentHistoryBySearch(map);
	}
	
	
	/**
	 * 根据条件查询学生历史信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseStudentHistoryTotalCount(BaseStudentHistorySearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.baseStudentHistoryMapper.queryBaseStudentHistoryTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseStudentHistoryPage(PageBean pb,BaseStudentHistorySearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseStudentHistoryMapper.queryBaseStudentHistoryTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseStudentHistoryMapper.queryBaseStudentHistoryPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除学生历史信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseStudentHistoryById(BaseStudentHistoryBean bean){
		return this.baseStudentHistoryMapper.deleteBaseStudentHistoryById(bean);
	}
	
				
	/**
	 * (更新)根据ID更新所有学生历史信息信息
	 * @param bean
	 * @return
	 */
	public int updateBaseStudentHistoryById(BaseStudentHistoryBean bean){
		
		return this.baseStudentHistoryMapper.updateBaseStudentHistoryById(bean);
		
	}
	
				
	
	/**
	 * (增加)增加学生历史信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseStudentHistory(BaseStudentHistoryBean bean){
	
		
		return this.baseStudentHistoryMapper.insertBaseStudentHistory(bean);
		
	}
	
	
	
}
