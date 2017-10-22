package com.sjq.detail.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.detail.dao.ExamDetailMapper;
import com.sjq.detail.service.ExamDetailService;
import com.sjq.detail.bean.ExamDetailBean;
import com.sjq.detail.search.ExamDetailSearch;
import com.sjq.detail.vo.ExamDetailVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现线上考试-考试明细信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-12 19:18:17
 * @version 1.0
 */
 
@Service("ExamDetailService")
public class ExamDetailServiceImpl implements ExamDetailService {
	

	@Autowired
	private ExamDetailMapper examDetailMapper;
	
	/**
	 * 查询所有的线上考试-考试明细信息信息
	 * @return
	 */
	public List<ExamDetailVo> queryAllExamDetail(){
		
		return this.examDetailMapper.queryAllExamDetail();
	
	}
				
				
	
	/**
	 * 根据ID查询线上考试-考试明细信息信息
	 * @return
	 */
	public ExamDetailVo queryExamDetailById(Long id){
		
		return this.examDetailMapper.queryExamDetailById(id);

	}
	

	/**
	 * 根据条件查询所有线上考试-考试明细信息信息
	 * @param map
	 * @return
	 */
	public List<ExamDetailVo> queryExamDetailBySearch(ExamDetailSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("paperId",search.getPaperId());
  		map.put("examId",search.getExamId());
  		map.put("detailName",search.getDetailName());
  		map.put("examProgress",search.getExamProgress());
		
		return this.examDetailMapper.queryExamDetailBySearch(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryExamDetailPage(PageBean pb,ExamDetailSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("paperId",search.getPaperId());
  		map.put("detailName",search.getDetailName());
  		map.put("examProgress",search.getExamProgress());
	
        // 设置PageBean的行数参数
        pb.setRows(this.examDetailMapper.queryExamDetailTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.examDetailMapper.queryExamDetailPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除线上考试-考试明细信息信息
	 * @param id
	 * @return
	 */
	public int deleteExamDetailById(ExamDetailBean bean){
		return this.examDetailMapper.deleteExamDetailById(bean);
	}
	
				
	/**
	 * (更新)根据ID更新所有线上考试-考试明细信息信息
	 * @param bean
	 * @return
	 */
	public int updateExamDetailById(ExamDetailBean bean){
		
		return this.examDetailMapper.updateExamDetailById(bean);
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有线上考试-考试明细信息信息
	 * @param map
	 * @return
	 */
	public int updateExamDetailBySearch(ExamDetailBean bean,ExamDetailSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.examDetailMapper.updateExamDetailBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加线上考试-考试明细信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertExamDetail(ExamDetailBean bean){
	
		
		return this.examDetailMapper.insertExamDetail(bean);
		
	}
	
	
	
}
