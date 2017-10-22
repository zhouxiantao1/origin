package com.sjq.answer.service;

import java.util.List;
import java.util.Map;

import com.sjq.answer.bean.WorkAnswerBean;
import com.sjq.answer.search.WorkAnswerSearch;
import com.sjq.answer.vo.WorkAnswerVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象作答信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:27:33
 * @version 1.0
 */
 
public interface WorkAnswerService {
	
	/**
	 * 查询各个段的得分率人数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int  queryWorkAnswerBycorrect(double start,double end,Long homeworkId);
	
	/**
	 * (更新)根据ID更新所有作答信息信息
	 * @param bean
	 * @return
	 */
	int updateWorkAnswerById(WorkAnswerBean bean);
	
	/**
	 * 根据ID查询作答信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	WorkAnswerVo queryWorkAnswerById(Long id);
				
				
	/**
	 * 根据条件查询所有作答信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<WorkAnswerVo> queryWorkAnswerBySearch(WorkAnswerSearch search);
				
					
	/**
	 * 根据条件查询作答信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryWorkAnswerTotalCount(WorkAnswerSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryWorkAnswerPage(PageBean pb,WorkAnswerSearch search);
				
								
	/**
	 * (删除)根据条件删除作答信息信息
	 * @param map
	 * @return
	 */
	int deleteWorkAnswerBySearch(WorkAnswerBean bean,WorkAnswerSearch search);
				
				
	/**
	 * (增加)增加作答信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertWorkAnswer(WorkAnswerBean bean);
				
	
}