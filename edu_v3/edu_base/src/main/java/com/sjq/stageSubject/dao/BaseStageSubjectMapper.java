package com.sjq.stageSubject.dao;

import java.util.List;
import java.util.Map;
import com.sjq.stageSubject.vo.BaseStageSubjectVo;
import com.sjq.stageSubject.bean.BaseStageSubjectBean;

/**
 * [自动生成]抽象学段学科信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-03 01:20:27
 * @version 1.0
 */
public interface BaseStageSubjectMapper {


	/**
	 * 根据条件查询所有学段学科信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseStageSubjectVo> queryBaseStageSubjectBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询学段学科信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryBaseStageSubjectTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询学段学科信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryBaseStageSubjectPage(Map<String, Object> map);
	
	/**
	 * (增加)增加学段学科信息信息
	 * @param bean 学段学科信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseStageSubject(BaseStageSubjectBean bean);

	
}