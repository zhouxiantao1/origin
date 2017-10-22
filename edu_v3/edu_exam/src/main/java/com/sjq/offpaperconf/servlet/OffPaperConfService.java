package com.sjq.offpaperconf.servlet;

import java.util.List;

import com.sjq.offpaperconf.vo.OffPaperConfBean;

/**
 * 
 * @ClassName:OfflinePaperConfService
 * @Description:线下考试试卷配置Service
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:14:22
 * @version 1.0
 */
public interface OffPaperConfService {
	
	/**
	 * 
	 * @MethodName:insertOfflinePaperConfBatch
	 * @Description:批量插入
	 * @param offlinePaperConfBeanList
	 * @return
	 */
	int insertOffPaperConfBatch(List<OffPaperConfBean> offPaperConfBeanList);
	int deleteOffPaperConfBatch(Long examId,Long examDetailId);
	
	/**
	 * 
	 * @MethodName:queryAllQuestionNo
	 * @Description:根据考试编码及学科编码，获取对应的所有小题
	 * @param examId
	 * @param subjectId
	 * @return List<String>
	 * @throws
	 */
	List<String> queryAllQuestionNo(Long examDetailId);
	
	/**
	 * 
	 * @MethodName:queryAllAbility
	 * @Description:根据考试编码及学科编码，获取对应的所有认知层次
	 * @param examId
	 * @param subjectId
	 * @return List<String>
	 * @throws
	 */
	List<String> queryAllAbility(Long examId,Long subjectId);
	
	/**
	 * 
	 * @MethodName:queryqueryAllPoint
	 * @Description:根据考试编码及学科编码，获取对应的所有知识模块
	 * @param examId
	 * @param subjectId
	 * @return List<String>
	 * @throws
	 */	
	List<String> queryAllPoint(Long examId,Long subjectId);
	
	/**
	 * 
	 * @MethodName:queryqueryAllPoint
	 * @Description:根据考试编码及学科编码，获取对应的所有题型
	 * @param examId
	 * @param subjectId
	 * @return List<String>
	 * @throws
	 */	
	List<String> queryAllType(Long examId,Long subjectId);
	
}
