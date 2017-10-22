package com.sjq.stageSubject.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.stageSubject.vo.BaseStageSubjectVo;
import com.sjq.stageSubject.bean.BaseStageSubjectBean;
import com.sjq.stageSubject.dao.BaseStageSubjectMapper;

/**
 * [自动生成]学段学科信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-03 01:20:27
 * @version 1.0
 */
@Repository("BaseStageSubjectMapper")
public class BaseStageSubjectMapperImpl extends BasicSqlSupport implements BaseStageSubjectMapper {

	/**
	 * 根据条件查询所有学段学科信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseStageSubjectVo>  queryBaseStageSubjectBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.stageSubject.dao.BaseStageSubjectMapper.queryBaseStageSubjectBySearch",map);
	}
	
	/**
	 * 根据条件查询学段学科信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseStageSubjectTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.stageSubject.dao.BaseStageSubjectMapper.queryBaseStageSubjectTotalCount",map);
	}
	
	/**
	 * 分页查询学段学科信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseStageSubjectPage(Map<String, Object> map){
		return this.selectList("com.sjq.stageSubject.dao.BaseStageSubjectMapper.queryBaseStageSubjectPage",map);
	}
	
	/**
	 * (增加)增加学段学科信息信息
	 * @param bean 学段学科信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseStageSubject(BaseStageSubjectBean bean){
		return this.insert("com.sjq.stageSubject.dao.BaseStageSubjectMapper.insertBaseStageSubject", bean);
	}
	
	

}