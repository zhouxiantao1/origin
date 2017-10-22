package com.sjq.exam.offline.dao;

import java.util.List;

import com.sjq.exam.offline.bean.OfflineAnswerDataBean;

/**
 * 
 * @ClassName:OfflinePaperConfMapper
 * @Description:线下考试试卷配置dao
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:22:41
 * @version 1.0
 */
public interface OfflineAnswerDataMapper {
	
	/**
	 * 
	 * @MethodName:insertOfflineAnswerDataBatch
	 * @Description:批量添加
	 * @param offlineAnswerDataBeanList
	 * @return
	 */
	int insertOfflineAnswerDataBatch(List<OfflineAnswerDataBean> offlineAnswerDataBeanList);
}
