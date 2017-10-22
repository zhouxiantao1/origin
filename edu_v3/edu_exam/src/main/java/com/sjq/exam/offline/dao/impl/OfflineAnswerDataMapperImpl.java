package com.sjq.exam.offline.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sjq.exam.offline.bean.OfflineAnswerDataBean;
import com.sjq.exam.offline.dao.OfflineAnswerDataMapper;
import com.sjq.manager.base.BasicSqlSupport;

/**
 * 
 * @ClassName:OfflinePaperConfMapperImp
 * @Description:线下考试试卷配置daoImp
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:23:34
 * @version 1.0
 */
@Repository("OfflineAnswerDataMapper")
public class OfflineAnswerDataMapperImpl extends BasicSqlSupport implements OfflineAnswerDataMapper {

	/**
	 * 
	 * @MethodName:insertOfflineAnswerDataBatch
	 * @Description:批量添加
	 * @param offlineAnswerDataBeanList
	 * @return
	 */
	public int insertOfflineAnswerDataBatch(List<OfflineAnswerDataBean> offlineAnswerDataBeanList) {
		return this.insert("insertOfflineAnswerDataBatch", offlineAnswerDataBeanList);
	}

	
}
