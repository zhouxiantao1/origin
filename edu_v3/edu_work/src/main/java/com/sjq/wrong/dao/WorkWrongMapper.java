package com.sjq.wrong.dao;

import java.util.List;
import java.util.Map;
import com.sjq.wrong.vo.WorkWrongVo;
import com.sjq.wrong.bean.WorkWrongBean;

/**
 * [自动生成]抽象错题信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-06-27 16:47:56
 * @version 1.0
 */
public interface WorkWrongMapper {


	/**
	 * 根据ID查询错题信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	WorkWrongVo queryWorkWrongById(Long id);
	
	/**
	 * 根据条件查询所有错题信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<WorkWrongVo> queryWorkWrongBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询错题信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryWorkWrongTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询错题信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryWorkWrongPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除错题信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteWorkWrongById(WorkWrongBean bean);
	
	/**
	 * (更新)根据ID更新所有错题信息信息
	 * @param bean 错题信息实体
	 * @return     受更新影响的行数
	 */
	int updateWorkWrongById(WorkWrongBean bean);
	
	/**
	 * (更新)根据条件更新所有错题信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateWorkWrongBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加错题信息信息
	 * @param bean 错题信息实体
	 * @return     受增加影响的行数
	 */
	int insertWorkWrong(WorkWrongBean bean);

	
}