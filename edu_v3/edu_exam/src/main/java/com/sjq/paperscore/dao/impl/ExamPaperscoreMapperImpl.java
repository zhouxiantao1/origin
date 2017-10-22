package com.sjq.paperscore.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.paperscore.vo.ExamPaperscoreVo;
import com.sjq.paperscore.bean.ExamPaperscoreBean;
import com.sjq.paperscore.dao.ExamPaperscoreMapper;

/**
 * [自动生成]考生考试卷面得分DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:20
 * @version 1.0
 */
@Repository("ExamPaperscoreMapper")
public class ExamPaperscoreMapperImpl extends BasicSqlSupport implements ExamPaperscoreMapper {

	/**
	 * 根据ID查询考生考试卷面得分信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public ExamPaperscoreVo queryExamPaperscoreById(Long id){
	    return this.selectOne("com.sjq.paperscore.dao.ExamPaperscoreMapper.queryExamPaperscoreById",id);
	}

	/**
	 * 根据条件查询所有考生考试卷面得分信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<ExamPaperscoreVo>  queryExamPaperscoreBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.paperscore.dao.ExamPaperscoreMapper.queryExamPaperscoreBySearch",map);
	}
	
	/**
	 * (增加)增加考生考试卷面得分信息
	 * @param bean 考生考试卷面得分实体
	 * @return     受增加影响的行数
	 */
	public int  insertExamPaperscore(ExamPaperscoreBean bean){
		return this.insert("com.sjq.paperscore.dao.ExamPaperscoreMapper.insertExamPaperscore", bean);
	}
	
	

}