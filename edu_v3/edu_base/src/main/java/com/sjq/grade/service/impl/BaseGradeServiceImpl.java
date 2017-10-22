package com.sjq.grade.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.grade.dao.BaseGradeMapper;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.bean.BaseGradeBean;
import com.sjq.grade.search.BaseGradeSearch;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现基础模块-学段信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:26:54
 * @version 1.0
 */
 
@Service("BaseGradeService")
public class BaseGradeServiceImpl implements BaseGradeService {
	

	@Autowired
	private BaseGradeMapper baseGradeMapper;
	
	/**
	 * (增加)增加基础模块-学段信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertBaseGrade(BaseGradeBean bean){
	
		
		return this.baseGradeMapper.insertBaseGrade(bean);
		
	}
	
	/**
	 * 根据学段ID查询基础模块-学段信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public List<BaseGradeVo> queryBaseGradeByStageId(Long stageId){
		return this.baseGradeMapper.queryBaseGradeByStageId(stageId);
	}
	
	/**
	 * 查询所有的基础模块-学段信息信息
	 * @return
	 */
	public List<BaseGradeVo> queryAllBaseGrade(){
		
		return this.baseGradeMapper.queryAllBaseGrade();
	
	}
				
				
	
	/**
	 * 根据ID查询基础模块-学段信息信息
	 * @return
	 */
	public BaseGradeVo queryBaseGradeById(Long id){
		
		return this.baseGradeMapper.queryBaseGradeById(id);

	}
	
				
	
	/**
	 * 根据IDS查询所有基础模块-学段信息信息
	 * @param map
	 * @return
	 */
	public List<BaseGradeVo> queryBaseGradeByIds(Long[] ids){
		
		if(ids == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		
		return this.baseGradeMapper.queryBaseGradeByIds(map);
	}
	

	/**
	 * 根据条件查询所有基础模块-学段信息信息
	 * @param map
	 * @return
	 */
	public List<BaseGradeVo> queryBaseGradeBySearch(BaseGradeSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
		
		return this.baseGradeMapper.queryBaseGradeBySearch(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryBaseGradePage(PageBean pb,BaseGradeSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
	
        // 设置PageBean的行数参数
        pb.setRows(this.baseGradeMapper.queryBaseGradeTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.baseGradeMapper.queryBaseGradePage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除基础模块-学段信息信息
	 * @param id
	 * @return
	 */
	public int deleteBaseGradeById(BaseGradeBean bean){
		return this.baseGradeMapper.deleteBaseGradeById(bean);
	}
	
				
	
	/**
	 * (删除)根据IDS删除基础模块-学段信息信息
	 * @param map
	 * @return
	 */
	public int deleteBaseGradeByIds(BaseGradeBean bean,Long[] ids){
		
		if(ids == null){
			return 0;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("ids", ids);
		
		return this.baseGradeMapper.deleteBaseGradeByIds(map);
	}
	
				
	/**
	 * (更新)根据ID更新所有基础模块-学段信息信息
	 * @param bean
	 * @return
	 */
	public int updateBaseGradeById(BaseGradeBean bean){
		
		return this.baseGradeMapper.updateBaseGradeById(bean);
		
	}
	
	
	/**
	 * 根据条件查询基础模块-学段信息count总数
	 * @param map
	 * @return
	 */
	public int queryBaseGradeTotalCount(BaseGradeSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("name",search.getName());
		
		return this.baseGradeMapper.queryBaseGradeTotalCount(map);
	}
	
	
	
}
