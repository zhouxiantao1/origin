package com.sjq.subject.service;

import java.util.List;
import java.util.Map;

import com.sjq.subject.bean.BaseSubjectBean;
import com.sjq.subject.search.BaseSubjectSearch;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象基础模块-学科信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:30:05
 * @version 1.0
 */
 
public interface BaseSubjectService {
	
	/**
	 * (增加)增加基础模块-学科信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseSubject(BaseSubjectBean bean);
	
	/**
	 * 根据学段ID查询的基础模块-学科信息信息
	 * @return 查询到的列表
	 */
	List<BaseSubjectVo> queryBaseSubjectByStageId(Long stageId);
	
	/**
	 * 查询所有的基础模块-学科信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseSubjectVo> queryAllBaseSubject();
				
				
	/**
	 * 根据ID查询基础模块-学科信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseSubjectVo queryBaseSubjectById(Long id);
				
				
	/**
	 * 根据IDS查询所有基础模块-学科信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseSubjectVo> queryBaseSubjectByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有基础模块-学科信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseSubjectVo> queryBaseSubjectBySearch(BaseSubjectSearch search);
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseSubjectPage(PageBean pb,BaseSubjectSearch search);
				
				
	/**
	 * (删除)根据ID删除基础模块-学科信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseSubjectById(BaseSubjectBean bean);
				
				
	/**
	 * (删除)根据IDS删除基础模块-学科信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseSubjectByIds(BaseSubjectBean bean,Long[] ids);
				
				
	/**
	 * (更新)根据ID更新所有基础模块-学科信息信息
	 * @param bean
	 * @return
	 */
	int updateBaseSubjectById(BaseSubjectBean bean);
				
					
	/**
	 * 根据条件查询基础模块-学科信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseSubjectTotalCount(BaseSubjectSearch search);
	
	
}