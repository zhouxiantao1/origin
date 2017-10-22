package com.sjq.question.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.question.dao.PapersQuestionMapper;
import com.sjq.question.service.PapersQuestionService;
import com.sjq.question.bean.PapersQuestionBean;
import com.sjq.question.search.PapersQuestionSearch;
import com.sjq.question.vo.PapersQuestionVo;
import com.sjq.util.PageBean;
import com.sjq.ware.search.QuestionWareSearch;
import com.sjq.ware.vo.QuestionWareVo;

/**
 * [自动生成]实现试卷模块-试卷试题信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-10 18:27:38
 * @version 1.0
 */
 
@Service("PapersQuestionService")
public class PapersQuestionServiceImpl implements PapersQuestionService {
	

	@Autowired
	private PapersQuestionMapper papersQuestionMapper;
	
	/**
	 * 根据条件查询所有试卷模块-试卷试题信息信息
	 * @param map
	 * @return
	 */
	public List<PapersQuestionVo> queryPapersQuestionBySearch(PapersQuestionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("paperId",search.getPaperId());
  		map.put("paperDetailId",search.getPaperDetailId());
		
		return this.papersQuestionMapper.queryPapersQuestionBySearch(map);
	}
	
	/**
	 * (删除)根据条件删除试卷模块-试卷试题信息信息
	 * @param map
	 * @return
	 */
	public int deletePapersQuestionBySearch(PapersQuestionBean bean,PapersQuestionSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.papersQuestionMapper.deletePapersQuestionBySearch(map);
		
	}

	/**
	 * (更新)根据条件更新所有试卷模块-试卷试题信息信息
	 * @param map
	 * @return
	 */
	public int updatePapersQuestionBySearch(PapersQuestionBean bean,PapersQuestionSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.papersQuestionMapper.updatePapersQuestionBySearch(map);
	}

	/**
	 * (增加)增加试卷模块-试卷试题信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertPapersQuestion(PapersQuestionBean bean){

		return this.papersQuestionMapper.insertPapersQuestion(bean);
		
	}
	
	/**
	 * 根据条件查询题目集合
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	public List<QuestionWareVo> queryQuestionWareVoList(Map map) {
		return this.papersQuestionMapper.queryQuestionWareVoList(map);
	}
	
}
