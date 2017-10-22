package com.sjq.exam.offline.dao;

import java.util.List;
import java.util.Map;

import com.sjq.exam.offline.bean.OfflineBasicDataBean;
import com.sjq.exam.offline.vo.ExamOfflineAreaInfoVo;
import com.sjq.exam.offline.vo.ExamOfflineDataVo;

/**
 * 
 * @ClassName:OfflineBasicDataMapper
 * @Description:线下考试基础数据dao层
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 下午3:06:20
 * @version 1.0
 */
public interface OfflineBasicDataMapper {
	
	/**
	 * 
	 * @MethodName:selectUserAreaInfo
	 * @Description:获取登录人可以查看的区域信息
	 * @return ExamOfflineAreaInfoVo
	 */
	ExamOfflineAreaInfoVo selectUserAreaInfo();
	
	/**
	 * 
	 * @MethodName:selectAllOfflineBasicData
	 * @Description:根据区域编码、学校编码、班级编码获取该班的所有人员的信息
	 * @param map
	 * @return List<ExamOfflineDataVo>
	 * @throws
	 */
	List<ExamOfflineDataVo> selectAllOfflineBasicData(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName:insertOfflineBasicDataBatch
	 * @Description:批量添加
	 * @param offlineBasicDataBeanList
	 * @return
	 */
	int insertOfflineBasicDataBatch(List<OfflineBasicDataBean> offlineBasicDataBeanList);
	
}
