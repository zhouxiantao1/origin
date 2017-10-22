package com.sjq.exam.offline.servlet;

import java.util.List;

import com.sjq.exam.offline.bean.OfflinePaperConfBean;

/**
 * 
 * @ClassName:OfflinePaperConfService
 * @Description:线下考试试卷配置Service
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:14:22
 * @version 1.0
 */
public interface OfflinePaperConfService {
	
	/**
	 * 
	 * @MethodName:insertOfflinePaperConfBatch
	 * @Description:批量插入
	 * @param offlinePaperConfBeanList
	 * @return
	 */
	int insertOfflinePaperConfBatch(List<OfflinePaperConfBean> offlinePaperConfBeanList);
	
	/**
	 * 
	 * @MethodName:queryAllQuestionNo
	 * @Description:根据考试编码及学科编码，获取对应的所有小题
	 * @param examCode
	 * @param subjectCode
	 * @return List<String>
	 * @throws
	 */
	List<String> queryAllQuestionNo(String examCode,String subjectCode);
	
	/**
	 * 
	 * @MethodName:queryAllAbility
	 * @Description:根据考试编码及学科编码，获取对应的所有认知层次
	 * @param examCode
	 * @param subjectCode
	 * @return List<String>
	 * @throws
	 */
	List<String> queryAllAbility(String examCode,String subjectCode);
	
	/**
	 * 
	 * @MethodName:queryqueryAllPoint
	 * @Description:根据考试编码及学科编码，获取对应的所有知识模块
	 * @param examCode
	 * @param subjectCode
	 * @return List<String>
	 * @throws
	 */	
	List<String> queryAllPoint(String examCode,String subjectCode);
	
	/**
	 * 
	 * @MethodName:queryqueryAllPoint
	 * @Description:根据考试编码及学科编码，获取对应的所有题型
	 * @param examCode
	 * @param subjectCode
	 * @return List<String>
	 * @throws
	 */	
	List<String> queryAllType(String examCode,String subjectCode);
	
}
