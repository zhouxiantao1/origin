package com.sjq.area.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.area.vo.BaseAreaVo;
import com.sjq.area.bean.BaseAreaBean;
import com.sjq.area.dao.BaseAreaMapper;

/**
 * [自动生成]基础模块-区域信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-25 16:25:00
 * @version 1.0
 */
@Repository("BaseAreaMapper")
public class BaseAreaMapperImpl extends BasicSqlSupport implements BaseAreaMapper {
	
	/**
	 * (增加)增加基础模块-区域信息信息
	 * @param bean 基础模块-区域信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertBaseArea(BaseAreaBean bean){
		return this.insert("com.sjq.area.dao.BaseAreaMapper.insertBaseArea", bean);
	}
	
	/**
	 * 查询所有的基础模块-区域信息信息
	 * @return 查询到的列表
	 */
	public List<BaseAreaVo> queryAllBaseArea(){
	     return this.selectList("com.sjq.area.dao.BaseAreaMapper.queryAllBaseArea");
	}
				
	/**
	 * 根据ID查询基础模块-区域信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseAreaVo queryBaseAreaById(Long id){
	    return this.selectOne("com.sjq.area.dao.BaseAreaMapper.queryBaseAreaById",id);
	}

	/**
	 * 根据IDS查询所有基础模块-区域信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseAreaVo>  queryBaseAreaByIds(Map<String, Object> map){
		return this.selectList("com.sjq.area.dao.BaseAreaMapper.queryBaseAreaByIds",map);
	}

	/**
	 * 根据条件查询所有基础模块-区域信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseAreaVo>  queryBaseAreaBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.area.dao.BaseAreaMapper.queryBaseAreaBySearch",map);
	}
	
	/**
	 * 根据条件查询基础模块-区域信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseAreaTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.area.dao.BaseAreaMapper.queryBaseAreaTotalCount",map);
	}
	
	/**
	 * 分页查询基础模块-区域信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseAreaPage(Map<String, Object> map){
		return this.selectList("com.sjq.area.dao.BaseAreaMapper.queryBaseAreaPage",map);
	}
	
	/**
	 * (删除)根据ID删除基础模块-区域信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseAreaById(BaseAreaBean bean){
		return this.delete("com.sjq.area.dao.BaseAreaMapper.deleteBaseAreaById",bean);
	}
	
	/**
	 * (删除)根据IDS删除基础模块-区域信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseAreaByIds(Map<String, Object> map){
		return this.delete("com.sjq.area.dao.BaseAreaMapper.deleteBaseAreaByIds",map);
	}
	
	/**
	 * (更新)根据ID更新所有基础模块-区域信息信息
	 * @param bean 基础模块-区域信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateBaseAreaById(BaseAreaBean bean){
	    return this.update("com.sjq.area.dao.BaseAreaMapper.updateBaseAreaById", bean);
	}
	
	/**
	 * (查询)根据父类ID查询
	 * */
	public List<BaseAreaVo> queryBaseAreaByParentId(Long parentId){
		return this.selectList("com.sjq.area.dao.BaseAreaMapper.queryBaseAreaByParentId",parentId);
	}
	

}