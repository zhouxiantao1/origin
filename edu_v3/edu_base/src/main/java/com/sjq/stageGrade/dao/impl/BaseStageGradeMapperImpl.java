package com.sjq.stageGrade.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.stageGrade.vo.BaseStageGradeVo;
import com.sjq.stageGrade.bean.BaseStageGradeBean;
import com.sjq.stageGrade.dao.BaseStageGradeMapper;

/**
 * [自动生成]学段年级信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-03 22:00:49
 * @version 1.0
 */
@Repository("BaseStageGradeMapper")
public class BaseStageGradeMapperImpl extends BasicSqlSupport implements BaseStageGradeMapper {
	
	/**
	 * 根据条件查询所有学段年级信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseStageGradeVo>  queryBaseStageGradeBySearch(Map map){
		return this.selectList("com.sjq.stageGrade.dao.BaseStageGradeMapper.queryBaseStageGradeBySearch",map);
	}
	
	/**
	 * (删除)根据条件删除学段年级信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseStageGradeBySearch(Map<String, Object> map){
		return this.delete("com.sjq.stageGrade.dao.BaseStageGradeMapper.deleteBaseStageGradeBySearch",map);
	}
	
	/**
	 * (增加)增加学段年级信息信息
	 * @param bean 学段年级信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseStageGrade(BaseStageGradeBean bean){
		return this.insert("com.sjq.stageGrade.dao.BaseStageGradeMapper.insertBaseStageGrade", bean);
	}
	
	

}