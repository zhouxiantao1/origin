package com.sjq.offpaperscore.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.offpaperscore.bean.OffPaperscoreBean;
import com.sjq.offpaperscore.dao.OffPaperscoreMapper;

/**
 * [自动生成]考生考试卷面得分DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:20
 * @version 1.0
 */
@Repository("OffPaperscoreMapper")
public class OffPaperscoreMapperImpl extends BasicSqlSupport implements OffPaperscoreMapper {

	@Override
	public int insertOffPaperscoreBatch(List<OffPaperscoreBean> offPaperscoreBeanList) {
		return this.insert("com.sjq.offpaperscore.dao.OffPaperscoreMapper.insertOffPaperscoreBatch", offPaperscoreBeanList);  
	}

	@Override
	public int deleteOffPaperscoreBatch(Map<String, Object> map) {
		return this.delete("com.sjq.offpaperscore.dao.OffPaperscoreMapper.deleteOffPaperscoreBatch", map);
	}

	@Override
	public Map<String, Map<String,String>> queryOffPaperscoreBySearch(Map<String, Object> map) {
		return this.selectMap("com.sjq.offpaperscore.dao.OffPaperscoreMapper.queryOffPaperscoreBySearch",map,"cname");
	}

	
}