package com.sjq.subject.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.subject.dao.BaseSubjectMapper;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.bean.BaseSubjectBean;
import com.sjq.subject.search.BaseSubjectSearch;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现基础模块-学科信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:30:05
 * @version 1.0
 */
 
@Service("BaseSubjectService")
public class BaseSubjectServiceImpl implements BaseSubjectService {
	

	@Autowired
	private BaseSubjectMapper baseSubjectMapper;
	
	/**
	 * (增加)增加基础模块-学科信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseSubject(BaseSubjectBean bean){
	
		
		return this.baseSubjectMapper.insertBaseSubject(bean);
		
	}
	
	/**
	 * 根据学段ID查询的基础模块-学科信息信息
	 * @return 查询到的列表
	 */
	public List<BaseSubjectVo> queryBaseSubjectByStageId(Long stageId){
		return this.baseSubjectMapper.queryBaseSubjectByStageId(stageId);
	}
	
	/**
	 * 查询所有的基础模块-学科信息信息
	 * @return
	 */
	public List<BaseSubjectVo> queryAllBaseSubject(){
		
		return this.baseSubjectMapper.queryAllBaseSubject();
	
	}
				
				
	
	/**
	 * 根据ID查询基础模块-学科信息信息
	 * @return
	 */
	public BaseSubjectVo queryBaseSubjectById(Long id){
		
		return this.baseSubjectMapper.queryBaseSubjectById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有基础模块-学科信息信息
	 * @param map
	 * @return
	 */
	public List<BaseSubjectVo> queryBaseSubjectByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.baseSubjectMapper.queryBaseSubjectByIds(map);
	}
	

	/**
	 * 根据条件查询所有基础模块-学科信息信息
	 * @param map
	 * @return
	 */
	public List<BaseSubjectVo> queryBaseSubjectBySearch(BaseSubjectSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.baseSubjectMapper.queryBaseSubjectBySearch(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseSubjectPage(PageBean pb,BaseSubjectSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseSubjectMapper.queryBaseSubjectTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseSubjectMapper.queryBaseSubjectPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除基础模块-学科信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseSubjectById(BaseSubjectBean bean){
		return this.baseSubjectMapper.deleteBaseSubjectById(bean);
	}
	
				
	
	/**
	 * (删除)根据IDS删除基础模块-学科信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseSubjectByIds(BaseSubjectBean bean,Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseSubjectMapper.deleteBaseSubjectByIds(map);
	}
	
				
	/**
	 * (更新)根据ID更新所有基础模块-学科信息信息
	 * @param bean
	 * @return
	 */
	public int updateBaseSubjectById(BaseSubjectBean bean){
		
		return this.baseSubjectMapper.updateBaseSubjectById(bean);
		
	}
	
	
	/**
	 * 根据条件查询基础模块-学科信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseSubjectTotalCount(BaseSubjectSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.baseSubjectMapper.queryBaseSubjectTotalCount(map);
	}
	
	
	
}
