package com.sjq.paperscore.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.paperscore.dao.ExamPaperscoreMapper;
import com.sjq.paperscore.service.ExamPaperscoreService;
import com.sjq.paperscore.bean.ExamPaperscoreBean;
import com.sjq.paperscore.search.ExamPaperscoreSearch;
import com.sjq.paperscore.vo.ExamPaperscoreVo;

/**
 * [自动生成]实现考生考试卷面得分service层
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:20
 * @version 1.0
 */
 
@Service("ExamPaperscoreService")
public class ExamPaperscoreServiceImpl implements ExamPaperscoreService {
	

	@Autowired
	private ExamPaperscoreMapper examPaperscoreMapper;
	
				
	
	/**
	 * 根据ID查询考生考试卷面得分信息
	 * @return
	 */
	public ExamPaperscoreVo queryExamPaperscoreById(Long id){
		
		return this.examPaperscoreMapper.queryExamPaperscoreById(id);

	}
	

	/**
	 * 根据条件查询所有考生考试卷面得分信息
	 * @param map
	 * @return
	 */
	public List<ExamPaperscoreVo> queryExamPaperscoreBySearch(ExamPaperscoreSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("examDetailId",search.getExamDetailId());
  		map.put("studentId",search.getStudentId());
		
		return this.examPaperscoreMapper.queryExamPaperscoreBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加考生考试卷面得分信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertExamPaperscore(ExamPaperscoreBean bean){
	
		
		return this.examPaperscoreMapper.insertExamPaperscore(bean);
		
	}
	
	
}
