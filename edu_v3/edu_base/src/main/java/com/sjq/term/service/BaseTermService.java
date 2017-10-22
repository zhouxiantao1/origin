package com.sjq.term.service;

import java.util.List;
import java.util.Map;

import com.sjq.term.bean.BaseTermBean;
import com.sjq.term.search.BaseTermSearch;
import com.sjq.term.vo.BaseTermVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象基础模块-学期信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:30:58
 * @version 1.0
 */
 
public interface BaseTermService {

	/**
	 * 查询所有的基础模块-学期信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseTermVo> queryAllBaseTerm();
				
				
	/**
	 * 根据ID查询基础模块-学期信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseTermVo queryBaseTermById(Long id);
				
				
	/**
	 * 根据IDS查询所有基础模块-学期信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseTermVo> queryBaseTermByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有基础模块-学期信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseTermVo> queryBaseTermBySearch(BaseTermSearch search);
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseTermPage(PageBean pb,BaseTermSearch search);
				
				
	/**
	 * (删除)根据ID删除基础模块-学期信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseTermById(BaseTermBean bean);
				
				
	/**
	 * (删除)根据IDS删除基础模块-学期信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseTermByIds(BaseTermBean bean,Long[] ids);
				
				
	/**
	 * (更新)根据ID更新所有基础模块-学期信息信息
	 * @param bean
	 * @return
	 */
	int updateBaseTermById(BaseTermBean bean);
				
					
	/**
	 * 根据条件查询基础模块-学期信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseTermTotalCount(BaseTermSearch search);
	
	
}