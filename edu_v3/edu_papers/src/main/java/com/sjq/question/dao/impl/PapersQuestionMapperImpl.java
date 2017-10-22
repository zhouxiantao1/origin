package com.sjq.question.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.question.vo.PapersQuestionVo;
import com.sjq.ware.vo.QuestionWareVo;
import com.sjq.question.bean.PapersQuestionBean;
import com.sjq.question.dao.PapersQuestionMapper;

/**
 * [自动生成]试卷模块-试卷试题信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-10 18:27:38
 * @version 1.0
 */
@Repository("PapersQuestionMapper")
public class PapersQuestionMapperImpl extends BasicSqlSupport implements PapersQuestionMapper {

	/**
	 * 根据条件查询所有试卷模块-试卷试题信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<PapersQuestionVo>  queryPapersQuestionBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.question.dao.PapersQuestionMapper.queryPapersQuestionBySearch",map);
	}
	
	/**
	 * (删除)根据条件删除试卷模块-试卷试题信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deletePapersQuestionBySearch(Map<String, Object> map){
		return this.delete("com.sjq.question.dao.PapersQuestionMapper.deletePapersQuestionBySearch",map);
	}
	
	/**
	 * (更新)根据条件更新所有试卷模块-试卷试题信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updatePapersQuestionBySearch(Map<String, Object> map){
	    return this.update("com.sjq.question.dao.PapersQuestionMapper.updatePapersQuestionBySearch", map);
	}
	
	/**
	 * (增加)增加试卷模块-试卷试题信息信息
	 * @param bean 试卷模块-试卷试题信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertPapersQuestion(PapersQuestionBean bean){
		return this.insert("com.sjq.question.dao.PapersQuestionMapper.insertPapersQuestion", bean);
	}

	/**
	 * 根据条件随机获取题目
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	public List<QuestionWareVo> queryQuestionWareVoList(Map map) {
		return this.selectList("com.sjq.question.dao.PapersQuestionMapper.queryQuestionWareVoList", map);
	}

	
}