package com.sjq.offpaperscore.service;

import java.util.List;
import java.util.Map;

import com.sjq.offpaperscore.bean.OffPaperscoreBean;
import com.sjq.offpaperscore.search.OffPaperscoreSearch;

/**
 * [自动生成]抽象考生考试卷面得分service层
 * @author  ShuiJingQiu
 * @since   2017-05-31 22:32:20
 * @version 1.0
 */
 
public interface OffPaperscoreService {
	
	int insertOffPaperscoreBatch(List<OffPaperscoreBean> offPaperscoreBeanList);
	
	int deleteOffPaperscoreBatch(Long examId,Long examDetailId);
	
	Map<String, Map<String,String>> queryOffPaperscoreBySearch(OffPaperscoreSearch search);
}