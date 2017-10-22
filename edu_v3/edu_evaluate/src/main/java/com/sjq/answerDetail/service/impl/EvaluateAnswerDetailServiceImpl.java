package com.sjq.answerDetail.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.answerDetail.dao.EvaluateAnswerDetailMapper;
import com.sjq.answerDetail.service.EvaluateAnswerDetailService;
import com.sjq.answerDetail.bean.EvaluateAnswerDetailBean;
import com.sjq.answerDetail.search.EvaluateAnswerDetailSearch;
import com.sjq.answerDetail.vo.EvaluateAnswerDetailVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现作答明细信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:58
 * @version 1.0
 */
 
@Service("EvaluateAnswerDetailService")
public class EvaluateAnswerDetailServiceImpl implements EvaluateAnswerDetailService {
	

	@Autowired
	private EvaluateAnswerDetailMapper evaluateAnswerDetailMapper;
	
	/**
	 * 查询所有的作答明细信息信息
	 * @return
	 */
	public List<EvaluateAnswerDetailVo> queryAllEvaluateAnswerDetail(){
		
		return this.evaluateAnswerDetailMapper.queryAllEvaluateAnswerDetail();
	
	}
				
				
	
	/**
	 * 根据ID查询作答明细信息信息
	 * @return
	 */
	public EvaluateAnswerDetailVo queryEvaluateAnswerDetailById(Long id){
		
		return this.evaluateAnswerDetailMapper.queryEvaluateAnswerDetailById(id);

	}
	

	/**
	 * 根据条件查询所有作答明细信息信息
	 * @param map
	 * @return
	 */
	public List<EvaluateAnswerDetailVo> queryEvaluateAnswerDetailBySearch(EvaluateAnswerDetailSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.evaluateAnswerDetailMapper.queryEvaluateAnswerDetailBySearch(map);
	}
	
	
	/**
	 * 根据条件查询作答明细信息count总数
	 * @param map
	 * @return
	 */
	public int queryEvaluateAnswerDetailTotalCount(EvaluateAnswerDetailSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
		
		return this.evaluateAnswerDetailMapper.queryEvaluateAnswerDetailTotalCount(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryEvaluateAnswerDetailPage(PageBean pb,EvaluateAnswerDetailSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.evaluateAnswerDetailMapper.queryEvaluateAnswerDetailTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.evaluateAnswerDetailMapper.queryEvaluateAnswerDetailPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有作答明细信息信息
	 * @param map
	 * @return
	 */
	public int updateEvaluateAnswerDetailBySearch(EvaluateAnswerDetailBean bean,EvaluateAnswerDetailSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.evaluateAnswerDetailMapper.updateEvaluateAnswerDetailBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加作答明细信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertEvaluateAnswerDetail(EvaluateAnswerDetailBean bean){
	
		
		return this.evaluateAnswerDetailMapper.insertEvaluateAnswerDetail(bean);
		
	}
	
	
	
}
