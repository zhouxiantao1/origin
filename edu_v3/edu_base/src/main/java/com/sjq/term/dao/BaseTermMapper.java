package com.sjq.term.dao;

import java.util.List;
import java.util.Map;
import com.sjq.term.vo.BaseTermVo;
import com.sjq.term.bean.BaseTermBean;

/**
 * [自动生成]抽象基础模块-学期信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:30:58
 * @version 1.0
 */
public interface BaseTermMapper {


	/**
	 * 查询所有的基础模块-学期信息信息
	 * @return 查询到的列表
	 */
	List<BaseTermVo> queryAllBaseTerm();
	
	/**
	 * 根据ID查询基础模块-学期信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseTermVo queryBaseTermById(Long id);
	
	/**
	 * 根据IDS查询所有基础模块-学期信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseTermVo> queryBaseTermByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有基础模块-学期信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseTermVo> queryBaseTermBySearch(Map<String, Object> map);
	
	/**
	 * 分页查询基础模块-学期信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseTermPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除基础模块-学期信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseTermById(BaseTermBean bean);
	
	/**
	 * (删除)根据IDS删除基础模块-学期信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseTermByIds(Map<String, Object> map);
		
	/**
	 * (更新)根据ID更新所有基础模块-学期信息信息
	 * @param bean 基础模块-学期信息实体
	 * @return     受更新影响的行数
	 */
	int updateBaseTermById(BaseTermBean bean);
	
	/**
	 * 根据条件查询基础模块-学期信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseTermTotalCount(Map<String, Object> map);
	
	
}