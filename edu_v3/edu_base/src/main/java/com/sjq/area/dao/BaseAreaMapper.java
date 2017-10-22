package com.sjq.area.dao;

import java.util.List;
import java.util.Map;
import com.sjq.area.vo.BaseAreaVo;
import com.sjq.area.bean.BaseAreaBean;

/**
 * [自动生成]抽象基础模块-区域信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-25 16:25:00
 * @version 1.0
 */
public interface BaseAreaMapper {

	/**
	 * (增加)增加基础模块-区域信息信息
	 * @param bean 基础模块-区域信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseArea(BaseAreaBean bean);
	/**
	 * 查询所有的基础模块-区域信息信息
	 * @return 查询到的列表
	 */
	List<BaseAreaVo> queryAllBaseArea();
	
	/**
	 * 根据ID查询基础模块-区域信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseAreaVo queryBaseAreaById(Long id);
	
	/**
	 * 根据IDS查询所有基础模块-区域信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseAreaVo> queryBaseAreaByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有基础模块-区域信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseAreaVo> queryBaseAreaBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询基础模块-区域信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseAreaTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询基础模块-区域信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseAreaPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除基础模块-区域信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseAreaById(BaseAreaBean bean);
	
	/**
	 * (删除)根据IDS删除基础模块-区域信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseAreaByIds(Map<String, Object> map);
		
	/**
	 * (更新)根据ID更新所有基础模块-区域信息信息
	 * @param bean 基础模块-区域信息实体
	 * @return     受更新影响的行数
	 */
	int updateBaseAreaById(BaseAreaBean bean);
	
	/**
	 * (查询)根据父类ID查询
	 * */
	public List<BaseAreaVo> queryBaseAreaByParentId(Long parentId);
}