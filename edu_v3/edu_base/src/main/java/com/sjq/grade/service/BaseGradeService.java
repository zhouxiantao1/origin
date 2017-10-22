package com.sjq.grade.service;

import java.util.List;
import java.util.Map;

import com.sjq.grade.bean.BaseGradeBean;
import com.sjq.grade.search.BaseGradeSearch;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象基础模块-学段信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:26:54
 * @version 1.0
 */
 
public interface BaseGradeService {
	
	/**
	 * (增加)增加基础模块-学段信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseGrade(BaseGradeBean bean);
	
	/**
	 * 根据学段ID查询基础模块-学段信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	List<BaseGradeVo> queryBaseGradeByStageId(Long stageId);
	
	/**
	 * 查询所有的基础模块-学段信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseGradeVo> queryAllBaseGrade();
				
				
	/**
	 * 根据ID查询基础模块-学段信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseGradeVo queryBaseGradeById(Long id);
				
				
	/**
	 * 根据IDS查询所有基础模块-学段信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseGradeVo> queryBaseGradeByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有基础模块-学段信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseGradeVo> queryBaseGradeBySearch(BaseGradeSearch search);
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseGradePage(PageBean pb,BaseGradeSearch search);
				
				
	/**
	 * (删除)根据ID删除基础模块-学段信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseGradeById(BaseGradeBean bean);
				
				
	/**
	 * (删除)根据IDS删除基础模块-学段信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseGradeByIds(BaseGradeBean bean,Long[] ids);
				
				
	/**
	 * (更新)根据ID更新所有基础模块-学段信息信息
	 * @param bean
	 * @return
	 */
	int updateBaseGradeById(BaseGradeBean bean);
				
					
	/**
	 * 根据条件查询基础模块-学段信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseGradeTotalCount(BaseGradeSearch search);
	
	
}