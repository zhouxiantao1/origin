package com.sjq.corrects.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.corrects.dao.WorkCorrectsMapper;
import com.sjq.corrects.service.WorkCorrectsService;
import com.sjq.corrects.bean.WorkCorrectsBean;
import com.sjq.corrects.search.WorkCorrectsSearch;
import com.sjq.corrects.vo.WorkCorrectsVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现批改信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-05 19:19:02
 * @version 1.0
 */
 
@Service("WorkCorrectsService")
public class WorkCorrectsServiceImpl implements WorkCorrectsService {
	

	@Autowired
	private WorkCorrectsMapper workCorrectsMapper;
	
	/**
	 * 查询所有的批改信息信息
	 * @return
	 */
	public List<WorkCorrectsVo> queryAllWorkCorrects(){
		
		return this.workCorrectsMapper.queryAllWorkCorrects();
	
	}
				
				
	
	/**
	 * 根据ID查询批改信息信息
	 * @return
	 */
	public WorkCorrectsVo queryWorkCorrectsById(Long id){
		
		return this.workCorrectsMapper.queryWorkCorrectsById(id);

	}
	

	/**
	 * 根据条件查询所有批改信息信息
	 * @param map
	 * @return
	 */
	public List<WorkCorrectsVo> queryWorkCorrectsBySearch(WorkCorrectsSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.workCorrectsMapper.queryWorkCorrectsBySearch(map);
	}
	
	
	/**
	 * 根据条件查询批改信息count总数
	 * @param map
	 * @return
	 */
	public int queryWorkCorrectsTotalCount(WorkCorrectsSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.workCorrectsMapper.queryWorkCorrectsTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryWorkCorrectsPage(PageBean pb,WorkCorrectsSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.workCorrectsMapper.queryWorkCorrectsTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.workCorrectsMapper.queryWorkCorrectsPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除批改信息信息
	 * @param id
	 * @return
	 */
	public int deleteWorkCorrectsById(WorkCorrectsBean bean){
		return this.workCorrectsMapper.deleteWorkCorrectsById(bean);
	}
	
				
	
	/**
	 * (更新)根据条件更新所有批改信息信息
	 * @param map
	 * @return
	 */
	public int updateWorkCorrectsBySearch(WorkCorrectsBean bean,WorkCorrectsSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.workCorrectsMapper.updateWorkCorrectsBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加批改信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertWorkCorrects(WorkCorrectsBean bean){
	
		
		return this.workCorrectsMapper.insertWorkCorrects(bean);
		
	}
	
	
	
}
