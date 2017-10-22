package com.sjq.selection.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.selection.vo.EvaluateSelectionVo;
import com.sjq.selection.bean.EvaluateSelectionBean;
import com.sjq.selection.dao.EvaluateSelectionMapper;

/**
 * [自动生成]选项信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-19 01:56:22
 * @version 1.0
 */
@Repository("EvaluateSelectionMapper")
public class EvaluateSelectionMapperImpl extends BasicSqlSupport implements EvaluateSelectionMapper {

	/**
	 * 查询所有的选项信息信息
	 * @return 查询到的列表
	 */
	public List<EvaluateSelectionVo> queryAllEvaluateSelection(){
	     return this.selectList("com.sjq.selection.dao.EvaluateSelectionMapper.queryAllEvaluateSelection");
	}
				
	/**
	 * 根据ID查询选项信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public EvaluateSelectionVo queryEvaluateSelectionById(Long id){
	    return this.selectOne("com.sjq.selection.dao.EvaluateSelectionMapper.queryEvaluateSelectionById",id);
	}

	/**
	 * 根据条件查询所有选项信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<EvaluateSelectionVo>  queryEvaluateSelectionBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.selection.dao.EvaluateSelectionMapper.queryEvaluateSelectionBySearch",map);
	}
	
	/**
	 * 根据条件查询选项信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryEvaluateSelectionTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.selection.dao.EvaluateSelectionMapper.queryEvaluateSelectionTotalCount",map);
	}
	
	/**
	 * 分页查询选项信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryEvaluateSelectionPage(Map<String, Object> map){
		return this.selectList("com.sjq.selection.dao.EvaluateSelectionMapper.queryEvaluateSelectionPage",map);
	}
	
	/**
	 * (删除)根据条件删除选项信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteEvaluateSelectionBySearch(Map<String, Object> map){
		return this.delete("com.sjq.selection.dao.EvaluateSelectionMapper.deleteEvaluateSelectionBySearch",map);
	}
	
	/**
	 * (更新)根据条件更新所有选项信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateEvaluateSelectionBySearch(Map<String, Object> map){
	    return this.update("com.sjq.selection.dao.EvaluateSelectionMapper.updateEvaluateSelectionBySearch", map);
	}
	
	/**
	 * (增加)增加选项信息信息
	 * @param bean 选项信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertEvaluateSelection(EvaluateSelectionBean bean){
		return this.insert("com.sjq.selection.dao.EvaluateSelectionMapper.insertEvaluateSelection", bean);
	}
	
	

}