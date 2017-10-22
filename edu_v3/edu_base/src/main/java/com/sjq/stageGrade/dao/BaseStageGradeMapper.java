package com.sjq.stageGrade.dao;

import java.util.List;
import java.util.Map;
import com.sjq.stageGrade.vo.BaseStageGradeVo;
import com.sjq.stageGrade.bean.BaseStageGradeBean;

/**
 * [自动生成]抽象学段年级信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-03 22:00:49
 * @version 1.0
 */
public interface BaseStageGradeMapper {

	
	/**
	 * 根据条件查询所有学段年级信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<BaseStageGradeVo> queryBaseStageGradeBySearch(Map map);
	
	/**
	 * (删除)根据条件删除学段年级信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteBaseStageGradeBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加学段年级信息信息
	 * @param bean 学段年级信息实体
	 * @return     受增加影响的行数
	 */
	int insertBaseStageGrade(BaseStageGradeBean bean);

	
}