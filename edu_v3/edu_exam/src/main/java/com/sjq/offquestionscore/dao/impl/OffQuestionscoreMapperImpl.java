package com.sjq.offquestionscore.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.offquestionscore.bean.OffQuestionscoreBean;
import com.sjq.offquestionscore.dao.OffQuestionscoreMapper;

/**
 * [自动生成]试管理-考生考试试题得分DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:05
 * @version 1.0
 */
@Repository("OffQuestionscoreMapper")
public class OffQuestionscoreMapperImpl extends BasicSqlSupport implements OffQuestionscoreMapper {

	@Override
	public int insertOffQuestionScoreBatch(List<OffQuestionscoreBean> offQuestionscoreBeanList) {
		return this.insert("com.sjq.offquestionscore.dao.OffQuestionscoreMapper.insertOffQuestionScoreBatch", offQuestionscoreBeanList);
	}

	@Override
	public int deleteOffQuestionScoreBatch(Map<String, Object> map) {
		return this.delete("com.sjq.offquestionscore.dao.OffQuestionscoreMapper.deleteOffQuestionScoreBatch", map);
	}

	

}