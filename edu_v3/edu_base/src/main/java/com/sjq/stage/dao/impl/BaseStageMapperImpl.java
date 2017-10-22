package com.sjq.stage.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.stage.vo.BaseStageVo;
import com.sjq.stage.bean.BaseStageBean;
import com.sjq.stage.dao.BaseStageMapper;

/**
 * [自动生成]基础模块-学段信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:27:20
 * @version 1.0
 */
@Repository("BaseStageMapper")
public class BaseStageMapperImpl extends BasicSqlSupport implements BaseStageMapper {

	/**
	 * 查询所有的基础模块-学段信息信息
	 * @return 查询到的列表
	 */
	public List<BaseStageVo> queryAllBaseStage(){
	     return this.selectList("com.sjq.stage.dao.BaseStageMapper.queryAllBaseStage");
	}
				
	/**
	 * 根据ID查询基础模块-学段信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseStageVo queryBaseStageById(Long id){
	    return this.selectOne("com.sjq.stage.dao.BaseStageMapper.queryBaseStageById",id);
	}

	/**
	 * 根据IDS查询所有基础模块-学段信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseStageVo>  queryBaseStageByIds(Map<String, Object> map){
		return this.selectList("com.sjq.stage.dao.BaseStageMapper.queryBaseStageByIds",map);
	}

	/**
	 * 根据条件查询所有基础模块-学段信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseStageVo>  queryBaseStageBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.stage.dao.BaseStageMapper.queryBaseStageBySearch",map);
	}
	
	/**
	 * 分页查询基础模块-学段信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseStagePage(Map<String, Object> map){
		return this.selectList("com.sjq.stage.dao.BaseStageMapper.queryBaseStagePage",map);
	}
	
	/**
	 * (删除)根据ID删除基础模块-学段信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseStageById(BaseStageBean bean){
		return this.delete("com.sjq.stage.dao.BaseStageMapper.deleteBaseStageById",bean);
	}
	
	/**
	 * (删除)根据IDS删除基础模块-学段信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseStageByIds(Map<String, Object> map){
		return this.delete("com.sjq.stage.dao.BaseStageMapper.deleteBaseStageByIds",map);
	}
	
	/**
	 * (更新)根据ID更新所有基础模块-学段信息信息
	 * @param bean 基础模块-学段信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateBaseStageById(BaseStageBean bean){
	    return this.update("com.sjq.stage.dao.BaseStageMapper.updateBaseStageById", bean);
	}
	
	/**
	 * 根据条件查询基础模块-学段信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseStageTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.stage.dao.BaseStageMapper.queryBaseStageTotalCount",map);
	}
	
	

}