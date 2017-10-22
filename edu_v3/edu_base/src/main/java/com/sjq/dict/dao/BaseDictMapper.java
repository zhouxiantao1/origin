package com.sjq.dict.dao;

import java.util.List;
import java.util.Map;
import com.sjq.dict.vo.BaseDictVo;
import com.sjq.dict.bean.BaseDictBean;

/**
 * [自动生成]抽象字典工具信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-27 18:11:47
 * @version 1.0
 */
public interface BaseDictMapper {


	/**
	 * 查询所有的字典工具信息信息
	 * @return 查询到的列表
	 */
	List<BaseDictVo> queryAllBaseDict();
	
	/**
	 * 根据ID查询字典工具信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseDictVo queryBaseDictById(Long id);
	
	/**
	 * 根据IDS查询所有字典工具信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseDictVo> queryBaseDictByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有字典工具信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseDictVo> queryBaseDictBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询字典工具信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseDictTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询字典工具信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseDictPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除字典工具信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseDictById(BaseDictBean bean);
	
	/**
	 * (增加)增加字典工具信息信息
	 * @param bean 字典工具信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseDict(BaseDictBean bean);

	
}