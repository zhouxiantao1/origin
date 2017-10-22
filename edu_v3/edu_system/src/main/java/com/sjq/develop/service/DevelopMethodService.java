package com.sjq.develop.service;

import java.util.List;
import java.util.Map;

import com.sjq.develop.bean.DevelopCodeBean;
import com.sjq.develop.bean.DevelopCodeMethodBean;
import com.sjq.develop.search.DevelopCodeSearch;
import com.sjq.develop.vo.DevelopCodeVo;
import com.sjq.develop.vo.DevelopMethodVo;
import com.sjq.util.PageBean;


/**
 * [自动生成]抽象代码生成模块service层
 * @author Zheng.ZeJie
 * @since  
 * @version 1.0
 */
public interface DevelopMethodService {

	/**
	 * 查询所有的方法配置信息
	 * @return
	 */
	List<DevelopMethodVo> queryDevelopMethodAll();
	
	/**
	 * 保存配置信息（先清空之前配置）
	 * @param codeId
	 * @param bean
	 * @return
	 */
	int insertDevelopCodeMethod(Long codeId,List<DevelopCodeMethodBean> bs);
	
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