package com.sjq.collect.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.collect.dao.QuestionCollectMapper;
import com.sjq.collect.service.QuestionCollectService;
import com.sjq.collect.bean.QuestionCollectBean;
import com.sjq.collect.search.QuestionCollectSearch;
import com.sjq.collect.vo.QuestionCollectVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现题库模块-题库收藏service层
 * @author  ShuiJingQiu
 * @since   2017-05-09 01:36:25
 * @version 1.0
 */
 
@Service("QuestionCollectService")
public class QuestionCollectServiceImpl implements QuestionCollectService {
	

	@Autowired
	private QuestionCollectMapper questionCollectMapper;
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryQuestionCollectPage(PageBean pb,QuestionCollectSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("userId",search.getUserId());
  		map.put("questionId",search.getQuestionId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.questionCollectMapper.queryQuestionCollectTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.questionCollectMapper.queryQuestionCollectPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (增加)增加题库模块-题库收藏信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertQuestionCollect(QuestionCollectBean bean){
	
		
		return this.questionCollectMapper.insertQuestionCollect(bean);
		
	}
	

	/**
	 * 根据条件查询所有题库模块-题库收藏信息
	 * @param map
	 * @return
	 */
	public List<QuestionCollectVo> queryQuestionCollectBySearch(QuestionCollectSearch search){
		
		Map<String,Object> map = new HashMap<String,Object>();
  		map.put("id",search.getId());
  		map.put("delflag", search.getDelflag());
  		map.put("userId",search.getUserId());
  		map.put("questionId",search.getQuestionId());
		
		return this.questionCollectMapper.queryQuestionCollectBySearch(map);
	}
	
	
}
