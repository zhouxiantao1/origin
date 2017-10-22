package com.sjq.offpaperscore.dao;

import java.util.List;
import java.util.Map;

import com.sjq.offpaperscore.bean.OffPaperscoreBean;

public interface OffPaperscoreMapper {
	
	int insertOffPaperscoreBatch(List<OffPaperscoreBean> offPaperscoreBeanList);
	
	int deleteOffPaperscoreBatch(Map<String, Object> map);
	
	Map<String, Map<String,String>> queryOffPaperscoreBySearch(Map<String, Object> map);
}