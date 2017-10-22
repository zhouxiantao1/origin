package com.sjq.comment.dao;

import java.util.List;
import java.util.Map;
import com.sjq.comment.vo.ArchivesCommentVo;
import com.sjq.comment.bean.ArchivesCommentBean;

/**
 * [自动生成]抽象评语信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-31 10:02:18
 * @version 1.0
 */
public interface ArchivesCommentMapper {


	/**
	 * 根据ID查询评语信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	ArchivesCommentVo queryArchivesCommentById(Long id);
	
	/**
	 * 根据条件查询所有评语信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<ArchivesCommentVo> queryArchivesCommentBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询评语信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryArchivesCommentTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询评语信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryArchivesCommentPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除评语信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteArchivesCommentById(ArchivesCommentBean bean);
	
	/**
	 * (更新)根据ID更新所有评语信息信息
	 * @param bean 评语信息实体
	 * @return     受更新影响的行数
	 */
	int updateArchivesCommentById(ArchivesCommentBean bean);
	
	/**
	 * (增加)增加评语信息信息
	 * @param bean 评语信息实体
	 * @return     受增加影响的行数
	 */
	int insertArchivesComment(ArchivesCommentBean bean);

	
}