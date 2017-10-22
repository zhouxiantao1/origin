package com.sjq.term.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.term.vo.BaseTermVo;
import com.sjq.term.bean.BaseTermBean;
import com.sjq.term.dao.BaseTermMapper;

/**
 * [自动生成]基础模块-学期信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-04-25 14:30:58
 * @version 1.0
 */
@Repository("BaseTermMapper")
public class BaseTermMapperImpl extends BasicSqlSupport implements BaseTermMapper {

	/**
	 * 查询所有的基础模块-学期信息信息
	 * @return 查询到的列表
	 */
	public List<BaseTermVo> queryAllBaseTerm(){
	     return this.selectList("com.sjq.term.dao.BaseTermMapper.queryAllBaseTerm");
	}
				
	/**
	 * 根据ID查询基础模块-学期信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public BaseTermVo queryBaseTermById(Long id){
	    return this.selectOne("com.sjq.term.dao.BaseTermMapper.queryBaseTermById",id);
	}

	/**
	 * 根据IDS查询所有基础模块-学期信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseTermVo>  queryBaseTermByIds(Map<String, Object> map){
		return this.selectList("com.sjq.term.dao.BaseTermMapper.queryBaseTermByIds",map);
	}

	/**
	 * 根据条件查询所有基础模块-学期信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<BaseTermVo>  queryBaseTermBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.term.dao.BaseTermMapper.queryBaseTermBySearch",map);
	}
	
	/**
	 * 分页查询基础模块-学期信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryBaseTermPage(Map<String, Object> map){
		return this.selectList("com.sjq.term.dao.BaseTermMapper.queryBaseTermPage",map);
	}
	
	/**
	 * (删除)根据ID删除基础模块-学期信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteBaseTermById(BaseTermBean bean){
		return this.delete("com.sjq.term.dao.BaseTermMapper.deleteBaseTermById",bean);
	}
	
	/**
	 * (删除)根据IDS删除基础模块-学期信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteBaseTermByIds(Map<String, Object> map){
		return this.delete("com.sjq.term.dao.BaseTermMapper.deleteBaseTermByIds",map);
	}
	
	/**
	 * (更新)根据ID更新所有基础模块-学期信息信息
	 * @param bean 基础模块-学期信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateBaseTermById(BaseTermBean bean){
	    return this.update("com.sjq.term.dao.BaseTermMapper.updateBaseTermById", bean);
	}
	
	/**
	 * 根据条件查询基础模块-学期信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryBaseTermTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.term.dao.BaseTermMapper.queryBaseTermTotalCount",map);
	}
	
	

}