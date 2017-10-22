package com.sjq.develop.dao;

import java.util.List;

import com.sjq.develop.bean.DevelopCodeMethodBean;
import com.sjq.develop.vo.DevelopMethodVo;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月13日上午9:28:55
 * @version 1.0
 */
public interface DevelopMethodMapper {
	
	/**
	 * 查询所有的方法配置信息
	 * @return
	 */
	List<DevelopMethodVo> queryDevelopMethodAll();
	
	
	/**
	 * 根据开发任务id删除所有配置信息
	 * @param codeId
	 * @return
	 */
	int deleteAllDevelopCodeMethodByCodeId(Long codeId);
	
	
	/**
	 * 保存开发方式配置信息
	 * @param bean
	 * @return
	 */
	int insertDevelopCodeMethod(DevelopCodeMethodBean bean);
	
	
	
	/**
	 * 根据codeid查询所有的方法配置信息与已配置上的信息
	 * @return
	 */
	List<DevelopMethodVo> queryDevelopMethodAllByCodeId(Long codeId);
	
	
	/**
	 * 查询所有的方法配置信息
	 * @return
	 */
	List<DevelopMethodVo> queryDevelopMethodByCodeId(Long codeId);
	
	
	/**
	 * 根据ids查询方式列表信息
	 * @param ids
	 * @return
	 */
	List<DevelopMethodVo> queryDevelopMethodByIds(Long[] ids);
	


}
