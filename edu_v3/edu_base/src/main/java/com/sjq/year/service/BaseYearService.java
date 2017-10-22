package com.sjq.year.service;

import java.util.List;
import java.util.Map;

import com.sjq.year.bean.BaseYearBean;
import com.sjq.year.search.BaseYearSearch;
import com.sjq.year.vo.BaseYearVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象基础模块-年份信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:29:37
 * @version 1.0
 */
 
public interface BaseYearService {

	/**
	 * 查询所有的基础模块-年份信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseYearVo> queryAllBaseYear();
				
				
	/**
	 * 根据ID查询基础模块-年份信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseYearVo queryBaseYearById(Long id);
				
				
	/**
	 * 根据IDS查询所有基础模块-年份信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseYearVo> queryBaseYearByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有基础模块-年份信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseYearVo> queryBaseYearBySearch(BaseYearSearch search);
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseYearPage(PageBean pb,BaseYearSearch search);
				
				
	/**
	 * (删除)根据ID删除基础模块-年份信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseYearById(BaseYearBean bean);
				
				
	/**
	 * (删除)根据IDS删除基础模块-年份信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseYearByIds(BaseYearBean bean,Long[] ids);
				
				
	/**
	 * (更新)根据ID更新所有基础模块-年份信息信息
	 * @param bean
	 * @return
	 */
	int updateBaseYearById(BaseYearBean bean);
				
					
	/**
	 * 根据条件查询基础模块-年份信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseYearTotalCount(BaseYearSearch search);
	
	
}