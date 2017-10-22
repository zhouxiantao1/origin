package com.sjq.wrong.service;

import java.util.List;
import java.util.Map;

import com.sjq.wrong.bean.WorkWrongBean;
import com.sjq.wrong.search.WorkWrongSearch;
import com.sjq.wrong.vo.WorkWrongVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象错题信息service层
 * @author  ShuiJingQiu
 * @since   2017-06-27 16:47:56
 * @version 1.0
 */
 
public interface WorkWrongService {

				
	/**
	 * 根据ID查询错题信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	WorkWrongVo queryWorkWrongById(Long id);
				
				
	/**
	 * 根据条件查询所有错题信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<WorkWrongVo> queryWorkWrongBySearch(WorkWrongSearch search);
				
					
	/**
	 * 根据条件查询错题信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryWorkWrongTotalCount(WorkWrongSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryWorkWrongPage(PageBean pb,WorkWrongSearch search);
				
				
	/**
	 * (删除)根据ID删除错题信息信息
	 * @param id
	 * @return
	 */
	int deleteWorkWrongById(WorkWrongBean bean);
				
				
	/**
	 * (更新)根据ID更新所有错题信息信息
	 * @param bean
	 * @return
	 */
	int updateWorkWrongById(WorkWrongBean bean);
				
				
	/**
	 * (更新)根据条件更新所有错题信息信息
	 * @param map
	 * @return
	 */
	int updateWorkWrongBySearch(WorkWrongBean bean,WorkWrongSearch search);
				
				
	/**
	 * (增加)增加错题信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertWorkWrong(WorkWrongBean bean);
				
	
}