package com.sjq.exam.offline.servlet;

import java.util.List;

import com.sjq.exam.offline.bean.OfflineBasicDataBean;
import com.sjq.exam.offline.vo.ExamOfflineAreaInfoVo;
import com.sjq.exam.offline.vo.ExamOfflineDataVo;

/**
 * 
 * @ClassName:OfflineBasicDataService
 * @Description:线下基础数据导入service层
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 下午2:43:07
 * @version 1.0
 */
public interface OfflineBasicDataService {
	
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
	 * @param districtCode
	 * @param schoolCode
	 * @param classCode
	 * @return List<ExamOfflineDataVo>
	 * @throws
	 */
	List<ExamOfflineDataVo> selectAllOfflineBasicData(String districtCode,String schoolCode,String classCode);
	
	/**
	 * 
	 * @MethodName:insertOfflineBasicDataBatch
	 * @Description:批量添加
	 * @param offlineBasicDataBeanList
	 * @return
	 */
	int insertOfflineBasicDataBatch(List<OfflineBasicDataBean> offlineBasicDataBeanList);
	
}
