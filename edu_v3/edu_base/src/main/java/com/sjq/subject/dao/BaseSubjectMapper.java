package com.sjq.subject.dao;

import java.util.List;
import java.util.Map;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.subject.bean.BaseSubjectBean;

/**
 * [自动生成]抽象基础模块-学科信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:30:05
 * @version 1.0
 */
public interface BaseSubjectMapper {

	/**
	 * (增加)增加基础模块-学科信息信息
	 * @param bean 基础模块-学科信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseSubject(BaseSubjectBean bean);
	/**
	 * 根据学段ID查询的基础模块-学科信息信息
	 * @return 查询到的列表
	 */
	List<BaseSubjectVo> queryBaseSubjectByStageId(Long stageId);
	
	/**
	 * 查询所有的基础模块-学科信息信息
	 * @return 查询到的列表
	 */
	List<BaseSubjectVo> queryAllBaseSubject();
	
	/**
	 * 根据ID查询基础模块-学科信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseSubjectVo queryBaseSubjectById(Long id);
	
	/**
	 * 根据IDS查询所有基础模块-学科信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseSubjectVo> queryBaseSubjectByIds(Map<String, Object> map);	
			
	/**
	 * 根据条件查询所有基础模块-学科信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseSubjectVo> queryBaseSubjectBySearch(Map<String, Object> map);
	
	/**
	 * 分页查询基础模块-学科信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseSubjectPage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除基础模块-学科信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteBaseSubjectById(BaseSubjectBean bean);
	
	/**
	 * (删除)根据IDS删除基础模块-学科信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseSubjectByIds(Map<String, Object> map);
		
	/**
	 * (更新)根据ID更新所有基础模块-学科信息信息
	 * @param bean 基础模块-学科信息实体
	 * @return     受更新影响的行数
	 */
	int updateBaseSubjectById(BaseSubjectBean bean);
	
	/**
	 * 根据条件查询基础模块-学科信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseSubjectTotalCount(Map<String, Object> map);
	
	
}