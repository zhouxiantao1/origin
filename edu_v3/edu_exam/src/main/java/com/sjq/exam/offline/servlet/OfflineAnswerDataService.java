package com.sjq.exam.offline.servlet;

import java.util.List;

import com.sjq.exam.offline.bean.OfflineAnswerDataBean;

/**
 * 
 * @ClassName:OfflinePaperConfService
 * @Description:线下考试试卷配置Service
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:14:22
 * @version 1.0
 */
public interface OfflineAnswerDataService {
	
	/**
	 * 
	 * @MethodName:insertOfflineAnswerDataBatch
	 * @Description:批量添加
	 * @param offlineAnswerDataBeanList
	 * @return
	 */
	int insertOfflineAnswerDataBatch(List<OfflineAnswerDataBean> offlineAnswerDataBeanList);
}
