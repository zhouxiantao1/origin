package com.sjq.comment.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.comment.dao.ArchivesCommentMapper;
import com.sjq.comment.service.ArchivesCommentService;
import com.sjq.comment.bean.ArchivesCommentBean;
import com.sjq.comment.search.ArchivesCommentSearch;
import com.sjq.comment.vo.ArchivesCommentVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现评语信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-31 10:02:18
 * @version 1.0
 */
 
@Service("ArchivesCommentService")
public class ArchivesCommentServiceImpl implements ArchivesCommentService {
	

	@Autowired
	private ArchivesCommentMapper archivesCommentMapper;
	
				
	
	/**
	 * 根据ID查询评语信息信息
	 * @return
	 */
	public ArchivesCommentVo queryArchivesCommentById(Long id){
		
		return this.archivesCommentMapper.queryArchivesCommentById(id);

	}
	

	/**
	 * 根据条件查询所有评语信息信息
	 * @param map
	 * @return
	 */
	public List<ArchivesCommentVo> queryArchivesCommentBySearch(ArchivesCommentSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("studentId",search.getStudentId());
		
		return this.archivesCommentMapper.queryArchivesCommentBySearch(map);
	}
	
	
	/**
	 * 根据条件查询评语信息count总数
	 * @param map
	 * @return
	 */
	public int queryArchivesCommentTotalCount(ArchivesCommentSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("studentId",search.getStudentId());
		
		return this.archivesCommentMapper.queryArchivesCommentTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryArchivesCommentPage(PageBean pb,ArchivesCommentSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("studentId",search.getStudentId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.archivesCommentMapper.queryArchivesCommentTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.archivesCommentMapper.queryArchivesCommentPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除评语信息信息
	 * @param id
	 * @return
	 */
	public int deleteArchivesCommentById(ArchivesCommentBean bean){
		return this.archivesCommentMapper.deleteArchivesCommentById(bean);
	}
	
				
	/**
	 * (更新)根据ID更新所有评语信息信息
	 * @param bean
	 * @return
	 */
	public int updateArchivesCommentById(ArchivesCommentBean bean){
		
		return this.archivesCommentMapper.updateArchivesCommentById(bean);
		
	}
	
				
	
	/**
	 * (增加)增加评语信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertArchivesComment(ArchivesCommentBean bean){
	
		
		return this.archivesCommentMapper.insertArchivesComment(bean);
		
	}
	
	
	
}
