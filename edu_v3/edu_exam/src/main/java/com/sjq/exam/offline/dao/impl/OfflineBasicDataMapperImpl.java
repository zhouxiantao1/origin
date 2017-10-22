package com.sjq.exam.offline.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sjq.area.service.BaseAreaService;
import com.sjq.exam.offline.bean.OfflineBasicDataBean;
import com.sjq.exam.offline.dao.OfflineBasicDataMapper;
import com.sjq.exam.offline.vo.ExamOfflineAreaInfoVo;
import com.sjq.exam.offline.vo.ExamOfflineDataVo;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;

/**
 * 
 * @ClassName:OfflineBasicDataMapperImp
 * @Description:线下考试基础数据dao实现层
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 下午3:06:59
 * @version 1.0
 */
@Repository("OfflineBasicDataMapper")
public class OfflineBasicDataMapperImpl extends BasicSqlSupport implements OfflineBasicDataMapper {
	
	@Autowired
	private BaseAreaService baseAreaService;

	//思路：1、获取登录人信息 。2、判断登录人角色。3、根据角色获取 对应的市、区、校、班
	public ExamOfflineAreaInfoVo selectUserAreaInfo() {
		
		ExamOfflineAreaInfoVo eoaif = new ExamOfflineAreaInfoVo();
		
		Map<String,Object> regionMap = new HashMap<String,Object>();
		regionMap.put("1", "海珠区");
		eoaif.setRegionMap(regionMap);
		
		Map<String,Object> schoolMap =  new HashMap<String,Object>();
		schoolMap.put("1", "海珠区第一中学");
		eoaif.setSchoolMap(schoolMap);
		
		Map<String,Object> classMap =  new HashMap<String,Object>();
		classMap.put("1", "海珠区第一中学高一（1）班");
		classMap.put("2", "海珠区第一中学高一（2）班");
		classMap.put("3", "海珠区第一中学高一（3）班");
		eoaif.setClassMap(classMap);
		
		/*//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		if(cu.getRole().getCode().equals("ROLE_02") || cu.getRole().getCode().equals("ROLE_03")){
			//市级角色
			Map regionMap = new HashMap();
			baseAreaService.queryAllBaseArea();
			eoaif.setRegionMap(regionMap);
		}else if(cu.getRole().getCode().equals("ROLE_04") || cu.getRole().getCode().equals("ROLE_05")){
			//区级角色
			Map regionMap = new HashMap();
			regionMap.put(1, "海珠区");
			eoaif.setRegionMap(regionMap);
			
			Map schoolMap = new HashMap();
			schoolMap.put(1, "海珠区第一中学");
			schoolMap.put(2, "海珠区第二中学");
			schoolMap.put(3, "海珠区第三中学");
			eoaif.setSchoolMap(schoolMap);
		}else if(cu.getRole().getCode().equals("ROLE_06") || cu.getRole().getCode().equals("ROLE_07") || cu.getRole().getCode().equals("ROLE_08")){
			//校级角色
			Map regionMap = new HashMap();
			regionMap.put(1, "海珠区");
			eoaif.setRegionMap(regionMap);
			
			Map schoolMap = new HashMap();
			schoolMap.put(1, "海珠区第一中学");
			eoaif.setSchoolMap(schoolMap);
			
			Map classMap = new HashMap();
			classMap.put(1, "海珠区第一中学高一（1）班");
			classMap.put(2, "海珠区第一中学高一（2）班");
			classMap.put(3, "海珠区第一中学高一（3）班");
			eoaif.setClassMap(classMap);
		}else if(cu.getRole().getCode().equals("ROLE_09")){
			//班级角色
			Map regionMap = new HashMap();
			regionMap.put(1, "海珠区");
			eoaif.setRegionMap(regionMap);
			
			Map schoolMap = new HashMap();
			schoolMap.put(1, "海珠区第一中学");
			eoaif.setSchoolMap(schoolMap);
			
			Map classMap = new HashMap();
			classMap.put(1, "海珠区第一中学高一（1）班");
			classMap.put(2, "海珠区第一中学高一（2）班");
			classMap.put(3, "海珠区第一中学高一（3）班");
			eoaif.setClassMap(classMap);
		}*/
		
		return eoaif;
	}

	/**
	 * 
	 * @MethodName:selectAllOfflineBasicData
	 * @Description:根据区域编码、学校编码、班级编码获取该班的所有人员的信息
	 * @param map
	 * @return
	 */
	public List<ExamOfflineDataVo> selectAllOfflineBasicData(Map<String, Object> map) {
		return this.selectList("com.sjq.exam.offline.dao.OfflineBasicDataMapper.selectAllOfflineBasicData",map);
	}

	/**
	 * 
	 * @MethodName:insertOfflineBasicDataBatch
	 * @Description:批量添加
	 * @param offlineBasicDataBeanList
	 * @return
	 */
	public int insertOfflineBasicDataBatch(List<OfflineBasicDataBean> offlineBasicDataBeanList) {
		return this.insert("insertOfflineBasicDataBatch", offlineBasicDataBeanList);  
	}

}
