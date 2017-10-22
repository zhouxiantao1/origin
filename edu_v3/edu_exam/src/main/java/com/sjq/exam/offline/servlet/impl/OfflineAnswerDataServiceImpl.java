package com.sjq.exam.offline.servlet.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.exam.offline.bean.OfflineAnswerDataBean;
import com.sjq.exam.offline.dao.OfflineAnswerDataMapper;
import com.sjq.exam.offline.servlet.OfflineAnswerDataService;

/**
 * 
 * @ClassName:OfflinePaperConfServiceImpl
 * @Description:线下考试试卷配置ServiceImpl
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:25:55
 * @version 1.0
 */
@Service("OfflineAnswerDataService")
public class OfflineAnswerDataServiceImpl implements OfflineAnswerDataService {

	@Autowired
	private OfflineAnswerDataMapper offlineAnswerDataMapper;
	
	/**
	 * 
	 * @MethodName:insertOfflineAnswerDataBatch
	 * @Description:批量添加
	 * @param offlineAnswerDataBeanList
	 * @return
	 */
	public int insertOfflineAnswerDataBatch(List<OfflineAnswerDataBean> offlineAnswerDataBeanList) {
		return offlineAnswerDataMapper.insertOfflineAnswerDataBatch(offlineAnswerDataBeanList);
	}

}
