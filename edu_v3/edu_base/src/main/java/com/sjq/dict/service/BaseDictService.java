package com.sjq.dict.service;

import java.util.List;
import java.util.Map;

import com.sjq.dict.bean.BaseDictBean;
import com.sjq.dict.search.BaseDictSearch;
import com.sjq.dict.vo.BaseDictVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象字典工具信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-27 18:11:47
 * @version 1.0
 */
 
public interface BaseDictService {

	/**
	 * 查询所有的字典工具信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseDictVo> queryAllBaseDict();
				
				
	/**
	 * 根据ID查询字典工具信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseDictVo queryBaseDictById(Long id);
				
				
	/**
	 * 根据IDS查询所有字典工具信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseDictVo> queryBaseDictByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有字典工具信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseDictVo> queryBaseDictBySearch(BaseDictSearch search);
				
					
	/**
	 * 根据条件查询字典工具信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseDictTotalCount(BaseDictSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseDictPage(PageBean pb,BaseDictSearch search);
				
				
	/**
	 * (删除)根据ID删除字典工具信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseDictById(BaseDictBean bean);
				
				
	/**
	 * (增加)增加字典工具信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseDict(BaseDictBean bean);
				
	
}