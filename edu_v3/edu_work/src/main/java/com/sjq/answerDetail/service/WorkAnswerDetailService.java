package com.sjq.answerDetail.service;

import java.util.List;
import java.util.Map;

import com.sjq.answerDetail.bean.WorkAnswerDetailBean;
import com.sjq.answerDetail.search.WorkAnswerDetailSearch;
import com.sjq.answerDetail.vo.WorkAnswerDetailVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象作答详细信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:28:06
 * @version 1.0
 */
 
public interface WorkAnswerDetailService {

				
	/**
	 * 根据ID查询作答详细信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	WorkAnswerDetailVo queryWorkAnswerDetailById(Long id);
				
				
	/**
	 * 根据条件查询所有作答详细信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<WorkAnswerDetailVo> queryWorkAnswerDetailBySearch(WorkAnswerDetailSearch search);
				
					
	/**
	 * 根据条件查询作答详细信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryWorkAnswerDetailTotalCount(WorkAnswerDetailSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryWorkAnswerDetailPage(PageBean pb,WorkAnswerDetailSearch search);
				
								
	/**
	 * (删除)根据条件删除作答详细信息信息
	 * @param map
	 * @return
	 */
	int deleteWorkAnswerDetailBySearch(WorkAnswerDetailBean bean,WorkAnswerDetailSearch search);
				
				
	/**
	 * (更新)根据条件更新所有作答详细信息信息
	 * @param map
	 * @return
	 */
	int updateWorkAnswerDetailBySearch(WorkAnswerDetailBean bean,WorkAnswerDetailSearch search);
				
				
	/**
	 * (增加)增加作答详细信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertWorkAnswerDetail(WorkAnswerDetailBean bean);
				
	
}