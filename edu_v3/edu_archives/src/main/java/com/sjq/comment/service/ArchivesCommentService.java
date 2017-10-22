package com.sjq.comment.service;

import java.util.List;
import java.util.Map;

import com.sjq.comment.bean.ArchivesCommentBean;
import com.sjq.comment.search.ArchivesCommentSearch;
import com.sjq.comment.vo.ArchivesCommentVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象评语信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-31 10:02:18
 * @version 1.0
 */
 
public interface ArchivesCommentService {

				
	/**
	 * 根据ID查询评语信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	ArchivesCommentVo queryArchivesCommentById(Long id);
				
				
	/**
	 * 根据条件查询所有评语信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<ArchivesCommentVo> queryArchivesCommentBySearch(ArchivesCommentSearch search);
				
					
	/**
	 * 根据条件查询评语信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryArchivesCommentTotalCount(ArchivesCommentSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryArchivesCommentPage(PageBean pb,ArchivesCommentSearch search);
				
				
	/**
	 * (删除)根据ID删除评语信息信息
	 * @param id
	 * @return
	 */
	int deleteArchivesCommentById(ArchivesCommentBean bean);
				
				
	/**
	 * (更新)根据ID更新所有评语信息信息
	 * @param bean
	 * @return
	 */
	int updateArchivesCommentById(ArchivesCommentBean bean);
				
				
	/**
	 * (增加)增加评语信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertArchivesComment(ArchivesCommentBean bean);
				
	
}