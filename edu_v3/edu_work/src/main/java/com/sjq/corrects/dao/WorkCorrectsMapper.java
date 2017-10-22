package com.sjq.corrects.dao;

import java.util.List;
import java.util.Map;
import com.sjq.corrects.vo.WorkCorrectsVo;
import com.sjq.corrects.bean.WorkCorrectsBean;

/**
 * [自动生成]抽象批改信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-05 19:19:02
 * @version 1.0
 */
public interface WorkCorrectsMapper {


	/**
	 * 查询所有的批改信息信息
	 * @return 查询到的列表
	 */
	List<WorkCorrectsVo> queryAllWorkCorrects();
	
	/**
	 * 根据ID查询批改信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	WorkCorrectsVo queryWorkCorrectsById(Long id);
	
	/**
	 * 根据条件查询所有批改信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<WorkCorrectsVo> queryWorkCorrectsBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询批改信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryWorkCorrectsTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询批改信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryWorkCorrectsPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除批改信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteWorkCorrectsById(WorkCorrectsBean bean);
	
	/**
	 * (更新)根据条件更新所有批改信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateWorkCorrectsBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加批改信息信息
	 * @param bean 批改信息实体
	 * @return     受增加影响的行数
	 */
	int insertWorkCorrects(WorkCorrectsBean bean);

	
}