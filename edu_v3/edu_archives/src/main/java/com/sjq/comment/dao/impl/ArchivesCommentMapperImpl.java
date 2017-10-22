package com.sjq.comment.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.comment.vo.ArchivesCommentVo;
import com.sjq.comment.bean.ArchivesCommentBean;
import com.sjq.comment.dao.ArchivesCommentMapper;

/**
 * [自动生成]评语信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-31 10:02:18
 * @version 1.0
 */
@Repository("ArchivesCommentMapper")
public class ArchivesCommentMapperImpl extends BasicSqlSupport implements ArchivesCommentMapper {

	/**
	 * 根据ID查询评语信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public ArchivesCommentVo queryArchivesCommentById(Long id){
	    return this.selectOne("com.sjq.comment.dao.ArchivesCommentMapper.queryArchivesCommentById",id);
	}

	/**
	 * 根据条件查询所有评语信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<ArchivesCommentVo>  queryArchivesCommentBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.comment.dao.ArchivesCommentMapper.queryArchivesCommentBySearch",map);
	}
	
	/**
	 * 根据条件查询评语信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryArchivesCommentTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.comment.dao.ArchivesCommentMapper.queryArchivesCommentTotalCount",map);
	}
	
	/**
	 * 分页查询评语信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryArchivesCommentPage(Map<String, Object> map){
		return this.selectList("com.sjq.comment.dao.ArchivesCommentMapper.queryArchivesCommentPage",map);
	}
	
	/**
	 * (删除)根据ID删除评语信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteArchivesCommentById(ArchivesCommentBean bean){
		return this.delete("com.sjq.comment.dao.ArchivesCommentMapper.deleteArchivesCommentById",bean);
	}
	
	/**
	 * (更新)根据ID更新所有评语信息信息
	 * @param bean 评语信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateArchivesCommentById(ArchivesCommentBean bean){
	    return this.update("com.sjq.comment.dao.ArchivesCommentMapper.updateArchivesCommentById", bean);
	}
	
	/**
	 * (增加)增加评语信息信息
	 * @param bean 评语信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertArchivesComment(ArchivesCommentBean bean){
		return this.insert("com.sjq.comment.dao.ArchivesCommentMapper.insertArchivesComment", bean);
	}
	
	

}