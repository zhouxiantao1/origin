package com.sjq.version.service;

import java.util.List;
import java.util.Map;

import com.sjq.version.bean.BaseVersionBean;
import com.sjq.version.search.BaseVersionSearch;
import com.sjq.version.vo.BaseVersionVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象基础模块-版本信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:30:32
 * @version 1.0
 */
 
public interface BaseVersionService {

	/**
	 * 查询所有的基础模块-版本信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseVersionVo> queryAllBaseVersion();
				
				
	/**
	 * 根据ID查询基础模块-版本信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseVersionVo queryBaseVersionById(Long id);
				
				
	/**
	 * 根据IDS查询所有基础模块-版本信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseVersionVo> queryBaseVersionByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有基础模块-版本信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseVersionVo> queryBaseVersionBySearch(BaseVersionSearch search);
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseVersionPage(PageBean pb,BaseVersionSearch search);
				
				
	/**
	 * (删除)根据ID删除基础模块-版本信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseVersionById(BaseVersionBean bean);
				
				
	/**
	 * (删除)根据IDS删除基础模块-版本信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseVersionByIds(BaseVersionBean bean,Long[] ids);
				
				
	/**
	 * (更新)根据ID更新所有基础模块-版本信息信息
	 * @param bean
	 * @return
	 */
	int updateBaseVersionById(BaseVersionBean bean);
				
					
	/**
	 * 根据条件查询基础模块-版本信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseVersionTotalCount(BaseVersionSearch search);
	
	
}