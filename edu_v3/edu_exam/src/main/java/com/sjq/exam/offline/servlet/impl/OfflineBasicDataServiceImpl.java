package com.sjq.exam.offline.servlet.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.exam.offline.bean.OfflineBasicDataBean;
import com.sjq.exam.offline.dao.OfflineBasicDataMapper;
import com.sjq.exam.offline.servlet.OfflineBasicDataService;
import com.sjq.exam.offline.vo.ExamOfflineAreaInfoVo;
import com.sjq.exam.offline.vo.ExamOfflineDataVo;

/**
 * 
 * @ClassName:OfflineBasicDataServiceImp
 * @Description:TODO
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 下午2:55:40
 * @version 1.0
 */
@Service("OfflineBasicDataService")
public class OfflineBasicDataServiceImpl implements OfflineBasicDataService {
	
	@Autowired
	private OfflineBasicDataMapper offlineBasicDataMapper;

	/**
	 * 
	 * @MethodName:selectUserAreaInfo
	 * @Description:获取登录人可以查看的区域信息
	 * @return ExamOfflineAreaInfoVo
	 */
	public ExamOfflineAreaInfoVo selectUserAreaInfo() {
		return this.offlineBasicDataMapper.selectUserAreaInfo();
	}

	/**
	 * 
	 * @MethodName:selectAllOfflineBasicData
	 * @Description:根据区域编码、学校编码、班级编码获取该班的所有人员的信息
	 * @param districtCode
	 * @param schoolCode
	 * @param classCode
	 * @return List<ExamOfflineDataVo>
	 */
	public List<ExamOfflineDataVo> selectAllOfflineBasicData(String districtCode,String schoolCode,String classCode) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("districtCode", districtCode);
		map.put("schoolCode", schoolCode);
		map.put("classCode", classCode);
		
		return offlineBasicDataMapper.selectAllOfflineBasicData(map);
	}

	/**
	 * 
	 * @MethodName:insertOfflineBasicDataBatch
	 * @Description:批量添加
	 * @param offlineBasicDataBeanList
	 * @return
	 */
	public int insertOfflineBasicDataBatch(List<OfflineBasicDataBean> offlineBasicDataBeanList) {
		return offlineBasicDataMapper.insertOfflineBasicDataBatch(offlineBasicDataBeanList);
	}
	
}
