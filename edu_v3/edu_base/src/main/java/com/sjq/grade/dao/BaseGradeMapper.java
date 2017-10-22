package com.sjq.grade.dao;

import java.util.List;
import java.util.Map;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.grade.bean.BaseGradeBean;

/**
 * [自动生成]抽象基础模块-学段信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:26:54
 * @version 1.0
 */
public interface BaseGradeMapper {
	
	/**
	 * (增加)增加基础模块-学段信息信息
	 * @param bean 基础模块-学段信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseGrade(BaseGradeBean bean);
	
	/**
	 * 根据学段ID查询基础模块-学段信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	List<BaseGradeVo> queryBaseGradeByStageId(Long stageId);
	
	/**
	 * 查询所有的基础模块-学段信息信息
	 * @return 查询到的列表
	 */
	List<BaseGradeVo> queryAllBaseGrade();
	
	/**
	 * 根据ID查询基础模块-学段信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseGradeVo queryBaseGradeById(Long id);
	
	/**
	 * 根据IDS查询所有基础模块-学段信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseGradeVo> queryBaseGradeByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有基础模块-学段信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseGradeVo> queryBaseGradeBySearch(Map<String, Object> map);
	
	/**
	 * 分页查询基础模块-学段信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseGradePage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除基础模块-学段信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseGradeById(BaseGradeBean bean);
	
	/**
	 * (删除)根据IDS删除基础模块-学段信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseGradeByIds(Map<String, Object> map);
		
	/**
	 * (更新)根据ID更新所有基础模块-学段信息信息
	 * @param bean 基础模块-学段信息实体
	 * @return     受更新影响的行数
	 */
	int updateBaseGradeById(BaseGradeBean bean);
	
	/**
	 * 根据条件查询基础模块-学段信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseGradeTotalCount(Map<String, Object> map);
	
	
}