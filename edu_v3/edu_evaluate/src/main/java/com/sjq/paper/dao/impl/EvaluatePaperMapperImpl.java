package com.sjq.paper.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.paper.vo.EvaluatePaperVo;
import com.sjq.paper.bean.EvaluatePaperBean;
import com.sjq.paper.dao.EvaluatePaperMapper;

/**
 * [自动生成]问卷信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:15:23
 * @version 1.0
 */
@Repository("EvaluatePaperMapper")
public class EvaluatePaperMapperImpl extends BasicSqlSupport implements EvaluatePaperMapper {
	
	
	/**
	 * (更新)根据ID物理删除记录
	 * @param bean 问卷信息实体
	 * @return     受更新影响的行数
	 */
	public int  deleteEvaluatePaperById(Long id){
	    return this.delete("com.sjq.paper.dao.EvaluatePaperMapper.deleteEvaluatePaperById", id);
	}
	
	/**
	 * (更新)根据ID更新所有问卷信息信息
	 * @param bean 问卷信息实体
	 * @return     受更新影响的行数
	 */
	public int  updateEvaluatePaperById(EvaluatePaperBean bean){
	    return this.update("com.sjq.paper.dao.EvaluatePaperMapper.updateEvaluatePaperById", bean);
	}
	
	/**
	 * 查询所有的问卷信息信息
	 * @return 查询到的列表
	 */
	public List<EvaluatePaperVo> queryAllEvaluatePaper(){
	     return this.selectList("com.sjq.paper.dao.EvaluatePaperMapper.queryAllEvaluatePaper");
	}
				
	/**
	 * 根据ID查询问卷信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public EvaluatePaperVo queryEvaluatePaperById(Long id){
	    return this.selectOne("com.sjq.paper.dao.EvaluatePaperMapper.queryEvaluatePaperById",id);
	}

	/**
	 * 根据条件查询所有问卷信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<EvaluatePaperVo>  queryEvaluatePaperBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.paper.dao.EvaluatePaperMapper.queryEvaluatePaperBySearch",map);
	}
	
	/**
	 * 根据条件查询问卷信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryEvaluatePaperTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.paper.dao.EvaluatePaperMapper.queryEvaluatePaperTotalCount",map);
	}
	
	/**
	 * 分页查询问卷信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryEvaluatePaperPage(Map<String, Object> map){
		return this.selectList("com.sjq.paper.dao.EvaluatePaperMapper.queryEvaluatePaperPage",map);
	}
	
	/**
	 * (删除)根据条件删除问卷信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteEvaluatePaperBySearch(Map<String, Object> map){
		return this.delete("com.sjq.paper.dao.EvaluatePaperMapper.deleteEvaluatePaperBySearch",map);
	}
	
	/**
	 * (增加)增加问卷信息信息
	 * @param bean 问卷信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertEvaluatePaper(EvaluatePaperBean bean){
		return this.insert("com.sjq.paper.dao.EvaluatePaperMapper.insertEvaluatePaper", bean);
	}
	
	

}