package com.sjq.homework.service;

import java.util.List;
import java.util.Map;

import com.sjq.homework.bean.WorkHomeworkBean;
import com.sjq.homework.search.WorkHomeworkSearch;
import com.sjq.homework.vo.WorkHomeworkVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象作业信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-11 23:11:48
 * @version 1.0
 */
 
public interface WorkHomeworkService {

	/**
	 * 查询所有的作业信息信息
	 * @return 查询到的结果列表
	 */
	List<WorkHomeworkVo> queryAllWorkHomework();
				
				
	/**
	 * 根据ID查询作业信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	WorkHomeworkVo queryWorkHomeworkById(Long id);
				
				
	/**
	 * 根据条件查询所有作业信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<WorkHomeworkVo> queryWorkHomeworkBySearch(WorkHomeworkSearch search);
				
					
	/**
	 * 根据条件查询作业信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryWorkHomeworkTotalCount(WorkHomeworkSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryWorkHomeworkPage(PageBean pb,WorkHomeworkSearch search);
				
								
	/**
	 * (删除)根据条件删除作业信息信息
	 * @param map
	 * @return
	 */
	int deleteWorkHomeworkBySearch(WorkHomeworkBean bean,WorkHomeworkSearch search);
				
				
	/**
	 * (更新)根据ID更新所有作业信息信息
	 * @param bean
	 * @return
	 */
	int updateWorkHomeworkById(WorkHomeworkBean bean);
				
				
	/**
	 * (增加)增加作业信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertWorkHomework(WorkHomeworkBean bean);
				
	
}