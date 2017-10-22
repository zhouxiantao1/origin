package com.sjq.subject.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.subject.bean.BaseSubjectBean;
import com.sjq.subject.dao.BaseSubjectMapper;

/**
 * [自动生成]基础模块-学科信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:30:05
 * @version 1.0
 */
@Repository("BaseSubjectMapper")
public class BaseSubjectMapperImpl extends BasicSqlSupport implements BaseSubjectMapper {
	
	/**
	 * (增加)增加基础模块-学科信息信息
	 * @param bean 基础模块-学科信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseSubject(BaseSubjectBean bean){
		return this.insert("com.sjq.subject.dao.BaseSubjectMapper.insertBaseSubject", bean);
	}
	
	/**
	 * 根据学段ID查询的基础模块-学科信息信息
	 * @return 查询到的列表
	 */
	public List<BaseSubjectVo> queryBaseSubjectByStageId(Long stageId){
	     return this.selectList("com.sjq.subject.dao.BaseSubjectMapper.queryBaseSubjectByStageId",stageId);
	}
	
	/**
	 * 查询所有的基础模块-学科信息信息
	 * @return 查询到的列表
	 */
	public List<BaseSubjectVo> queryAllBaseSubject(){
	     return this.selectList("com.sjq.subject.dao.BaseSubjectMapper.queryAllBaseSubject");
	}
				
	/**
	 * 根据ID查询基础模块-学科信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseSubjectVo queryBaseSubjectById(Long id){
	    return this.selectOne("com.sjq.subject.dao.BaseSubjectMapper.queryBaseSubjectById",id);
	}

	/**
	 * 根据IDS查询所有基础模块-学科信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseSubjectVo>  queryBaseSubjectByIds(Map<String, Object> map){
		return this.selectList("com.sjq.subject.dao.BaseSubjectMapper.queryBaseSubjectByIds",map);
	}

	/**
	 * 根据条件查询所有基础模块-学科信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseSubjectVo>  queryBaseSubjectBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.subject.dao.BaseSubjectMapper.queryBaseSubjectBySearch",map);
	}
	
	/**
	 * 分页查询基础模块-学科信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseSubjectPage(Map<String, Object> map){
		return this.selectList("com.sjq.subject.dao.BaseSubjectMapper.queryBaseSubjectPage",map);
	}
	
	/**
	 * (删除)根据ID删除基础模块-学科信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseSubjectById(BaseSubjectBean bean){
		return this.delete("com.sjq.subject.dao.BaseSubjectMapper.deleteBaseSubjectById",bean);
	}
	
	/**
	 * (删除)根据IDS删除基础模块-学科信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseSubjectByIds(Map<String, Object> map){
		return this.delete("com.sjq.subject.dao.BaseSubjectMapper.deleteBaseSubjectByIds",map);
	}
	
	/**
	 * (更新)根据ID更新所有基础模块-学科信息信息
	 * @param bean 基础模块-学科信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateBaseSubjectById(BaseSubjectBean bean){
	    return this.update("com.sjq.subject.dao.BaseSubjectMapper.updateBaseSubjectById", bean);
	}
	
	/**
	 * 根据条件查询基础模块-学科信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseSubjectTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.subject.dao.BaseSubjectMapper.queryBaseSubjectTotalCount",map);
	}
	
	

}