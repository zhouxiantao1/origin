package com.sjq.corrects.service;

import java.util.List;
import java.util.Map;

import com.sjq.corrects.bean.WorkCorrectsBean;
import com.sjq.corrects.search.WorkCorrectsSearch;
import com.sjq.corrects.vo.WorkCorrectsVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象批改信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-05 19:19:02
 * @version 1.0
 */
 
public interface WorkCorrectsService {

	/**
	 * 查询所有的批改信息信息
	 * @return 查询到的结果列表
	 */
	List<WorkCorrectsVo> queryAllWorkCorrects();
				
				
	/**
	 * 根据ID查询批改信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	WorkCorrectsVo queryWorkCorrectsById(Long id);
				
				
	/**
	 * 根据条件查询所有批改信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<WorkCorrectsVo> queryWorkCorrectsBySearch(WorkCorrectsSearch search);
				
					
	/**
	 * 根据条件查询批改信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryWorkCorrectsTotalCount(WorkCorrectsSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryWorkCorrectsPage(PageBean pb,WorkCorrectsSearch search);
				
				
	/**
	 * (删除)根据ID删除批改信息信息
	 * @param id
	 * @return
	 */
	int deleteWorkCorrectsById(WorkCorrectsBean bean);
				
				
	/**
	 * (更新)根据条件更新所有批改信息信息
	 * @param map
	 * @return
	 */
	int updateWorkCorrectsBySearch(WorkCorrectsBean bean,WorkCorrectsSearch search);
				
				
	/**
	 * (增加)增加批改信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertWorkCorrects(WorkCorrectsBean bean);
				
	
}