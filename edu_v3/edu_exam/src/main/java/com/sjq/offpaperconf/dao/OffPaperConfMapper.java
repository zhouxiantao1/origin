package com.sjq.offpaperconf.dao;

import java.util.List;
import java.util.Map;

import com.sjq.offpaperconf.vo.OffPaperConfBean;

/**
 * 
 * @ClassName:OfflinePaperConfMapper
 * @Description:线下考试试卷配置dao
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:22:41
 * @version 1.0
 */
public interface OffPaperConfMapper {
	
	/**
	 * 
	 * @MethodName:insertOfflinePaperConfBatch
	 * @Description:批量插入
	 * @param offlinePaperConfBeanList
	 * @return
	 */
	int insertOffPaperConfBatch(List<OffPaperConfBean> offPaperConfBeanList);
	
	/**
	 * 
	 * @MethodName:queryAllQuestionNo
	 * @Description:根据考试编码及学科编码，获取对应的所有小题
	 * @param map
	 * @return List<String>
	 * @throws
	 */
	List<String> queryAllQuestionNo(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName:queryAllAbility
	 * @Description:根据考试编码及学科编码，获取对应的所有认知层次
	 * @param map
	 * @return List<String>
	 * @throws
	 */
	List<String> queryAllAbility(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName:queryqueryAllPoint
	 * @Description:根据考试编码及学科编码，获取对应的所有知识模块
	 * @param map
	 * @return List<String>
	 * @throws
	 */	
	List<String> queryAllPoint(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName:queryqueryAllPoint
	 * @Description:根据考试编码及学科编码，获取对应的所有题型
	 * @param map
	 * @return List<String>
	 * @throws
	 */	
	List<String> queryAllType(Map<String, Object> map);
	
	int deleteOffPaperConfBatch(Map<String, Object> map);
}
