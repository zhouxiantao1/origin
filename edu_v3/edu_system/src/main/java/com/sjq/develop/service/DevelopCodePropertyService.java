package com.sjq.develop.service;

import java.util.List;

import com.sjq.develop.bean.DevelopCodePropertyBean;
import com.sjq.develop.vo.DevelopCodePropertyVo;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月12日上午9:39:51
 * @version 1.0
 */
public interface DevelopCodePropertyService {
	
	
	/**
	 * 根据codeId查询属性列表
	 * @param id
	 * @return
	 */
	List<DevelopCodePropertyVo> queryDevelopCodePropertyByCodeId(Long codeId);

	
	
	/**
	 * 增加代码属性
	 * @param bean
	 * @return
	 */
	int insertDevelopCodeProerty(DevelopCodePropertyBean bean);
}
