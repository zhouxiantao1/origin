package com.sjq.exam.offline.vo;

import java.util.Map;

import com.sjq.security.util.CustomUser;

/**
 * 
 * @ClassName:ExamOfflineAreaInfoVo
 * @Description:获取登录人的基础信息（登录人所属市，区，校及其对应角色可查的区域）
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月24日 下午4:11:07
 * @version 1.0
 */
public class ExamOfflineAreaInfoVo {
	
	private CustomUser cu;//用户
	
	private Map<String,Object> regionMap;//对应角色所包含的区集合
	
	private Map<String,Object> schoolMap;//对应角色所包含的学校集合
	
	private Map<String,Object> classMap;//对应角色所包含的班级集合

	public CustomUser getCu() {
		return cu;
	}

	public void setCu(CustomUser cu) {
		this.cu = cu;
	}

	public Map<String, Object> getRegionMap() {
		return regionMap;
	}

	public void setRegionMap(Map<String, Object> regionMap) {
		this.regionMap = regionMap;
	}

	public Map<String, Object> getSchoolMap() {
		return schoolMap;
	}

	public void setSchoolMap(Map<String, Object> schoolMap) {
		this.schoolMap = schoolMap;
	}

	public Map<String, Object> getClassMap() {
		return classMap;
	}

	public void setClassMap(Map<String, Object> classMap) {
		this.classMap = classMap;
	}

}
